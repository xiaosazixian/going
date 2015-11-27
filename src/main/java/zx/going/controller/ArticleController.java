package zx.going.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import zx.going.entity.Article;
import zx.going.entity.VO.ArticleVO;
import zx.going.facade.ArticleFacade;

import java.util.List;

/**
 * Created by Administrator on 2015/11/27.
 */

@RestController
public class ArticleController {

    @Autowired
    private ArticleFacade articleFacade;

    @RequestMapping(value = "/l" , method = RequestMethod.GET , produces = {"application/xml", "application/json"})
    @ResponseStatus(HttpStatus.OK)
    public List<Article> getArticles(){
        return null;
    }

    @RequestMapping(value = "/a",method = RequestMethod.POST)
    public  void addArticle(ArticleVO articleVO){
        Article article = new Article();
        BeanUtils.copyProperties(articleVO,article);
        articleFacade.addArticle(article);
    }

    @RequestMapping(value = "/u",method = RequestMethod.PUT)
    public  void updateArticle(ArticleVO articleVO){
        Article article = new Article();
        BeanUtils.copyProperties(articleVO,article);
        articleFacade.updateArticle(article);
    }

}
