package Bh;

import ji.InterfaceC6346g;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Bh.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2510u {
    protected AbstractC2510u() {
    }

    public final Integer a(AbstractC2510u visibility) {
        AbstractC6492s.i(visibility, "visibility");
        return b().a(visibility.b());
    }

    public abstract w0 b();

    public abstract String c();

    public final boolean d() {
        return b().c();
    }

    public abstract boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10);

    public abstract AbstractC2510u f();

    public final String toString() {
        return b().toString();
    }
}
