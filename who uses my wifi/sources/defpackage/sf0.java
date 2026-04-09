package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sf0 implements jd, w71 {
    public final kd f;
    public final /* synthetic */ tf0 g;

    public sf0(tf0 tf0Var, kd kdVar) {
        this.g = tf0Var;
        this.f = kdVar;
    }

    @Override // defpackage.w71
    public final void a(yt0 yt0Var, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f.a(yt0Var, i);
    }

    @Override // defpackage.oj
    public final void e(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f.e(obj);
    }

    @Override // defpackage.oj
    public final hk getContext() {
        return this.f.j;
    }

    @Override // defpackage.jd
    public final void j(Object obj) {
        this.f.j(obj);
    }

    @Override // defpackage.jd
    public final void k(Object obj, dy dyVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tf0.h;
        tf0 tf0Var = this.g;
        atomicReferenceFieldUpdater.set(tf0Var, null);
        this.f.k(z31.a, new rf0(tf0Var, this, 0));
    }

    @Override // defpackage.jd
    public final gs3 l(Object obj, dy dyVar) {
        tf0 tf0Var = this.g;
        rf0 rf0Var = new rf0(tf0Var, this, 1);
        gs3 gs3VarL = this.f.l((z31) obj, rf0Var);
        if (gs3VarL != null) {
            tf0.h.set(tf0Var, null);
        }
        return gs3VarL;
    }
}
