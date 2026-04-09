package o1;

import java.util.ArrayList;
import o1.C7049e;

/* renamed from: o1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7047c {

    /* renamed from: a, reason: collision with root package name */
    protected C7049e f55050a;

    /* renamed from: b, reason: collision with root package name */
    protected C7049e f55051b;

    /* renamed from: c, reason: collision with root package name */
    protected C7049e f55052c;

    /* renamed from: d, reason: collision with root package name */
    protected C7049e f55053d;

    /* renamed from: e, reason: collision with root package name */
    protected C7049e f55054e;

    /* renamed from: f, reason: collision with root package name */
    protected C7049e f55055f;

    /* renamed from: g, reason: collision with root package name */
    protected C7049e f55056g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList f55057h;

    /* renamed from: i, reason: collision with root package name */
    protected int f55058i;

    /* renamed from: j, reason: collision with root package name */
    protected int f55059j;

    /* renamed from: k, reason: collision with root package name */
    protected float f55060k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f55061l;

    /* renamed from: m, reason: collision with root package name */
    int f55062m;

    /* renamed from: n, reason: collision with root package name */
    int f55063n;

    /* renamed from: o, reason: collision with root package name */
    boolean f55064o;

    /* renamed from: p, reason: collision with root package name */
    private int f55065p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f55066q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f55067r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f55068s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f55069t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f55070u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f55071v;

    public C7047c(C7049e c7049e, int i10, boolean z10) {
        this.f55050a = c7049e;
        this.f55065p = i10;
        this.f55066q = z10;
    }

    private void b() {
        int i10 = this.f55065p * 2;
        C7049e c7049e = this.f55050a;
        this.f55064o = true;
        C7049e c7049e2 = c7049e;
        boolean z10 = false;
        while (!z10) {
            this.f55058i++;
            C7049e[] c7049eArr = c7049e.f55144s0;
            int i11 = this.f55065p;
            C7049e c7049e3 = null;
            c7049eArr[i11] = null;
            c7049e.f55142r0[i11] = null;
            if (c7049e.O() != 8) {
                this.f55061l++;
                C7049e.b bVarS = c7049e.s(this.f55065p);
                C7049e.b bVar = C7049e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar) {
                    this.f55062m += c7049e.A(this.f55065p);
                }
                int iC = this.f55062m + c7049e.f55090J[i10].c();
                this.f55062m = iC;
                int i12 = i10 + 1;
                this.f55062m = iC + c7049e.f55090J[i12].c();
                int iC2 = this.f55063n + c7049e.f55090J[i10].c();
                this.f55063n = iC2;
                this.f55063n = iC2 + c7049e.f55090J[i12].c();
                if (this.f55051b == null) {
                    this.f55051b = c7049e;
                }
                this.f55053d = c7049e;
                C7049e.b[] bVarArr = c7049e.f55093M;
                int i13 = this.f55065p;
                if (bVarArr[i13] == bVar) {
                    int i14 = c7049e.f55133n[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f55059j++;
                        float f10 = c7049e.f55140q0[i13];
                        if (f10 > 0.0f) {
                            this.f55060k += f10;
                        }
                        if (c(c7049e, i13)) {
                            if (f10 < 0.0f) {
                                this.f55067r = true;
                            } else {
                                this.f55068s = true;
                            }
                            if (this.f55057h == null) {
                                this.f55057h = new ArrayList();
                            }
                            this.f55057h.add(c7049e);
                        }
                        if (this.f55055f == null) {
                            this.f55055f = c7049e;
                        }
                        C7049e c7049e4 = this.f55056g;
                        if (c7049e4 != null) {
                            c7049e4.f55142r0[this.f55065p] = c7049e;
                        }
                        this.f55056g = c7049e;
                    }
                    if (this.f55065p == 0) {
                        if (c7049e.f55129l != 0 || c7049e.f55135o != 0 || c7049e.f55137p != 0) {
                            this.f55064o = false;
                        }
                    } else if (c7049e.f55131m != 0 || c7049e.f55141r != 0 || c7049e.f55143s != 0) {
                        this.f55064o = false;
                    }
                    if (c7049e.f55097Q != 0.0f) {
                        this.f55064o = false;
                        this.f55070u = true;
                    }
                }
            }
            if (c7049e2 != c7049e) {
                c7049e2.f55144s0[this.f55065p] = c7049e;
            }
            C7048d c7048d = c7049e.f55090J[i10 + 1].f55075d;
            if (c7048d != null) {
                C7049e c7049e5 = c7048d.f55073b;
                C7048d c7048d2 = c7049e5.f55090J[i10].f55075d;
                if (c7048d2 != null && c7048d2.f55073b == c7049e) {
                    c7049e3 = c7049e5;
                }
            }
            if (c7049e3 == null) {
                c7049e3 = c7049e;
                z10 = true;
            }
            c7049e2 = c7049e;
            c7049e = c7049e3;
        }
        C7049e c7049e6 = this.f55051b;
        if (c7049e6 != null) {
            this.f55062m -= c7049e6.f55090J[i10].c();
        }
        C7049e c7049e7 = this.f55053d;
        if (c7049e7 != null) {
            this.f55062m -= c7049e7.f55090J[i10 + 1].c();
        }
        this.f55052c = c7049e;
        if (this.f55065p == 0 && this.f55066q) {
            this.f55054e = c7049e;
        } else {
            this.f55054e = this.f55050a;
        }
        this.f55069t = this.f55068s && this.f55067r;
    }

    private static boolean c(C7049e c7049e, int i10) {
        int i11;
        return c7049e.O() != 8 && c7049e.f55093M[i10] == C7049e.b.MATCH_CONSTRAINT && ((i11 = c7049e.f55133n[i10]) == 0 || i11 == 3);
    }

    public void a() {
        if (!this.f55071v) {
            b();
        }
        this.f55071v = true;
    }
}
