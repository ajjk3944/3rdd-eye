package com.mbridge.msdk.config.component.time;

import android.os.Handler;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class TimeCpt extends com.mbridge.msdk.config.component.base.a implements d {

    /* renamed from: h, reason: collision with root package name */
    Map<String, Object> f13730h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    Map<String, Object> f13731i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    String f13732j;

    /* renamed from: k, reason: collision with root package name */
    long f13733k;

    /* renamed from: l, reason: collision with root package name */
    int f13734l;

    /* renamed from: m, reason: collision with root package name */
    String f13735m;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        int f13736a = 0;

        /* renamed from: b, reason: collision with root package name */
        boolean f13737b;

        public a(boolean z10) {
            this.f13737b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map = new HashMap();
            String strA = c.a("triggered_count");
            int i10 = this.f13736a;
            this.f13736a = i10 + 1;
            map.put(strA, Integer.valueOf(i10));
            TimeCpt timeCpt = TimeCpt.this;
            timeCpt.a(timeCpt.a("919003", map));
            if (this.f13737b) {
                TimeCpt timeCpt2 = TimeCpt.this;
                Handler handler = (Handler) timeCpt2.f13730h.get(timeCpt2.f13732j);
                if (handler != null) {
                    handler.postDelayed(this, TimeCpt.this.f13733k);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(c.a("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(c.a("110"));
                if (obj2 instanceof String) {
                    return this.f13732j.equals(String.valueOf(obj2));
                }
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f13092f = "919001";
        if (map == null || map.isEmpty()) {
            return;
        }
        Object obj = map.get(c.a("110"));
        if (obj != null) {
            this.f13732j = String.valueOf(obj);
        }
        Object obj2 = map.get(c.a("152"));
        if (obj2 != null) {
            if (!TextUtils.isEmpty(String.valueOf(obj2))) {
                this.f13733k = Integer.parseInt(r0) * 1000;
            }
        }
        Object obj3 = map.get(c.a("153"));
        if (obj3 != null) {
            String strValueOf = String.valueOf(obj3);
            if (!TextUtils.isEmpty(strValueOf)) {
                this.f13734l = Integer.parseInt(strValueOf);
            }
        }
        Object obj4 = map.get(c.a(StatisticData.ERROR_CODE_NOT_FOUND));
        if (obj4 != null) {
            this.f13735m = String.valueOf(obj4);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        super.c(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Handler handler;
        Runnable aVar;
        super.d();
        if (this.f13730h.containsKey(this.f13732j)) {
            handler = (Handler) this.f13730h.get(this.f13732j);
        } else {
            handler = new Handler();
            this.f13730h.put(this.f13732j, handler);
        }
        if (this.f13731i.containsKey(this.f13732j)) {
            aVar = (Runnable) this.f13731i.get(this.f13732j);
        } else {
            aVar = new a(this.f13734l == 1);
            this.f13731i.put(this.f13732j, aVar);
        }
        if (handler == null || aVar == null) {
            return;
        }
        if (c.a("310").equals(this.f13735m) || c.a("335").equals(this.f13735m)) {
            handler.postDelayed(aVar, this.f13733k);
            return;
        }
        if (c.a("311").equals(this.f13735m)) {
            handler.removeCallbacks(aVar);
            this.f13730h.remove(this.f13732j);
        } else if (c.a("316").equals(this.f13735m)) {
            handler.removeCallbacks(aVar);
        }
    }
}
