package com.mbridge.msdk.config.component.sen;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class SenCpt extends com.mbridge.msdk.config.component.base.a {

    /* renamed from: k, reason: collision with root package name */
    private static b f13672k;

    /* renamed from: l, reason: collision with root package name */
    private static Map<String, a> f13673l;

    /* renamed from: h, reason: collision with root package name */
    private String f13674h;

    /* renamed from: i, reason: collision with root package name */
    private String f13675i;

    /* renamed from: j, reason: collision with root package name */
    private int f13676j;

    private String c(String str) {
        return com.mbridge.msdk.config.component.common.util.c.a("331").equals(str) ? "accelerometer" : com.mbridge.msdk.config.component.common.util.c.a("332").equals(str) ? "magnetic" : com.mbridge.msdk.config.component.common.util.c.a("333").equals(str) ? "gyroscope" : com.mbridge.msdk.config.component.common.util.c.a("334").equals(str) ? "rotation" : str;
    }

    private void h() {
        if (f13672k == null) {
            f13672k = new b();
        }
        if (f13673l == null) {
            f13673l = new HashMap();
        }
        a aVar = new a() { // from class: com.mbridge.msdk.config.component.sen.c
            @Override // com.mbridge.msdk.config.component.sen.a
            public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                this.f13681a.b(bVar);
            }
        };
        f13673l.put(this.f13675i, aVar);
        f13672k.a(aVar);
        f13672k.a(g(), c(this.f13675i), this.f13676j);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) throws NumberFormatException {
        this.f13092f = "917001";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                if (key.equals(com.mbridge.msdk.config.component.common.util.c.a("149"))) {
                    this.f13675i = String.valueOf(entry.getValue());
                } else if (key.equals(com.mbridge.msdk.config.component.common.util.c.a("150"))) {
                    double d10 = Double.parseDouble(String.valueOf(entry.getValue()));
                    if (d10 > 0.0d) {
                        this.f13676j = (int) (d10 * 1000.0d * 1000.0d);
                    }
                } else if (key.equals(com.mbridge.msdk.config.component.common.util.c.a(StatisticData.ERROR_CODE_NOT_FOUND))) {
                    this.f13674h = String.valueOf(entry.getValue());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Map<String, a> map;
        super.d();
        if (this.f13674h.equals(com.mbridge.msdk.config.component.common.util.c.a("310"))) {
            h();
        }
        if (!this.f13674h.equals(com.mbridge.msdk.config.component.common.util.c.a("318")) || f13672k == null || (map = f13673l) == null) {
            return;
        }
        f13672k.b(map.get(this.f13675i));
        f13673l.remove(this.f13675i);
        if (f13673l.isEmpty()) {
            f13672k.a();
            f13672k = null;
        }
    }

    private int g() {
        if (com.mbridge.msdk.config.component.common.util.c.a("331").equals(this.f13675i)) {
            return 1;
        }
        if (com.mbridge.msdk.config.component.common.util.c.a("332").equals(this.f13675i)) {
            return 2;
        }
        if (com.mbridge.msdk.config.component.common.util.c.a("333").equals(this.f13675i)) {
            return 4;
        }
        return com.mbridge.msdk.config.component.common.util.c.a("334").equals(this.f13675i) ? 11 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.base.b bVar) {
        a(a(bVar.c(), bVar.b()));
    }
}
