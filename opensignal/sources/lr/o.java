package lr;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15654d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f15655g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r rVar, int i10) {
        super(0);
        this.f15654d = i10;
        this.f15655g = rVar;
    }

    @Override // ar.a
    public final Object c() {
        int i10;
        Type[] lowerBounds;
        int i11 = this.f15654d;
        int i12 = 0;
        r rVar = this.f15655g;
        switch (i11) {
            case 0:
                int size = (rVar.r() ? 1 : 0) + rVar.o().size();
                int size2 = (rVar.o().size() + 31) / 32;
                Object[] objArr = new Object[size + size2 + 1];
                Iterator it = rVar.o().iterator();
                while (it.hasNext()) {
                    t0 t0Var = (t0) ((ir.m) it.next());
                    boolean zF = t0Var.f();
                    int i13 = t0Var.f15690d;
                    if (zF) {
                        m1 m1VarC = t0Var.c();
                        qs.c cVar = z1.f15721a;
                        ht.x xVar = m1VarC.f15644a;
                        if (xVar == null || !ts.h.c(xVar)) {
                            objArr[i13] = z1.e(xu.l.w(t0Var.c()));
                        }
                    }
                    if (t0Var.g()) {
                        objArr[i13] = r.j(t0Var.c());
                    }
                }
                for (int i14 = 0; i14 < size2; i14++) {
                    objArr[size + i14] = 0;
                }
                return objArr;
            case 1:
                return z1.d(rVar.C());
            case 2:
                rr.d dVarC = rVar.C();
                ArrayList arrayList = new ArrayList();
                if (rVar.E()) {
                    i10 = 0;
                } else {
                    ur.v vVarG = z1.g(dVarC);
                    if (vVarG != null) {
                        arrayList.add(new t0(rVar, 0, ir.l.INSTANCE, new p(vVarG, 0)));
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    ur.v vVarJ0 = dVarC.j0();
                    if (vVarJ0 != null) {
                        arrayList.add(new t0(rVar, i10, ir.l.EXTENSION_RECEIVER, new p(vVarJ0, 1)));
                        i10++;
                    }
                }
                int size3 = dVarC.Y().size();
                while (i12 < size3) {
                    arrayList.add(new t0(rVar, i10, ir.l.VALUE, new q(dVarC, i12)));
                    i12++;
                    i10++;
                }
                if (rVar.D() && (dVarC instanceof cs.a) && arrayList.size() > 1) {
                    mq.s.c0(arrayList, new dv.h(10));
                }
                arrayList.trimToSize();
                return arrayList;
            case 3:
                Type type = null;
                if (rVar.r()) {
                    Object objA0 = mq.o.A0(rVar.z().a());
                    ParameterizedType parameterizedType = objA0 instanceof ParameterizedType ? (ParameterizedType) objA0 : null;
                    if (br.l.a(parameterizedType != null ? parameterizedType.getRawType() : null, pq.c.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        br.l.d(actualTypeArguments, "continuationType.actualTypeArguments");
                        Object objX0 = mq.l.x0(actualTypeArguments);
                        WildcardType wildcardType = objX0 instanceof WildcardType ? (WildcardType) objX0 : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) mq.l.m0(lowerBounds);
                        }
                    }
                }
                return type == null ? rVar.z().i() : type;
            case 4:
                ht.x xVarI = rVar.C().i();
                br.l.b(xVarI);
                return new m1(xVarI, new o(rVar, 3));
            default:
                List<rr.r0> typeParameters = rVar.C().getTypeParameters();
                br.l.d(typeParameters, "descriptor.typeParameters");
                ArrayList arrayList2 = new ArrayList(mq.p.a0(typeParameters, 10));
                for (rr.r0 r0Var : typeParameters) {
                    br.l.d(r0Var, "descriptor");
                    arrayList2.add(new o1(rVar, r0Var));
                }
                return arrayList2;
        }
    }
}
