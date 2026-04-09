package io.appmetrica.analytics.impl;

import android.content.Context;
import c9.C2078B;
import c9.C2092m;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final Ub f39072a = new Ub(C5065x4.l().d());

    /* renamed from: b, reason: collision with root package name */
    public final Vb f39073b = new Vb();

    /* renamed from: c, reason: collision with root package name */
    public final Xb f39074c = new Xb();

    public final void a(String str, String str2, String str3) {
        Ub ub = this.f39072a;
        if (ub.f40234c.a((Void) null).f41158a && ub.f40235d.a(str).f41158a && ub.f40236e.a(str2).f41158a && ub.f40237f.a(str3).f41158a) {
            this.f39073b.getClass();
            IHandlerExecutor iHandlerExecutorA = C5065x4.l().f42014c.a();
            ((S9) iHandlerExecutorA).f40100b.post(new N.i(this, str, str2, str3, 5));
            return;
        }
        StringBuilder sbD = j6.l.d("Failed report event from sender: ", str, " with name = ", str2, " and payload = ");
        sbD.append(str3);
        PublicLogger.Companion.getAnonymousInstance().warning(androidx.work.s.d("[AppMetricaLibraryAdapterProxy]", sbD.toString()), new Object[0]);
    }

    public static final void a(A0 a02, String str, String str2, String str3) {
        List list;
        Context contextA;
        Xb xb = a02.f39074c;
        xb.getClass();
        if (str == null) {
            str = "null";
        }
        b9.l lVar = new b9.l("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        b9.l lVar2 = new b9.l("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        LinkedHashMap linkedHashMapP = C2078B.p(lVar, lVar2, new b9.l("payload", str3));
        ModuleEvent.Builder builderWithName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (xb) {
            try {
                if (xb.f40381a == null && (contextA = C5065x4.l().f42018g.a()) != null) {
                    xb.f40381a = C2092m.W(new C4536ce(), new C4519bn(contextA), new Co());
                }
                list = xb.f40381a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC4934s) it.next()).a(linkedHashMapP);
            }
        }
        ModulesFacade.reportEvent(builderWithName.withAttributes(linkedHashMapP).build());
    }
}
