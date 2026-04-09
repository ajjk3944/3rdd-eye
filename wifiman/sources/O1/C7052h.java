package o1;

import o1.C7048d;
import o1.C7049e;

/* renamed from: o1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7052h extends C7049e {

    /* renamed from: w0, reason: collision with root package name */
    protected float f55224w0 = -1.0f;

    /* renamed from: x0, reason: collision with root package name */
    protected int f55225x0 = -1;

    /* renamed from: y0, reason: collision with root package name */
    protected int f55226y0 = -1;

    /* renamed from: z0, reason: collision with root package name */
    private C7048d f55227z0 = this.f55083C;

    /* renamed from: A0, reason: collision with root package name */
    private int f55222A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    private int f55223B0 = 0;

    /* renamed from: o1.h$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55228a;

        static {
            int[] iArr = new int[C7048d.b.values().length];
            f55228a = iArr;
            try {
                iArr[C7048d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55228a[C7048d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55228a[C7048d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55228a[C7048d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55228a[C7048d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55228a[C7048d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55228a[C7048d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55228a[C7048d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55228a[C7048d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C7052h() {
        this.f55091K.clear();
        this.f55091K.add(this.f55227z0);
        int length = this.f55090J.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f55090J[i10] = this.f55227z0;
        }
    }

    @Override // o1.C7049e
    public void J0(n1.d dVar) {
        if (G() == null) {
            return;
        }
        int iX = dVar.x(this.f55227z0);
        if (this.f55222A0 == 1) {
            F0(iX);
            G0(0);
            h0(G().v());
            E0(0);
            return;
        }
        F0(0);
        G0(iX);
        E0(G().P());
        h0(0);
    }

    public int K0() {
        return this.f55222A0;
    }

    public int L0() {
        return this.f55225x0;
    }

    public int M0() {
        return this.f55226y0;
    }

    public float N0() {
        return this.f55224w0;
    }

    public void O0(int i10) {
        if (i10 > -1) {
            this.f55224w0 = -1.0f;
            this.f55225x0 = i10;
            this.f55226y0 = -1;
        }
    }

    public void P0(int i10) {
        if (i10 > -1) {
            this.f55224w0 = -1.0f;
            this.f55225x0 = -1;
            this.f55226y0 = i10;
        }
    }

    public void Q0(float f10) {
        if (f10 > -1.0f) {
            this.f55224w0 = f10;
            this.f55225x0 = -1;
            this.f55226y0 = -1;
        }
    }

    public void R0(int i10) {
        if (this.f55222A0 == i10) {
            return;
        }
        this.f55222A0 = i10;
        this.f55091K.clear();
        if (this.f55222A0 == 1) {
            this.f55227z0 = this.f55082B;
        } else {
            this.f55227z0 = this.f55083C;
        }
        this.f55091K.add(this.f55227z0);
        int length = this.f55090J.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f55090J[i11] = this.f55227z0;
        }
    }

    @Override // o1.C7049e
    public void f(n1.d dVar) {
        C7050f c7050f = (C7050f) G();
        if (c7050f == null) {
            return;
        }
        C7048d c7048dM = c7050f.m(C7048d.b.LEFT);
        C7048d c7048dM2 = c7050f.m(C7048d.b.RIGHT);
        C7049e c7049e = this.f55094N;
        boolean z10 = c7049e != null && c7049e.f55093M[0] == C7049e.b.WRAP_CONTENT;
        if (this.f55222A0 == 0) {
            c7048dM = c7050f.m(C7048d.b.TOP);
            c7048dM2 = c7050f.m(C7048d.b.BOTTOM);
            C7049e c7049e2 = this.f55094N;
            z10 = c7049e2 != null && c7049e2.f55093M[1] == C7049e.b.WRAP_CONTENT;
        }
        if (this.f55225x0 != -1) {
            n1.i iVarQ = dVar.q(this.f55227z0);
            dVar.e(iVarQ, dVar.q(c7048dM), this.f55225x0, 8);
            if (z10) {
                dVar.h(dVar.q(c7048dM2), iVarQ, 0, 5);
                return;
            }
            return;
        }
        if (this.f55226y0 == -1) {
            if (this.f55224w0 != -1.0f) {
                dVar.d(n1.d.s(dVar, dVar.q(this.f55227z0), dVar.q(c7048dM2), this.f55224w0));
                return;
            }
            return;
        }
        n1.i iVarQ2 = dVar.q(this.f55227z0);
        n1.i iVarQ3 = dVar.q(c7048dM2);
        dVar.e(iVarQ2, iVarQ3, -this.f55226y0, 8);
        if (z10) {
            dVar.h(iVarQ2, dVar.q(c7048dM), 0, 5);
            dVar.h(iVarQ3, iVarQ2, 0, 5);
        }
    }

    @Override // o1.C7049e
    public boolean g() {
        return true;
    }

    @Override // o1.C7049e
    public C7048d m(C7048d.b bVar) {
        switch (a.f55228a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f55222A0 == 1) {
                    return this.f55227z0;
                }
                break;
            case 3:
            case 4:
                if (this.f55222A0 == 0) {
                    return this.f55227z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
