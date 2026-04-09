package com.google.firebase.sessions;

import a0.x0;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.f1;
import ba.e;
import ce.a;
import ce.b;
import ck.h;
import cm.g;
import com.google.android.gms.internal.ads.sh0;
import com.google.firebase.components.ComponentRegistrar;
import de.q;
import df.d;
import java.util.List;
import km.n;
import km.y;
import nk.k;
import nm.d0;
import pf.e0;
import pf.i;
import pf.o;
import pf.s;
import pf.u;
import pf.v;
import pf.v0;
import rf.c;
import wd.f;
import xk.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final v Companion = new v();
    private static final q appContext = q.a(Context.class);
    private static final q firebaseApp = q.a(f.class);
    private static final q firebaseInstallationsApi = q.a(d.class);
    private static final q backgroundDispatcher = new q(a.class, r.class);
    private static final q blockingDispatcher = new q(b.class, r.class);
    private static final q transportFactory = q.a(e.class);
    private static final q firebaseSessionsComponent = q.a(pf.r.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final o getComponents$lambda$0(de.b bVar) {
        return (o) ((i) ((pf.r) bVar.l(firebaseSessionsComponent))).f31848p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pf.r getComponents$lambda$1(de.b bVar) {
        Object objL = bVar.l(appContext);
        k.d(objL, "get(...)");
        Object objL2 = bVar.l(backgroundDispatcher);
        k.d(objL2, "get(...)");
        Object objL3 = bVar.l(blockingDispatcher);
        k.d(objL3, "get(...)");
        Object objL4 = bVar.l(firebaseApp);
        k.d(objL4, "get(...)");
        Object objL5 = bVar.l(firebaseInstallationsApi);
        k.d(objL5, "get(...)");
        cf.b bVarI = bVar.i(transportFactory);
        k.d(bVarI, "getProvider(...)");
        i iVar = new i();
        iVar.f31835a = c.a((f) objL4);
        c cVarA = c.a((Context) objL);
        iVar.f31836b = cVarA;
        iVar.f31837c = rf.a.a(new o.e(14, cVarA));
        iVar.f31838d = rf.a.a(s.f31890a);
        iVar.f31839e = c.a((d) objL5);
        iVar.f31840f = rf.a.a(new km.i(10, iVar.f31835a));
        c cVarA2 = c.a((h) objL3);
        iVar.g = cVarA2;
        iVar.f31841h = rf.a.a(new e0(iVar.f31840f, cVarA2));
        iVar.f31842i = c.a((h) objL2);
        iVar.j = rf.a.a(new v0(iVar.f31837c, rf.a.a(new f1(iVar.f31838d, iVar.f31839e, iVar.f31840f, iVar.f31841h, rf.a.a(new i0.f(iVar.f31842i, iVar.f31838d, rf.a.a(new n(9, iVar.f31836b, iVar.g)), 21)), 26)), 1));
        rf.d dVarA = rf.a.a(s.f31891b);
        iVar.f31843k = dVarA;
        iVar.f31844l = rf.a.a(new v0(iVar.f31838d, dVarA, 0));
        iVar.f31845m = rf.a.a(new f1(iVar.f31835a, iVar.f31839e, iVar.j, rf.a.a(new y(11, c.a(bVarI))), iVar.f31842i, 18));
        iVar.f31846n = rf.a.a(new i0.f(iVar.f31836b, iVar.g, rf.a.a(new d0(5, iVar.f31844l)), 15));
        rf.d dVarA2 = rf.a.a(new pe.c(iVar.j, iVar.f31844l, iVar.f31845m, iVar.f31838d, iVar.f31846n, rf.a.a(new e0(iVar.f31836b, iVar.f31843k)), iVar.f31842i, 3));
        iVar.f31847o = dVarA2;
        iVar.f31848p = rf.a.a(new x0(iVar.f31835a, iVar.j, iVar.f31842i, rf.a.a(new o.e(6, dVarA2)), 27));
        return iVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<de.a> getComponents() {
        sh0 sh0VarB = de.a.b(o.class);
        sh0VarB.f16012a = LIBRARY_NAME;
        sh0VarB.a(de.i.a(firebaseSessionsComponent));
        sh0VarB.f16017f = new p1.a();
        sh0VarB.d();
        de.a aVarC = sh0VarB.c();
        sh0 sh0VarB2 = de.a.b(pf.r.class);
        sh0VarB2.f16012a = "fire-sessions-component";
        sh0VarB2.a(de.i.a(appContext));
        sh0VarB2.a(de.i.a(backgroundDispatcher));
        sh0VarB2.a(de.i.a(blockingDispatcher));
        sh0VarB2.a(de.i.a(firebaseApp));
        sh0VarB2.a(de.i.a(firebaseInstallationsApi));
        sh0VarB2.a(new de.i(transportFactory, 1, 1));
        sh0VarB2.f16017f = new u(0);
        return g.t(aVarC, sh0VarB2.c(), a.a.f(LIBRARY_NAME, "3.0.3"));
    }
}
