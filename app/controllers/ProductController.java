package controllers;

import play.mvc.*;

import services.EmarketDataService;
import services.ServiceFactory;
import views.html.*;

import  models.Product;

import javax.inject.Inject;
import java.util.ArrayList;


public class ProductController extends Controller {

    private EmarketDataService emarketDataService;

    @Inject
    public ProductController(ServiceFactory serviceFactory) {
        emarketDataService = serviceFactory.getEmarketDataService();
    }

    public Result product(Integer id) {
        return ok(product_detail.render());
    }

    //get product list
    public Result getProducts() {
        Product[] products = emarketDataService.getProducts().toArray(new Product[emarketDataService.getProducts().size()]);
        return ok(product.render(products));
    }

    public Result getProductRummary() {
        return ok(product_summary.render());
    }

}