package e0;

import t2.f;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f7632a;

    public b(float f10) {
        this.f7632a = f10;
    }

    @Override // e0.a
    public final float a(long j, t2.c cVar) {
        return cVar.z(this.f7632a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.a(this.f7632a, ((b) obj).f7632a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f7632a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f7632a + ".dp)";
    }
}
