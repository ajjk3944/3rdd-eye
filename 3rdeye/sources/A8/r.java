package A8;

/* compiled from: RelaunchResult.kt */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f156a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f157b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f158c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f159d;

    public r() {
        this(false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f156a == rVar.f156a && this.f157b == rVar.f157b && this.f158c == rVar.f158c && this.f159d == rVar.f159d;
    }

    public final int hashCode() {
        return ((((((this.f156a ? 1231 : 1237) * 31) + (this.f157b ? 1231 : 1237)) * 31) + (this.f158c ? 1231 : 1237)) * 31) + (this.f159d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelaunchResult(premiumOfferingShown=");
        sb.append(this.f156a);
        sb.append(", interstitialAdShown=");
        sb.append(this.f157b);
        sb.append(", rateUiShown=");
        sb.append(this.f158c);
        sb.append(", isFirstAppStart=");
        return androidx.work.s.h(sb, this.f159d, ")");
    }

    public r(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f156a = z10;
        this.f157b = z11;
        this.f158c = z12;
        this.f159d = z13;
    }
}
