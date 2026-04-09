package T;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class N implements F1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3551q0 f20894a;

    public N(InterfaceC3551q0 interfaceC3551q0) {
        this.f20894a = interfaceC3551q0;
    }

    @Override // T.F1
    public Object a(A0 a02) {
        return this.f20894a.getValue();
    }

    public final InterfaceC3551q0 b() {
        return this.f20894a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N) && AbstractC6492s.d(this.f20894a, ((N) obj).f20894a);
    }

    public int hashCode() {
        return this.f20894a.hashCode();
    }

    public String toString() {
        return "DynamicValueHolder(state=" + this.f20894a + ')';
    }
}
