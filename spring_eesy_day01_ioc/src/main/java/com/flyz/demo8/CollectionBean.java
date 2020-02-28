package com.flyz.demo8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {
    private String [] arrs;
    private List<String> lists;
    private Set<String> sets;
    private Map<String,Object> maps;

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "arrs=" + Arrays.toString(arrs) +
                ", lists=" + lists +
                ", sets=" + sets +
                ", maps=" + maps +
                '}';
    }
}
