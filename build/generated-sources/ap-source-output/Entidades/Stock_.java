package Entidades;

import Entidades.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-12T21:58:58")
@StaticMetamodel(Stock.class)
public class Stock_ { 

    public static volatile SingularAttribute<Stock, String> codproducto;
    public static volatile SingularAttribute<Stock, Integer> stock;
    public static volatile SingularAttribute<Stock, Productos> productos;

}