package com.google.firebase.sessions;

import A9.A;
import B4.e;
import H4.b;
import I4.a;
import I4.s;
import android.content.Context;
import androidx.annotation.Keep;
import c9.C2092m;
import com.google.firebase.components.ComponentRegistrar;
import f9.InterfaceC4350h;
import g0.C4356c;
import g5.InterfaceC4392b;
import h5.c;
import io.appmetrica.analytics.impl.Oo;
import java.util.List;
import v3.i;
import w5.C5723C;
import w5.H;
import w5.I;
import w5.l;
import w5.t;
import w5.u;
import w5.y;
import w5.z;
import y5.C5810e;

/* compiled from: FirebaseSessionsRegistrar.kt */
@Keep
/* loaded from: classes2.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final a Companion = new a();
    private static final s<e> firebaseApp = s.a(e.class);
    private static final s<c> firebaseInstallationsApi = s.a(c.class);
    private static final s<A> backgroundDispatcher = new s<>(H4.a.class, A.class);
    private static final s<A> blockingDispatcher = new s<>(b.class, A.class);
    private static final s<i> transportFactory = s.a(i.class);
    private static final s<C5810e> sessionsSettings = s.a(C5810e.class);
    private static final s<H> sessionLifecycleServiceBinder = s.a(H.class);

    /* compiled from: FirebaseSessionsRegistrar.kt */
    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l getComponents$lambda$0(I4.b bVar) {
        Object objB = bVar.b(firebaseApp);
        kotlin.jvm.internal.l.e(objB, "container[firebaseApp]");
        Object objB2 = bVar.b(sessionsSettings);
        kotlin.jvm.internal.l.e(objB2, "container[sessionsSettings]");
        Object objB3 = bVar.b(backgroundDispatcher);
        kotlin.jvm.internal.l.e(objB3, "container[backgroundDispatcher]");
        Object objB4 = bVar.b(sessionLifecycleServiceBinder);
        kotlin.jvm.internal.l.e(objB4, "container[sessionLifecycleServiceBinder]");
        return new l((e) objB, (C5810e) objB2, (InterfaceC4350h) objB3, (H) objB4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5723C getComponents$lambda$1(I4.b bVar) {
        return new C5723C(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y getComponents$lambda$2(I4.b bVar) {
        Object objB = bVar.b(firebaseApp);
        kotlin.jvm.internal.l.e(objB, "container[firebaseApp]");
        Object objB2 = bVar.b(firebaseInstallationsApi);
        kotlin.jvm.internal.l.e(objB2, "container[firebaseInstallationsApi]");
        Object objB3 = bVar.b(sessionsSettings);
        kotlin.jvm.internal.l.e(objB3, "container[sessionsSettings]");
        InterfaceC4392b interfaceC4392bE = bVar.e(transportFactory);
        kotlin.jvm.internal.l.e(interfaceC4392bE, "container.getProvider(transportFactory)");
        A3.c cVar = new A3.c(interfaceC4392bE, 9);
        Object objB4 = bVar.b(backgroundDispatcher);
        kotlin.jvm.internal.l.e(objB4, "container[backgroundDispatcher]");
        return new z((e) objB, (c) objB2, (C5810e) objB3, cVar, (InterfaceC4350h) objB4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5810e getComponents$lambda$3(I4.b bVar) {
        Object objB = bVar.b(firebaseApp);
        kotlin.jvm.internal.l.e(objB, "container[firebaseApp]");
        Object objB2 = bVar.b(blockingDispatcher);
        kotlin.jvm.internal.l.e(objB2, "container[blockingDispatcher]");
        Object objB3 = bVar.b(backgroundDispatcher);
        kotlin.jvm.internal.l.e(objB3, "container[backgroundDispatcher]");
        Object objB4 = bVar.b(firebaseInstallationsApi);
        kotlin.jvm.internal.l.e(objB4, "container[firebaseInstallationsApi]");
        return new C5810e((e) objB, (InterfaceC4350h) objB2, (InterfaceC4350h) objB3, (c) objB4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t getComponents$lambda$4(I4.b bVar) {
        e eVar = (e) bVar.b(firebaseApp);
        eVar.a();
        Context context = eVar.f487a;
        kotlin.jvm.internal.l.e(context, "container[firebaseApp].applicationContext");
        Object objB = bVar.b(backgroundDispatcher);
        kotlin.jvm.internal.l.e(objB, "container[backgroundDispatcher]");
        return new u(context, (InterfaceC4350h) objB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H getComponents$lambda$5(I4.b bVar) {
        Object objB = bVar.b(firebaseApp);
        kotlin.jvm.internal.l.e(objB, "container[firebaseApp]");
        return new I((e) objB);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<I4.a<? extends Object>> getComponents() {
        a.C0043a c0043aB = I4.a.b(l.class);
        c0043aB.f2440a = LIBRARY_NAME;
        s<e> sVar = firebaseApp;
        c0043aB.a(I4.i.a(sVar));
        s<C5810e> sVar2 = sessionsSettings;
        c0043aB.a(I4.i.a(sVar2));
        s<A> sVar3 = backgroundDispatcher;
        c0043aB.a(I4.i.a(sVar3));
        c0043aB.a(I4.i.a(sessionLifecycleServiceBinder));
        c0043aB.f2445f = new C4356c(14);
        c0043aB.c(2);
        I4.a aVarB = c0043aB.b();
        a.C0043a c0043aB2 = I4.a.b(C5723C.class);
        c0043aB2.f2440a = "session-generator";
        c0043aB2.f2445f = new Oo(12);
        I4.a aVarB2 = c0043aB2.b();
        a.C0043a c0043aB3 = I4.a.b(y.class);
        c0043aB3.f2440a = "session-publisher";
        c0043aB3.a(new I4.i(sVar, 1, 0));
        s<c> sVar4 = firebaseInstallationsApi;
        c0043aB3.a(I4.i.a(sVar4));
        c0043aB3.a(new I4.i(sVar2, 1, 0));
        c0043aB3.a(new I4.i(transportFactory, 1, 1));
        c0043aB3.a(new I4.i(sVar3, 1, 0));
        c0043aB3.f2445f = new j6.l();
        I4.a aVarB3 = c0043aB3.b();
        a.C0043a c0043aB4 = I4.a.b(C5810e.class);
        c0043aB4.f2440a = "sessions-settings";
        c0043aB4.a(new I4.i(sVar, 1, 0));
        c0043aB4.a(I4.i.a(blockingDispatcher));
        c0043aB4.a(new I4.i(sVar3, 1, 0));
        c0043aB4.a(new I4.i(sVar4, 1, 0));
        c0043aB4.f2445f = new com.google.android.gms.measurement.internal.a();
        I4.a aVarB4 = c0043aB4.b();
        a.C0043a c0043aB5 = I4.a.b(t.class);
        c0043aB5.f2440a = "sessions-datastore";
        c0043aB5.a(new I4.i(sVar, 1, 0));
        c0043aB5.a(new I4.i(sVar3, 1, 0));
        c0043aB5.f2445f = new androidx.work.s();
        I4.a aVarB5 = c0043aB5.b();
        a.C0043a c0043aB6 = I4.a.b(H.class);
        c0043aB6.f2440a = "sessions-service-binder";
        c0043aB6.a(new I4.i(sVar, 1, 0));
        c0043aB6.f2445f = new C4356c(15);
        return C2092m.W(aVarB, aVarB2, aVarB3, aVarB4, aVarB5, c0043aB6.b(), q5.e.a(LIBRARY_NAME, "2.0.3"));
    }
}
