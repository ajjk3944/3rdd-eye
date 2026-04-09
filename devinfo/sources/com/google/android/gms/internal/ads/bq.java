package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bq implements oo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f9764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iq f9765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zp f9766c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y50 f9767d;

    public bq(y50 y50Var, long j, iq iqVar, zp zpVar) {
        this.f9764a = j;
        this.f9765b = iqVar;
        this.f9766c = zpVar;
        this.f9767d = y50Var;
    }

    @Override // com.google.android.gms.internal.ads.oo
    public final void k(Object obj, Map map) {
        ua.j.C.f35267k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f9764a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb2.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb2.append(jCurrentTimeMillis);
        sb2.append(" ms.");
        ya.a0.m(sb2.toString());
        ya.a0.m("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        y50 y50Var = this.f9767d;
        synchronized (y50Var.f18643b) {
            ya.a0.m("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            iq iqVar = this.f9765b;
            if (((AtomicInteger) iqVar.f1326b).get() != -1 && ((AtomicInteger) iqVar.f1326b).get() != 1) {
                y50Var.g = 0;
                zp zpVar = this.f9766c;
                zpVar.e("/log", no.f14364c);
                zpVar.e("/result", no.j);
                ((gx) iqVar.f1325a).b(zpVar);
                y50Var.f18647f = iqVar;
                ya.a0.m("Successfully loaded JS Engine.");
                ya.a0.m("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            ya.a0.m("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
