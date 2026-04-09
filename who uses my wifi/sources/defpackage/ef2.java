package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ef2 implements Runnable {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ ef2(s53 s53Var, long j, q53 q53Var, Bundle bundle) {
        this.h = s53Var;
        this.g = j;
        this.i = q53Var;
        this.j = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f) {
            case 0:
                HashMap map = new HashMap();
                map.put("event", "precacheComplete");
                map.put("src", (String) this.h);
                map.put("cachedSrc", (String) this.i);
                map.put("totalDuration", Long.toString(this.g));
                ((ff2) this.j).n(map);
                return;
            default:
                s53 s53Var = (s53) this.h;
                long j = this.g;
                q53 q53Var = (q53) this.i;
                Bundle bundle = (Bundle) this.j;
                hg4 hg4Var = hg4.C;
                hg4Var.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                if (((Boolean) u02.a.w()).booleanValue()) {
                    String canonicalName = q53Var.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = "";
                    }
                    StringBuilder sb = new StringBuilder(canonicalName.length() + 25 + String.valueOf(jElapsedRealtime).length());
                    sb.append("Signal runtime (ms) : ");
                    sb.append(canonicalName);
                    sb.append(" = ");
                    sb.append(jElapsedRealtime);
                    gi2.G(sb.toString());
                }
                iz1 iz1Var = mz1.m2;
                tw1 tw1Var = tw1.e;
                if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                    if (((Boolean) tw1Var.c.a(mz1.s2)).booleanValue()) {
                        synchronized (s53Var) {
                            int iD = q53Var.d();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 3);
                            sb2.append("sig");
                            sb2.append(iD);
                            bundle.putLong(sb2.toString(), jElapsedRealtime);
                        }
                    }
                }
                if (((Boolean) tw1Var.c.a(mz1.k2)).booleanValue()) {
                    lv2 lv2VarA = s53Var.e.a();
                    lv2VarA.k("action", "lat_ms");
                    lv2VarA.k("lat_grp", "sig_lat_grp");
                    lv2VarA.k("lat_id", String.valueOf(q53Var.d()));
                    lv2VarA.k("clat_ms", String.valueOf(jElapsedRealtime));
                    if (((Boolean) tw1Var.c.a(mz1.l2)).booleanValue()) {
                        synchronized (s53Var) {
                            s53Var.g++;
                        }
                        l92 l92Var = hg4Var.h.c.h;
                        synchronized (l92Var) {
                            str = (String) l92Var.g;
                        }
                        lv2VarA.k("seq_num", str);
                        synchronized (s53Var) {
                            try {
                                if (s53Var.g == s53Var.b.size() && s53Var.f != 0) {
                                    s53Var.g = 0;
                                    hg4Var.k.getClass();
                                    String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - s53Var.f);
                                    if (q53Var.d() <= 39 || q53Var.d() >= 52) {
                                        lv2VarA.k("lat_clsg", strValueOf);
                                    } else {
                                        lv2VarA.k("lat_gmssg", strValueOf);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    ((mv2) lv2VarA.h).b.execute(new kv2(lv2VarA, 1));
                    return;
                }
                return;
        }
    }

    public ef2(ff2 ff2Var, String str, String str2, long j) {
        this.h = str;
        this.i = str2;
        this.g = j;
        this.j = ff2Var;
    }
}
