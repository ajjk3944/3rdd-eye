package R0;

import kotlin.jvm.internal.AbstractC6492s;
import l0.C6533i;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private final T f19448a;

    /* renamed from: b, reason: collision with root package name */
    private final L f19449b;

    public Z(T t10, L l10) {
        this.f19448a = t10;
        this.f19449b = l10;
    }

    public final void a() {
        this.f19448a.g(this);
    }

    public final boolean b() {
        return AbstractC6492s.d(this.f19448a.a(), this);
    }

    public final boolean c(C6533i c6533i) {
        boolean zB = b();
        if (zB) {
            this.f19449b.h(c6533i);
        }
        return zB;
    }

    public final boolean d(Q q10, Q q11) {
        boolean zB = b();
        if (zB) {
            this.f19449b.f(q10, q11);
        }
        return zB;
    }

    public final boolean e(Q q10, H h10, L0.M m10, InterfaceC6835l interfaceC6835l, C6533i c6533i, C6533i c6533i2) {
        boolean zB = b();
        if (zB) {
            this.f19449b.e(q10, h10, m10, interfaceC6835l, c6533i, c6533i2);
        }
        return zB;
    }
}
