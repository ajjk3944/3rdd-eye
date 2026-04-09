package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yd0 implements qa.d, n70, va.a, g60, p60, r60, w60, i60, tr0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f18706a;

    /* renamed from: b, reason: collision with root package name */
    public final xd0 f18707b;

    /* renamed from: c, reason: collision with root package name */
    public long f18708c;

    public yd0(xd0 xd0Var, k10 k10Var) {
        this.f18707b = xd0Var;
        this.f18706a = Collections.singletonList(k10Var);
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void E() throws IOException {
        r(g60.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final void a(String str) throws IOException {
        r(rr0.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final void b(qr0 qr0Var, String str, Throwable th2) throws IOException {
        r(rr0.class, "onTaskFailed", str, th2.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void c() throws IOException {
        r(g60.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void d() throws IOException {
        r(g60.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void e() throws IOException {
        ua.j.C.f35267k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f18708c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb2.append("Ad Request Latency : ");
        sb2.append(jElapsedRealtime);
        ya.a0.m(sb2.toString());
        r(w60.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void f(Context context) throws IOException {
        r(r60.class, "onDestroy", context);
    }

    @Override // qa.d
    public final void g(String str, String str2) throws IOException {
        r(qa.d.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void h(Context context) throws IOException {
        r(r60.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void j() throws IOException {
        r(g60.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void k(Context context) throws IOException {
        r(r60.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final void m(qr0 qr0Var, String str) throws IOException {
        r(rr0.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void n() throws IOException {
        r(p60.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void o(va.w1 w1Var) throws IOException {
        r(i60.class, "onAdFailedToLoad", Integer.valueOf(w1Var.f36177a), w1Var.f36178b, w1Var.f36179c);
    }

    @Override // va.a
    public final void onAdClicked() throws IOException {
        r(va.a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final void p(qr0 qr0Var, String str) throws IOException {
        r(rr0.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void q(pu puVar, String str, String str2) throws IOException {
        r(g60.class, "onRewarded", puVar, str, str2);
    }

    public final void r(Class cls, String str, Object... objArr) throws IOException {
        String simpleName = cls.getSimpleName();
        List list = this.f18706a;
        String strConcat = "Event-".concat(simpleName);
        xd0 xd0Var = this.f18707b;
        xd0Var.getClass();
        if (((Boolean) wl.f18052a.u()).booleanValue()) {
            xd0Var.f18375a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jCurrentTimeMillis);
                jsonWriter.name("source").value(strConcat);
                jsonWriter.name("event").value(str);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    Object obj = objArr[i4];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e2) {
                za.i.f("unable to log", e2);
            }
            za.i.g("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void t(iu iuVar) throws IOException {
        ua.j.C.f35267k.getClass();
        this.f18708c = SystemClock.elapsedRealtime();
        r(n70.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void v() throws IOException {
        r(g60.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void l(dq0 dq0Var) {
    }
}
