package jf;

/* renamed from: jf.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6323f {

    /* renamed from: a, reason: collision with root package name */
    private final long f50825a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f50826b;

    public C6323f(long j10, boolean z10) {
        this.f50825a = j10;
        this.f50826b = z10;
    }

    public final long a() {
        return this.f50825a;
    }

    public final boolean b() {
        return this.f50826b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6323f)) {
            return false;
        }
        C6323f c6323f = (C6323f) obj;
        return this.f50825a == c6323f.f50825a && this.f50826b == c6323f.f50826b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f50825a) * 31) + Boolean.hashCode(this.f50826b);
    }

    public String toString() {
        return "Params(speedtestId=" + this.f50825a + ", isJustFinished=" + this.f50826b + ")";
    }
}
