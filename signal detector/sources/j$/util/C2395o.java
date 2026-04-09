package j$.util;

/* renamed from: j$.util.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2395o {

    /* renamed from: c, reason: collision with root package name */
    public static final C2395o f20813c = new C2395o();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20814a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20815b;

    public C2395o() {
        this.f20814a = false;
        this.f20815b = 0L;
    }

    public C2395o(long j6) {
        this.f20814a = true;
        this.f20815b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2395o)) {
            return false;
        }
        C2395o c2395o = (C2395o) obj;
        boolean z6 = this.f20814a;
        return (z6 && c2395o.f20814a) ? this.f20815b == c2395o.f20815b : z6 == c2395o.f20814a;
    }

    public final int hashCode() {
        if (!this.f20814a) {
            return 0;
        }
        long j6 = this.f20815b;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        if (this.f20814a) {
            return "OptionalLong[" + this.f20815b + "]";
        }
        return "OptionalLong.empty";
    }
}
