package controllers;

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

    public Result product(Integer id) {
        return ok(index.render(emarketDataService.getProduct(id).name));
    }

}