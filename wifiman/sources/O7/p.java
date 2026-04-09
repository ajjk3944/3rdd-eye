package o7;

import kotlin.jvm.internal.AbstractC6492s;
import u7.InterfaceC8139b;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8139b f55565a;

    /* renamed from: b, reason: collision with root package name */
    private final int f55566b;

    public p(InterfaceC8139b factory, int i10) {
        AbstractC6492s.i(factory, "factory");
        this.f55565a = factory;
        this.f55566b = i10;
    }

    public final InterfaceC8139b a() {
        return this.f55565a;
    }

    public final int b() {
        return this.f55566b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC6492s.d(this.f55565a, pVar.f55565a) && this.f55566b == pVar.f55566b;
    }

    public int hashCode() {
        return (this.f55565a.hashCode() * 31) + Integer.hashCode(this.f55566b);
    }

    public String toString() {
        return "PrioritizedServerFactory(factory=" + this.f55565a + ", priority=" + this.f55566b + ")";
    }
}
