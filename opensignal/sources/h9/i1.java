package h9;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i1 implements Cloneable {
    public l0 B;
    public b1 D;
    public c1 E;
    public Float F;
    public l0[] G;
    public l0 H;
    public Float I;
    public b0 J;
    public ArrayList K;
    public l0 L;
    public Integer M;
    public a1 N;
    public f1 O;
    public g1 P;
    public e1 Q;
    public Boolean R;
    public kg.r S;
    public String T;
    public String U;
    public String V;
    public Boolean W;
    public Boolean X;
    public r1 Y;
    public Float Z;

    /* renamed from: a, reason: collision with root package name */
    public long f10358a = 0;

    /* renamed from: a0, reason: collision with root package name */
    public String f10359a0;

    /* renamed from: b0, reason: collision with root package name */
    public z0 f10360b0;

    /* renamed from: c0, reason: collision with root package name */
    public String f10361c0;

    /* renamed from: d, reason: collision with root package name */
    public r1 f10362d;

    /* renamed from: d0, reason: collision with root package name */
    public r1 f10363d0;

    /* renamed from: e0, reason: collision with root package name */
    public Float f10364e0;

    /* renamed from: f0, reason: collision with root package name */
    public r1 f10365f0;

    /* renamed from: g, reason: collision with root package name */
    public z0 f10366g;

    /* renamed from: g0, reason: collision with root package name */
    public Float f10367g0;

    /* renamed from: h0, reason: collision with root package name */
    public h1 f10368h0;

    /* renamed from: i0, reason: collision with root package name */
    public d1 f10369i0;

    /* renamed from: r, reason: collision with root package name */
    public Float f10370r;

    /* renamed from: x, reason: collision with root package name */
    public r1 f10371x;

    /* renamed from: y, reason: collision with root package name */
    public Float f10372y;

    public static i1 a() {
        i1 i1Var = new i1();
        i1Var.f10358a = -1L;
        b0 b0Var = b0.f10306d;
        i1Var.f10362d = b0Var;
        z0 z0Var = z0.NonZero;
        i1Var.f10366g = z0Var;
        Float fValueOf = Float.valueOf(1.0f);
        i1Var.f10370r = fValueOf;
        i1Var.f10371x = null;
        i1Var.f10372y = fValueOf;
        i1Var.B = new l0(1.0f);
        i1Var.D = b1.Butt;
        i1Var.E = c1.Miter;
        i1Var.F = Float.valueOf(4.0f);
        i1Var.G = null;
        i1Var.H = new l0(0.0f);
        i1Var.I = fValueOf;
        i1Var.J = b0Var;
        i1Var.K = null;
        i1Var.L = new l0(12.0f, f2.pt);
        i1Var.M = 400;
        i1Var.N = a1.Normal;
        i1Var.O = f1.None;
        i1Var.P = g1.LTR;
        i1Var.Q = e1.Start;
        Boolean bool = Boolean.TRUE;
        i1Var.R = bool;
        i1Var.S = null;
        i1Var.T = null;
        i1Var.U = null;
        i1Var.V = null;
        i1Var.W = bool;
        i1Var.X = bool;
        i1Var.Y = b0Var;
        i1Var.Z = fValueOf;
        i1Var.f10359a0 = null;
        i1Var.f10360b0 = z0Var;
        i1Var.f10361c0 = null;
        i1Var.f10363d0 = null;
        i1Var.f10364e0 = fValueOf;
        i1Var.f10365f0 = null;
        i1Var.f10367g0 = fValueOf;
        i1Var.f10368h0 = h1.None;
        i1Var.f10369i0 = d1.auto;
        return i1Var;
    }

    public final Object clone() {
        i1 i1Var = (i1) super.clone();
        l0[] l0VarArr = this.G;
        if (l0VarArr != null) {
            i1Var.G = (l0[]) l0VarArr.clone();
        }
        return i1Var;
    }
}
