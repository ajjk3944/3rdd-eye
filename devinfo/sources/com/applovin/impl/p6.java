package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
class p6 extends i5 {
    private final s7 g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f5074h;

    public p6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.f5074h = appLovinAdLoadListener;
        this.g = s7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = a8.a(this.g);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.b(this.f4288b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Resolving VAST ad with depth " + this.g.d() + " at " + strA);
        }
        try {
            this.f4287a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.f4287a).b(strA).c("GET").a(p8.f5080f).a(((Integer) this.f4287a.a(x4.U4)).intValue()).c(((Integer) this.f4287a.a(x4.V4)).intValue()).a(false).a(), this.f4287a));
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Unable to resolve VAST wrapper", th2);
            }
            a(-1);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, p8 p8Var, int i4) {
            this.f4287a.q0().a(h6.a(p8Var, p6.this.g, p6.this.f5074h, p6.this.f4287a));
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i4, String str2, p8 p8Var) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.b(this.f4288b, "Unable to resolve VAST wrapper. Server returned " + i4);
            }
            p6.this.a(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.b(this.f4288b, "Failed to resolve VAST wrapper due to error code " + i4);
        }
        if (i4 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f5074h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i4);
                return;
            }
            return;
        }
        a8.a(this.g, this.f5074h, i4 == -1001 ? t7.TIMED_OUT : t7.GENERAL_WRAPPER_ERROR, i4, this.f4287a);
    }
}
