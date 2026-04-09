package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import bf.d;
import bf.u;
import br.l;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import com.google.firebase.components.ComponentRegistrar;
import fg.e;
import i5.c;
import java.util.List;
import kotlin.Metadata;
import p.l2;
import p.v2;
import pq.h;
import se.f;
import tg.b0;
import tg.i;
import tg.n;
import tg.p;
import tg.r;
import tg.r0;
import tg.s;
import wt.q;
import ye.a;
import ye.b;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lbf/c;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "tg/s", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final s Companion = new s();
    private static final u appContext = u.a(Context.class);
    private static final u firebaseApp = u.a(f.class);
    private static final u firebaseInstallationsApi = u.a(e.class);
    private static final u backgroundDispatcher = new u(a.class, q.class);
    private static final u blockingDispatcher = new u(b.class, q.class);
    private static final u transportFactory = u.a(j9.f.class);
    private static final u firebaseSessionsComponent = u.a(p.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final n getComponents$lambda$0(d dVar) {
        return (n) ((i) ((p) dVar.i(firebaseSessionsComponent))).f22805p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p getComponents$lambda$1(d dVar) {
        Object objI = dVar.i(appContext);
        l.d(objI, "get(...)");
        Object objI2 = dVar.i(backgroundDispatcher);
        l.d(objI2, "get(...)");
        Object objI3 = dVar.i(blockingDispatcher);
        l.d(objI3, "get(...)");
        Object objI4 = dVar.i(firebaseApp);
        l.d(objI4, "get(...)");
        Object objI5 = dVar.i(firebaseInstallationsApi);
        l.d(objI5, "get(...)");
        eg.b bVarK = dVar.k(transportFactory);
        l.d(bVarK, "getProvider(...)");
        i iVar = new i();
        iVar.f22792a = c.a((f) objI4);
        c cVarA = c.a((Context) objI);
        iVar.f22793b = cVarA;
        iVar.f22794c = vg.a.a(new tg.q(cVarA, 1));
        iVar.f22795d = vg.a.a(r.f22838a);
        iVar.f22796e = c.a((e) objI5);
        iVar.f22797f = vg.a.a(new tg.q(iVar.f22792a, 0));
        c cVarA2 = c.a((h) objI3);
        iVar.f22798g = cVarA2;
        iVar.f22799h = vg.a.a(new b0(iVar.f22797f, cVarA2));
        iVar.f22800i = c.a((h) objI2);
        iVar.j = vg.a.a(new r0(iVar.f22794c, vg.a.a(new tv.b(iVar.f22795d, iVar.f22796e, iVar.f22797f, iVar.f22799h, vg.a.a(new qm.c(iVar.f22800i, iVar.f22795d, vg.a.a(new q3.a(iVar.f22793b, 8, iVar.f22798g)), 13)))), 1));
        vg.c cVarA3 = vg.a.a(r.f22839b);
        iVar.k = cVarA3;
        iVar.f22801l = vg.a.a(new r0(iVar.f22795d, cVarA3, 0));
        iVar.f22802m = vg.a.a(new cj.a(iVar.f22792a, iVar.f22796e, iVar.j, vg.a.a(new l2(14, c.a(bVarK))), iVar.f22800i, 29));
        iVar.f22803n = vg.a.a(new qm.c(iVar.f22793b, iVar.f22798g, vg.a.a(new t9.e(iVar.f22801l, 1)), 5));
        vg.c cVarA4 = vg.a.a(new v2(iVar.j, iVar.f22801l, iVar.f22802m, iVar.f22795d, iVar.f22803n, vg.a.a(new b0(iVar.f22793b, iVar.k)), iVar.f22800i));
        iVar.f22804o = cVarA4;
        iVar.f22805p = vg.a.a(new js.e(iVar.f22792a, iVar.j, iVar.f22800i, vg.a.a(new l2(15, cVarA4)), 16));
        return iVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bf.c> getComponents() {
        bf.b bVarB = bf.c.b(n.class);
        bVarB.f2696a = LIBRARY_NAME;
        bVarB.a(bf.l.a(firebaseSessionsComponent));
        bVarB.f2701f = new p5.b(16);
        bVarB.c(2);
        bf.c cVarB = bVarB.b();
        bf.b bVarB2 = bf.c.b(p.class);
        bVarB2.f2696a = "fire-sessions-component";
        bVarB2.a(bf.l.a(appContext));
        bVarB2.a(bf.l.a(backgroundDispatcher));
        bVarB2.a(bf.l.a(blockingDispatcher));
        bVarB2.a(bf.l.a(firebaseApp));
        bVarB2.a(bf.l.a(firebaseInstallationsApi));
        bVarB2.a(new bf.l(transportFactory, 1, 1));
        bVarB2.f2701f = new p5.b(17);
        return e5.I(cVarB, bVarB2.b(), b4.q(LIBRARY_NAME, "3.0.3"));
    }
}
