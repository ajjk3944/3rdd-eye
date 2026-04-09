package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sy implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16588a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16590c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16592e;

    public /* synthetic */ sy(tn0 tn0Var, long j, qn0 qn0Var, Bundle bundle) {
        this.f16590c = tn0Var;
        this.f16589b = j;
        this.f16591d = qn0Var;
        this.f16592e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16588a) {
            case 0:
                HashMap map = new HashMap();
                map.put("event", "precacheComplete");
                map.put("src", (String) this.f16590c);
                map.put("cachedSrc", (String) this.f16591d);
                map.put("totalDuration", Long.toString(this.f16589b));
                ((uy) this.f16592e).s(map);
                return;
            default:
                tn0 tn0Var = (tn0) this.f16590c;
                long j = this.f16589b;
                qn0 qn0Var = (qn0) this.f16591d;
                Bundle bundle = (Bundle) this.f16592e;
                ua.j jVar = ua.j.C;
                jVar.f35267k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                if (((Boolean) wl.f18052a.u()).booleanValue()) {
                    String canonicalName = qn0Var.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = "";
                    }
                    StringBuilder sb2 = new StringBuilder(canonicalName.length() + 25 + String.valueOf(jElapsedRealtime).length());
                    sb2.append("Signal runtime (ms) : ");
                    sb2.append(canonicalName);
                    sb2.append(" = ");
                    sb2.append(jElapsedRealtime);
                    ya.a0.m(sb2.toString());
                }
                pk pkVar = sk.B2;
                va.s sVar = va.s.f36163e;
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                    if (((Boolean) sVar.f36166c.a(sk.H2)).booleanValue()) {
                        synchronized (tn0Var) {
                            int iA = qn0Var.a();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iA).length() + 3);
                            sb3.append("sig");
                            sb3.append(iA);
                            bundle.putLong(sb3.toString(), jElapsedRealtime);
                        }
                    }
                }
                if (((Boolean) sVar.f36166c.a(sk.f16430z2)).booleanValue()) {
                    rt rtVarA = tn0Var.f16889e.a();
                    rtVarA.u("action", "lat_ms");
                    rtVarA.u("lat_grp", "sig_lat_grp");
                    rtVarA.u("lat_id", String.valueOf(qn0Var.a()));
                    rtVarA.u("clat_ms", String.valueOf(jElapsedRealtime));
                    if (((Boolean) sVar.f36166c.a(sk.A2)).booleanValue()) {
                        synchronized (tn0Var) {
                            tn0Var.g++;
                        }
                        rtVarA.u("seq_num", jVar.f35265h.f19195c.f9836c.p());
                        synchronized (tn0Var) {
                            try {
                                if (tn0Var.g == tn0Var.f16886b.size() && tn0Var.f16890f != 0) {
                                    tn0Var.g = 0;
                                    jVar.f35267k.getClass();
                                    String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - tn0Var.f16890f);
                                    if (qn0Var.a() <= 39 || qn0Var.a() >= 52) {
                                        rtVarA.u("lat_clsg", strValueOf);
                                    } else {
                                        rtVarA.u("lat_gmssg", strValueOf);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    ((qd0) rtVarA.f15754c).f15316b.execute(new pd0(rtVarA, 1));
                    return;
                }
                return;
        }
    }

    public sy(uy uyVar, String str, String str2, long j) {
        this.f16590c = str;
        this.f16591d = str2;
        this.f16589b = j;
        this.f16592e = uyVar;
    }
}
