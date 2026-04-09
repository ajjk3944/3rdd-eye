package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.e0;
import com.applovin.impl.l5;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class m5 extends l5 {

    /* renamed from: q, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f4495q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f4496r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f4497s;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements e0.a {
        public a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                m5.this.f4495q.m1();
                m5.this.f4495q.c(uri);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements l5.e {
        public b() {
        }

        @Override // com.applovin.impl.l5.e
        public void a(String str) {
            m5.this.f4495q.d(m5.this.d(str));
            m5.this.f4495q.b(true);
            com.applovin.impl.sdk.o oVar = m5.this.f4289c;
            if (com.applovin.impl.sdk.o.a()) {
                m5 m5Var = m5.this;
                m5Var.f4289c.a(m5Var.f4288b, "Finish caching non-video resources for ad #" + m5.this.f4495q.getAdIdNumber());
            }
            m5 m5Var2 = m5.this;
            m5Var2.f4289c.f(m5Var2.f4288b, "Ad updated with cachedHTML = " + m5.this.f4495q.g1());
        }
    }

    public m5(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, kVar, appLovinAdLoadListener);
        this.f4495q = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        if (n7.j(com.applovin.impl.sdk.k.o())) {
            str = n7.c(str);
        }
        if (!this.f4495q.isOpenMeasurementEnabled()) {
            return str;
        }
        return this.f4287a.e0().a(str, f2.a((AppLovinAdImpl) this.g));
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Caching non-optional HTML resources...");
        }
        this.f4495q.d(d(a(this.f4495q.g1(), this.f4495q.S(), this.f4495q)));
        this.f4495q.b(true);
        a(this.f4495q);
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Finish caching non-optional HTML resources for ad #" + this.f4495q.getAdIdNumber());
        }
        this.f4289c.f(this.f4288b, "Ad HTML updated to reference locally cached non-optional resources = " + this.f4495q.g1());
    }

    private void n() {
        Uri uriC;
        if (l() || (uriC = c(this.f4495q.k1())) == null) {
            return;
        }
        this.f4495q.m1();
        this.f4495q.c(uriC);
    }

    private d0 o() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Caching HTML resources...");
        }
        return a(this.f4495q.g1(), this.f4495q.S(), new b());
    }

    private e0 p() {
        return b(this.f4495q.k1(), new a());
    }

    private void q() {
        List<String> listH = this.f4495q.H();
        if (CollectionUtils.isEmpty(listH)) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Caching optional HTML resources...");
        }
        String strG1 = this.f4495q.g1();
        for (String str : listH) {
            if (com.applovin.impl.sdk.o.a()) {
                a0.g.x("Caching optional resource: ", str, this.f4289c, this.f4288b);
            }
            int iA = this.f4287a.G().a(str, this.g);
            Map mapA = f2.a((AppLovinAdImpl) this.g);
            String strA = this.f4287a.G().a(com.applovin.impl.sdk.k.o(), str, this.f4495q.getCachePrefix(), this.f4495q.S(), true, true, iA, this.f4427i, mapA);
            if (StringUtils.isValidString(strA)) {
                if (com.applovin.impl.sdk.o.a()) {
                    a0.g.x("Updating HTML with cached optional resource: ", strA, this.f4289c, this.f4288b);
                }
                this.f4495q.a(strA, str);
                strG1 = strG1.replace(str, strA);
                this.f4495q.d(strG1);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4289c.b(this.f4288b, "Failed to cache optional resource: " + str);
                }
                a(str, "cacheOptionalHtmlResource", mapA);
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Finish caching optional HTML resources for ad #" + this.f4495q.getAdIdNumber());
        }
    }

    public void b(boolean z3) {
        this.f4497s = z3;
    }

    public void c(boolean z3) {
        this.f4496r = z3;
    }

    @Override // com.applovin.impl.l5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zC0 = this.f4495q.C0();
        boolean z3 = this.f4497s;
        if (zC0 || z3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Begin caching for streaming ad #" + this.f4495q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f4287a.a(x4.I0)).booleanValue()) {
                if (!o0.d()) {
                    a(e());
                }
                ArrayList arrayList = new ArrayList();
                if (!zC0) {
                    f();
                    d0 d0VarO = o();
                    if (d0VarO != null) {
                        arrayList.add(d0VarO);
                    }
                } else if (this.f4496r) {
                    f();
                    d0 d0VarO2 = o();
                    if (d0VarO2 != null) {
                        arrayList.add(d0VarO2);
                    }
                    e0 e0VarP = p();
                    if (e0VarP != null) {
                        arrayList.add(e0VarP);
                    }
                } else {
                    d0 d0VarO3 = o();
                    if (d0VarO3 != null) {
                        a(Arrays.asList(d0VarO3));
                    }
                    f();
                    e0 e0VarP2 = p();
                    if (e0VarP2 != null) {
                        arrayList.add(e0VarP2);
                    }
                }
                a(arrayList);
                f();
            } else {
                j();
                if (zC0) {
                    if (this.f4496r) {
                        f();
                    }
                    m();
                    if (!this.f4496r) {
                        f();
                    }
                    n();
                } else {
                    f();
                    m();
                }
            }
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Begin processing for non-streaming ad #" + this.f4495q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f4287a.a(x4.I0)).booleanValue()) {
                ArrayList arrayList2 = new ArrayList();
                if (!o0.d()) {
                    arrayList2.addAll(e());
                }
                d0 d0VarO4 = o();
                if (d0VarO4 != null) {
                    arrayList2.add(d0VarO4);
                }
                e0 e0VarP3 = p();
                if (e0VarP3 != null) {
                    arrayList2.add(e0VarP3);
                }
                a(arrayList2);
                f();
                q();
            } else {
                j();
                m();
                n();
                f();
                q();
            }
        }
        k();
    }
}
