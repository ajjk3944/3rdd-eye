package com.applovin.impl;

import N7.C1154e9;
import android.net.Uri;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;

/* loaded from: classes.dex */
public class a5 extends z4 {

    /* renamed from: l, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f18939l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f18940m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f18941n;

    public a5(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, kVar, appLovinAdLoadListener);
        this.f18939l = aVar;
    }

    private String d(String str) {
        if (a7.h(com.applovin.impl.sdk.k.o())) {
            str = a7.c(str);
        }
        if (!this.f18939l.isOpenMeasurementEnabled()) {
            return str;
        }
        return this.f21692a.d0().a(str, a2.a((AppLovinAdImpl) this.f21896g));
    }

    private void l() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Caching non-optional HTML resources...");
        }
        this.f18939l.d(d(a(this.f18939l.o1(), this.f18939l.c0(), this.f18939l)));
        this.f18939l.b(true);
        a(this.f18939l);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Finish caching non-optional HTML resources for ad #" + this.f18939l.getAdIdNumber());
        }
        this.f21694c.f(this.f21693b, "Ad HTML updated to reference locally cached non-optional resources = " + this.f18939l.o1());
    }

    private void m() {
        Uri uriC;
        if (k() || (uriC = c(this.f18939l.s1())) == null) {
            return;
        }
        this.f18939l.u1();
        this.f18939l.d(uriC);
    }

    private void n() {
        List<String> listR = this.f18939l.R();
        if (CollectionUtils.isEmpty(listR)) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Caching optional HTML resources...");
        }
        String strO1 = this.f18939l.o1();
        for (String str : listR) {
            if (com.applovin.impl.sdk.o.a()) {
                C1154e9.m("Caching optional resource: ", str, this.f21694c, this.f21693b);
            }
            String strA = this.f21692a.H().a(com.applovin.impl.sdk.k.o(), str, this.f18939l.getCachePrefix(), this.f18939l.c0(), true, true, this.f21692a.H().a(str, this.f21896g), this.f18939l.i0(), a2.a((AppLovinAdImpl) this.f21896g));
            if (StringUtils.isValidString(strA)) {
                if (com.applovin.impl.sdk.o.a()) {
                    C1154e9.m("Updating HTML with cached optional resource: ", strA, this.f21694c, this.f21693b);
                }
                this.f18939l.a(Uri.parse(strA));
                strO1 = strO1.replace(str, strA);
                this.f18939l.d(strO1);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.b(this.f21693b, "Failed to cache optional resource: " + str);
                }
                this.f21692a.E().a(y1.f21816r0, "cacheOptionalHtmlResource", CollectionUtils.hashMap(ImagesContract.URL, str));
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Finish caching optional HTML resources for ad #" + this.f18939l.getAdIdNumber());
        }
    }

    public void b(boolean z10) {
        this.f18941n = z10;
    }

    public void c(boolean z10) {
        this.f18940m = z10;
    }

    @Override // com.applovin.impl.z4, java.lang.Runnable
    public void run() {
        super.run();
        boolean zQ0 = this.f18939l.Q0();
        boolean z10 = this.f18941n;
        if (zQ0 || z10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Begin caching for streaming ad #" + this.f18939l.getAdIdNumber() + "...");
            }
            i();
            if (zQ0) {
                if (this.f18940m) {
                    e();
                }
                l();
                if (!this.f18940m) {
                    e();
                }
                m();
            } else {
                e();
                l();
            }
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Begin processing for non-streaming ad #" + this.f18939l.getAdIdNumber() + "...");
            }
            i();
            l();
            m();
            e();
            n();
        }
        j();
    }
}
