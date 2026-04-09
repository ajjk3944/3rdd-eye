package U2;

/* compiled from: DownsampleStrategy.java */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final e f12407a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f12408b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f12409c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f12410d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f12411e;

    /* renamed from: f, reason: collision with root package name */
    public static final L2.g<l> f12412f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f12413g;

    /* compiled from: DownsampleStrategy.java */
    public static class a extends l {
        @Override // U2.l
        public final g a(int i, int i10, int i11, int i12) {
            return g.QUALITY;
        }

        @Override // U2.l
        public final float b(int i, int i10, int i11, int i12) {
            if (Math.min(i10 / i12, i / i11) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    public static class b extends l {
        @Override // U2.l
        public final g a(int i, int i10, int i11, int i12) {
            return g.MEMORY;
        }

        @Override // U2.l
        public final float b(int i, int i10, int i11, int i12) {
            int iCeil = (int) Math.ceil(Math.max(i10 / i12, i / i11));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    public static class c extends l {
        @Override // U2.l
        public final g a(int i, int i10, int i11, int i12) {
            return b(i, i10, i11, i12) == 1.0f ? g.QUALITY : l.f12407a.a(i, i10, i11, i12);
        }

        @Override // U2.l
        public final float b(int i, int i10, int i11, int i12) {
            return Math.min(1.0f, l.f12407a.b(i, i10, i11, i12));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    public static class d extends l {
        @Override // U2.l
        public final g a(int i, int i10, int i11, int i12) {
            return g.QUALITY;
        }

        @Override // U2.l
        public final float b(int i, int i10, int i11, int i12) {
            return Math.max(i11 / i, i12 / i10);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    public static class e extends l {
        @Override // U2.l
        public final g a(int i, int i10, int i11, int i12) {
            return l.f12413g ? g.QUALITY : g.MEMORY;
        }

        @Override // U2.l
        public final float b(int i, int i10, int i11, int i12) {
            if (l.f12413g) {
                return Math.min(i11 / i, i12 / i10);
            }
            if (Math.max(i10 / i12, i / i11) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    public static class f extends l {
        @Override // U2.l
        public final g a(int i, int i10, int i11, int i12) {
            return g.QUALITY;
        }

        @Override // U2.l
        public final float b(int i, int i10, int i11, int i12) {
            return 1.0f;
        }
    }

    /* compiled from: DownsampleStrategy.java */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        new a();
        new b();
        f12407a = new e();
        f12408b = new c();
        d dVar = new d();
        f12409c = dVar;
        f12410d = new f();
        f12411e = dVar;
        f12412f = L2.g.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f12413g = true;
    }

    public abstract g a(int i, int i10, int i11, int i12);

    public abstract float b(int i, int i10, int i11, int i12);
}
