package com.yandex.mobile.ads.impl;

import c9.C2078B;
import c9.C2088i;
import c9.C2092m;
import c9.C2095p;
import c9.C2097r;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class my1 implements ed1 {

    /* renamed from: c, reason: collision with root package name */
    private static final List<ux1> f30582c = C2092m.W(ux1.f34241b, ux1.f34242c);

    /* renamed from: a, reason: collision with root package name */
    private final Map<ux1, ed1> f30583a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30584b;

    public static final class a extends kotlin.jvm.internal.m implements p9.l<ux1, List<? extends kd1>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f30585b = new a();

        public a() {
            super(1);
        }

        @Override // p9.l
        public final List<? extends kd1> invoke(ux1 ux1Var) {
            ux1 it = ux1Var;
            kotlin.jvm.internal.l.f(it, "it");
            return C2099t.f18581b;
        }
    }

    public my1(f62 innerAdNoticeReportController, f62 blockNoticeReportController) {
        kotlin.jvm.internal.l.f(innerAdNoticeReportController, "innerAdNoticeReportController");
        kotlin.jvm.internal.l.f(blockNoticeReportController, "blockNoticeReportController");
        this.f30583a = C2078B.o(new b9.l(ux1.f34241b, innerAdNoticeReportController), new b9.l(ux1.f34242c, blockNoticeReportController));
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    public final void a(ux1 showNoticeType, a92 validationResult) {
        kotlin.jvm.internal.l.f(showNoticeType, "showNoticeType");
        kotlin.jvm.internal.l.f(validationResult, "validationResult");
        ed1 ed1Var = this.f30583a.get(showNoticeType);
        if (ed1Var != null) {
            ed1Var.a(showNoticeType, validationResult);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    public final void invalidate() {
        Iterator<T> it = this.f30583a.values().iterator();
        while (it.hasNext()) {
            ((ed1) it.next()).invalidate();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    public final void a(List<kd1> forcedFailures) {
        kotlin.jvm.internal.l.f(forcedFailures, "forcedFailures");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : forcedFailures) {
            ux1 ux1VarC = ((kd1) obj).a().c();
            Object arrayList = linkedHashMap.get(ux1VarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(ux1VarC, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : C2088i.k(linkedHashMap, a.f30585b).entrySet()) {
            ux1 ux1Var = (ux1) entry.getKey();
            List<kd1> list = (List) entry.getValue();
            ed1 ed1Var = this.f30583a.get(ux1Var);
            if (ed1Var != null) {
                ed1Var.a(list);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    public final void a(ux1 showNoticeType, List<? extends ux1> notTrackedShowNoticeTypes) {
        List<ux1> listG0;
        kotlin.jvm.internal.l.f(showNoticeType, "showNoticeType");
        kotlin.jvm.internal.l.f(notTrackedShowNoticeTypes, "notTrackedShowNoticeTypes");
        if (!this.f30584b) {
            this.f30584b = true;
            ArrayList arrayListZ0 = C2097r.z0(notTrackedShowNoticeTypes, showNoticeType);
            Set setL0 = C2097r.L0(arrayListZ0);
            List<ux1> list = f30582c;
            kotlin.jvm.internal.l.f(list, "<this>");
            Collection collectionD0 = C2095p.d0(setL0);
            if (collectionD0.isEmpty()) {
                listG0 = C2097r.G0(list);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!collectionD0.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
                listG0 = arrayList;
            }
            for (ux1 ux1Var : listG0) {
                a(ux1Var);
                a(ux1Var, arrayListZ0);
            }
        }
        if (!(notTrackedShowNoticeTypes instanceof Collection) || !notTrackedShowNoticeTypes.isEmpty()) {
            Iterator<T> it = notTrackedShowNoticeTypes.iterator();
            while (it.hasNext()) {
                if (((ux1) it.next()) == showNoticeType) {
                    return;
                }
            }
        }
        ed1 ed1Var = this.f30583a.get(showNoticeType);
        if (ed1Var != null) {
            ed1Var.a(showNoticeType, notTrackedShowNoticeTypes);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    public final void a(ux1 showNoticeType) {
        kotlin.jvm.internal.l.f(showNoticeType, "showNoticeType");
        ed1 ed1Var = this.f30583a.get(showNoticeType);
        if (ed1Var != null) {
            ed1Var.a(showNoticeType);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    public final void a(a8<?> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        Iterator<T> it = this.f30583a.values().iterator();
        while (it.hasNext()) {
            ((ed1) it.next()).a(adResponse);
        }
    }
}
