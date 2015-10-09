package info.arrighi.repository;

import info.arrighi.entity.Comment;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long>{

}
