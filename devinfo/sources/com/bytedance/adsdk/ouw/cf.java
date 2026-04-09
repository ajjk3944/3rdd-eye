package com.bytedance.adsdk.ouw;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf implements bly {
    @Override // com.bytedance.adsdk.ouw.bly
    public final /* synthetic */ Object ouw(JSONObject jSONObject, Object[] objArr) {
        Object obj;
        if (objArr != null && objArr.length != 0 && (obj = objArr[0]) != null) {
            if (obj instanceof String) {
                return Integer.valueOf(((String) obj).length());
            }
            if (obj instanceof Set) {
                return Integer.valueOf(((Set) obj).size());
            }
            if (obj instanceof List) {
                return Integer.valueOf(((List) obj).size());
            }
            if (obj instanceof Map) {
                return Integer.valueOf(((Map) obj).size());
            }
            if (obj.getClass().isArray()) {
                return Integer.valueOf(Array.getLength(obj));
            }
            if (obj instanceof Number) {
                return Integer.valueOf(obj.toString().length());
            }
            if (obj instanceof JSONObject) {
                return Integer.valueOf(((JSONObject) obj).length());
            }
            if (obj instanceof JSONArray) {
                return Integer.valueOf(((JSONArray) obj).length());
            }
        }
        return 0;
    }
}
