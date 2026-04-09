package j$.util;

/* renamed from: j$.util.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2394n {

    /* renamed from: c, reason: collision with root package name */
    public static final C2394n f20810c = new C2394n();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20811a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20812b;

    public C2394n() {
        this.f20811a = false;
        this.f20812b = 0;
    }

    public C2394n(int i) {
        this.f20811a = true;
        this.f20812b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2394n)) {
            return false;
        }
        C2394n c2394n = (C2394n) obj;
        boolean z6 = this.f20811a;
        return (z6 && c2394n.f20811a) ? this.f20812b == c2394n.f20812b : z6 == c2394n.f20811a;
    }

    public final int hashCode() {
        if (this.f20811a) {
            return this.f20812b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f20811a) {
            return "OptionalInt[" + this.f20812b + "]";
        }
        return "OptionalInt.empty";
    }
}
