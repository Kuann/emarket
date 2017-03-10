package controllers;

import play.mvc.*;

import services.impl.EmarketDataServiceFake;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        EmarketDataServiceFake emarketDataServiceFake = new EmarketDataServiceFake();
        return ok(index.render( emarketDataServiceFake.getProduct(1)));
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
