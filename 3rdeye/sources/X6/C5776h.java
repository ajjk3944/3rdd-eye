package x6;

import N7.H7;

/* compiled from: DivVideoResolution.kt */
/* renamed from: x6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5776h {

    /* renamed from: a, reason: collision with root package name */
    public final int f47790a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47791b;

    public C5776h(int i, int i10) {
        this.f47790a = i;
        this.f47791b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5776h)) {
            return false;
        }
        C5776h c5776h = (C5776h) obj;
        return this.f47790a == c5776h.f47790a && this.f47791b == c5776h.f47791b;
    }

    public final int hashCode() {
        return (this.f47790a * 31) + this.f47791b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivVideoResolution(width=");
        sb.append(this.f47790a);
        sb.append(", height=");
        return H7.p(sb, this.f47791b, ')');
    }
}
