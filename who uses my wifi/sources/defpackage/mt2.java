package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mt2 {
    public final l83 a;
    public final Executor b;
    public final pu2 c;
    public final du2 d;
    public final Context e;
    public final mv2 f;
    public final eb3 g;
    public final jz2 h;
    public final jv2 i;
    public final xv2 j;

    public mt2(l83 l83Var, Executor executor, pu2 pu2Var, Context context, mv2 mv2Var, eb3 eb3Var, jz2 jz2Var, du2 du2Var, jv2 jv2Var, xv2 xv2Var) {
        this.a = l83Var;
        this.b = executor;
        this.c = pu2Var;
        this.e = context;
        this.f = mv2Var;
        this.g = eb3Var;
        this.h = jz2Var;
        this.d = du2Var;
        this.i = jv2Var;
        this.j = xv2Var;
    }

    public static final void b(ag2 ag2Var) {
        ag2Var.v0("/videoClicked", x32.d);
        sg2 sg2VarE0 = ag2Var.e0();
        synchronized (sg2VarE0.i) {
            sg2VarE0.w = true;
        }
        ag2Var.v0("/getNativeAdViewSignals", x32.n);
        ag2Var.v0("/getNativeClickMeta", x32.o);
    }

    public final void a(ag2 ag2Var, su1 su1Var, sb2 sb2Var) {
        xv2 xv2Var;
        b(ag2Var);
        ag2Var.v0("/video", x32.g);
        ag2Var.v0("/videoMeta", x32.h);
        ag2Var.v0("/precache", new o32(26));
        ag2Var.v0("/delayPageLoaded", x32.k);
        ag2Var.v0("/instrument", x32.i);
        ag2Var.v0("/log", x32.c);
        ag2Var.v0("/click", new v32(null, null, 0));
        if (this.a.b != null) {
            sg2 sg2VarE0 = ag2Var.e0();
            synchronized (sg2VarE0.i) {
                sg2VarE0.y = true;
            }
            ag2Var.v0("/open", new i42(true != ((Boolean) tw1.e.c.a(mz1.pe)).booleanValue() ? null : su1Var, null, null, null, null, null));
        } else {
            sg2 sg2VarE02 = ag2Var.e0();
            synchronized (sg2VarE02.i) {
                sg2VarE02.y = false;
            }
        }
        if (hg4.C.y.a(ag2Var.getContext())) {
            HashMap map = new HashMap();
            if (ag2Var.F() != null) {
                map = ag2Var.F().w0;
            }
            ag2Var.v0("/logScionEvent", new v32(ag2Var.getContext(), map, 1));
        }
        iz1 iz1Var = mz1.pe;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            ag2Var.e0().B = su1Var;
            ag2Var.e0().D = sb2Var;
        }
        if (!((Boolean) tw1Var.c.a(mz1.l8)).booleanValue() || (xv2Var = this.j) == null) {
            return;
        }
        ag2Var.v0("/onDeviceStorageEvent", new k32(3, xv2Var));
    }
}
