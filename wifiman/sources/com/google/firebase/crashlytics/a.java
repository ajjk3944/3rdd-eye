package com.google.firebase.crashlytics;

import I4.d;
import I4.g;
import I4.l;
import P4.b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.crashlytics.internal.common.A;
import com.google.firebase.crashlytics.internal.common.AbstractC5107i;
import com.google.firebase.crashlytics.internal.common.C5099a;
import com.google.firebase.crashlytics.internal.common.C5104f;
import com.google.firebase.crashlytics.internal.common.C5111m;
import com.google.firebase.crashlytics.internal.common.G;
import com.google.firebase.crashlytics.internal.common.L;
import com.google.firebase.f;
import f5.InterfaceC5535a;
import g5.e;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p5.C7229a;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final A f38686a;

    private a(A a10) {
        this.f38686a = a10;
    }

    public static a b() {
        a aVar = (a) f.l().j(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static a c(f fVar, e eVar, InterfaceC5535a interfaceC5535a, InterfaceC5535a interfaceC5535a2, InterfaceC5535a interfaceC5535a3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) throws Resources.NotFoundException {
        Context contextK = fVar.k();
        String packageName = contextK.getPackageName();
        g.f().g("Initializing Firebase Crashlytics " + A.n() + " for " + packageName);
        L4.f fVar2 = new L4.f(executorService, executorService2);
        Q4.g gVar = new Q4.g(contextK);
        G g10 = new G(fVar);
        L l10 = new L(contextK, packageName, eVar, g10);
        d dVar = new d(interfaceC5535a);
        H4.d dVar2 = new H4.d(interfaceC5535a2);
        C5111m c5111m = new C5111m(g10, gVar);
        C7229a.e(c5111m);
        A a10 = new A(fVar, l10, dVar, g10, dVar2.e(), dVar2.d(), gVar, c5111m, new l(interfaceC5535a3), fVar2);
        String strC = fVar.n().c();
        String strM = AbstractC5107i.m(contextK);
        List<C5104f> listJ = AbstractC5107i.j(contextK);
        g.f().b("Mapping file ID is: " + strM);
        for (C5104f c5104f : listJ) {
            g.f().b(String.format("Build id for %s on %s: %s", c5104f.c(), c5104f.a(), c5104f.b()));
        }
        try {
            C5099a c5099aA = C5099a.a(contextK, l10, strC, strM, listJ, new I4.f(contextK));
            g.f().i("Installer package name is: " + c5099aA.f38755d);
            S4.g gVarL = S4.g.l(contextK, strC, l10, new b(), c5099aA.f38757f, c5099aA.f38758g, gVar, g10);
            gVarL.o(fVar2).addOnFailureListener(executorService3, new OnFailureListener() { // from class: H4.g
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    com.google.firebase.crashlytics.a.d(exc);
                }
            });
            if (a10.B(c5099aA, gVarL)) {
                a10.l(gVarL);
            }
            return new a(a10);
        } catch (PackageManager.NameNotFoundException e10) {
            g.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Exception exc) {
        g.f().e("Error fetching settings.", exc);
    }

    public void e(String str) {
        this.f38686a.x(str);
    }

    public void f(Throwable th2) {
        if (th2 == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f38686a.y(th2, Collections.emptyMap());
        }
    }

    public void g(boolean z10) {
        this.f38686a.C(Boolean.valueOf(z10));
    }

    public void h(String str, String str2) {
        this.f38686a.D(str, str2);
    }

    public void i(String str) {
        this.f38686a.E(str);
    }
}
