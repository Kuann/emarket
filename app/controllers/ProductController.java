package controllers;

import models.Category;
import models.Product;
import play.db.jpa.Transactional;
import play.mvc.*;

import services.EmarketDataService;
import services.ServiceFactory;
import views.html.*;

import javax.inject.Inject;


public class ProductController extends Controller {

    private EmarketDataService emarketDataService;

    @Inject
    public ProductController(ServiceFactory serviceFactory) {
        emarketDataService = serviceFactory.getEmarketDataService();
    }


    @Transactional
    public Result product(Integer id) {
        Product product = emarketDataService.getProduct(id);
        Category category = product.getCategory();
        return ok(index.render(product.getName()));
    }

}