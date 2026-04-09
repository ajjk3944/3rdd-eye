package a5;

import o4.AbstractC2763b;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4740a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4741b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4742c;

    public C0274a(int i, int i3, int i6) {
        this.f4740a = i;
        this.f4741b = i3;
        this.f4742c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0274a)) {
            return false;
        }
        C0274a c0274a = (C0274a) obj;
        return this.f4740a == c0274a.f4740a && this.f4741b == c0274a.f4741b && this.f4742c == c0274a.f4742c;
    }

    public final int hashCode() {
        return (((this.f4740a * 31) + this.f4741b) * 31) + this.f4742c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LteBandInfo(band=");
        sb.append(this.f4740a);
        sb.append(", downlinkFreq=");
        sb.append(this.f4741b);
        sb.append(", uplinkFreq=");
        return AbstractC2763b.d(this.f4742c, ")", sb);
    }
}
