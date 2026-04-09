package bq;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2884a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2885b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2886c;

    public m(String str, boolean z10, boolean z11) {
        br.l.e(str, "submitText");
        this.f2884a = z10;
        this.f2885b = str;
        this.f2886c = z11;
    }

    @Override // bq.n
    public final boolean a() {
        return this.f2886c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f2884a == mVar.f2884a && br.l.a(this.f2885b, mVar.f2885b) && this.f2886c == mVar.f2886c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        boolean z10 = this.f2884a;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int iG = c7.a.g(this.f2885b, r12 * 31, 31);
        boolean z11 = this.f2886c;
        return iG + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Submit(submitEnabled=");
        sb2.append(this.f2884a);
        sb2.append(", submitText=");
        sb2.append(this.f2885b);
        sb2.append(", forceCenter=");
        return c7.a.r(sb2, this.f2886c, ')');
    }
}
