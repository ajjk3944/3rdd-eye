package defpackage;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mv2 {
    public final pv2 a;
    public final Executor b;
    public final HashMap c;

    public mv2(pv2 pv2Var, ld2 ld2Var) {
        this.a = pv2Var;
        pv2Var.getClass();
        this.c = new HashMap(pv2Var.a);
        this.b = ld2Var;
    }

    public final lv2 a() {
        lv2 lv2Var = new lv2(this);
        ((ConcurrentHashMap) lv2Var.g).putAll(this.c);
        return lv2Var;
    }

    public final void b() {
        if (((Boolean) tw1.e.c.a(mz1.sc)).booleanValue()) {
            lv2 lv2VarA = a();
            lv2VarA.k("action", "pecr");
            lv2VarA.m();
        }
    }
}
