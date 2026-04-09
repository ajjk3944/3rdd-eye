package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f15324a = new HashMap();

    public void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (obj instanceof String) {
                if (TextUtils.isEmpty((String) obj)) {
                    return;
                }
                this.f15324a.put(str, (String) obj);
            } else {
                this.f15324a.put(str, obj + "");
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public Object b(String str) {
        return this.f15324a.get(str);
    }

    public void c(String str) {
        if (this.f15324a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f15324a.remove(str);
    }

    public boolean a(String str) {
        return this.f15324a.containsKey(str);
    }

    public Map<String, String> a() {
        return this.f15324a;
    }

    public void a(e eVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (eVar == null || (map = eVar.f15324a) == null || (map2 = this.f15324a) == null) {
            return;
        }
        map2.putAll(map);
    }
}
