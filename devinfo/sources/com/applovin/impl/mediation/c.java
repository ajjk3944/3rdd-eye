package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.g0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4656a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f4657b;

    /* renamed from: c, reason: collision with root package name */
    private final a f4658c;

    /* renamed from: d, reason: collision with root package name */
    private g0 f4659d;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        void a(c3 c3Var);
    }

    public c(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f4656a = kVar;
        this.f4657b = kVar.O();
        this.f4658c = aVar;
    }

    public void a(c3 c3Var, long j) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4657b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.f4659d = g0.a(j, this.f4656a, new r(3, this, c3Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4657b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f4658c.a(c3Var);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4657b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        g0 g0Var = this.f4659d;
        if (g0Var != null) {
            g0Var.a();
            this.f4659d = null;
        }
    }
}
