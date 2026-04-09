package ec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f23030a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23031b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23032c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23033d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23034e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23035f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f23036h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f23037i;
    public final Long j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f23038k;

    public r(String str, String str2, long j, long j8, long j9, long j10, long j11, Long l10, Long l11, Long l12, Boolean bool) {
        pb.y.e(str);
        pb.y.e(str2);
        pb.y.b(j >= 0);
        pb.y.b(j8 >= 0);
        pb.y.b(j9 >= 0);
        pb.y.b(j11 >= 0);
        this.f23030a = str;
        this.f23031b = str2;
        this.f23032c = j;
        this.f23033d = j8;
        this.f23034e = j9;
        this.f23035f = j10;
        this.g = j11;
        this.f23036h = l10;
        this.f23037i = l11;
        this.j = l12;
        this.f23038k = bool;
    }

    public final r a(long j) {
        return new r(this.f23030a, this.f23031b, this.f23032c, this.f23033d, this.f23034e, j, this.g, this.f23036h, this.f23037i, this.j, this.f23038k);
    }

    public final r b(Long l10, Long l11, Boolean bool) {
        return new r(this.f23030a, this.f23031b, this.f23032c, this.f23033d, this.f23034e, this.f23035f, this.g, this.f23036h, l10, l11, bool);
    }
}
