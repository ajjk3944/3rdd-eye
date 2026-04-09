package com.applovin.impl;

import com.applovin.impl.b7;
import com.applovin.impl.r5;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;

/* loaded from: classes.dex */
class y5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final f7 f21851g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f21852h;

    public y5(f7 f7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderVastAd", kVar);
        this.f21852h = appLovinAdLoadListener;
        this.f21851g = f7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Rendering VAST ad...");
        }
        int size = this.f21851g.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String strA = "";
        k7 k7VarA = null;
        o7 o7VarA = null;
        e7 e7VarA = null;
        d7 d7VarA = null;
        String strA2 = "";
        for (c8 c8Var : this.f21851g.a()) {
            c8 c8VarB = c8Var.b(n7.b(c8Var) ? "Wrapper" : "InLine");
            if (c8VarB != null) {
                c8 c8VarB2 = c8VarB.b("AdSystem");
                if (c8VarB2 != null) {
                    k7VarA = k7.a(c8VarB2, k7VarA, this.f21692a);
                }
                strA = n7.a(c8VarB, "AdTitle", strA);
                strA2 = n7.a(c8VarB, "Description", strA2);
                n7.a(c8VarB.a("Impression"), hashSet, this.f21851g, this.f21692a);
                c8 c8VarC = c8VarB.c("ViewableImpression");
                if (c8VarC != null) {
                    n7.a(c8VarC.a("Viewable"), hashSet, this.f21851g, this.f21692a);
                }
                c8 c8VarB3 = c8VarB.b("AdVerifications");
                if (c8VarB3 != null) {
                    d7VarA = d7.a(c8VarB3, d7VarA, this.f21851g, this.f21692a);
                }
                n7.a(c8VarB.a("Error"), hashSet2, this.f21851g, this.f21692a);
                c8 c8VarC2 = c8VarB.c("Creatives");
                if (c8VarC2 != null) {
                    for (c8 c8Var2 : c8VarC2.b()) {
                        c8 c8VarC3 = c8Var2.c("Linear");
                        if (c8VarC3 != null) {
                            o7VarA = o7.a(c8VarC3, o7VarA, this.f21851g, this.f21692a);
                        } else {
                            c8 c8VarB4 = c8Var2.b("CompanionAds");
                            if (c8VarB4 != null) {
                                c8 c8VarB5 = c8VarB4.b("Companion");
                                if (c8VarB5 != null) {
                                    e7VarA = e7.a(c8VarB5, e7VarA, this.f21851g, this.f21692a);
                                }
                            } else if (com.applovin.impl.sdk.o.a()) {
                                this.f21694c.b(this.f21693b, "Received and will skip rendering for an unidentified creative: " + c8Var2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Did not find wrapper or inline response for node: " + c8Var);
            }
        }
        b7 b7VarA = new b7.b().a(this.f21692a).a(this.f21851g.b()).b(this.f21851g.e()).a(this.f21851g.c()).b(strA).a(strA2).a(k7VarA).a(o7VarA).a(e7VarA).a(d7VarA).b(hashSet).a(d7VarA).a(hashSet2).a();
        g7 g7VarC = n7.c(b7VarA);
        if (g7VarC != null) {
            n7.a(this.f21851g, this.f21852h, g7VarC, -6, this.f21692a);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Finished rendering VAST ad: " + b7VarA);
        }
        b7VarA.getAdEventTracker().e();
        this.f21692a.q0().a((w4) new b5(b7VarA, this.f21692a, this.f21852h), r5.b.CACHING);
    }
}
