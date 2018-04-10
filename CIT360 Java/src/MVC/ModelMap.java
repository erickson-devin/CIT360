/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author devin erickson
 */
public class ModelMap implements Serializable{
    
    private Planet[] location;

    public ModelMap() {
    }
    
    public Planet[] getLocation() {
        return location;
    }

    public void setLocation(Planet[] location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Map{" + "location=" + location + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Arrays.deepHashCode(this.location);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ModelMap other = (ModelMap) obj;
        if (!Arrays.deepEquals(this.location, other.location)) {
            return false;
        }
        return true;
    }

}