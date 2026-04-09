package xl;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f25444a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25445b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25446c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25447d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25448e;

    public /* synthetic */ a(int i10, int i11, int i12) {
        this(false, i10, i11, -1, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25444a == aVar.f25444a && this.f25445b == aVar.f25445b && this.f25446c == aVar.f25446c && this.f25447d == aVar.f25447d && this.f25448e == aVar.f25448e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25448e) + c7.a.C(this.f25447d, c7.a.C(this.f25446c, c7.a.C(this.f25445b, Integer.hashCode(this.f25444a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnBoardingPageItem(pageDescriptionResId=");
        sb2.append(this.f25444a);
        sb2.append(", pageTitleResId=");
        sb2.append(this.f25445b);
        sb2.append(", pageSubtitleResId=");
        sb2.append(this.f25446c);
        sb2.append(", imageResourceId=");
        sb2.append(this.f25447d);
        sb2.append(", showSubtitle=");
        return c7.a.r(sb2, this.f25448e, ')');
    }

    public a(boolean z10, int i10, int i11, int i12, int i13) {
        this.f25444a = i10;
        this.f25445b = i11;
        this.f25446c = i12;
        this.f25447d = i13;
        this.f25448e = z10;
    }
}
