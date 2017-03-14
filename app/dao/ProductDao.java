package dao;

import models.Product;

import javax.inject.Singleton;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;

/**
 * Created by An on 3/1/2017.
 */
@Singleton
public class ProductDao {
    public Product get(Integer id) {
        return JPA.em().find(Product.class, id);
    }
}
