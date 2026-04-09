package C;

import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class B implements A {

    /* renamed from: b, reason: collision with root package name */
    private final int f1847b;

    public B(int i10) {
        this.f1847b = i10;
    }

    @Override // C.A
    public int a(int i10, int i11, float f10, int i12, int i13) {
        long j10 = i10;
        return AbstractC7978m.k(i11, (int) AbstractC7978m.e(j10 - this.f1847b, 0L), (int) AbstractC7978m.h(j10 + this.f1847b, 2147483647L));
    }

    public boolean equals(Object obj) {
        return (obj instanceof B) && this.f1847b == ((B) obj).f1847b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f1847b);
    }
}
