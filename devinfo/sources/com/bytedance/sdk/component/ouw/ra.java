package com.bytedance.sdk.component.ouw;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra {
    private tlj ouw;

    public ra(tlj tljVar) {
        this.ouw = tljVar;
    }

    public final <T> T ouw(String str, Type type) throws JSONException {
        ouw(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.ouw.ouw();
    }

    public final <T> String ouw(T t10) {
        String string;
        if (t10 == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if (!(t10 instanceof JSONObject) && !(t10 instanceof JSONArray)) {
            string = this.ouw.vt();
        } else {
            string = t10.toString();
        }
        ouw(string);
        return string;
    }

    private static void ouw(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        pno.ouw(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
