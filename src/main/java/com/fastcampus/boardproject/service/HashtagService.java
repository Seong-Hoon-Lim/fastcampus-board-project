package com.fastcampus.boardproject.service;

import com.fastcampus.boardproject.domain.Hashtag;
import com.fastcampus.boardproject.repository.HashtagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Transactional
@RequiredArgsConstructor
@Service
public class HashtagService {

    private final HashtagRepository hashtagRepository;

    @Transactional(readOnly = true)
    public Set<Hashtag> findHashtagsByNames(Set<String> hashtagNames) {
        return new HashSet<>(hashtagRepository.findByHashtagNameIn(hashtagNames));
    }

    //본문의 해시태그를 파싱
    public Set<String> parseHashtagNames(String content) {
        if (content == null) {
            return Set.of();
        }

        //해시태그 파싱을 위한 정규식
        Pattern pattern = Pattern.compile("#[\\w가-힣]+");
        Matcher matcher = pattern.matcher(content.strip());  //해시태그 양쪽의 공백 제거
        Set<String> result = new HashSet<>();

        while (matcher.find()) {
            result.add(matcher.group().replace("#", ""));  //파싱 과정에서 "#" 을 삭제
        }

        return Set.copyOf(result);  //불변성 처리
    }

    public void deleteHashtagWithoutArticles(Long hashtagId) {
        Hashtag hashtag = hashtagRepository.getReferenceById(hashtagId);
        if (hashtag.getArticles().isEmpty()) {
            hashtagRepository.delete(hashtag);
        }
    }

}
