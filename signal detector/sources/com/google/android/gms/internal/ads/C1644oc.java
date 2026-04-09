package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1644oc implements InterfaceC0466Db {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f15964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2021vc f15965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1536mc f15966c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0895ak f15967d;

    public C1644oc(C0895ak c0895ak, long j6, C2021vc c2021vc, C1536mc c1536mc) {
        this.f15964a = j6;
        this.f15965b = c2021vc;
        this.f15966c = c1536mc;
        this.f15967d = c0895ak;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    public final void e(Object obj, Map map) {
        p2.j.f22785C.f22797k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f15964a;
        StringBuilder sb = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(jCurrentTimeMillis);
        sb.append(" ms.");
        AbstractC2907C.m(sb.toString());
        AbstractC2907C.m("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        C0895ak c0895ak = this.f15967d;
        synchronized (c0895ak.f13214b) {
            AbstractC2907C.m("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            C2021vc c2021vc = this.f15965b;
            if (((AtomicInteger) c2021vc.f663b).get() != -1 && ((AtomicInteger) c2021vc.f663b).get() != 1) {
                c0895ak.f13219g = 0;
                C1536mc c1536mc = this.f15966c;
                c1536mc.e("/log", AbstractC0449Cb.f7601c);
                c1536mc.e("/result", AbstractC0449Cb.f7607j);
                ((C0657Of) c2021vc.f662a).b(c1536mc);
                c0895ak.f13218f = c2021vc;
                AbstractC2907C.m("Successfully loaded JS Engine.");
                AbstractC2907C.m("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            AbstractC2907C.m("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
