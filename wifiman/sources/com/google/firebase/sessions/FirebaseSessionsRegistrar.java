package com.google.firebase.sessions;

import F4.A;
import F4.c;
import F4.d;
import F4.g;
import F4.q;
import Ii.J;
import Zg.AbstractC3689v;
import a3.i;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import dh.InterfaceC5384i;
import f5.InterfaceC5536b;
import g5.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.h;
import o5.C7077B;
import o5.C7086g;
import o5.F;
import o5.G;
import o5.k;
import o5.x;
import org.snmp4j.util.SnmpConfigurator;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LF4/c;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final A backgroundDispatcher;
    private static final A blockingDispatcher;
    private static final A firebaseApp;
    private static final A firebaseInstallationsApi;
    private static final A sessionLifecycleServiceBinder;
    private static final A sessionsSettings;
    private static final A transportFactory;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        A aB = A.b(f.class);
        AbstractC6492s.h(aB, "unqualified(FirebaseApp::class.java)");
        firebaseApp = aB;
        A aB2 = A.b(e.class);
        AbstractC6492s.h(aB2, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = aB2;
        A a10 = A.a(E4.a.class, J.class);
        AbstractC6492s.h(a10, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = a10;
        A a11 = A.a(E4.b.class, J.class);
        AbstractC6492s.h(a11, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = a11;
        A aB3 = A.b(i.class);
        AbstractC6492s.h(aB3, "unqualified(TransportFactory::class.java)");
        transportFactory = aB3;
        A aB4 = A.b(q5.f.class);
        AbstractC6492s.h(aB4, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = aB4;
        A aB5 = A.b(F.class);
        AbstractC6492s.h(aB5, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = aB5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k getComponents$lambda$0(d dVar) {
        Object objF = dVar.f(firebaseApp);
        AbstractC6492s.h(objF, "container[firebaseApp]");
        Object objF2 = dVar.f(sessionsSettings);
        AbstractC6492s.h(objF2, "container[sessionsSettings]");
        Object objF3 = dVar.f(backgroundDispatcher);
        AbstractC6492s.h(objF3, "container[backgroundDispatcher]");
        Object objF4 = dVar.f(sessionLifecycleServiceBinder);
        AbstractC6492s.h(objF4, "container[sessionLifecycleServiceBinder]");
        return new k((f) objF, (q5.f) objF2, (InterfaceC5384i) objF3, (F) objF4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c getComponents$lambda$1(d dVar) {
        return new c(o5.J.f55367a, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getComponents$lambda$2(d dVar) {
        Object objF = dVar.f(firebaseApp);
        AbstractC6492s.h(objF, "container[firebaseApp]");
        f fVar = (f) objF;
        Object objF2 = dVar.f(firebaseInstallationsApi);
        AbstractC6492s.h(objF2, "container[firebaseInstallationsApi]");
        e eVar = (e) objF2;
        Object objF3 = dVar.f(sessionsSettings);
        AbstractC6492s.h(objF3, "container[sessionsSettings]");
        q5.f fVar2 = (q5.f) objF3;
        InterfaceC5536b interfaceC5536bD = dVar.d(transportFactory);
        AbstractC6492s.h(interfaceC5536bD, "container.getProvider(transportFactory)");
        C7086g c7086g = new C7086g(interfaceC5536bD);
        Object objF4 = dVar.f(backgroundDispatcher);
        AbstractC6492s.h(objF4, "container[backgroundDispatcher]");
        return new C7077B(fVar, eVar, fVar2, c7086g, (InterfaceC5384i) objF4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q5.f getComponents$lambda$3(d dVar) {
        Object objF = dVar.f(firebaseApp);
        AbstractC6492s.h(objF, "container[firebaseApp]");
        Object objF2 = dVar.f(blockingDispatcher);
        AbstractC6492s.h(objF2, "container[blockingDispatcher]");
        Object objF3 = dVar.f(backgroundDispatcher);
        AbstractC6492s.h(objF3, "container[backgroundDispatcher]");
        Object objF4 = dVar.f(firebaseInstallationsApi);
        AbstractC6492s.h(objF4, "container[firebaseInstallationsApi]");
        return new q5.f((f) objF, (InterfaceC5384i) objF2, (InterfaceC5384i) objF3, (e) objF4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.a getComponents$lambda$4(d dVar) {
        Context contextK = ((f) dVar.f(firebaseApp)).k();
        AbstractC6492s.h(contextK, "container[firebaseApp].applicationContext");
        Object objF = dVar.f(backgroundDispatcher);
        AbstractC6492s.h(objF, "container[backgroundDispatcher]");
        return new x(contextK, (InterfaceC5384i) objF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F getComponents$lambda$5(d dVar) {
        Object objF = dVar.f(firebaseApp);
        AbstractC6492s.h(objF, "container[firebaseApp]");
        return new G((f) objF);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<F4.c> getComponents() {
        c.b bVarG = F4.c.e(k.class).g(LIBRARY_NAME);
        A a10 = firebaseApp;
        c.b bVarB = bVarG.b(q.i(a10));
        A a11 = sessionsSettings;
        c.b bVarB2 = bVarB.b(q.i(a11));
        A a12 = backgroundDispatcher;
        F4.c cVarC = bVarB2.b(q.i(a12)).b(q.i(sessionLifecycleServiceBinder)).e(new g() { // from class: o5.m
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(dVar);
            }
        }).d().c();
        F4.c cVarC2 = F4.c.e(c.class).g("session-generator").e(new g() { // from class: o5.n
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(dVar);
            }
        }).c();
        c.b bVarB3 = F4.c.e(b.class).g("session-publisher").b(q.i(a10));
        A a13 = firebaseInstallationsApi;
        return AbstractC3689v.o(cVarC, cVarC2, bVarB3.b(q.i(a13)).b(q.i(a11)).b(q.k(transportFactory)).b(q.i(a12)).e(new g() { // from class: o5.o
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$2(dVar);
            }
        }).c(), F4.c.e(q5.f.class).g("sessions-settings").b(q.i(a10)).b(q.i(blockingDispatcher)).b(q.i(a12)).b(q.i(a13)).e(new g() { // from class: o5.p
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$3(dVar);
            }
        }).c(), F4.c.e(com.google.firebase.sessions.a.class).g("sessions-datastore").b(q.i(a10)).b(q.i(a12)).e(new g() { // from class: o5.q
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$4(dVar);
            }
        }).c(), F4.c.e(F.class).g("sessions-service-binder").b(q.i(a10)).e(new g() { // from class: o5.r
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$5(dVar);
            }
        }).c(), h.b(LIBRARY_NAME, "2.0.9"));
    }
}
