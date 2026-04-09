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
            } catch (Exception e10) {
                ul.emc("ISettingsDataRepository", "", e10);
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
                for (int i10 = 0; i10 < length; i10++) {
                    hashSet.add(jSONArray.getString(i10));
                }
                return hashSet;
            } catch (Exception e10) {
                ul.emc("ISettingsDataRepository", "", e10);
                return hashSet;
            }
        }
    };

    public interface emc {
        emc emc(String str);

        emc emc(String str, float f10);

        emc emc(String str, int i10);

        emc emc(String str, long j10);

        emc emc(String str, String str2);

        emc emc(String str, boolean z10);

        void emc();
    }

    public interface ypw<T> {
        T ypw(String str);
    }

    void emc(JSONObject jSONObject);
}
