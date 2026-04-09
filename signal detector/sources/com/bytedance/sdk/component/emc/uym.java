package com.bytedance.sdk.component.emc;

import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
class uym {
    private ru emc;

    private uym(ru ruVar) {
        this.emc = ruVar;
    }

    public static uym emc(ru ruVar) {
        return new uym(ruVar);
    }

    public <T> T emc(String str, Type type) {
        emc(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.emc.emc(str, type);
    }

    public <T> String emc(T t6) {
        String string;
        if (t6 == null) {
            return "{}";
        }
        if (!(t6 instanceof JSONObject) && !(t6 instanceof JSONArray)) {
            string = this.emc.emc(t6);
        } else {
            string = t6.toString();
        }
        emc(string);
        return string;
    }

    private static void emc(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        msw.emc(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
