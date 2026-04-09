package com.applovin.impl.mediation;

import com.applovin.impl.C2112c0;
import com.applovin.impl.t2;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20318a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f20319b;

    /* renamed from: c, reason: collision with root package name */
    private final a f20320c;

    /* renamed from: d, reason: collision with root package name */
    private C2112c0 f20321d;

    public interface a {
        void b(t2 t2Var);
    }

    public c(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f20318a = kVar;
        this.f20319b = kVar.O();
        this.f20320c = aVar;
    }

    public void a(t2 t2Var, long j4) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20319b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j4 + "ms...");
        }
        this.f20321d = C2112c0.a(j4, this.f20318a, new t(3, this, t2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(t2 t2Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20319b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f20320c.b(t2Var);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20319b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        C2112c0 c2112c0 = this.f20321d;
        if (c2112c0 != null) {
            c2112c0.a();
            this.f20321d = null;
        }
    }
}
