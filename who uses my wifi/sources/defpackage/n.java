package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class n extends g40 implements oj, qk {
    public final hk h;

    public n(hk hkVar, boolean z) {
        super(z);
        D((w30) hkVar.h(fr.j));
        this.h = hkVar.g(this);
    }

    @Override // defpackage.g40
    public final void C(rg rgVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        uk2.q(this.h, rgVar);
    }

    @Override // defpackage.g40
    public final void K(Object obj) {
        if (obj instanceof pg) {
            pg.b.get((pg) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(tk tkVar, n nVar, hy hyVar) {
        int iOrdinal = tkVar.ordinal();
        if (iOrdinal == 0) {
            yb.q(hyVar, nVar, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                uk2.r(((s9) hyVar).h(this, nVar)).e(z31.a);
                return;
            }
            if (iOrdinal != 3) {
                throw new rg();
            }
            try {
                hk hkVar = this.h;
                Object objY = wl2.y(hkVar, null);
                try {
                    qb1.b(2, hyVar);
                    Object objF = hyVar.f(nVar, this);
                    if (objF != rk.f) {
                        e(objF);
                    }
                } finally {
                    wl2.v(hkVar, objY);
                }
            } catch (Throwable th) {
                e(bd2.k(th));
            }
        }
    }

    @Override // defpackage.qk
    public final hk b() {
        return this.h;
    }

    @Override // defpackage.oj
    public final void e(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable thA = jq0.a(obj);
        if (thA != null) {
            obj = new pg(thA, false);
        }
        Object objG = G(obj);
        if (objG == wl2.c) {
            return;
        }
        n(objG);
    }

    @Override // defpackage.oj
    public final hk getContext() {
        return this.h;
    }

    @Override // defpackage.g40
    public final String q() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
