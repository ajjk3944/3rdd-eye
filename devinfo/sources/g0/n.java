package g0;

import g2.r0;
import g2.s0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24156a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24158c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24160e;

    public /* synthetic */ n(u0.d0 d0Var, c1.i iVar, x.z zVar, int i4) {
        this.f24157b = d0Var;
        this.f24160e = iVar;
        this.f24159d = zVar;
        this.f24158c = i4;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f24156a) {
            case 0:
                s0[] s0VarArr = (s0[]) this.f24157b;
                g2.l0 l0Var = (g2.l0) this.f24160e;
                int[] iArr = (int[]) this.f24159d;
                r0 r0Var = (r0) obj;
                int length = s0VarArr.length;
                int i4 = 0;
                int i10 = 0;
                while (i4 < length) {
                    s0 s0Var = s0VarArr[i4];
                    int i11 = i10 + 1;
                    nk.k.b(s0Var);
                    s0Var.w();
                    float f10 = (this.f24158c - s0Var.f24408a) / 2.0f;
                    float f11 = -1.0f;
                    if (l0Var.getLayoutDirection() != d3.l.f21966a) {
                        f11 = (-1.0f) * (-1);
                    }
                    r0.g(r0Var, s0Var, Math.round((1 + f11) * f10), iArr[i10]);
                    i4++;
                    i10 = i11;
                }
                return yj.u.f37649a;
            case 1:
                s0[] s0VarArr2 = (s0[]) this.f24157b;
                g0 g0Var = (g0) this.f24160e;
                int[] iArr2 = (int[]) this.f24159d;
                r0 r0Var2 = (r0) obj;
                int length2 = s0VarArr2.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length2) {
                    s0 s0Var2 = s0VarArr2[i12];
                    nk.k.b(s0Var2);
                    s0Var2.w();
                    r0.g(r0Var2, s0Var2, iArr2[i13], g0Var.f24116b.a(s0Var2.f24409b, this.f24158c));
                    i12++;
                    i13++;
                }
                return yj.u.f37649a;
            default:
                u0.d0 d0Var = (u0.d0) this.f24157b;
                c1.i iVar = (c1.i) this.f24160e;
                x.z zVar = (x.z) this.f24159d;
                if (obj == d0Var) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof g1.x) {
                    int i14 = iVar.f2562a - this.f24158c;
                    int iD = zVar.d(obj);
                    zVar.g(Math.min(i14, iD >= 0 ? zVar.f36967c[iD] : Integer.MAX_VALUE), obj);
                }
                return yj.u.f37649a;
        }
    }

    public /* synthetic */ n(s0[] s0VarArr, o oVar, int i4, g2.l0 l0Var, int[] iArr) {
        this.f24157b = s0VarArr;
        this.f24158c = i4;
        this.f24160e = l0Var;
        this.f24159d = iArr;
    }

    public /* synthetic */ n(s0[] s0VarArr, g0 g0Var, int i4, int[] iArr) {
        this.f24157b = s0VarArr;
        this.f24160e = g0Var;
        this.f24158c = i4;
        this.f24159d = iArr;
    }
}
