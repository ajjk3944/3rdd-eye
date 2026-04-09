package androidx.media3.common;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class d1 {

    /* renamed from: e, reason: collision with root package name */
    public int f1587e;

    /* renamed from: f, reason: collision with root package name */
    public int f1588f;

    /* renamed from: g, reason: collision with root package name */
    public int f1589g;

    /* renamed from: h, reason: collision with root package name */
    public int f1590h;

    /* renamed from: l, reason: collision with root package name */
    public oe.h0 f1592l;

    /* renamed from: m, reason: collision with root package name */
    public int f1593m;

    /* renamed from: n, reason: collision with root package name */
    public oe.h0 f1594n;

    /* renamed from: o, reason: collision with root package name */
    public int f1595o;

    /* renamed from: p, reason: collision with root package name */
    public int f1596p;

    /* renamed from: q, reason: collision with root package name */
    public int f1597q;

    /* renamed from: r, reason: collision with root package name */
    public oe.h0 f1598r;

    /* renamed from: s, reason: collision with root package name */
    public oe.h0 f1599s;

    /* renamed from: t, reason: collision with root package name */
    public int f1600t;

    /* renamed from: u, reason: collision with root package name */
    public int f1601u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1602v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1603w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1604x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f1605y;

    /* renamed from: z, reason: collision with root package name */
    public HashSet f1606z;

    /* renamed from: a, reason: collision with root package name */
    public int f1583a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public int f1584b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f1585c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f1586d = Integer.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f1591i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;

    public d1() {
        oe.f0 f0Var = oe.h0.f19336d;
        oe.u0 u0Var = oe.u0.f19383x;
        this.f1592l = u0Var;
        this.f1593m = 0;
        this.f1594n = u0Var;
        this.f1595o = 0;
        this.f1596p = Integer.MAX_VALUE;
        this.f1597q = Integer.MAX_VALUE;
        this.f1598r = u0Var;
        this.f1599s = u0Var;
        this.f1600t = 0;
        this.f1601u = 0;
        this.f1602v = false;
        this.f1603w = false;
        this.f1604x = false;
        this.f1605y = new HashMap();
        this.f1606z = new HashSet();
    }

    public final void a(e1 e1Var) {
        this.f1583a = e1Var.f1613a;
        this.f1584b = e1Var.f1614d;
        this.f1585c = e1Var.f1615g;
        this.f1586d = e1Var.f1616r;
        this.f1587e = e1Var.f1617x;
        this.f1588f = e1Var.f1618y;
        this.f1589g = e1Var.B;
        this.f1590h = e1Var.D;
        this.f1591i = e1Var.E;
        this.j = e1Var.F;
        this.k = e1Var.G;
        this.f1592l = e1Var.H;
        this.f1593m = e1Var.I;
        this.f1594n = e1Var.J;
        this.f1595o = e1Var.K;
        this.f1596p = e1Var.L;
        this.f1597q = e1Var.M;
        this.f1598r = e1Var.N;
        this.f1599s = e1Var.O;
        this.f1600t = e1Var.P;
        this.f1601u = e1Var.Q;
        this.f1602v = e1Var.R;
        this.f1603w = e1Var.S;
        this.f1604x = e1Var.T;
        this.f1606z = new HashSet(e1Var.V);
        this.f1605y = new HashMap(e1Var.U);
    }

    public d1 b(int i10, int i11) {
        this.f1591i = i10;
        this.j = i11;
        this.k = true;
        return this;
    }
}
