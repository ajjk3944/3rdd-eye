package r0;

import java.util.ArrayList;
import r0.C5507d;
import r0.C5508e;

/* compiled from: Guideline.java */
/* renamed from: r0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5511h extends C5508e {

    /* renamed from: r0, reason: collision with root package name */
    public float f45646r0 = -1.0f;

    /* renamed from: s0, reason: collision with root package name */
    public int f45647s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public int f45648t0 = -1;

    /* renamed from: u0, reason: collision with root package name */
    public C5507d f45649u0 = this.f45525K;

    /* renamed from: v0, reason: collision with root package name */
    public int f45650v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f45651w0;

    /* compiled from: Guideline.java */
    /* renamed from: r0.h$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45652a;

        static {
            int[] iArr = new int[C5507d.b.values().length];
            f45652a = iArr;
            try {
                iArr[C5507d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45652a[C5507d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45652a[C5507d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45652a[C5507d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45652a[C5507d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45652a[C5507d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45652a[C5507d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45652a[C5507d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45652a[C5507d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C5511h() {
        this.f45533S.clear();
        this.f45533S.add(this.f45649u0);
        int length = this.f45532R.length;
        for (int i = 0; i < length; i++) {
            this.f45532R[i] = this.f45649u0;
        }
    }

    @Override // r0.C5508e
    public final boolean A() {
        return this.f45651w0;
    }

    @Override // r0.C5508e
    public final boolean B() {
        return this.f45651w0;
    }

    @Override // r0.C5508e
    public final void Q(p0.c cVar, boolean z10) {
        if (this.f45536V == null) {
            return;
        }
        C5507d c5507d = this.f45649u0;
        cVar.getClass();
        int iN = p0.c.n(c5507d);
        if (this.f45650v0 == 1) {
            this.f45542a0 = iN;
            this.f45544b0 = 0;
            L(this.f45536V.k());
            O(0);
            return;
        }
        this.f45542a0 = 0;
        this.f45544b0 = iN;
        O(this.f45536V.q());
        L(0);
    }

    public final void R(int i) {
        this.f45649u0.l(i);
        this.f45651w0 = true;
    }

    public final void S(int i) {
        if (this.f45650v0 == i) {
            return;
        }
        this.f45650v0 = i;
        ArrayList<C5507d> arrayList = this.f45533S;
        arrayList.clear();
        if (this.f45650v0 == 1) {
            this.f45649u0 = this.f45524J;
        } else {
            this.f45649u0 = this.f45525K;
        }
        arrayList.add(this.f45649u0);
        C5507d[] c5507dArr = this.f45532R;
        int length = c5507dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c5507dArr[i10] = this.f45649u0;
        }
    }

    @Override // r0.C5508e
    public final void b(p0.c cVar, boolean z10) {
        C5509f c5509f = (C5509f) this.f45536V;
        if (c5509f == null) {
            return;
        }
        Object objI = c5509f.i(C5507d.b.LEFT);
        Object objI2 = c5509f.i(C5507d.b.RIGHT);
        C5508e c5508e = this.f45536V;
        boolean z11 = c5508e != null && c5508e.f45535U[0] == C5508e.b.WRAP_CONTENT;
        if (this.f45650v0 == 0) {
            objI = c5509f.i(C5507d.b.TOP);
            objI2 = c5509f.i(C5507d.b.BOTTOM);
            C5508e c5508e2 = this.f45536V;
            z11 = c5508e2 != null && c5508e2.f45535U[1] == C5508e.b.WRAP_CONTENT;
        }
        if (this.f45651w0) {
            C5507d c5507d = this.f45649u0;
            if (c5507d.f45508c) {
                p0.e eVarK = cVar.k(c5507d);
                cVar.d(eVarK, this.f45649u0.d());
                if (this.f45647s0 != -1) {
                    if (z11) {
                        cVar.f(cVar.k(objI2), eVarK, 0, 5);
                    }
                } else if (this.f45648t0 != -1 && z11) {
                    p0.e eVarK2 = cVar.k(objI2);
                    cVar.f(eVarK, cVar.k(objI), 0, 5);
                    cVar.f(eVarK2, eVarK, 0, 5);
                }
                this.f45651w0 = false;
                return;
            }
        }
        if (this.f45647s0 != -1) {
            p0.e eVarK3 = cVar.k(this.f45649u0);
            cVar.e(eVarK3, cVar.k(objI), this.f45647s0, 8);
            if (z11) {
                cVar.f(cVar.k(objI2), eVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f45648t0 != -1) {
            p0.e eVarK4 = cVar.k(this.f45649u0);
            p0.e eVarK5 = cVar.k(objI2);
            cVar.e(eVarK4, eVarK5, -this.f45648t0, 8);
            if (z11) {
                cVar.f(eVarK4, cVar.k(objI), 0, 5);
                cVar.f(eVarK5, eVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f45646r0 != -1.0f) {
            p0.e eVarK6 = cVar.k(this.f45649u0);
            p0.e eVarK7 = cVar.k(objI2);
            float f10 = this.f45646r0;
            p0.b bVarL = cVar.l();
            bVarL.f44978d.c(eVarK6, -1.0f);
            bVarL.f44978d.c(eVarK7, f10);
            cVar.c(bVarL);
        }
    }

    @Override // r0.C5508e
    public final boolean c() {
        return true;
    }

    @Override // r0.C5508e
    public final C5507d i(C5507d.b bVar) {
        int i = a.f45652a[bVar.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f45650v0 == 1) {
                return this.f45649u0;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.f45650v0 == 0) {
            return this.f45649u0;
        }
        return null;
    }
}
