package bq;

/* loaded from: classes.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2879a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2880b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2881c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2882d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2883e;

    public l(boolean z10, String str, boolean z11, String str2, boolean z12) {
        br.l.e(str, "backText");
        br.l.e(str2, "submitText");
        this.f2879a = z10;
        this.f2880b = str;
        this.f2881c = z11;
        this.f2882d = str2;
        this.f2883e = z12;
    }

    @Override // bq.n
    public final boolean a() {
        return this.f2883e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f2879a == lVar.f2879a && br.l.a(this.f2880b, lVar.f2880b) && this.f2881c == lVar.f2881c && br.l.a(this.f2882d, lVar.f2882d) && this.f2883e == lVar.f2883e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    public final int hashCode() {
        boolean z10 = this.f2879a;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int iG = c7.a.g(this.f2880b, r12 * 31, 31);
        ?? r32 = this.f2881c;
        int i10 = r32;
        if (r32 != 0) {
            i10 = 1;
        }
        int iG2 = c7.a.g(this.f2882d, (iG + i10) * 31, 31);
        boolean z11 = this.f2883e;
        return iG2 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Navigation(backEnabled=");
        sb2.append(this.f2879a);
        sb2.append(", backText=");
        sb2.append(this.f2880b);
        sb2.append(", submitEnabled=");
        sb2.append(this.f2881c);
        sb2.append(", submitText=");
        sb2.append(this.f2882d);
        sb2.append(", forceCenter=");
        return c7.a.r(sb2, this.f2883e, ')');
    }
}
