package telran.java2022.security.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telran.java2022.post.dao.PostRepository;
import telran.java2022.post.model.Post;
@Service("customSecurity")
@RequiredArgsConstructor
public class CustomWebSecurity {
	final PostRepository postRepository;
	
	public boolean checkPostAuthor(String postID, String userName) {
		Post post = postRepository.findById(postID).orElse(null);
		return post!=null && post.getAuthor().equalsIgnoreCase(userName);
	}
}
