package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u33 implements q53 {
    public final Context a;
    public final String b;
    public final String c;
    public final long d;
    public final rl2 e;
    public final w83 f;
    public final l83 g;
    public final ra4 h = hg4.C.h.g();
    public final jv2 i;
    public final ul2 j;

    public u33(Context context, String str, String str2, rl2 rl2Var, w83 w83Var, l83 l83Var, jv2 jv2Var, ul2 ul2Var, long j) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.e = rl2Var;
        this.f = w83Var;
        this.g = l83Var;
        this.i = jv2Var;
        this.j = ul2Var;
        this.d = j;
    }

    @Override // defpackage.q53
    public final n70 a() {
        Bundle bundle = new Bundle();
        jv2 jv2Var = this.i;
        ConcurrentHashMap concurrentHashMap = jv2Var.a;
        String str = this.b;
        concurrentHashMap.put("seq_num", str);
        if (((Boolean) tw1.e.c.a(mz1.m2)).booleanValue()) {
            hg4.C.k.getClass();
            jv2Var.b("tsacc", String.valueOf(System.currentTimeMillis() - this.d));
            jv2Var.b("foreground", true != lf4.g(this.a) ? "1" : "0");
        }
        rl2 rl2Var = this.e;
        l83 l83Var = this.g;
        pc4 pc4Var = l83Var.d;
        dd2 dd2Var = rl2Var.g;
        synchronized (dd2Var.d) {
            dd2Var.a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            dd2Var.j = jElapsedRealtime;
            id2 id2Var = dd2Var.b;
            synchronized (id2Var.f) {
                id2Var.i.a(pc4Var, jElapsedRealtime);
            }
        }
        bundle.putAll(this.f.a());
        return pu1.r(new v33(this.a, bundle, str, this.c, this.h, l83Var.g, this.j));
    }

    @Override // defpackage.q53
    public final int d() {
        return 12;
    }
}
