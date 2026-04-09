package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final c f19469a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f19470b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f19471c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f19472d = new AtomicReference();

    public q(c cVar, Executor executor) {
        this.f19469a = cVar;
        this.f19470b = executor;
    }

    public final void a(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener, boolean z3) {
        j0.a();
        r rVar = (r) this.f19471c.get();
        if (rVar == null) {
            onConsentFormLoadFailureListener.onConsentFormLoadFailure(new r1(3, "No available form can be built.").a());
            return;
        }
        c cVar = (c) this.f19469a.a();
        cVar.getClass();
        d dVar = cVar.f19284a;
        h7 h7VarB = h7.b(new e6(4, (e6) dVar.f19296b));
        e6 e6Var = new e6(8, rVar);
        e6 e6Var2 = new e6(7);
        e6 e6Var3 = (e6) dVar.f19296b;
        h7 h7Var = (h7) dVar.f19300f;
        g gVar = (g) dVar.f19302i;
        h7 h7Var2 = (h7) dVar.f19297c;
        h7 h7VarB2 = h7.b(new p.r3(e6Var3, (h7) dVar.f19298d, h7VarB, h7Var2, e6Var, new p(h7VarB, new va.o(e6Var3, h7VarB, h7Var, gVar, e6Var2, h7Var2, 2)), (h7) dVar.g));
        if (((h7) e6Var2.f19335b) != null) {
            throw new IllegalStateException();
        }
        e6Var2.f19335b = h7VarB2;
        m mVar = (m) e6Var2.a();
        mVar.f19432n = z3;
        mVar.a(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    public final void b() {
        r rVar = (r) this.f19471c.get();
        if (rVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        c cVar = (c) this.f19469a.a();
        cVar.getClass();
        d dVar = cVar.f19284a;
        h7 h7VarB = h7.b(new e6(4, (e6) dVar.f19296b));
        e6 e6Var = new e6(8, rVar);
        e6 e6Var2 = new e6(7);
        e6 e6Var3 = (e6) dVar.f19296b;
        h7 h7Var = (h7) dVar.f19300f;
        g gVar = (g) dVar.f19302i;
        h7 h7Var2 = (h7) dVar.f19297c;
        h7 h7VarB2 = h7.b(new p.r3(e6Var3, (h7) dVar.f19298d, h7VarB, h7Var2, e6Var, new p(h7VarB, new va.o(e6Var3, h7VarB, h7Var, gVar, e6Var2, h7Var2, 2)), (h7) dVar.g));
        if (((h7) e6Var2.f19335b) != null) {
            throw new IllegalStateException();
        }
        e6Var2.f19335b = h7VarB2;
        m mVar = (m) e6Var2.a();
        mVar.f19431m = true;
        j0.f19383a.post(new n(0, this, mVar));
    }
}
