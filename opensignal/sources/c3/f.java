package c3;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class f extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3151a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3152a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3153b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3154b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3155c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3156c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3157d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3158d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3159e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3160e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3161f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3162f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3163g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3164g0;

    /* renamed from: h, reason: collision with root package name */
    public int f3165h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3166h0;

    /* renamed from: i, reason: collision with root package name */
    public int f3167i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3168i0;
    public int j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3169j0;
    public int k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3170k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3171l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3172l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3173m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3174m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3175n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3176n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3177o;

    /* renamed from: o0, reason: collision with root package name */
    public float f3178o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3179p;

    /* renamed from: p0, reason: collision with root package name */
    public z2.g f3180p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3181q;

    /* renamed from: r, reason: collision with root package name */
    public float f3182r;

    /* renamed from: s, reason: collision with root package name */
    public int f3183s;

    /* renamed from: t, reason: collision with root package name */
    public int f3184t;

    /* renamed from: u, reason: collision with root package name */
    public int f3185u;

    /* renamed from: v, reason: collision with root package name */
    public int f3186v;

    /* renamed from: w, reason: collision with root package name */
    public int f3187w;

    /* renamed from: x, reason: collision with root package name */
    public int f3188x;

    /* renamed from: y, reason: collision with root package name */
    public int f3189y;

    /* renamed from: z, reason: collision with root package name */
    public int f3190z;

    public final void a() {
        this.f3158d0 = false;
        this.f3152a0 = true;
        this.f3154b0 = true;
        int i10 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i10 == -2 && this.W) {
            this.f3152a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i11 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i11 == -2 && this.X) {
            this.f3154b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f3152a0 = false;
            if (i10 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i11 == 0 || i11 == -1) {
            this.f3154b0 = false;
            if (i11 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f3155c == -1.0f && this.f3151a == -1 && this.f3153b == -1) {
            return;
        }
        this.f3158d0 = true;
        this.f3152a0 = true;
        this.f3154b0 = true;
        if (!(this.f3180p0 instanceof z2.l)) {
            this.f3180p0 = new z2.l();
        }
        ((z2.l) this.f3180p0).S(this.V);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.f.resolveLayoutDirection(int):void");
    }
}
