package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class au2 {
    public final l92 b;
    public final Context c;
    public final mv2 d;
    public final Executor e;
    public final vs1 f;
    public final e51 g;
    public final jz2 i;
    public final eb3 j;
    public final pz2 k;
    public final m83 l;
    public rp3 m;
    public final vt2 a = new vt2();
    public final v32 h = new v32();

    public au2(zt2 zt2Var) {
        this.c = zt2Var.b;
        this.e = zt2Var.e;
        this.f = zt2Var.f;
        this.g = zt2Var.g;
        this.b = zt2Var.a;
        this.i = zt2Var.d;
        this.j = zt2Var.h;
        this.d = zt2Var.c;
        this.k = zt2Var.i;
        this.l = zt2Var.j;
    }

    public final synchronized n70 a(String str, JSONObject jSONObject) {
        rp3 rp3Var = this.m;
        if (rp3Var == null) {
            return lq3.g;
        }
        return pu1.O(rp3Var, new op1(this, str, jSONObject), this.e);
    }

    public final synchronized void b(String str, y32 y32Var) {
        rp3 rp3Var = this.m;
        if (rp3Var == null) {
            return;
        }
        gw3 gw3Var = new gw3(this, str, y32Var);
        rp3Var.c(new jq3(rp3Var, gw3Var, 0), this.e);
    }

    public final synchronized void c(String str, y32 y32Var) {
        rp3 rp3Var = this.m;
        if (rp3Var == null) {
            return;
        }
        wt2 wt2Var = new wt2(this, str, y32Var);
        rp3Var.c(new jq3(rp3Var, wt2Var, 0), this.e);
    }

    public final synchronized void d(Map map) {
        rp3 rp3Var = this.m;
        if (rp3Var == null) {
            return;
        }
        f23 f23Var = new f23(this, map);
        rp3Var.c(new jq3(rp3Var, f23Var, 0), this.e);
    }
}
