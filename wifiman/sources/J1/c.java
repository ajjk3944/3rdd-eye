package j1;

import j1.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f49825a;

    /* renamed from: b, reason: collision with root package name */
    protected e f49826b;

    /* renamed from: c, reason: collision with root package name */
    protected e f49827c;

    /* renamed from: d, reason: collision with root package name */
    protected e f49828d;

    /* renamed from: e, reason: collision with root package name */
    protected e f49829e;

    /* renamed from: f, reason: collision with root package name */
    protected e f49830f;

    /* renamed from: g, reason: collision with root package name */
    protected e f49831g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList f49832h;

    /* renamed from: i, reason: collision with root package name */
    protected int f49833i;

    /* renamed from: j, reason: collision with root package name */
    protected int f49834j;

    /* renamed from: k, reason: collision with root package name */
    protected float f49835k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f49836l;

    /* renamed from: m, reason: collision with root package name */
    int f49837m;

    /* renamed from: n, reason: collision with root package name */
    int f49838n;

    /* renamed from: o, reason: collision with root package name */
    boolean f49839o;

    /* renamed from: p, reason: collision with root package name */
    private int f49840p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f49841q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f49842r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f49843s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f49844t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f49845u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f49846v;

    public c(e eVar, int i10, boolean z10) {
        this.f49825a = eVar;
        this.f49840p = i10;
        this.f49841q = z10;
    }

    private void b() {
        int i10 = this.f49840p * 2;
        e eVar = this.f49825a;
        this.f49839o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f49833i++;
            e[] eVarArr = eVar.f49866E0;
            int i11 = this.f49840p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f49864D0[i11] = null;
            if (eVar.N() != 8) {
                this.f49836l++;
                e.b bVarR = eVar.r(this.f49840p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarR != bVar) {
                    this.f49837m += eVar.z(this.f49840p);
                }
                int iF = this.f49837m + eVar.f49887V[i10].f();
                this.f49837m = iF;
                int i12 = i10 + 1;
                this.f49837m = iF + eVar.f49887V[i12].f();
                int iF2 = this.f49838n + eVar.f49887V[i10].f();
                this.f49838n = iF2;
                this.f49838n = iF2 + eVar.f49887V[i12].f();
                if (this.f49826b == null) {
                    this.f49826b = eVar;
                }
                this.f49828d = eVar;
                e.b[] bVarArr = eVar.f49890Y;
                int i13 = this.f49840p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f49940y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f49834j++;
                        float f10 = eVar.f49862C0[i13];
                        if (f10 > 0.0f) {
                            this.f49835k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f49842r = true;
                            } else {
                                this.f49843s = true;
                            }
                            if (this.f49832h == null) {
                                this.f49832h = new ArrayList();
                            }
                            this.f49832h.add(eVar);
                        }
                        if (this.f49830f == null) {
                            this.f49830f = eVar;
                        }
                        e eVar4 = this.f49831g;
                        if (eVar4 != null) {
                            eVar4.f49864D0[this.f49840p] = eVar;
                        }
                        this.f49831g = eVar;
                    }
                    if (this.f49840p == 0) {
                        if (eVar.f49936w != 0 || eVar.f49942z != 0 || eVar.f49857A != 0) {
                            this.f49839o = false;
                        }
                    } else if (eVar.f49938x != 0 || eVar.f49861C != 0 || eVar.f49863D != 0) {
                        this.f49839o = false;
                    }
                    if (eVar.f49897c0 != 0.0f) {
                        this.f49839o = false;
                        this.f49845u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f49866E0[this.f49840p] = eVar;
            }
            d dVar = eVar.f49887V[i10 + 1].f49852f;
            if (dVar != null) {
                e eVar5 = dVar.f49850d;
                d dVar2 = eVar5.f49887V[i10].f49852f;
                if (dVar2 != null && dVar2.f49850d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f49826b;
        if (eVar6 != null) {
            this.f49837m -= eVar6.f49887V[i10].f();
        }
        e eVar7 = this.f49828d;
        if (eVar7 != null) {
            this.f49837m -= eVar7.f49887V[i10 + 1].f();
        }
        this.f49827c = eVar;
        if (this.f49840p == 0 && this.f49841q) {
            this.f49829e = eVar;
        } else {
            this.f49829e = this.f49825a;
        }
        this.f49844t = this.f49843s && this.f49842r;
    }

    private static boolean c(e eVar, int i10) {
        int i11;
        return eVar.N() != 8 && eVar.f49890Y[i10] == e.b.MATCH_CONSTRAINT && ((i11 = eVar.f49940y[i10]) == 0 || i11 == 3);
    }

    public void a() {
        if (!this.f49846v) {
            b();
        }
        this.f49846v = true;
    }
}
