package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33421a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33422b;

    public r() {
        this.f33421a = false;
        this.f33422b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f33421a == rVar.f33421a && this.f33422b == rVar.f33422b;
    }

    public final int hashCode() {
        return ((this.f33421a ? 1231 : 1237) * 31) + this.f33422b;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f33421a + ", emojiSupportMatch=" + ((Object) h.a(this.f33422b)) + ')';
    }

    public r(int i4, boolean z3) {
        this.f33421a = z3;
        this.f33422b = i4;
    }
}
