package n3;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {
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
    public int f29579a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f29580a0;

    /* renamed from: b, reason: collision with root package name */
    public int f29581b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f29582b0;

    /* renamed from: c, reason: collision with root package name */
    public float f29583c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f29584c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29585d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f29586d0;

    /* renamed from: e, reason: collision with root package name */
    public int f29587e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f29588e0;

    /* renamed from: f, reason: collision with root package name */
    public int f29589f;

    /* renamed from: f0, reason: collision with root package name */
    public int f29590f0;
    public int g;

    /* renamed from: g0, reason: collision with root package name */
    public int f29591g0;

    /* renamed from: h, reason: collision with root package name */
    public int f29592h;

    /* renamed from: h0, reason: collision with root package name */
    public int f29593h0;

    /* renamed from: i, reason: collision with root package name */
    public int f29594i;

    /* renamed from: i0, reason: collision with root package name */
    public int f29595i0;
    public int j;

    /* renamed from: j0, reason: collision with root package name */
    public int f29596j0;

    /* renamed from: k, reason: collision with root package name */
    public int f29597k;

    /* renamed from: k0, reason: collision with root package name */
    public int f29598k0;

    /* renamed from: l, reason: collision with root package name */
    public int f29599l;

    /* renamed from: l0, reason: collision with root package name */
    public float f29600l0;

    /* renamed from: m, reason: collision with root package name */
    public int f29601m;

    /* renamed from: m0, reason: collision with root package name */
    public int f29602m0;

    /* renamed from: n, reason: collision with root package name */
    public int f29603n;

    /* renamed from: n0, reason: collision with root package name */
    public int f29604n0;

    /* renamed from: o, reason: collision with root package name */
    public int f29605o;

    /* renamed from: o0, reason: collision with root package name */
    public float f29606o0;

    /* renamed from: p, reason: collision with root package name */
    public int f29607p;

    /* renamed from: p0, reason: collision with root package name */
    public k3.d f29608p0;

    /* renamed from: q, reason: collision with root package name */
    public int f29609q;

    /* renamed from: r, reason: collision with root package name */
    public float f29610r;

    /* renamed from: s, reason: collision with root package name */
    public int f29611s;

    /* renamed from: t, reason: collision with root package name */
    public int f29612t;

    /* renamed from: u, reason: collision with root package name */
    public int f29613u;

    /* renamed from: v, reason: collision with root package name */
    public int f29614v;

    /* renamed from: w, reason: collision with root package name */
    public int f29615w;

    /* renamed from: x, reason: collision with root package name */
    public int f29616x;

    /* renamed from: y, reason: collision with root package name */
    public int f29617y;

    /* renamed from: z, reason: collision with root package name */
    public int f29618z;

    public final void a() {
        this.f29586d0 = false;
        this.f29580a0 = true;
        this.f29582b0 = true;
        int i4 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i4 == -2 && this.W) {
            this.f29580a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i10 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i10 == -2 && this.X) {
            this.f29582b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i4 == 0 || i4 == -1) {
            this.f29580a0 = false;
            if (i4 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f29582b0 = false;
            if (i10 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f29583c == -1.0f && this.f29579a == -1 && this.f29581b == -1) {
            return;
        }
        this.f29586d0 = true;
        this.f29580a0 = true;
        this.f29582b0 = true;
        if (!(this.f29608p0 instanceof k3.h)) {
            this.f29608p0 = new k3.h();
        }
        ((k3.h) this.f29608p0).S(this.V);
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
        throw new UnsupportedOperationException("Method not decompiled: n3.d.resolveLayoutDirection(int):void");
    }
}
