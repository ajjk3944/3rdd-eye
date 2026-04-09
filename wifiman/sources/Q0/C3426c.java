package Q0;

import sh.AbstractC7978m;

/* renamed from: Q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3426c implements H {

    /* renamed from: b, reason: collision with root package name */
    private final int f19030b;

    public C3426c(int i10) {
        this.f19030b = i10;
    }

    @Override // Q0.H
    public A c(A a10) {
        int i10 = this.f19030b;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? a10 : new A(AbstractC7978m.k(a10.p() + this.f19030b, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3426c) && this.f19030b == ((C3426c) obj).f19030b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f19030b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f19030b + ')';
    }
}
