package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class eq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y50 f10843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ iq f10844c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zp f10845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f10847f;

    public /* synthetic */ eq(y50 y50Var, iq iqVar, zp zpVar, ArrayList arrayList, long j, int i4) {
        this.f10842a = i4;
        this.f10844c = iqVar;
        this.f10845d = zpVar;
        this.f10846e = arrayList;
        this.f10847f = j;
        this.f10843b = y50Var;
    }

    private final void a() {
        String string;
        ya.a0.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        y50 y50Var = this.f10843b;
        synchronized (y50Var.f18643b) {
            try {
                ya.a0.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                iq iqVar = this.f10844c;
                if (((AtomicInteger) iqVar.f1326b).get() != -1 && ((AtomicInteger) iqVar.f1326b).get() != 1) {
                    pk pkVar = sk.B8;
                    va.s sVar = va.s.f36163e;
                    if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                        iqVar.x("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                    } else {
                        iqVar.w();
                    }
                    fx.f11279f.execute(new dq(this.f10845d, 0));
                    String strValueOf = String.valueOf(sVar.f36166c.a(sk.f16099e));
                    int i4 = ((AtomicInteger) iqVar.f1326b).get();
                    int i10 = y50Var.g;
                    ArrayList arrayList = this.f10846e;
                    if (arrayList.isEmpty()) {
                        string = ". Still waiting for the engine to be loaded";
                    } else {
                        String strValueOf2 = String.valueOf(arrayList.get(0));
                        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 88);
                        sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                        sb2.append(strValueOf2);
                        string = sb2.toString();
                    }
                    ua.j.C.f35267k.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f10847f;
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + FacebookMediationAdapter.ERROR_NULL_CONTEXT + String.valueOf(i4).length() + 36 + String.valueOf(i10).length() + string.length() + 39 + String.valueOf(jCurrentTimeMillis).length() + 26);
                    sb3.append("Could not finish the full JS engine loading in ");
                    sb3.append(strValueOf);
                    sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                    sb3.append(i4);
                    sb3.append(". Update status(fullLoadTimeout) is ");
                    sb3.append(i10);
                    sb3.append(string);
                    sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                    sb3.append(jCurrentTimeMillis);
                    sb3.append(" ms at timeout. Rejecting.");
                    ya.a0.m(sb3.toString());
                    ya.a0.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                ya.a0.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10842a) {
            case 0:
                a();
                return;
            default:
                y50 y50Var = this.f10843b;
                iq iqVar = this.f10844c;
                zp zpVar = this.f10845d;
                ArrayList arrayList = this.f10846e;
                long j = this.f10847f;
                ya.a0.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                synchronized (y50Var.f18643b) {
                    try {
                        ya.a0.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                        if (((AtomicInteger) iqVar.f1326b).get() != -1 && ((AtomicInteger) iqVar.f1326b).get() != 1) {
                            pk pkVar = sk.B8;
                            va.s sVar = va.s.f36163e;
                            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                                iqVar.x("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                            } else {
                                iqVar.w();
                            }
                            fx.f11279f.execute(new dq(zpVar, 1));
                            String strValueOf = String.valueOf(sVar.f36166c.a(sk.f16083d));
                            int i4 = ((AtomicInteger) iqVar.f1326b).get();
                            int i10 = y50Var.g;
                            String strValueOf2 = String.valueOf(arrayList.get(0));
                            ua.j.C.f35267k.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis() - j;
                            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 94 + String.valueOf(i4).length() + 39 + String.valueOf(i10).length() + 57 + strValueOf2.length() + 42 + String.valueOf(jCurrentTimeMillis).length() + 15);
                            sb2.append("Could not receive /jsLoaded in ");
                            sb2.append(strValueOf);
                            sb2.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                            sb2.append(i4);
                            sb2.append(". Update status(onEngLoadedTimeout) is ");
                            sb2.append(i10);
                            sb2.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                            sb2.append(strValueOf2);
                            sb2.append(" ms. Total latency(onEngLoadedTimeout) is ");
                            sb2.append(jCurrentTimeMillis);
                            sb2.append(" ms. Rejecting.");
                            ya.a0.m(sb2.toString());
                            ya.a0.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                            return;
                        }
                        ya.a0.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
