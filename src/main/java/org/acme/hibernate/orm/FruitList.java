package org.acme.hibernate.orm;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class FruitList  {

    private List<Fruit> list;

    public FruitList() {
        this(new ArrayList<>());
    }

    public FruitList(List<Fruit> list) {
        this.setList(list);
    }

    public List<Fruit> getList() {
        return list;
    }

    public void setList(List<Fruit> list) {
        this.list = list;
    }
}
