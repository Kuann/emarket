package controllers;

import play.data.FormFactory;
import play.mvc.*;

import services.EmarketDataService;
import services.ServiceFactory;
import services.impl.EmarketDataServiceFake;
import views.html.*;

import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private EmarketDataService emarketDataService;

    private final FormFactory formFactory;

    @Inject
    public HomeController(ServiceFactory serviceFactory, FormFactory formFactory) {
        emarketDataService = serviceFactory.getEmarketDataService();
        this.formFactory = formFactory;
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render(emarketDataService.getProduct(1)));
    }


    //get product detail
    public Result getProductDetail(Integer id) {
        return ok(product_detail.render());
    }

    /**
     * get cart
     * @return
     */
    public Result guest_ViewCart() {
        return ok(product_summary.render());
    }

    //getSpecialOffer
    public Result getSpecialOffer() {
        return ok(special_offer.render());
    }

    //getDelivery
    public Result getDelivery(){
      return ok(normal.render());
    }

    //getContact
    public Result getContact() {
      return ok(contact.render());
    }
}
