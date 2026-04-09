package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Date;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class pu0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15108a;

    /* renamed from: c, reason: collision with root package name */
    public long f15110c = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public int f15111d = 1;

    /* renamed from: b, reason: collision with root package name */
    public c1.r f15109b = new c1.r(null);

    public pu0(String str) {
        this.f15108a = str;
    }

    public void b() {
        this.f15109b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView c() {
        return (WebView) this.f15109b.get();
    }

    public void d(vt0 vt0Var, b7 b7Var) {
        e(vt0Var, b7Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.google.android.gms.internal.ads.vt0 r11, com.google.android.gms.internal.ads.b7 r12, org.json.JSONObject r13) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pu0.e(com.google.android.gms.internal.ads.vt0, com.google.android.gms.internal.ads.b7, org.json.JSONObject):void");
    }

    public final void f(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        uu0.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        w5.g.C(c(), "setLastActivity", jSONObject);
    }

    public void a() {
    }
}
