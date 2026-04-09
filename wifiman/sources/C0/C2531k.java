package C0;

/* renamed from: C0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2531k implements InterfaceC2528h {

    /* renamed from: b, reason: collision with root package name */
    private final float f2157b;

    public C2531k(float f10) {
        this.f2157b = f10;
    }

    @Override // C0.InterfaceC2528h
    public long a(long j10, long j11) {
        float f10 = this.f2157b;
        return T.a(f10, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2531k) && Float.compare(this.f2157b, ((C2531k) obj).f2157b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f2157b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f2157b + ')';
    }
}
