package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashMap;
import q2.C2841s;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.Ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0420Ag implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7017a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7018b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7019c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7021e;

    public /* synthetic */ RunnableC0420Ag(Ps ps, long j6, Ms ms, Bundle bundle) {
        this.f7019c = ps;
        this.f7018b = j6;
        this.f7020d = ms;
        this.f7021e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7017a) {
            case 0:
                HashMap map = new HashMap();
                map.put("event", "precacheComplete");
                map.put("src", (String) this.f7019c);
                map.put("cachedSrc", (String) this.f7020d);
                map.put("totalDuration", Long.toString(this.f7018b));
                ((AbstractC0454Cg) this.f7021e).n(map);
                return;
            default:
                Ps ps = (Ps) this.f7019c;
                long j6 = this.f7018b;
                Ms ms = (Ms) this.f7020d;
                Bundle bundle = (Bundle) this.f7021e;
                p2.j jVar = p2.j.f22785C;
                jVar.f22797k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j6;
                if (((Boolean) AbstractC1480la.f15412a.v()).booleanValue()) {
                    String canonicalName = ms.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = "";
                    }
                    StringBuilder sb = new StringBuilder(canonicalName.length() + 25 + String.valueOf(jElapsedRealtime).length());
                    sb.append("Signal runtime (ms) : ");
                    sb.append(canonicalName);
                    sb.append(" = ");
                    sb.append(jElapsedRealtime);
                    AbstractC2907C.m(sb.toString());
                }
                E9 e9 = H9.f8565B2;
                C2841s c2841s = C2841s.f23267e;
                if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                    if (((Boolean) c2841s.f23270c.a(H9.H2)).booleanValue()) {
                        synchronized (ps) {
                            int iC = ms.c();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iC).length() + 3);
                            sb2.append("sig");
                            sb2.append(iC);
                            bundle.putLong(sb2.toString(), jElapsedRealtime);
                        }
                    }
                }
                if (((Boolean) c2841s.f23270c.a(H9.f8868z2)).booleanValue()) {
                    C0697Ql c0697QlA = ps.f10527e.a();
                    c0697QlA.r("action", "lat_ms");
                    c0697QlA.r("lat_grp", "sig_lat_grp");
                    c0697QlA.r("lat_id", String.valueOf(ms.c()));
                    c0697QlA.r("clat_ms", String.valueOf(jElapsedRealtime));
                    if (((Boolean) c2841s.f23270c.a(H9.f8560A2)).booleanValue()) {
                        synchronized (ps) {
                            ps.f10529g++;
                        }
                        c0697QlA.r("seq_num", jVar.f22795h.f8970c.f9321c.o());
                        synchronized (ps) {
                            try {
                                if (ps.f10529g == ps.f10524b.size() && ps.f10528f != 0) {
                                    ps.f10529g = 0;
                                    jVar.f22797k.getClass();
                                    String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - ps.f10528f);
                                    if (ms.c() <= 39 || ms.c() >= 52) {
                                        c0697QlA.r("lat_clsg", strValueOf);
                                    } else {
                                        c0697QlA.r("lat_gmssg", strValueOf);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    ((C0784Vn) c0697QlA.f10692c).f12084b.execute(new RunnableC0767Un(c0697QlA, 1));
                    return;
                }
                return;
        }
    }

    public RunnableC0420Ag(AbstractC0454Cg abstractC0454Cg, String str, String str2, long j6) {
        this.f7019c = str;
        this.f7020d = str2;
        this.f7018b = j6;
        this.f7021e = abstractC0454Cg;
    }
}
