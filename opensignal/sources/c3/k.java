package c3;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f3217a;

    /* renamed from: b, reason: collision with root package name */
    public final n f3218b;

    /* renamed from: c, reason: collision with root package name */
    public final m f3219c;

    /* renamed from: d, reason: collision with root package name */
    public final l f3220d;

    /* renamed from: e, reason: collision with root package name */
    public final o f3221e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3222f;

    public k() {
        n nVar = new n();
        nVar.f3272a = 0;
        nVar.f3273b = 0;
        nVar.f3274c = 1.0f;
        nVar.f3275d = Float.NaN;
        this.f3218b = nVar;
        m mVar = new m();
        mVar.f3263a = -1;
        mVar.f3264b = 0;
        mVar.f3265c = -1;
        mVar.f3266d = Float.NaN;
        mVar.f3267e = Float.NaN;
        mVar.f3268f = Float.NaN;
        mVar.f3269g = -1;
        mVar.f3270h = null;
        mVar.f3271i = -1;
        this.f3219c = mVar;
        l lVar = new l();
        lVar.f3224a = false;
        lVar.f3230d = -1;
        lVar.f3232e = -1;
        lVar.f3234f = -1.0f;
        lVar.f3236g = true;
        lVar.f3238h = -1;
        lVar.f3240i = -1;
        lVar.j = -1;
        lVar.k = -1;
        lVar.f3244l = -1;
        lVar.f3246m = -1;
        lVar.f3248n = -1;
        lVar.f3250o = -1;
        lVar.f3252p = -1;
        lVar.f3253q = -1;
        lVar.f3254r = -1;
        lVar.f3255s = -1;
        lVar.f3256t = -1;
        lVar.f3257u = -1;
        lVar.f3258v = -1;
        lVar.f3259w = 0.5f;
        lVar.f3260x = 0.5f;
        lVar.f3261y = null;
        lVar.f3262z = -1;
        lVar.A = 0;
        lVar.B = 0.0f;
        lVar.C = -1;
        lVar.D = -1;
        lVar.E = -1;
        lVar.F = 0;
        lVar.G = 0;
        lVar.H = 0;
        lVar.I = 0;
        lVar.J = 0;
        lVar.K = 0;
        lVar.L = 0;
        lVar.M = Integer.MIN_VALUE;
        lVar.N = Integer.MIN_VALUE;
        lVar.O = Integer.MIN_VALUE;
        lVar.P = Integer.MIN_VALUE;
        lVar.Q = Integer.MIN_VALUE;
        lVar.R = Integer.MIN_VALUE;
        lVar.S = Integer.MIN_VALUE;
        lVar.T = -1.0f;
        lVar.U = -1.0f;
        lVar.V = 0;
        lVar.W = 0;
        lVar.X = 0;
        lVar.Y = 0;
        lVar.Z = 0;
        lVar.f3225a0 = 0;
        lVar.f3227b0 = 0;
        lVar.f3229c0 = 0;
        lVar.f3231d0 = 1.0f;
        lVar.f3233e0 = 1.0f;
        lVar.f3235f0 = -1;
        lVar.f3237g0 = 0;
        lVar.f3239h0 = -1;
        lVar.f3245l0 = false;
        lVar.f3247m0 = false;
        lVar.f3249n0 = true;
        lVar.f3251o0 = 0;
        this.f3220d = lVar;
        o oVar = new o();
        oVar.f3277a = 0.0f;
        oVar.f3278b = 0.0f;
        oVar.f3279c = 0.0f;
        oVar.f3280d = 1.0f;
        oVar.f3281e = 1.0f;
        oVar.f3282f = Float.NaN;
        oVar.f3283g = Float.NaN;
        oVar.f3284h = -1;
        oVar.f3285i = 0.0f;
        oVar.j = 0.0f;
        oVar.k = 0.0f;
        oVar.f3286l = false;
        oVar.f3287m = 0.0f;
        this.f3221e = oVar;
        this.f3222f = new HashMap();
    }

    public final void a(f fVar) {
        l lVar = this.f3220d;
        fVar.f3159e = lVar.f3238h;
        fVar.f3161f = lVar.f3240i;
        fVar.f3163g = lVar.j;
        fVar.f3165h = lVar.k;
        fVar.f3167i = lVar.f3244l;
        fVar.j = lVar.f3246m;
        fVar.k = lVar.f3248n;
        fVar.f3171l = lVar.f3250o;
        fVar.f3173m = lVar.f3252p;
        fVar.f3175n = lVar.f3253q;
        fVar.f3177o = lVar.f3254r;
        fVar.f3183s = lVar.f3255s;
        fVar.f3184t = lVar.f3256t;
        fVar.f3185u = lVar.f3257u;
        fVar.f3186v = lVar.f3258v;
        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = lVar.F;
        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = lVar.G;
        ((ViewGroup.MarginLayoutParams) fVar).topMargin = lVar.H;
        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = lVar.I;
        fVar.A = lVar.R;
        fVar.B = lVar.Q;
        fVar.f3188x = lVar.N;
        fVar.f3190z = lVar.P;
        fVar.E = lVar.f3259w;
        fVar.F = lVar.f3260x;
        fVar.f3179p = lVar.f3262z;
        fVar.f3181q = lVar.A;
        fVar.f3182r = lVar.B;
        fVar.G = lVar.f3261y;
        fVar.T = lVar.C;
        fVar.U = lVar.D;
        fVar.I = lVar.T;
        fVar.H = lVar.U;
        fVar.K = lVar.W;
        fVar.J = lVar.V;
        fVar.W = lVar.f3245l0;
        fVar.X = lVar.f3247m0;
        fVar.L = lVar.X;
        fVar.M = lVar.Y;
        fVar.P = lVar.Z;
        fVar.Q = lVar.f3225a0;
        fVar.N = lVar.f3227b0;
        fVar.O = lVar.f3229c0;
        fVar.R = lVar.f3231d0;
        fVar.S = lVar.f3233e0;
        fVar.V = lVar.E;
        fVar.f3155c = lVar.f3234f;
        fVar.f3151a = lVar.f3230d;
        fVar.f3153b = lVar.f3232e;
        ((ViewGroup.MarginLayoutParams) fVar).width = lVar.f3226b;
        ((ViewGroup.MarginLayoutParams) fVar).height = lVar.f3228c;
        String str = lVar.f3243k0;
        if (str != null) {
            fVar.Y = str;
        }
        fVar.Z = lVar.f3251o0;
        fVar.setMarginStart(lVar.K);
        fVar.setMarginEnd(lVar.J);
        fVar.a();
    }

    public final Object clone() {
        k kVar = new k();
        l lVar = kVar.f3220d;
        lVar.getClass();
        l lVar2 = this.f3220d;
        lVar.f3224a = lVar2.f3224a;
        lVar.f3226b = lVar2.f3226b;
        lVar.f3228c = lVar2.f3228c;
        lVar.f3230d = lVar2.f3230d;
        lVar.f3232e = lVar2.f3232e;
        lVar.f3234f = lVar2.f3234f;
        lVar.f3236g = lVar2.f3236g;
        lVar.f3238h = lVar2.f3238h;
        lVar.f3240i = lVar2.f3240i;
        lVar.j = lVar2.j;
        lVar.k = lVar2.k;
        lVar.f3244l = lVar2.f3244l;
        lVar.f3246m = lVar2.f3246m;
        lVar.f3248n = lVar2.f3248n;
        lVar.f3250o = lVar2.f3250o;
        lVar.f3252p = lVar2.f3252p;
        lVar.f3253q = lVar2.f3253q;
        lVar.f3254r = lVar2.f3254r;
        lVar.f3255s = lVar2.f3255s;
        lVar.f3256t = lVar2.f3256t;
        lVar.f3257u = lVar2.f3257u;
        lVar.f3258v = lVar2.f3258v;
        lVar.f3259w = lVar2.f3259w;
        lVar.f3260x = lVar2.f3260x;
        lVar.f3261y = lVar2.f3261y;
        lVar.f3262z = lVar2.f3262z;
        lVar.A = lVar2.A;
        lVar.B = lVar2.B;
        lVar.C = lVar2.C;
        lVar.D = lVar2.D;
        lVar.E = lVar2.E;
        lVar.F = lVar2.F;
        lVar.G = lVar2.G;
        lVar.H = lVar2.H;
        lVar.I = lVar2.I;
        lVar.J = lVar2.J;
        lVar.K = lVar2.K;
        lVar.L = lVar2.L;
        lVar.M = lVar2.M;
        lVar.N = lVar2.N;
        lVar.O = lVar2.O;
        lVar.P = lVar2.P;
        lVar.Q = lVar2.Q;
        lVar.R = lVar2.R;
        lVar.S = lVar2.S;
        lVar.T = lVar2.T;
        lVar.U = lVar2.U;
        lVar.V = lVar2.V;
        lVar.W = lVar2.W;
        lVar.X = lVar2.X;
        lVar.Y = lVar2.Y;
        lVar.Z = lVar2.Z;
        lVar.f3225a0 = lVar2.f3225a0;
        lVar.f3227b0 = lVar2.f3227b0;
        lVar.f3229c0 = lVar2.f3229c0;
        lVar.f3231d0 = lVar2.f3231d0;
        lVar.f3233e0 = lVar2.f3233e0;
        lVar.f3235f0 = lVar2.f3235f0;
        lVar.f3237g0 = lVar2.f3237g0;
        lVar.f3239h0 = lVar2.f3239h0;
        lVar.f3243k0 = lVar2.f3243k0;
        int[] iArr = lVar2.f3241i0;
        if (iArr == null || lVar2.f3242j0 != null) {
            lVar.f3241i0 = null;
        } else {
            lVar.f3241i0 = Arrays.copyOf(iArr, iArr.length);
        }
        lVar.f3242j0 = lVar2.f3242j0;
        lVar.f3245l0 = lVar2.f3245l0;
        lVar.f3247m0 = lVar2.f3247m0;
        lVar.f3249n0 = lVar2.f3249n0;
        lVar.f3251o0 = lVar2.f3251o0;
        m mVar = kVar.f3219c;
        mVar.getClass();
        m mVar2 = this.f3219c;
        mVar2.getClass();
        mVar.f3263a = mVar2.f3263a;
        mVar.f3265c = mVar2.f3265c;
        mVar.f3267e = mVar2.f3267e;
        mVar.f3266d = mVar2.f3266d;
        n nVar = this.f3218b;
        int i10 = nVar.f3272a;
        n nVar2 = kVar.f3218b;
        nVar2.f3272a = i10;
        nVar2.f3274c = nVar.f3274c;
        nVar2.f3275d = nVar.f3275d;
        nVar2.f3273b = nVar.f3273b;
        o oVar = kVar.f3221e;
        oVar.getClass();
        o oVar2 = this.f3221e;
        oVar2.getClass();
        oVar.f3277a = oVar2.f3277a;
        oVar.f3278b = oVar2.f3278b;
        oVar.f3279c = oVar2.f3279c;
        oVar.f3280d = oVar2.f3280d;
        oVar.f3281e = oVar2.f3281e;
        oVar.f3282f = oVar2.f3282f;
        oVar.f3283g = oVar2.f3283g;
        oVar.f3284h = oVar2.f3284h;
        oVar.f3285i = oVar2.f3285i;
        oVar.j = oVar2.j;
        oVar.k = oVar2.k;
        oVar.f3286l = oVar2.f3286l;
        oVar.f3287m = oVar2.f3287m;
        kVar.f3217a = this.f3217a;
        return kVar;
    }
}
