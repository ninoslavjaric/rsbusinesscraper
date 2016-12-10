package pojo;

import helper.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by ninoslav.jaric on 10-Dec-16.
 */
public class Seeker {
    private String value;
    private String djelatnostId;
    private String osnivac;
    private String term;
    private String opstinaId;

    public Seeker() {}
    public Seeker(HashMap<String, String> params) {
        Set<String> keys = params.keySet();
        String value;
        for (String key : keys) {
            value = params.get(key);
            key = Character.toUpperCase(key.charAt(0)) + key.substring(1);
            try {
                Method method = this.getClass().getMethod("set" + key, String.class);
                method.invoke(this, value);
            } catch (SecurityException e) {
                Log.prntl("SecurityException\t" + key);
            } catch (NoSuchMethodException e) {
                Log.prntl("NoSuchMethodException\t" + key);
            } catch (IllegalArgumentException e) {
                Log.prntl("IllegalArgumentException\t" + key);
            } catch (IllegalAccessException e) {
                Log.prntl("IllegalAccessException\t" + key);
            } catch (InvocationTargetException e) {
                Log.prntl("InvocationTargetException\t" + key);
            }
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDjelatnostId() {
        return djelatnostId;
    }

    public void setDjelatnostId(String djelatnostId) {
        this.djelatnostId = djelatnostId;
    }

    public String getOsnivac() {
        return osnivac;
    }

    public void setOsnivac(String osnivac) {
        this.osnivac = osnivac;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getOpstinaId() {
        return opstinaId;
    }

    public void setOpstinaId(String opstinaId) {
        this.opstinaId = opstinaId;
    }
}
