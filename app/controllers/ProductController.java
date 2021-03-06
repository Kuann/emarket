package controllers;

import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;

import services.EmarketDataService;
import services.ServiceFactory;
import views.html.*;

import  models.Product;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class ProductController extends Controller {

    private EmarketDataService emarketDataService;

    private final FormFactory formFactory;

    @Inject
    public ProductController(ServiceFactory serviceFactory, FormFactory formFactory) {
        emarketDataService = serviceFactory.getEmarketDataService();
        this.formFactory = formFactory;
    }

    /**
     * get product by id
     * @param id
     * @return
     */
    public Result product(Integer id) {
        return ok(product_detail.render());
    }

    //get product list
    public Result getProducts() {
        Product[] products = emarketDataService.getProducts().toArray(new Product[emarketDataService.getProducts().size()]);
        return ok(product.render(products));
    }

    /**
     * get product list by type
     * @param type
     * @return
     */
    public Result guest_ViewProductListByType(String type) {
        Product[] products = emarketDataService.getProducts().toArray(new Product[emarketDataService.getProducts().size()]);
        return ok(product.render(products));
    }

    /**
     * search product by key
     * @param key
     * @return
     */
    public Result guest_SearchProduct(String key) {
        Product[] products = emarketDataService.getProducts().toArray(new Product[emarketDataService.getProducts().size()]);
        return ok(product.render(products));
    }

    /**
     * post method
     * @return
     */
    public Result searchProductByForm() {
        DynamicForm form = formFactory.form().bindFromRequest();
        String key = form.get("srchFld");
        return guest_SearchProduct(key);
    }






}