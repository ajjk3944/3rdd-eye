package C;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f817A;

    /* renamed from: B, reason: collision with root package name */
    public int f818B;

    /* renamed from: C, reason: collision with root package name */
    public int f819C;

    /* renamed from: D, reason: collision with root package name */
    public int f820D;

    /* renamed from: E, reason: collision with root package name */
    public float f821E;

    /* renamed from: F, reason: collision with root package name */
    public float f822F;

    /* renamed from: G, reason: collision with root package name */
    public String f823G;

    /* renamed from: H, reason: collision with root package name */
    public float f824H;

    /* renamed from: I, reason: collision with root package name */
    public float f825I;

    /* renamed from: J, reason: collision with root package name */
    public int f826J;

    /* renamed from: K, reason: collision with root package name */
    public int f827K;

    /* renamed from: L, reason: collision with root package name */
    public int f828L;
    public int M;

    /* renamed from: N, reason: collision with root package name */
    public int f829N;

    /* renamed from: O, reason: collision with root package name */
    public int f830O;

    /* renamed from: P, reason: collision with root package name */
    public int f831P;

    /* renamed from: Q, reason: collision with root package name */
    public int f832Q;

    /* renamed from: R, reason: collision with root package name */
    public float f833R;

    /* renamed from: S, reason: collision with root package name */
    public float f834S;

    /* renamed from: T, reason: collision with root package name */
    public int f835T;

    /* renamed from: U, reason: collision with root package name */
    public int f836U;

    /* renamed from: V, reason: collision with root package name */
    public int f837V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f838W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f839X;

    /* renamed from: Y, reason: collision with root package name */
    public String f840Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f841Z;

    /* renamed from: a, reason: collision with root package name */
    public int f842a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f843a0;

    /* renamed from: b, reason: collision with root package name */
    public int f844b;
    public boolean b0;

    /* renamed from: c, reason: collision with root package name */
    public float f845c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f846c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f847d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f848d0;

    /* renamed from: e, reason: collision with root package name */
    public int f849e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f850e0;

    /* renamed from: f, reason: collision with root package name */
    public int f851f;

    /* renamed from: f0, reason: collision with root package name */
    public int f852f0;

    /* renamed from: g, reason: collision with root package name */
    public int f853g;

    /* renamed from: g0, reason: collision with root package name */
    public int f854g0;

    /* renamed from: h, reason: collision with root package name */
    public int f855h;

    /* renamed from: h0, reason: collision with root package name */
    public int f856h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f857i0;

    /* renamed from: j, reason: collision with root package name */
    public int f858j;

    /* renamed from: j0, reason: collision with root package name */
    public int f859j0;

    /* renamed from: k, reason: collision with root package name */
    public int f860k;

    /* renamed from: k0, reason: collision with root package name */
    public int f861k0;

    /* renamed from: l, reason: collision with root package name */
    public int f862l;

    /* renamed from: l0, reason: collision with root package name */
    public float f863l0;

    /* renamed from: m, reason: collision with root package name */
    public int f864m;

    /* renamed from: m0, reason: collision with root package name */
    public int f865m0;

    /* renamed from: n, reason: collision with root package name */
    public int f866n;

    /* renamed from: n0, reason: collision with root package name */
    public int f867n0;

    /* renamed from: o, reason: collision with root package name */
    public int f868o;

    /* renamed from: o0, reason: collision with root package name */
    public float f869o0;

    /* renamed from: p, reason: collision with root package name */
    public int f870p;

    /* renamed from: p0, reason: collision with root package name */
    public z.d f871p0;

    /* renamed from: q, reason: collision with root package name */
    public int f872q;

    /* renamed from: r, reason: collision with root package name */
    public float f873r;

    /* renamed from: s, reason: collision with root package name */
    public int f874s;

    /* renamed from: t, reason: collision with root package name */
    public int f875t;

    /* renamed from: u, reason: collision with root package name */
    public int f876u;

    /* renamed from: v, reason: collision with root package name */
    public int f877v;

    /* renamed from: w, reason: collision with root package name */
    public int f878w;

    /* renamed from: x, reason: collision with root package name */
    public int f879x;

    /* renamed from: y, reason: collision with root package name */
    public int f880y;

    /* renamed from: z, reason: collision with root package name */
    public int f881z;

    public final void a() {
        this.f848d0 = false;
        this.f843a0 = true;
        this.b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f838W) {
            this.f843a0 = false;
            if (this.f828L == 0) {
                this.f828L = 1;
            }
        }
        int i3 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i3 == -2 && this.f839X) {
            this.b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f843a0 = false;
            if (i == 0 && this.f828L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f838W = true;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.b0 = false;
            if (i3 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f839X = true;
            }
        }
        if (this.f845c == -1.0f && this.f842a == -1 && this.f844b == -1) {
            return;
        }
        this.f848d0 = true;
        this.f843a0 = true;
        this.b0 = true;
        if (!(this.f871p0 instanceof z.h)) {
            this.f871p0 = new z.h();
        }
        ((z.h) this.f871p0).S(this.f837V);
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
        throw new UnsupportedOperationException("Method not decompiled: C.e.resolveLayoutDirection(int):void");
    }
}
