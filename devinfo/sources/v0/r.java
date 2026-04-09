package v0;

import u0.e2;
import u0.m1;
import u0.v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r extends j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final r f35595d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f35596e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f35597f;
    public static final r g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f35598c;

    static {
        int i4 = 1;
        f35595d = new r(i4, 2, 0);
        int i10 = 1;
        f35596e = new r(i10, i10, 1);
        f35597f = new r(i4, 2, 2);
        int i11 = 1;
        g = new r(i11, i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i4, int i10, int i11) {
        super(i4, i10);
        this.f35598c = i11;
    }

    @Override // v0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, u0.c cVar, e2 e2Var, c1.o oVar, k0 k0Var) {
        switch (this.f35598c) {
            case 0:
                Object objInvoke = ((mk.a) kVar.j(0)).invoke();
                u0.a aVar = (u0.a) kVar.j(1);
                int i4 = kVar.i(0);
                aVar.getClass();
                e2Var.U(e2Var.c(aVar), objInvoke);
                cVar.l(i4, objInvoke);
                cVar.d(objInvoke);
                break;
            case 1:
                u0.a aVar2 = (u0.a) kVar.j(0);
                int i10 = kVar.i(0);
                cVar.j();
                aVar2.getClass();
                cVar.c(i10, e2Var.D(e2Var.c(aVar2)));
                break;
            case 2:
                Object objJ = kVar.j(0);
                u0.a aVar3 = (u0.a) kVar.j(1);
                int i11 = kVar.i(0);
                if (objJ instanceof v1) {
                    v1 v1Var = (v1) objJ;
                    ((w0.e) oVar.f2573e).b(v1Var);
                    ((x.f0) oVar.f2575h).a(v1Var);
                }
                Object objK = e2Var.K(e2Var.c(aVar3), i11, objJ);
                if (!(objK instanceof v1)) {
                    if (objK instanceof m1) {
                        ((m1) objK).d();
                        break;
                    }
                } else {
                    oVar.e((v1) objK);
                    break;
                }
                break;
            default:
                Object objJ2 = kVar.j(0);
                int i12 = kVar.i(0);
                if (objJ2 instanceof v1) {
                    v1 v1Var2 = (v1) objJ2;
                    ((w0.e) oVar.f2573e).b(v1Var2);
                    ((x.f0) oVar.f2575h).a(v1Var2);
                }
                Object objK2 = e2Var.K(e2Var.f34796t, i12, objJ2);
                if (!(objK2 instanceof v1)) {
                    if (objK2 instanceof m1) {
                        ((m1) objK2).d();
                        break;
                    }
                } else {
                    oVar.e((v1) objK2);
                    break;
                }
                break;
        }
    }

    @Override // v0.j0
    public u0.a b(androidx.datastore.preferences.protobuf.k kVar) {
        switch (this.f35598c) {
            case 0:
                return (u0.a) kVar.j(1);
            case 1:
                return (u0.a) kVar.j(0);
            default:
                return super.b(kVar);
        }
    }
}
