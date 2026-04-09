package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: classes.dex */
class d6 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final f7 f19226g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f19227h;

    public d6(f7 f7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.f19227h = appLovinAdLoadListener;
        this.f19226g = f7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = n7.a(this.f19226g);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Resolving VAST ad with depth " + this.f19226g.d() + " at " + strA);
        }
        try {
            this.f21692a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.f21692a).b(strA).c("GET").a(c8.f19177f).a(((Integer) this.f21692a.a(l4.f20047v4)).intValue()).c(((Integer) this.f21692a.a(l4.f20055w4)).intValue()).a(false).a(), this.f21692a));
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Unable to resolve VAST wrapper", th);
            }
            a(-1);
        }
    }

    public class a extends z5 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, c8 c8Var, int i) {
            this.f21692a.q0().a(v5.a(c8Var, d6.this.f19226g, d6.this.f19227h, d6.this.f21692a));
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, c8 c8Var) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Unable to resolve VAST wrapper. Server returned " + i);
            }
            d6.this.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.b(this.f21693b, "Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f19227h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        n7.a(this.f19226g, this.f19227h, i == -1001 ? g7.TIMED_OUT : g7.GENERAL_WRAPPER_ERROR, i, this.f21692a);
    }
}
