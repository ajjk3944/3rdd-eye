package j2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27248b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i4, int i10) {
        super(1);
        this.f27247a = i10;
        this.f27248b = i4;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f27247a) {
            case 0:
                return Boolean.valueOf(((n1.s) obj).w0(this.f27248b));
            case 1:
                return Boolean.valueOf(((n1.s) obj).w0(this.f27248b));
            case 2:
                return Boolean.valueOf(((n1.s) obj).w0(this.f27248b));
            default:
                return Boolean.valueOf(((n1.s) obj).p0(this.f27248b));
        }
    }
}
