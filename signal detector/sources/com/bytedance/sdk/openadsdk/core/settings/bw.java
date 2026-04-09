package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.ul;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface bw {
    public static final ypw<JSONObject> emc = new ypw<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.bw.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.bw.ypw
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public JSONObject ypw(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e6) {
                ul.emc("ISettingsDataRepository", "", e6);
                return null;
            }
        }
    };
    public static final ypw<Set<String>> ypw = new ypw<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.bw.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.bw.ypw
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public Set<String> ypw(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
                return hashSet;
            } catch (Exception e6) {
                ul.emc("ISettingsDataRepository", "", e6);
                return hashSet;
            }
        }
    };

    public interface emc {
        emc emc(String str);

        emc emc(String str, float f2);

        emc emc(String str, int i);

        emc emc(String str, long j6);

        emc emc(String str, String str2);

        emc emc(String str, boolean z6);

        void emc();
    }

    public interface ypw<T> {
        T ypw(String str);
    }

    void emc(JSONObject jSONObject);
}
