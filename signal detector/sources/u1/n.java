package u1;

import l1.C2641g;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f23745b = new n(2);

    /* renamed from: c, reason: collision with root package name */
    public static final n f23746c = new n(0);

    /* renamed from: d, reason: collision with root package name */
    public static final n f23747d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f23748e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f23749f;

    /* renamed from: g, reason: collision with root package name */
    public static final C2641g f23750g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f23751h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23752a;

    static {
        n nVar = new n(1);
        f23747d = nVar;
        f23748e = new n(3);
        f23749f = nVar;
        f23750g = C2641g.a(nVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f23751h = true;
    }

    public /* synthetic */ n(int i) {
        this.f23752a = i;
    }

    public final int a(int i, int i3, int i6, int i7) {
        switch (this.f23752a) {
            case 0:
                if (b(i, i3, i6, i7) != 1.0f) {
                    break;
                }
                break;
            case 2:
                if (f23751h) {
                }
                break;
        }
        return 2;
    }

    public final float b(int i, int i3, int i6, int i7) {
        switch (this.f23752a) {
            case 0:
                return Math.min(1.0f, f23745b.b(i, i3, i6, i7));
            case 1:
                return Math.max(i6 / i, i7 / i3);
            case 2:
                if (f23751h) {
                    return Math.min(i6 / i, i7 / i3);
                }
                if (Math.max(i3 / i7, i / i6) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
