package g8;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f24578b = new m(2);

    /* renamed from: c, reason: collision with root package name */
    public static final m f24579c = new m(0);

    /* renamed from: d, reason: collision with root package name */
    public static final m f24580d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f24581e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f24582f;
    public static final x7.g g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f24583h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24584a;

    static {
        m mVar = new m(1);
        f24580d = mVar;
        f24581e = new m(3);
        f24582f = mVar;
        g = x7.g.a(mVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f24583h = true;
    }

    public /* synthetic */ m(int i4) {
        this.f24584a = i4;
    }

    public final int a(int i4, int i10, int i11, int i12) {
        switch (this.f24584a) {
            case 0:
                if (b(i4, i10, i11, i12) != 1.0f) {
                    break;
                }
                break;
            case 2:
                if (f24583h) {
                }
                break;
        }
        return 2;
    }

    public final float b(int i4, int i10, int i11, int i12) {
        switch (this.f24584a) {
            case 0:
                return Math.min(1.0f, f24578b.b(i4, i10, i11, i12));
            case 1:
                return Math.max(i11 / i4, i12 / i10);
            case 2:
                if (f24583h) {
                    return Math.min(i11 / i4, i12 / i10);
                }
                if (Math.max(i10 / i12, i4 / i11) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
