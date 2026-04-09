package T;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class D implements F1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f20842a;

    public D(InterfaceC6835l interfaceC6835l) {
        this.f20842a = interfaceC6835l;
    }

    @Override // T.F1
    public Object a(A0 a02) {
        return this.f20842a.invoke(a02);
    }

    public final InterfaceC6835l b() {
        return this.f20842a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && AbstractC6492s.d(this.f20842a, ((D) obj).f20842a);
    }

    public int hashCode() {
        return this.f20842a.hashCode();
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.f20842a + ')';
    }
}
