package es;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i4;
import ht.y0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rr.r0;
import ur.q0;

/* loaded from: classes.dex */
public final class n extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8316d = 1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cj.a f8317g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f8318r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(cj.a aVar, p pVar) {
        super(0);
        this.f8317g = aVar;
        this.f8318r = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [es.c0, es.p] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [cs.b, ur.j, ur.u] */
    @Override // ar.a
    public final Object c() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ?? arrayList;
        Object obj;
        xr.x xVar;
        ArrayList arrayList2;
        lq.l lVar;
        List listD;
        switch (this.f8316d) {
            case 0:
                ?? r22 = this.f8318r;
                xr.o oVar = r22.f8322o;
                cj.a aVar = r22.f8271b;
                rr.f fVar = r22.f8321n;
                Constructor<?>[] declaredConstructors = oVar.f25509a.getDeclaredConstructors();
                br.l.d(declaredConstructors, "klass.declaredConstructors");
                boolean z10 = false;
                List<xr.r> listD0 = st.l.d0(st.l.b0(new st.f(mq.l.Y(declaredConstructors), false, xr.j.E), xr.k.E));
                ArrayList arrayList3 = new ArrayList(listD0.size());
                for (xr.r rVar : listD0) {
                    ds.c cVarH = ic.a.H(aVar, rVar);
                    ds.a aVar2 = (ds.a) aVar.f3974d;
                    cs.b bVarM1 = cs.b.M1(fVar, cVarH, z10, aVar2.j.a(rVar));
                    cj.a aVar3 = new cj.a(aVar2, new bj.c(aVar, bVarM1, rVar, fVar.s().size()), (lq.h) aVar.f3976r);
                    Constructor constructor = rVar.f25513a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    br.l.d(genericParameterTypes, "types");
                    if (genericParameterTypes.length == 0) {
                        listD = mq.w.f16945a;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) mq.l.h0(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) mq.l.h0(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listD = rVar.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    ab.g gVarU = c0.u(aVar3, bVarM1, listD);
                    List listS = fVar.s();
                    br.l.d(listS, "classDescriptor.declaredTypeParameters");
                    ArrayList typeParameters = rVar.getTypeParameters();
                    ArrayList arrayList4 = new ArrayList(mq.p.a0(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        r0 r0VarA = ((ds.e) aVar3.f3975g).a((xr.c0) it.next());
                        br.l.b(r0VarA);
                        arrayList4.add(r0VarA);
                    }
                    bVarM1.K1((List) gVarU.f309g, i4.I(rVar.e()), mq.o.E0(listS, arrayList4));
                    bVarM1.D1(false);
                    bVarM1.E1(gVarU.f308d);
                    bVarM1.F1(fVar.q());
                    ((ds.a) aVar3.f3974d).f7452g.getClass();
                    arrayList3.add(bVarM1);
                    z10 = false;
                }
                boolean zF = oVar.f();
                Class cls = oVar.f25509a;
                sr.f fVar2 = sr.g.f22217a;
                cj.a aVar4 = this.f8317g;
                if (zF) {
                    cs.b bVarM12 = cs.b.M1(fVar, fVar2, true, ((ds.a) aVar.f3974d).j.a(oVar));
                    ArrayList arrayListE = oVar.e();
                    ArrayList arrayList5 = new ArrayList(arrayListE.size());
                    fs.a aVarF0 = b4.f0(y0.COMMON, false, null, 6);
                    int i10 = 0;
                    for (Iterator it2 = arrayListE.iterator(); it2.hasNext(); it2 = it2) {
                        xr.a0 a0Var = (xr.a0) it2.next();
                        arrayList5.add(new q0(bVarM12, null, i10, fVar2, a0Var.c(), ((bm.d) aVar.f3978y).U(a0Var.f(), aVarF0), false, false, false, null, ((ds.a) aVar.f3974d).j.a(a0Var)));
                        i10++;
                    }
                    bVarM12.E1(false);
                    as.p pVarC = fVar.c();
                    br.l.d(pVarC, "classDescriptor.visibility");
                    if (pVarC.equals(as.q.f2242b)) {
                        pVarC = as.q.f2243c;
                        br.l.d(pVarC, "PROTECTED_AND_PACKAGE");
                    }
                    bVarM12.J1(arrayList5, pVarC);
                    bVarM12.D1(false);
                    bVarM12.F1(fVar.q());
                    String strF = i3.g.f(bVarM12, 2);
                    if (arrayList3.isEmpty()) {
                        arrayList3.add(bVarM12);
                        ((ds.a) aVar4.f3974d).f7452g.getClass();
                    } else {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            if (i3.g.f((ur.j) it3.next(), 2).equals(strF)) {
                            }
                        }
                        arrayList3.add(bVarM12);
                        ((ds.a) aVar4.f3974d).f7452g.getClass();
                    }
                }
                ((ys.a) ((ds.a) aVar4.f3974d).f7467x).getClass();
                br.l.e(aVar4, "_context_receiver_0");
                br.l.e(fVar, "thisDescriptor");
                is.c cVar = ((ds.a) aVar4.f3974d).f7461r;
                boolean zIsEmpty = arrayList3.isEmpty();
                Collection collectionJ = arrayList3;
                if (zIsEmpty) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (zIsAnnotation) {
                        ds.a aVar5 = (ds.a) aVar.f3974d;
                        bm.d dVar = (bm.d) aVar.f3978y;
                        ?? M1 = cs.b.M1(fVar, fVar2, true, aVar5.j.a(oVar));
                        if (zIsAnnotation) {
                            List listD2 = oVar.d();
                            arrayList = new ArrayList(listD2.size());
                            fs.a aVarF02 = b4.f0(y0.COMMON, true, null, 6);
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            Iterator it4 = listD2.iterator();
                            while (it4.hasNext()) {
                                Object next = it4.next();
                                Iterator it5 = it4;
                                if (br.l.a(((xr.x) next).c(), as.a0.f2167b)) {
                                    arrayList6.add(next);
                                } else {
                                    arrayList7.add(next);
                                }
                                it4 = it5;
                            }
                            arrayList6.size();
                            xr.x xVar2 = (xr.x) mq.o.t0(arrayList6);
                            if (xVar2 != null) {
                                xr.b0 b0VarF = xVar2.f();
                                if (b0VarF instanceof xr.i) {
                                    xr.i iVar = (xr.i) b0VarF;
                                    xVar = xVar2;
                                    lVar = new lq.l(dVar.T(iVar, aVarF02, true), dVar.U(iVar.f25507b, aVarF02));
                                } else {
                                    xVar = xVar2;
                                    lVar = new lq.l(dVar.U(b0VarF, aVarF02), null);
                                }
                                arrayList2 = arrayList7;
                                r22.x(arrayList, M1, 0, xVar, (ht.x) lVar.f15571a, (ht.x) lVar.f15572d);
                            } else {
                                xVar = xVar2;
                                arrayList2 = arrayList7;
                            }
                            int i11 = xVar != null ? 1 : 0;
                            Iterator it6 = arrayList2.iterator();
                            int i12 = 0;
                            while (it6.hasNext()) {
                                xr.x xVar3 = (xr.x) it6.next();
                                r22.x(arrayList, M1, i12 + i11, xVar3, dVar.U(xVar3.f(), aVarF02), null);
                                i12++;
                            }
                        } else {
                            arrayList = Collections.EMPTY_LIST;
                        }
                        M1.E1(false);
                        as.p pVarC2 = fVar.c();
                        br.l.d(pVarC2, "classDescriptor.visibility");
                        if (pVarC2.equals(as.q.f2242b)) {
                            pVarC2 = as.q.f2243c;
                            br.l.d(pVarC2, "PROTECTED_AND_PACKAGE");
                        }
                        M1.J1(arrayList, pVarC2);
                        M1.D1(true);
                        M1.F1(fVar.q());
                        ((ds.a) aVar.f3974d).f7452g.getClass();
                        obj = M1;
                    } else {
                        obj = null;
                    }
                    collectionJ = e5.J(obj);
                }
                return mq.o.Q0(cVar.e(aVar4, collectionJ));
            default:
                cj.a aVar6 = this.f8317g;
                ys.e eVar = ((ds.a) aVar6.f3974d).f7467x;
                rr.f fVar3 = this.f8318r.f8321n;
                ((ys.a) eVar).getClass();
                br.l.e(aVar6, "_context_receiver_0");
                br.l.e(fVar3, "thisDescriptor");
                return mq.o.U0(new ArrayList());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, cj.a aVar) {
        super(0);
        this.f8318r = pVar;
        this.f8317g = aVar;
    }
}
