package com.bumptech.glide.load.resource.bitmap;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f34535a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final k f34536b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final k f34537c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final k f34538d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final k f34539e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f34540f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f34541g;

    /* renamed from: h, reason: collision with root package name */
    public static final C2.f f34542h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f34543i;

    private static class a extends k {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public float b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    private static class b extends k {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public float b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    private static class c extends k {
        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : k.f34537c.a(i10, i11, i12, i13);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, k.f34537c.b(i10, i11, i12, i13));
        }
    }

    private static class d extends k {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    private static class e extends k {
        e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public g a(int i10, int i11, int i12, int i13) {
            return k.f34543i ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public float b(int i10, int i11, int i12, int i13) {
            if (k.f34543i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    private static class f extends k {
        f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f34539e = dVar;
        f34540f = new f();
        f34541g = dVar;
        f34542h = C2.f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f34543i = true;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
