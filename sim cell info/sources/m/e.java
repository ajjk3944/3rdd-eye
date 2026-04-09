package m;

import l.i;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    final f f2851b;

    /* renamed from: c, reason: collision with root package name */
    final d f2852c;

    /* renamed from: d, reason: collision with root package name */
    e f2853d;

    /* renamed from: j, reason: collision with root package name */
    l.i f2859j;

    /* renamed from: a, reason: collision with root package name */
    private m f2850a = new m(this);

    /* renamed from: e, reason: collision with root package name */
    public int f2854e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f2855f = -1;

    /* renamed from: g, reason: collision with root package name */
    private c f2856g = c.NONE;

    /* renamed from: h, reason: collision with root package name */
    private b f2857h = b.RELAXED;

    /* renamed from: i, reason: collision with root package name */
    private int f2858i = 0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2860a;

        static {
            int[] iArr = new int[d.values().length];
            f2860a = iArr;
            try {
                iArr[d.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2860a[d.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2860a[d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2860a[d.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2860a[d.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2860a[d.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2860a[d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2860a[d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2860a[d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        RELAXED,
        STRICT
    }

    public enum c {
        NONE,
        STRONG,
        WEAK
    }

    public enum d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public e(f fVar, d dVar) {
        this.f2851b = fVar;
        this.f2852c = dVar;
    }

    public boolean a(e eVar, int i2, int i3, c cVar, int i4, boolean z2) {
        if (eVar == null) {
            this.f2853d = null;
            this.f2854e = 0;
            this.f2855f = -1;
            this.f2856g = c.NONE;
            this.f2858i = 2;
            return true;
        }
        if (!z2 && !l(eVar)) {
            return false;
        }
        this.f2853d = eVar;
        if (i2 > 0) {
            this.f2854e = i2;
        } else {
            this.f2854e = 0;
        }
        this.f2855f = i3;
        this.f2856g = cVar;
        this.f2858i = i4;
        return true;
    }

    public boolean b(e eVar, int i2, c cVar, int i3) {
        return a(eVar, i2, -1, cVar, i3, false);
    }

    public int c() {
        return this.f2858i;
    }

    public int d() {
        e eVar;
        if (this.f2851b.C() == 8) {
            return 0;
        }
        return (this.f2855f <= -1 || (eVar = this.f2853d) == null || eVar.f2851b.C() != 8) ? this.f2854e : this.f2855f;
    }

    public f e() {
        return this.f2851b;
    }

    public m f() {
        return this.f2850a;
    }

    public l.i g() {
        return this.f2859j;
    }

    public c h() {
        return this.f2856g;
    }

    public e i() {
        return this.f2853d;
    }

    public d j() {
        return this.f2852c;
    }

    public boolean k() {
        return this.f2853d != null;
    }

    public boolean l(e eVar) {
        if (eVar == null) {
            return false;
        }
        d dVarJ = eVar.j();
        d dVar = this.f2852c;
        if (dVarJ == dVar) {
            return dVar != d.BASELINE || (eVar.e().I() && e().I());
        }
        switch (a.f2860a[dVar.ordinal()]) {
            case 1:
                return (dVarJ == d.BASELINE || dVarJ == d.CENTER_X || dVarJ == d.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = dVarJ == d.LEFT || dVarJ == d.RIGHT;
                if (eVar.e() instanceof i) {
                    return z2 || dVarJ == d.CENTER_X;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = dVarJ == d.TOP || dVarJ == d.BOTTOM;
                if (eVar.e() instanceof i) {
                    return z3 || dVarJ == d.CENTER_Y;
                }
                return z3;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f2852c.name());
        }
    }

    public void m() {
        this.f2853d = null;
        this.f2854e = 0;
        this.f2855f = -1;
        this.f2856g = c.STRONG;
        this.f2858i = 0;
        this.f2857h = b.RELAXED;
        this.f2850a.e();
    }

    public void n(l.c cVar) {
        l.i iVar = this.f2859j;
        if (iVar == null) {
            this.f2859j = new l.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public String toString() {
        return this.f2851b.n() + ":" + this.f2852c.toString();
    }
}
