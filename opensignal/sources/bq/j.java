package bq;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2872a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2873b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2874c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2875d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2876e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2877f;

    public j(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        br.l.e(str, "backButtonText");
        br.l.e(str2, "submitButtonText");
        this.f2872a = str;
        this.f2873b = str2;
        this.f2874c = z10;
        this.f2875d = z11;
        this.f2876e = z12;
        this.f2877f = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return br.l.a(this.f2872a, jVar.f2872a) && br.l.a(this.f2873b, jVar.f2873b) && this.f2874c == jVar.f2874c && this.f2875d == jVar.f2875d && this.f2876e == jVar.f2876e && this.f2877f == jVar.f2877f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iG = c7.a.g(this.f2873b, this.f2872a.hashCode() * 31, 31);
        boolean z10 = this.f2874c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iG + i10) * 31;
        boolean z11 = this.f2875d;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f2876e;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.f2877f;
        return i15 + (z13 ? 1 : z13 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubmitViewConfiguration(backButtonText=");
        sb2.append(this.f2872a);
        sb2.append(", submitButtonText=");
        sb2.append(this.f2873b);
        sb2.append(", hasNavigationButtons=");
        sb2.append(this.f2874c);
        sb2.append(", isFirstSurveyPoint=");
        sb2.append(this.f2875d);
        sb2.append(", isFirstPointForFirstTime=");
        sb2.append(this.f2876e);
        sb2.append(", forceCenter=");
        return c7.a.r(sb2, this.f2877f, ')');
    }
}
