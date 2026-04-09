package r;

import kotlin.jvm.internal.C6486l;

/* renamed from: r.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7537l {
    public static final C7536k a(float f10, float f11, long j10, long j11, boolean z10) {
        return new C7536k(u0.f(C6486l.f51726a), Float.valueOf(f10), r.a(f11), j10, j11, z10);
    }

    public static final C7536k b(s0 s0Var, Object obj, Object obj2, long j10, long j11, boolean z10) {
        return new C7536k(s0Var, obj, (AbstractC7542q) s0Var.a().invoke(obj2), j10, j11, z10);
    }

    public static /* synthetic */ C7536k c(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        long j12 = (i10 & 4) != 0 ? Long.MIN_VALUE : j10;
        long j13 = (i10 & 8) == 0 ? j11 : Long.MIN_VALUE;
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return a(f10, f11, j12, j13, z10);
    }

    public static final C7536k e(C7536k c7536k, float f10, float f11, long j10, long j11, boolean z10) {
        return new C7536k(c7536k.j(), Float.valueOf(f10), r.a(f11), j10, j11, z10);
    }

    public static final C7536k f(C7536k c7536k, Object obj, AbstractC7542q abstractC7542q, long j10, long j11, boolean z10) {
        return new C7536k(c7536k.j(), obj, abstractC7542q, j10, j11, z10);
    }

    public static /* synthetic */ C7536k g(C7536k c7536k, float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) c7536k.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((C7538m) c7536k.q()).f();
        }
        float f12 = f11;
        if ((i10 & 4) != 0) {
            j10 = c7536k.i();
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = c7536k.g();
        }
        long j13 = j11;
        if ((i10 & 16) != 0) {
            z10 = c7536k.r();
        }
        return e(c7536k, f10, f12, j12, j13, z10);
    }

    public static /* synthetic */ C7536k h(C7536k c7536k, Object obj, AbstractC7542q abstractC7542q, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = c7536k.getValue();
        }
        if ((i10 & 2) != 0) {
            abstractC7542q = r.e(c7536k.q());
        }
        AbstractC7542q abstractC7542q2 = abstractC7542q;
        if ((i10 & 4) != 0) {
            j10 = c7536k.i();
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = c7536k.g();
        }
        long j13 = j11;
        if ((i10 & 16) != 0) {
            z10 = c7536k.r();
        }
        return f(c7536k, obj, abstractC7542q2, j12, j13, z10);
    }

    public static final AbstractC7542q i(s0 s0Var, Object obj) {
        AbstractC7542q abstractC7542q = (AbstractC7542q) s0Var.a().invoke(obj);
        abstractC7542q.d();
        return abstractC7542q;
    }
}
