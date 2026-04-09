package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k2.InterfaceC2625d;
import q2.C2852x0;
import q2.InterfaceC2806a;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.eo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117eo implements InterfaceC2625d, InterfaceC0730Sk, InterfaceC2806a, InterfaceC1382jk, InterfaceC1921tk, InterfaceC2029vk, InterfaceC0441Bk, InterfaceC1544mk, Nu {

    /* renamed from: a, reason: collision with root package name */
    public final List f13975a;

    /* renamed from: b, reason: collision with root package name */
    public final C1008co f13976b;

    /* renamed from: c, reason: collision with root package name */
    public long f13977c;

    public C1117eo(C1008co c1008co, C0710Rh c0710Rh) {
        this.f13976b = c1008co;
        this.f13975a = Collections.singletonList(c0710Rh);
    }

    public final void A(Class cls, String str, Object... objArr) throws IOException {
        String simpleName = cls.getSimpleName();
        List list = this.f13975a;
        String strConcat = "Event-".concat(simpleName);
        C1008co c1008co = this.f13976b;
        c1008co.getClass();
        if (((Boolean) AbstractC1480la.f15412a.v()).booleanValue()) {
            c1008co.f13671a.getClass();
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
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e6) {
                u2.k.f("unable to log", e6);
            }
            u2.k.g("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1544mk
    public final void D(C2852x0 c2852x0) throws IOException {
        A(InterfaceC1544mk.class, "onAdFailedToLoad", Integer.valueOf(c2852x0.f23273a), c2852x0.f23274b, c2852x0.f23275c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void E(C1807re c1807re) throws IOException {
        p2.j.f22785C.f22797k.getClass();
        this.f13977c = SystemClock.elapsedRealtime();
        A(InterfaceC0730Sk.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void F(BinderC2185ye binderC2185ye, String str, String str2) throws IOException {
        A(InterfaceC1382jk.class, "onRewarded", binderC2185ye, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void I() throws IOException {
        A(InterfaceC1382jk.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void N() throws IOException {
        A(InterfaceC1382jk.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Nu
    public final void a(String str) throws IOException {
        A(Lu.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void b() throws IOException {
        A(InterfaceC1382jk.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2029vk
    public final void c(Context context) throws IOException {
        A(InterfaceC2029vk.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void d() throws IOException {
        A(InterfaceC1382jk.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    public final void e() throws IOException {
        p2.j.f22785C.f22797k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f13977c;
        StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(jElapsedRealtime);
        AbstractC2907C.m(sb.toString());
        A(InterfaceC0441Bk.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2029vk
    public final void f(Context context) throws IOException {
        A(InterfaceC2029vk.class, "onDestroy", context);
    }

    @Override // q2.InterfaceC2806a
    public final void onAdClicked() throws IOException {
        A(InterfaceC2806a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Nu
    public final void p(Ku ku, String str, Throwable th) throws IOException {
        A(Lu.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // k2.InterfaceC2625d
    public final void s(String str, String str2) throws IOException {
        A(InterfaceC2625d.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2029vk
    public final void u(Context context) throws IOException {
        A(InterfaceC2029vk.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void v() throws IOException {
        A(InterfaceC1382jk.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void w(Xt xt) {
    }

    @Override // com.google.android.gms.internal.ads.Nu
    public final void x(Ku ku, String str) throws IOException {
        A(Lu.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.Nu
    public final void y(Ku ku, String str) throws IOException {
        A(Lu.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
    public final void z() throws IOException {
        A(InterfaceC1921tk.class, "onAdImpression", new Object[0]);
    }
}
