package m;

import java.util.ArrayList;
import m.e;
import m.f;

/* loaded from: classes.dex */
public class i extends f {
    protected float v0 = -1.0f;
    protected int w0 = -1;
    protected int x0 = -1;
    private e y0 = this.f2916v;
    private int z0 = 0;
    private boolean A0 = false;
    private int B0 = 0;
    private l C0 = new l();
    private int D0 = 8;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2939a;

        static {
            int[] iArr = new int[e.d.values().length];
            f2939a = iArr;
            try {
                iArr[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2939a[e.d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2939a[e.d.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2939a[e.d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2939a[e.d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2939a[e.d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2939a[e.d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2939a[e.d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2939a[e.d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public i() {
        this.D.clear();
        this.D.add(this.y0);
        int length = this.C.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.C[i2] = this.y0;
        }
    }

    @Override // m.f
    public void G0(l.e eVar) {
        if (u() == null) {
            return;
        }
        int iY = eVar.y(this.y0);
        if (this.z0 == 1) {
            C0(iY);
            D0(0);
            b0(u().r());
            y0(0);
            return;
        }
        C0(0);
        D0(iY);
        y0(u().D());
        b0(0);
    }

    public int I0() {
        return this.z0;
    }

    public void J0(int i2) {
        if (i2 > -1) {
            this.v0 = -1.0f;
            this.w0 = i2;
            this.x0 = -1;
        }
    }

    public void K0(int i2) {
        if (i2 > -1) {
            this.v0 = -1.0f;
            this.w0 = -1;
            this.x0 = i2;
        }
    }

    public void L0(float f2) {
        if (f2 > -1.0f) {
            this.v0 = f2;
            this.w0 = -1;
            this.x0 = -1;
        }
    }

    public void M0(int i2) {
        if (this.z0 == i2) {
            return;
        }
        this.z0 = i2;
        this.D.clear();
        this.y0 = this.z0 == 1 ? this.f2915u : this.f2916v;
        this.D.add(this.y0);
        int length = this.C.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.C[i3] = this.y0;
        }
    }

    @Override // m.f
    public void b(l.e eVar) {
        g gVar = (g) u();
        if (gVar == null) {
            return;
        }
        e eVarH = gVar.h(e.d.LEFT);
        e eVarH2 = gVar.h(e.d.RIGHT);
        f fVar = this.F;
        boolean z2 = fVar != null && fVar.E[0] == f.b.WRAP_CONTENT;
        if (this.z0 == 0) {
            eVarH = gVar.h(e.d.TOP);
            eVarH2 = gVar.h(e.d.BOTTOM);
            f fVar2 = this.F;
            z2 = fVar2 != null && fVar2.E[1] == f.b.WRAP_CONTENT;
        }
        if (this.w0 != -1) {
            l.i iVarR = eVar.r(this.y0);
            eVar.e(iVarR, eVar.r(eVarH), this.w0, 6);
            if (z2) {
                eVar.i(eVar.r(eVarH2), iVarR, 0, 5);
                return;
            }
            return;
        }
        if (this.x0 == -1) {
            if (this.v0 != -1.0f) {
                eVar.d(l.e.t(eVar, eVar.r(this.y0), eVar.r(eVarH), eVar.r(eVarH2), this.v0, this.A0));
                return;
            }
            return;
        }
        l.i iVarR2 = eVar.r(this.y0);
        l.i iVarR3 = eVar.r(eVarH2);
        eVar.e(iVarR2, iVarR3, -this.x0, 6);
        if (z2) {
            eVar.i(iVarR2, eVar.r(eVarH), 0, 5);
            eVar.i(iVarR3, iVarR2, 0, 5);
        }
    }

    @Override // m.f
    public boolean c() {
        return true;
    }

    @Override // m.f
    public void d(int i2) {
        int i3;
        m mVarF;
        e eVar;
        m mVarF2;
        e eVar2;
        e eVar3;
        m mVarF3;
        int i4;
        f fVarU = u();
        if (fVarU == null) {
            return;
        }
        if (I0() == 1) {
            this.f2916v.f().h(1, fVarU.f2916v.f(), 0);
            this.f2918x.f().h(1, fVarU.f2916v.f(), 0);
            if (this.w0 != -1) {
                this.f2915u.f().h(1, fVarU.f2915u.f(), this.w0);
                mVarF2 = this.f2917w.f();
                eVar3 = fVarU.f2915u;
                mVarF3 = eVar3.f();
                i4 = this.w0;
            } else {
                if (this.x0 == -1) {
                    if (this.v0 == -1.0f || fVarU.s() != f.b.FIXED) {
                        return;
                    }
                    i3 = (int) (fVarU.G * this.v0);
                    this.f2915u.f().h(1, fVarU.f2915u.f(), i3);
                    mVarF = this.f2917w.f();
                    eVar = fVarU.f2915u;
                    mVarF.h(1, eVar.f(), i3);
                    return;
                }
                this.f2915u.f().h(1, fVarU.f2917w.f(), -this.x0);
                mVarF2 = this.f2917w.f();
                eVar2 = fVarU.f2917w;
                mVarF3 = eVar2.f();
                i4 = -this.x0;
            }
        } else {
            this.f2915u.f().h(1, fVarU.f2915u.f(), 0);
            this.f2917w.f().h(1, fVarU.f2915u.f(), 0);
            if (this.w0 != -1) {
                this.f2916v.f().h(1, fVarU.f2916v.f(), this.w0);
                mVarF2 = this.f2918x.f();
                eVar3 = fVarU.f2916v;
                mVarF3 = eVar3.f();
                i4 = this.w0;
            } else {
                if (this.x0 == -1) {
                    if (this.v0 == -1.0f || fVarU.B() != f.b.FIXED) {
                        return;
                    }
                    i3 = (int) (fVarU.H * this.v0);
                    this.f2916v.f().h(1, fVarU.f2916v.f(), i3);
                    mVarF = this.f2918x.f();
                    eVar = fVarU.f2916v;
                    mVarF.h(1, eVar.f(), i3);
                    return;
                }
                this.f2916v.f().h(1, fVarU.f2918x.f(), -this.x0);
                mVarF2 = this.f2918x.f();
                eVar2 = fVarU.f2918x;
                mVarF3 = eVar2.f();
                i4 = -this.x0;
            }
        }
        mVarF2.h(1, mVarF3, i4);
    }

    @Override // m.f
    public e h(e.d dVar) {
        switch (a.f2939a[dVar.ordinal()]) {
            case 1:
            case 2:
                if (this.z0 == 1) {
                    return this.y0;
                }
                break;
            case 3:
            case 4:
                if (this.z0 == 0) {
                    return this.y0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(dVar.name());
    }

    @Override // m.f
    public ArrayList<e> i() {
        return this.D;
    }
}
