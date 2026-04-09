package c0;

import n0.d0;
import x1.m0;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements ar.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3089a = 2;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3090d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3091g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3092r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3093x;

    public /* synthetic */ k(d0 d0Var, v0.e eVar, u.y yVar, int i10) {
        this.f3090d = d0Var;
        this.f3093x = eVar;
        this.f3092r = yVar;
        this.f3091g = i10;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f3089a) {
            case 0:
                v1.v[] vVarArr = (v1.v[]) this.f3090d;
                m0 m0Var = (m0) this.f3093x;
                int[] iArr = (int[]) this.f3092r;
                v1.u uVar = (v1.u) obj;
                int length = vVarArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    v1.v vVar = vVarArr[i10];
                    int i12 = i11 + 1;
                    br.l.b(vVar);
                    vVar.t();
                    float f10 = (this.f3091g - vVar.f23809b) / 2.0f;
                    float f11 = -1.0f;
                    if (m0Var.getLayoutDirection() != t2.i.Ltr) {
                        f11 = (-1.0f) * (-1);
                    }
                    v1.u.e(uVar, vVar, Math.round((1 + f11) * f10), iArr[i11]);
                    i10++;
                    i11 = i12;
                }
                return lq.b0.f15562a;
            case 1:
                v1.v[] vVarArr2 = (v1.v[]) this.f3090d;
                x xVar = (x) this.f3093x;
                int[] iArr2 = (int[]) this.f3092r;
                v1.u uVar2 = (v1.u) obj;
                int length2 = vVarArr2.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2) {
                    v1.v vVar2 = vVarArr2[i13];
                    br.l.b(vVar2);
                    vVar2.t();
                    v1.u.e(uVar2, vVar2, iArr2[i14], Math.round((1 + xVar.f3113b.f26487a) * ((this.f3091g - vVar2.f23810c) / 2.0f)));
                    i13++;
                    i14++;
                }
                return lq.b0.f15562a;
            default:
                d0 d0Var = (d0) this.f3090d;
                v0.e eVar = (v0.e) this.f3093x;
                u.y yVar = (u.y) this.f3092r;
                if (obj == d0Var) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof x0.t) {
                    int i15 = eVar.f23741a - this.f3091g;
                    int iD = yVar.d(obj);
                    yVar.h(Math.min(i15, iD >= 0 ? yVar.f23130c[iD] : Integer.MAX_VALUE), obj);
                }
                return lq.b0.f15562a;
        }
    }

    public /* synthetic */ k(v1.v[] vVarArr, l lVar, int i10, m0 m0Var, int[] iArr) {
        this.f3090d = vVarArr;
        this.f3091g = i10;
        this.f3093x = m0Var;
        this.f3092r = iArr;
    }

    public /* synthetic */ k(v1.v[] vVarArr, x xVar, int i10, int[] iArr) {
        this.f3090d = vVarArr;
        this.f3093x = xVar;
        this.f3091g = i10;
        this.f3092r = iArr;
    }
}
