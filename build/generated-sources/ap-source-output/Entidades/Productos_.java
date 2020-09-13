package Entidades;

import Entidades.Precio;
import Entidades.Stock;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-12T21:58:58")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, Precio> precio;
    public static volatile SingularAttribute<Productos, String> codproducto;
    public static volatile SingularAttribute<Productos, Stock> stock;
    public static volatile SingularAttribute<Productos, String> descproducto;

}