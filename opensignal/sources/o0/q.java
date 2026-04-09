package o0;

import n0.k1;
import n0.q1;
import n0.v1;

/* loaded from: classes.dex */
public final class q extends ns.d {

    /* renamed from: e, reason: collision with root package name */
    public static final q f18720e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f18721f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f18722g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f18723h;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18724d;

    static {
        int i10 = 1;
        f18720e = new q(i10, 2, 0);
        int i11 = 1;
        f18721f = new q(i11, i11, 1);
        f18722g = new q(i10, 2, 2);
        int i12 = 1;
        f18723h = new q(i12, i12, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10, int i11, int i12) {
        super(i10, i11, 1, (byte) 0);
        this.f18724d = i12;
    }

    @Override // ns.d
    public final void c(androidx.datastore.preferences.protobuf.l lVar, n0.c cVar, v1 v1Var, al.g gVar, g0 g0Var) {
        switch (this.f18724d) {
            case 0:
                Object objC = ((ar.a) lVar.g(0)).c();
                n0.a aVar = (n0.a) lVar.g(1);
                int iF = lVar.f(0);
                aVar.getClass();
                v1Var.S(v1Var.c(aVar), objC);
                cVar.p(iF, objC);
                cVar.e(objC);
                break;
            case 1:
                n0.a aVar2 = (n0.a) lVar.g(0);
                int iF2 = lVar.f(0);
                cVar.k();
                aVar2.getClass();
                cVar.d(iF2, v1Var.B(v1Var.c(aVar2)));
                break;
            case 2:
                Object objG = lVar.g(0);
                n0.a aVar3 = (n0.a) lVar.g(1);
                int iF3 = lVar.f(0);
                if (objG instanceof q1) {
                    q1 q1Var = (q1) objG;
                    ((p0.e) gVar.f849e).b(q1Var);
                    ((u.b0) gVar.f848d).a(q1Var);
                }
                Object objI = v1Var.I(v1Var.c(aVar3), iF3, objG);
                if (!(objI instanceof q1)) {
                    if (objI instanceof k1) {
                        ((k1) objI).d();
                        break;
                    }
                } else {
                    gVar.f((q1) objI);
                    break;
                }
                break;
            default:
                Object objG2 = lVar.g(0);
                int iF4 = lVar.f(0);
                if (objG2 instanceof q1) {
                    q1 q1Var2 = (q1) objG2;
                    ((p0.e) gVar.f849e).b(q1Var2);
                    ((u.b0) gVar.f848d).a(q1Var2);
                }
                Object objI2 = v1Var.I(v1Var.f17350t, iF4, objG2);
                if (!(objI2 instanceof q1)) {
                    if (objI2 instanceof k1) {
                        ((k1) objI2).d();
                        break;
                    }
                } else {
                    gVar.f((q1) objI2);
                    break;
                }
                break;
        }
    }

    @Override // ns.d
    public n0.a d(androidx.datastore.preferences.protobuf.l lVar) {
        switch (this.f18724d) {
            case 0:
                return (n0.a) lVar.g(1);
            case 1:
                return (n0.a) lVar.g(0);
            default:
                return super.d(lVar);
        }
    }
}
