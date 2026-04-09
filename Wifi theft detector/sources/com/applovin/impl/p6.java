package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: classes.dex */
class p6 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final s7 f7257g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f7258h;

    public p6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.f7258h = appLovinAdLoadListener;
        this.f7257g = s7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = a8.a(this.f7257g);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Resolving VAST ad with depth " + this.f7257g.d() + " at " + strA);
        }
        try {
            this.f6218a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.f6218a).b(strA).c("GET").a(p8.f7264f).a(((Integer) this.f6218a.a(x4.U4)).intValue()).c(((Integer) this.f6218a.a(x4.V4)).intValue()).a(false).a(), this.f6218a));
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Unable to resolve VAST wrapper", th);
            }
            a(-1);
        }
    }

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, p8 p8Var, int i10) {
            this.f6218a.q0().a(h6.a(p8Var, p6.this.f7257g, p6.this.f7258h, p6.this.f6218a));
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, p8 p8Var) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Unable to resolve VAST wrapper. Server returned " + i10);
            }
            p6.this.a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.b(this.f6219b, "Failed to resolve VAST wrapper due to error code " + i10);
        }
        if (i10 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f7258h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i10);
                return;
            }
            return;
        }
        a8.a(this.f7257g, this.f7258h, i10 == -1001 ? t7.TIMED_OUT : t7.GENERAL_WRAPPER_ERROR, i10, this.f6218a);
    }
}
