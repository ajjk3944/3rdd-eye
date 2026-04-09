package com.yandex.mobile.ads.impl;

import c9.C2092m;
import c9.C2097r;
import c9.C2099t;
import com.yandex.mobile.ads.impl.ez0;
import com.yandex.mobile.ads.impl.mw;
import com.yandex.mobile.ads.impl.qw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class xw {

    /* renamed from: a, reason: collision with root package name */
    private final fz0 f35515a;

    /* renamed from: b, reason: collision with root package name */
    private final nz0 f35516b;

    /* renamed from: c, reason: collision with root package name */
    private final rw f35517c;

    /* renamed from: d, reason: collision with root package name */
    private final kz0 f35518d;

    public xw(fz0 networksValidator, nz0 networksMapper, rw alertsMapper, kz0 mediationNetworksStatusMapper) {
        kotlin.jvm.internal.l.f(networksValidator, "networksValidator");
        kotlin.jvm.internal.l.f(networksMapper, "networksMapper");
        kotlin.jvm.internal.l.f(alertsMapper, "alertsMapper");
        kotlin.jvm.internal.l.f(mediationNetworksStatusMapper, "mediationNetworksStatusMapper");
        this.f35515a = networksValidator;
        this.f35516b = networksMapper;
        this.f35517c = alertsMapper;
        this.f35518d = mediationNetworksStatusMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ww a(ix localData, mx mxVar) {
        List<lx> listF;
        C2099t c2099t;
        qw.a aVar;
        List<cw> listB;
        Object next;
        mw.a bVar;
        boolean z10 = true;
        kotlin.jvm.internal.l.f(localData, "localData");
        C2099t c2099t2 = C2099t.f18581b;
        if (mxVar == null || (listF = mxVar.f()) == null) {
            listF = c2099t2;
        }
        sw swVarA = localData.a();
        tx txVarF = localData.f();
        bw bwVar = new bw(mxVar != null ? mxVar.g() : null, mxVar != null ? mxVar.e() : null, mxVar != null ? mxVar.d() : null);
        List<ez0> listE = localData.e();
        ArrayList arrayListA = this.f35516b.a(listF);
        if (!arrayListA.isEmpty()) {
            listE = arrayListA;
        }
        ArrayList arrayList = new ArrayList(C2092m.T(listE, 10));
        for (ez0 network : listE) {
            Iterator<T> it = listF.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.l.b(((lx) next).f(), network.d())) {
                    break;
                }
            }
            lx lxVar = (lx) next;
            this.f35515a.getClass();
            boolean zA = fz0.a(network);
            this.f35518d.getClass();
            kotlin.jvm.internal.l.f(network, "network");
            List<ez0.c> listB2 = network.b();
            if ((listB2 instanceof Collection) && listB2.isEmpty()) {
                bVar = mw.a.C0413a.f30535a;
            } else {
                Iterator<T> it2 = listB2.iterator();
                while (it2.hasNext()) {
                    if (!((ez0.c) it2.next()).c()) {
                        List<ez0.c> listB3 = network.b();
                        if ((listB3 instanceof Collection) && listB3.isEmpty()) {
                            bVar = mw.a.c.f30537a;
                        } else {
                            Iterator<T> it3 = listB3.iterator();
                            while (it3.hasNext()) {
                                if (((ez0.c) it3.next()).c()) {
                                    gz0 gz0Var = gz0.f28043b;
                                    bVar = new mw.a.b();
                                    break;
                                }
                            }
                            bVar = mw.a.c.f30537a;
                        }
                    }
                }
                bVar = mw.a.C0413a.f30535a;
            }
            mw.a aVar2 = bVar;
            String strD = network.d();
            String strE = lxVar != null ? lxVar.e() : null;
            ez0.c cVar = (ez0.c) C2097r.q0(network.b());
            String strB = cVar != null ? cVar.b() : null;
            String strD2 = lxVar != null ? lxVar.d() : null;
            String strE2 = network.e();
            List<ez0.c> listB4 = network.b();
            ArrayList arrayList2 = new ArrayList(C2092m.T(listB4, 10));
            Iterator<T> it4 = listB4.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((ez0.c) it4.next()).a());
            }
            arrayList.add(new mw(strD, strE, zA, strB, strD2, strE2, aVar2, arrayList2));
        }
        ow owVar = new ow(arrayList);
        vw vwVarB = localData.b();
        cx cxVarC = localData.c();
        List<cw> list = (mxVar == null || (listB = mxVar.b()) == null) ? c2099t2 : listB;
        rw rwVar = this.f35517c;
        List<pw> listC = mxVar != null ? mxVar.c() : null;
        rwVar.getClass();
        if (listC != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : listC) {
                pw pwVar = (pw) obj;
                if (pwVar.b() != null || pwVar.a() != null) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(C2092m.T(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                pw pwVar2 = (pw) it5.next();
                String strB2 = pwVar2.b();
                String strA = pwVar2.a();
                boolean z11 = z10;
                qw.a[] aVarArrValues = qw.a.values();
                int length = aVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = aVarArrValues[i];
                    int i10 = length;
                    int i11 = i;
                    if (kotlin.jvm.internal.l.b(pwVar2.c(), aVar.a())) {
                        break;
                    }
                    i = i11 + 1;
                    length = i10;
                }
                if (aVar == null) {
                    aVar = qw.a.f32364c;
                }
                arrayList4.add(new qw(strB2, strA, aVar));
                z10 = z11;
            }
            c2099t = arrayList4;
        } else {
            c2099t = c2099t2;
        }
        return new ww(swVarA, txVarF, bwVar, owVar, vwVarB, cxVarC, list, c2099t);
    }
}
