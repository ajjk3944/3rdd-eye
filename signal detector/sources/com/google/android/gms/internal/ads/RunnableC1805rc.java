package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C2841s;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.rc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1805rc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0895ak f16570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2021vc f16571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1536mc f16572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f16574f;

    public /* synthetic */ RunnableC1805rc(C0895ak c0895ak, C2021vc c2021vc, C1536mc c1536mc, ArrayList arrayList, long j6, int i) {
        this.f16569a = i;
        this.f16571c = c2021vc;
        this.f16572d = c1536mc;
        this.f16573e = arrayList;
        this.f16574f = j6;
        this.f16570b = c0895ak;
    }

    private final void a() {
        String string;
        AbstractC2907C.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        C0895ak c0895ak = this.f16570b;
        synchronized (c0895ak.f13214b) {
            try {
                AbstractC2907C.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                C2021vc c2021vc = this.f16571c;
                if (((AtomicInteger) c2021vc.f663b).get() != -1 && ((AtomicInteger) c2021vc.f663b).get() != 1) {
                    E9 e9 = H9.B8;
                    C2841s c2841s = C2841s.f23267e;
                    if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                        c2021vc.C("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                    } else {
                        c2021vc.B();
                    }
                    AbstractC0640Nf.f10010f.execute(new RunnableC1752qc(this.f16572d, 0));
                    String strValueOf = String.valueOf(c2841s.f23270c.a(H9.f8733e));
                    int i = ((AtomicInteger) c2021vc.f663b).get();
                    int i3 = c0895ak.f13219g;
                    ArrayList arrayList = this.f16573e;
                    if (arrayList.isEmpty()) {
                        string = ". Still waiting for the engine to be loaded";
                    } else {
                        String strValueOf2 = String.valueOf(arrayList.get(0));
                        StringBuilder sb = new StringBuilder(strValueOf2.length() + 88);
                        sb.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                        sb.append(strValueOf2);
                        string = sb.toString();
                    }
                    p2.j.f22785C.f22797k.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f16574f;
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 107 + String.valueOf(i).length() + 36 + String.valueOf(i3).length() + string.length() + 39 + String.valueOf(jCurrentTimeMillis).length() + 26);
                    sb2.append("Could not finish the full JS engine loading in ");
                    sb2.append(strValueOf);
                    sb2.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                    sb2.append(i);
                    sb2.append(". Update status(fullLoadTimeout) is ");
                    sb2.append(i3);
                    sb2.append(string);
                    sb2.append(" ms. Total latency(fullLoadTimeout) is ");
                    sb2.append(jCurrentTimeMillis);
                    sb2.append(" ms at timeout. Rejecting.");
                    AbstractC2907C.m(sb2.toString());
                    AbstractC2907C.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                AbstractC2907C.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16569a) {
            case 0:
                a();
                return;
            default:
                C0895ak c0895ak = this.f16570b;
                C2021vc c2021vc = this.f16571c;
                C1536mc c1536mc = this.f16572d;
                ArrayList arrayList = this.f16573e;
                long j6 = this.f16574f;
                AbstractC2907C.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                synchronized (c0895ak.f13214b) {
                    try {
                        AbstractC2907C.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                        if (((AtomicInteger) c2021vc.f663b).get() != -1 && ((AtomicInteger) c2021vc.f663b).get() != 1) {
                            E9 e9 = H9.B8;
                            C2841s c2841s = C2841s.f23267e;
                            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                                c2021vc.C("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                            } else {
                                c2021vc.B();
                            }
                            AbstractC0640Nf.f10010f.execute(new RunnableC1752qc(c1536mc, 1));
                            String strValueOf = String.valueOf(c2841s.f23270c.a(H9.f8726d));
                            int i = ((AtomicInteger) c2021vc.f663b).get();
                            int i3 = c0895ak.f13219g;
                            String strValueOf2 = String.valueOf(arrayList.get(0));
                            p2.j.f22785C.f22797k.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis() - j6;
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 94 + String.valueOf(i).length() + 39 + String.valueOf(i3).length() + 57 + strValueOf2.length() + 42 + String.valueOf(jCurrentTimeMillis).length() + 15);
                            sb.append("Could not receive /jsLoaded in ");
                            sb.append(strValueOf);
                            sb.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                            sb.append(i);
                            sb.append(". Update status(onEngLoadedTimeout) is ");
                            sb.append(i3);
                            sb.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                            sb.append(strValueOf2);
                            sb.append(" ms. Total latency(onEngLoadedTimeout) is ");
                            sb.append(jCurrentTimeMillis);
                            sb.append(" ms. Rejecting.");
                            AbstractC2907C.m(sb.toString());
                            AbstractC2907C.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                            return;
                        }
                        AbstractC2907C.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
