package k1;

import j1.d;
import j1.e;

/* loaded from: classes.dex */
public abstract class p implements InterfaceC6358d {

    /* renamed from: a, reason: collision with root package name */
    public int f51087a;

    /* renamed from: b, reason: collision with root package name */
    j1.e f51088b;

    /* renamed from: c, reason: collision with root package name */
    m f51089c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f51090d;

    /* renamed from: e, reason: collision with root package name */
    g f51091e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f51092f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f51093g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f51094h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f51095i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f51096j = b.NONE;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f51097a;

        static {
            int[] iArr = new int[d.a.values().length];
            f51097a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51097a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51097a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51097a[d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51097a[d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(j1.e eVar) {
        this.f51088b = eVar;
    }

    private void l(int i10, int i11) {
        int i12 = this.f51087a;
        if (i12 == 0) {
            this.f51091e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f51091e.d(Math.min(g(this.f51091e.f51056m, i10), i11));
            return;
        }
        if (i12 == 2) {
            j1.e eVarF = this.f51088b.F();
            if (eVarF != null) {
                if ((i10 == 0 ? eVarF.f49900e : eVarF.f49902f).f51091e.f51053j) {
                    this.f51091e.d(g((int) ((r9.f51050g * (i10 == 0 ? this.f51088b.f49859B : this.f51088b.f49865E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        j1.e eVar = this.f51088b;
        p pVar = eVar.f49900e;
        e.b bVar = pVar.f51090d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f51087a == 3) {
            n nVar = eVar.f49902f;
            if (nVar.f51090d == bVar2 && nVar.f51087a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar.f49902f;
        }
        if (pVar.f51091e.f51053j) {
            float fS = eVar.s();
            this.f51091e.d(i10 == 1 ? (int) ((pVar.f51091e.f51050g / fS) + 0.5f) : (int) ((fS * pVar.f51091e.f51050g) + 0.5f));
        }
    }

    @Override // k1.InterfaceC6358d
    public abstract void a(InterfaceC6358d interfaceC6358d);

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f51055l.add(fVar2);
        fVar.f51049f = i10;
        fVar2.f51054k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f51055l.add(fVar2);
        fVar.f51055l.add(this.f51091e);
        fVar.f51051h = i10;
        fVar.f51052i = gVar;
        fVar2.f51054k.add(fVar);
        gVar.f51054k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i10, int i11) {
        int iMax;
        if (i11 == 0) {
            j1.e eVar = this.f51088b;
            int i12 = eVar.f49857A;
            iMax = Math.max(eVar.f49942z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        } else {
            j1.e eVar2 = this.f51088b;
            int i13 = eVar2.f49863D;
            iMax = Math.max(eVar2.f49861C, i10);
            if (i13 > 0) {
                iMax = Math.min(i13, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        }
        return iMax;
    }

    protected final f h(j1.d dVar) {
        j1.d dVar2 = dVar.f49852f;
        if (dVar2 == null) {
            return null;
        }
        j1.e eVar = dVar2.f49850d;
        int i10 = a.f51097a[dVar2.f49851e.ordinal()];
        if (i10 == 1) {
            return eVar.f49900e.f51094h;
        }
        if (i10 == 2) {
            return eVar.f49900e.f51095i;
        }
        if (i10 == 3) {
            return eVar.f49902f.f51094h;
        }
        if (i10 == 4) {
            return eVar.f49902f.f51070k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f49902f.f51095i;
    }

    protected final f i(j1.d dVar, int i10) {
        j1.d dVar2 = dVar.f49852f;
        if (dVar2 == null) {
            return null;
        }
        j1.e eVar = dVar2.f49850d;
        p pVar = i10 == 0 ? eVar.f49900e : eVar.f49902f;
        int i11 = a.f51097a[dVar2.f49851e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f51095i;
        }
        return pVar.f51094h;
    }

    public long j() {
        if (this.f51091e.f51053j) {
            return r0.f51050g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f51093g;
    }

    abstract boolean m();

    protected void n(InterfaceC6358d interfaceC6358d, j1.d dVar, j1.d dVar2, int i10) {
        f fVarH = h(dVar);
        f fVarH2 = h(dVar2);
        if (fVarH.f51053j && fVarH2.f51053j) {
            int iF = fVarH.f51050g + dVar.f();
            int iF2 = fVarH2.f51050g - dVar2.f();
            int i11 = iF2 - iF;
            if (!this.f51091e.f51053j && this.f51090d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f51091e;
            if (gVar.f51053j) {
                if (gVar.f51050g == i11) {
                    this.f51094h.d(iF);
                    this.f51095i.d(iF2);
                    return;
                }
                float fV = i10 == 0 ? this.f51088b.v() : this.f51088b.K();
                if (fVarH == fVarH2) {
                    iF = fVarH.f51050g;
                    iF2 = fVarH2.f51050g;
                    fV = 0.5f;
                }
                this.f51094h.d((int) (iF + 0.5f + (((iF2 - iF) - this.f51091e.f51050g) * fV)));
                this.f51095i.d(this.f51094h.f51050g + this.f51091e.f51050g);
            }
        }
    }

    protected void o(InterfaceC6358d interfaceC6358d) {
    }

    protected void p(InterfaceC6358d interfaceC6358d) {
    }
}
