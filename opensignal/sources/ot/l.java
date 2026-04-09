package ot;

import com.google.android.gms.internal.measurement.e5;
import ht.a1;
import ht.b0;
import ht.g0;
import ht.i0;
import java.util.List;
import rr.a0;
import rr.r0;
import ur.q0;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final l f19811b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f19812c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19813a;

    public /* synthetic */ l(int i10) {
        this.f19813a = i10;
    }

    @Override // ot.e
    public final boolean a(cs.g gVar) {
        b0 b0VarQ;
        switch (this.f19813a) {
            case 0:
                q0 q0Var = (q0) gVar.Y().get(1);
                df.c cVar = or.m.f19681d;
                br.l.d(q0Var, "secondParameter");
                a0 a0VarJ = xs.d.j(q0Var);
                cVar.getClass();
                rr.f fVarD = rr.w.d(a0VarJ, or.n.Q);
                if (fVarD == null) {
                    b0VarQ = null;
                } else {
                    i0.f10910d.getClass();
                    i0 i0Var = i0.f10911g;
                    List listO = fVarD.v().o();
                    br.l.d(listO, "kPropertyClass.typeConstructor.parameters");
                    Object objI0 = mq.o.I0(listO);
                    br.l.d(objI0, "kPropertyClass.typeConstructor.parameters.single()");
                    b0VarQ = ht.e.q(i0Var, fVarD, e5.H(new g0((r0) objI0)));
                }
                if (b0VarQ == null) {
                    return false;
                }
                ht.x type = q0Var.getType();
                br.l.d(type, "secondParameter.type");
                return jt.d.f13840a.b(b0VarQ, a1.g(type, false));
            default:
                List<q0> listY = gVar.Y();
                br.l.d(listY, "functionDescriptor.valueParameters");
                if (!listY.isEmpty()) {
                    for (q0 q0Var2 : listY) {
                        br.l.d(q0Var2, "it");
                        if (xs.d.a(q0Var2) || q0Var2.G != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // ot.e
    public final String b(cs.g gVar) {
        switch (this.f19813a) {
        }
        return a.a.t(this, gVar);
    }

    @Override // ot.e
    public final String getDescription() {
        switch (this.f19813a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
