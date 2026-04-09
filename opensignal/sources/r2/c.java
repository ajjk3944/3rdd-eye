package r2;

import g1.f0;

/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final long f21195a;

    public c(long j) {
        this.f21195a = j;
        if (j != 16) {
            return;
        }
        m2.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // r2.o
    public final float a() {
        return g1.r.d(this.f21195a);
    }

    @Override // r2.o
    public final long b() {
        return this.f21195a;
    }

    @Override // r2.o
    public final f0 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && g1.r.c(this.f21195a, ((c) obj).f21195a);
    }

    public final int hashCode() {
        int i10 = g1.r.f9270h;
        return Long.hashCode(this.f21195a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) g1.r.i(this.f21195a)) + ')';
    }
}
