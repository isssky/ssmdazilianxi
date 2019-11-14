package com.pyw.mappr;

import com.pyw.pojo.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;


@Repository
public interface UserMapper {

   User query(User user);


}
