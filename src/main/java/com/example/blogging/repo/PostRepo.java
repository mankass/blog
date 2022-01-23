package com.example.blogging.repo;

import com.example.blogging.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo  extends CrudRepository<Post,Long > {
}
