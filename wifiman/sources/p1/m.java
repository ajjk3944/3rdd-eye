package p1;

import o1.C7048d;
import o1.C7049e;

/* loaded from: classes.dex */
public abstract class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f57498a;

    /* renamed from: b, reason: collision with root package name */
    C7049e f57499b;

    /* renamed from: c, reason: collision with root package name */
    k f57500c;

    /* renamed from: d, reason: collision with root package name */
    protected C7049e.b f57501d;

    /* renamed from: e, reason: collision with root package name */
    g f57502e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f57503f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f57504g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f57505h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f57506i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f57507j = b.NONE;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57508a;

        static {
            int[] iArr = new int[C7048d.b.values().length];
            f57508a = iArr;
            try {
                iArr[C7048d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57508a[C7048d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57508a[C7048d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57508a[C7048d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57508a[C7048d.b.BOTTOM.ordinal()] = 5;
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

    public m(C7049e c7049e) {
        this.f57499b = c7049e;
    }

    private void l(int i10, int i11) {
        int i12 = this.f57498a;
        if (i12 == 0) {
            this.f57502e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f57502e.d(Math.min(g(this.f57502e.f57484m, i10), i11));
            return;
        }
        if (i12 == 2) {
            C7049e c7049eG = this.f57499b.G();
            if (c7049eG != null) {
                if ((i10 == 0 ? c7049eG.f55115e : c7049eG.f55117f).f57502e.f57481j) {
                    C7049e c7049e = this.f57499b;
                    this.f57502e.d(g((int) ((r9.f57478g * (i10 == 0 ? c7049e.f55139q : c7049e.f55145t)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        C7049e c7049e2 = this.f57499b;
        m mVar = c7049e2.f55115e;
        C7049e.b bVar = mVar.f57501d;
        C7049e.b bVar2 = C7049e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && mVar.f57498a == 3) {
            l lVar = c7049e2.f55117f;
            if (lVar.f57501d == bVar2 && lVar.f57498a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            mVar = c7049e2.f55117f;
        }
        if (mVar.f57502e.f57481j) {
            float fT = c7049e2.t();
            this.f57502e.d(i10 == 1 ? (int) ((mVar.f57502e.f57478g / fT) + 0.5f) : (int) ((fT * mVar.f57502e.f57478g) + 0.5f));
        }
    }

    @Override // p1.d
    public abstract void a(d dVar);

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f57483l.add(fVar2);
        fVar.f57477f = i10;
        fVar2.f57482k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f57483l.add(fVar2);
        fVar.f57483l.add(this.f57502e);
        fVar.f57479h = i10;
        fVar.f57480i = gVar;
        fVar2.f57482k.add(fVar);
        gVar.f57482k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i10, int i11) {
        int iMax;
        if (i11 == 0) {
            C7049e c7049e = this.f57499b;
            int i12 = c7049e.f55137p;
            iMax = Math.max(c7049e.f55135o, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        } else {
            C7049e c7049e2 = this.f57499b;
            int i13 = c7049e2.f55143s;
            iMax = Math.max(c7049e2.f55141r, i10);
            if (i13 > 0) {
                iMax = Math.min(i13, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        }
        return iMax;
    }

    protected final f h(C7048d c7048d) {
        C7048d c7048d2 = c7048d.f55075d;
        if (c7048d2 == null) {
            return null;
        }
        C7049e c7049e = c7048d2.f55073b;
        int i10 = a.f57508a[c7048d2.f55074c.ordinal()];
        if (i10 == 1) {
            return c7049e.f55115e.f57505h;
        }
        if (i10 == 2) {
            return c7049e.f55115e.f57506i;
        }
        if (i10 == 3) {
            return c7049e.f55117f.f57505h;
        }
        if (i10 == 4) {
            return c7049e.f55117f.f57495k;
        }
        if (i10 != 5) {
            return null;
        }
        return c7049e.f55117f.f57506i;
    }

    protected final f i(C7048d c7048d, int i10) {
        C7048d c7048d2 = c7048d.f55075d;
        if (c7048d2 == null) {
            return null;
        }
        C7049e c7049e = c7048d2.f55073b;
        m mVar = i10 == 0 ? c7049e.f55115e : c7049e.f55117f;
        int i11 = a.f57508a[c7048d2.f55074c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f57506i;
        }
        return mVar.f57505h;
    }

    public long j() {
        if (this.f57502e.f57481j) {
            return r0.f57478g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f57504g;
    }

    abstract boolean m();

    protected void n(d dVar, C7048d c7048d, C7048d c7048d2, int i10) {
        f fVarH = h(c7048d);
        f fVarH2 = h(c7048d2);
        if (fVarH.f57481j && fVarH2.f57481j) {
            int iC = fVarH.f57478g + c7048d.c();
            int iC2 = fVarH2.f57478g - c7048d2.c();
            int i11 = iC2 - iC;
            if (!this.f57502e.f57481j && this.f57501d == C7049e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f57502e;
            if (gVar.f57481j) {
                if (gVar.f57478g == i11) {
                    this.f57505h.d(iC);
                    this.f57506i.d(iC2);
                    return;
                }
                C7049e c7049e = this.f57499b;
                float fW = i10 == 0 ? c7049e.w() : c7049e.K();
                if (fVarH == fVarH2) {
                    iC = fVarH.f57478g;
                    iC2 = fVarH2.f57478g;
                    fW = 0.5f;
                }
                this.f57505h.d((int) (iC + 0.5f + (((iC2 - iC) - this.f57502e.f57478g) * fW)));
                this.f57506i.d(this.f57505h.f57478g + this.f57502e.f57478g);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
