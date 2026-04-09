package com.applovin.impl.mediation;

import com.applovin.impl.c3;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6704a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f6705b;

    /* renamed from: c, reason: collision with root package name */
    private final a f6706c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.g0 f6707d;

    public interface a {
        void a(c3 c3Var);
    }

    public c(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f6704a = kVar;
        this.f6705b = kVar.O();
        this.f6706c = aVar;
    }

    public void a(final c3 c3Var, long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6705b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j10 + "ms...");
        }
        this.f6707d = com.applovin.impl.g0.a(j10, this.f6704a, new Runnable() { // from class: com.applovin.impl.mediation.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f6948a.a(c3Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6705b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f6706c.a(c3Var);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6705b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        com.applovin.impl.g0 g0Var = this.f6707d;
        if (g0Var != null) {
            g0Var.a();
            this.f6707d = null;
        }
    }
}
