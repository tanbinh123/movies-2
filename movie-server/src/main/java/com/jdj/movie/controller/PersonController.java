package com.jdj.movie.controller;

import com.jdj.movie.bll.PersonBll;
import com.jdj.movie.model.Person;
import com.jdj.movie.model.ReturnModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jdj on 2018/4/23.
 */
@RestController
@RequestMapping("/person")
public class PersonController {
//    private final static Logger logger = LoggerFactory.getLogger(PersonController.class);
//    @Autowired
//    private PersonBll personBll;
//    /**
//     * @content:根据id对应的person
//     * @param id=1;
//     * @return returnModel
//     */
//    @RequestMapping(value = "/list",method = RequestMethod.GET)
//    public ReturnModel<Person> list(
//            @RequestParam(value = "id") Integer id
//    ){
//        return new ReturnModel<Person>(personBll.getPersonList(id));
//    }
}