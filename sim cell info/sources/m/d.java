package m;

import java.util.ArrayList;
import m.f;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    protected f f2833a;

    /* renamed from: b, reason: collision with root package name */
    protected f f2834b;

    /* renamed from: c, reason: collision with root package name */
    protected f f2835c;

    /* renamed from: d, reason: collision with root package name */
    protected f f2836d;

    /* renamed from: e, reason: collision with root package name */
    protected f f2837e;

    /* renamed from: f, reason: collision with root package name */
    protected f f2838f;

    /* renamed from: g, reason: collision with root package name */
    protected f f2839g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<f> f2840h;

    /* renamed from: i, reason: collision with root package name */
    protected int f2841i;

    /* renamed from: j, reason: collision with root package name */
    protected int f2842j;

    /* renamed from: k, reason: collision with root package name */
    protected float f2843k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    private int f2844l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f2845m;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f2846n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f2847o;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f2848p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f2849q;

    public d(f fVar, int i2, boolean z2) {
        this.f2845m = false;
        this.f2833a = fVar;
        this.f2844l = i2;
        this.f2845m = z2;
    }

    private void b() {
        int i2 = this.f2844l * 2;
        f fVar = this.f2833a;
        boolean z2 = false;
        f fVar2 = fVar;
        boolean z3 = false;
        while (!z3) {
            this.f2841i++;
            f[] fVarArr = fVar.r0;
            int i3 = this.f2844l;
            f fVar3 = null;
            fVarArr[i3] = null;
            fVar.f2911q0[i3] = null;
            if (fVar.C() != 8) {
                if (this.f2834b == null) {
                    this.f2834b = fVar;
                }
                this.f2836d = fVar;
                f.b[] bVarArr = fVar.E;
                int i4 = this.f2844l;
                if (bVarArr[i4] == f.b.MATCH_CONSTRAINT) {
                    int[] iArr = fVar.f2890g;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f2842j++;
                        float[] fArr = fVar.f2909p0;
                        float f2 = fArr[i4];
                        if (f2 > 0.0f) {
                            this.f2843k += fArr[i4];
                        }
                        if (c(fVar, i4)) {
                            if (f2 < 0.0f) {
                                this.f2846n = true;
                            } else {
                                this.f2847o = true;
                            }
                            if (this.f2840h == null) {
                                this.f2840h = new ArrayList<>();
                            }
                            this.f2840h.add(fVar);
                        }
                        if (this.f2838f == null) {
                            this.f2838f = fVar;
                        }
                        f fVar4 = this.f2839g;
                        if (fVar4 != null) {
                            fVar4.f2911q0[this.f2844l] = fVar;
                        }
                        this.f2839g = fVar;
                    }
                }
            }
            if (fVar2 != fVar) {
                fVar2.r0[this.f2844l] = fVar;
            }
            e eVar = fVar.C[i2 + 1].f2853d;
            if (eVar != null) {
                f fVar5 = eVar.f2851b;
                e[] eVarArr = fVar5.C;
                if (eVarArr[i2].f2853d != null && eVarArr[i2].f2853d.f2851b == fVar) {
                    fVar3 = fVar5;
                }
            }
            if (fVar3 == null) {
                fVar3 = fVar;
                z3 = true;
            }
            fVar2 = fVar;
            fVar = fVar3;
        }
        this.f2835c = fVar;
        if (this.f2844l == 0 && this.f2845m) {
            this.f2837e = fVar;
        } else {
            this.f2837e = this.f2833a;
        }
        if (this.f2847o && this.f2846n) {
            z2 = true;
        }
        this.f2848p = z2;
    }

    private static boolean c(f fVar, int i2) {
        if (fVar.C() != 8 && fVar.E[i2] == f.b.MATCH_CONSTRAINT) {
            int[] iArr = fVar.f2890g;
            if (iArr[i2] == 0 || iArr[i2] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.f2849q) {
            b();
        }
        this.f2849q = true;
    }
}
