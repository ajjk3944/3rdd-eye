package ma;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16503a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16504b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16505c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16506d;

    /* renamed from: e, reason: collision with root package name */
    public int f16507e;

    /* renamed from: f, reason: collision with root package name */
    public int f16508f;

    /* renamed from: g, reason: collision with root package name */
    public long f16509g;

    /* renamed from: h, reason: collision with root package name */
    public long f16510h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f16511i;

    public /* synthetic */ m(int i10, Object obj) {
        this.f16503a = i10;
        this.f16511i = obj;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        switch (this.f16503a) {
            case 0:
                if (this.f16505c) {
                    int i12 = this.f16508f;
                    int i13 = (i10 + 1) - i12;
                    if (i13 >= i11) {
                        this.f16508f = (i11 - i10) + i12;
                        break;
                    } else {
                        this.f16506d = ((bArr[i13] & 192) >> 6) == 0;
                        this.f16505c = false;
                        break;
                    }
                }
                break;
            default:
                if (this.f16505c) {
                    int i14 = this.f16508f;
                    int i15 = (i10 + 1) - i14;
                    if (i15 >= i11) {
                        this.f16508f = (i11 - i10) + i14;
                        break;
                    } else {
                        this.f16506d = ((bArr[i15] & 192) >> 6) == 0;
                        this.f16505c = false;
                        break;
                    }
                }
                break;
        }
    }
}
