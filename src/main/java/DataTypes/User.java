/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package DataTypes;

import java.util.ArrayList;
import java.util.List;

public class User {

    int id;
    String name;
    List<Integer> posts;

    User(int id,String name){
        this.id=id;
        this.name=name;
        posts = new ArrayList<Integer>();
    }
}
