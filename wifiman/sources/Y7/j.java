package y7;

import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class j implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f66390a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f66391b = true;

    public j(boolean z10) {
        this.f66390a = z10;
    }

    public final boolean a() {
        return this.f66390a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f66390a == ((j) obj).f66390a;
    }

    public int hashCode() {
        boolean z10 = this.f66390a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f66391b;
    }

    public String toString() {
        return "MikrotikUnpack(value=" + this.f66390a + ")";
    }
}
