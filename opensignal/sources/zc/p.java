package zc;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f27061a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27062b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27063c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27064d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27065e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27066f;

    /* renamed from: g, reason: collision with root package name */
    public final long f27067g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f27068h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f27069i;
    public final Long j;
    public final Boolean k;

    public p(String str, String str2, long j, long j7, long j10, long j11, long j12, Long l10, Long l11, Long l12, Boolean bool) {
        cc.s.e(str);
        cc.s.e(str2);
        cc.s.b(j >= 0);
        cc.s.b(j7 >= 0);
        cc.s.b(j10 >= 0);
        cc.s.b(j12 >= 0);
        this.f27061a = str;
        this.f27062b = str2;
        this.f27063c = j;
        this.f27064d = j7;
        this.f27065e = j10;
        this.f27066f = j11;
        this.f27067g = j12;
        this.f27068h = l10;
        this.f27069i = l11;
        this.j = l12;
        this.k = bool;
    }

    public final p a(long j) {
        return new p(this.f27061a, this.f27062b, this.f27063c, this.f27064d, this.f27065e, j, this.f27067g, this.f27068h, this.f27069i, this.j, this.k);
    }

    public final p b(Long l10, Long l11, Boolean bool) {
        return new p(this.f27061a, this.f27062b, this.f27063c, this.f27064d, this.f27065e, this.f27066f, this.f27067g, this.f27068h, l10, l11, bool);
    }
}
