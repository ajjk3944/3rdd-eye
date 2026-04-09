package y7;

import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class p implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f66414a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f66415b = true;

    public p(boolean z10) {
        this.f66414a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f66414a == ((p) obj).f66414a;
    }

    public int hashCode() {
        boolean z10 = this.f66414a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f66415b;
    }

    public String toString() {
        return "UbiquitiIsStandalone(value=" + this.f66414a + ")";
    }
}
