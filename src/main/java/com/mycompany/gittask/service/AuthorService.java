package com.mycompany.gittask.service;

import com.mycompany.gittask.model.AuthorList;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AuthorService {

  private List<AuthorList>  authorlist = Arrays.asList(
          new AuthorList(989095, "Deependra", "Sydney"),
          new AuthorList(988339, "Nandeshwor", "Denver"),
          new AuthorList(443433, "Anita", "Kathmandu")
  );

  public List<AuthorList> getAuthorlist() {
    return authorlist;

  }
}
