package androidx.media3.common;

/* loaded from: classes.dex */
public final class m implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f1719a;

    /* renamed from: d, reason: collision with root package name */
    public final int f1720d;

    /* renamed from: g, reason: collision with root package name */
    public final int f1721g;

    static {
        int i10 = a5.d0.f105a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public m(int i10, int i11, int i12) {
        this.f1719a = i10;
        this.f1720d = i11;
        this.f1721g = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f1719a == mVar.f1719a && this.f1720d == mVar.f1720d && this.f1721g == mVar.f1721g;
    }

    public final int hashCode() {
        return ((((527 + this.f1719a) * 31) + this.f1720d) * 31) + this.f1721g;
    }
}
