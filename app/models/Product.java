package models;

//import com.avaje.ebean.Model;
import play.data.validation.Constraints;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//simport javax.persistence.Id;

/**
 * Created by An on 2/9/2017.
 */
//@Entity
public class Product /* extends Model*/ {
  //  @Id
    @Constraints.Required
    public Integer id;
    public String name;
    public Integer manufacturer;
    //@Column(name="short_description")
    public String shortDescription;
    public Integer price;
   // @Column(name="information_detail")
    public String informationDetail;
    public String description;
    public Integer category;
    public String warranty;
    public String pictures;

  //  public static Find<Integer, Product> find = new Find<Integer, Product>(){};
}
