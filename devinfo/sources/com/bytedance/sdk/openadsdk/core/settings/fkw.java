package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.qbp;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public interface fkw {
    public static final vt<JSONObject> ouw = new vt<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.fkw.1
        private static JSONObject vt(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e2) {
                qbp.ouw("ISettingsDataRepository", "", e2);
                return null;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.vt
        public final /* synthetic */ JSONObject ouw(String str) {
            return vt(str);
        }
    };
    public static final vt<Set<String>> vt = new vt<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.fkw.2
        private static Set<String> vt(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    hashSet.add(jSONArray.getString(i4));
                }
                return hashSet;
            } catch (Exception e2) {
                qbp.ouw("ISettingsDataRepository", "", e2);
                return hashSet;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.vt
        public final /* synthetic */ Set<String> ouw(String str) {
            return vt(str);
        }
    };

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        ouw ouw(String str);

        ouw ouw(String str, float f10);

        ouw ouw(String str, int i4);

        ouw ouw(String str, long j);

        ouw ouw(String str, String str2);

        ouw ouw(String str, boolean z3);

        void ouw();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt<T> {
        T ouw(String str);
    }

    void ouw(JSONObject jSONObject);
}
