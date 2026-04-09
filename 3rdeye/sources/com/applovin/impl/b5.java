package com.applovin.impl;

import N7.C1154e9;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.b7;
import com.applovin.impl.j7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;

/* loaded from: classes.dex */
class b5 extends z4 {

    /* renamed from: l, reason: collision with root package name */
    private final b7 f19106l;

    public b5(b7 b7Var, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", b7Var, kVar, appLovinAdLoadListener);
        this.f19106l = b7Var;
    }

    private String d(String str) {
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f21692a.a(l4.f19761I4)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                Uri uriA = a(str2, Collections.EMPTY_LIST, false);
                if (uriA != null) {
                    str = str.replace(str2, uriA.toString());
                    this.f21896g.a(uriA);
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.b(this.f21693b, "Failed to cache JavaScript resource: " + str2);
                }
            }
        }
        return str;
    }

    private void l() {
        if (k()) {
            return;
        }
        if (!this.f19106l.C1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Companion ad caching disabled. Skipping...");
                return;
            }
            return;
        }
        e7 e7VarO1 = this.f19106l.o1();
        if (e7VarO1 == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        j7 j7VarE = e7VarO1.e();
        if (j7VarE == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                return;
            }
            return;
        }
        Uri uriC = j7VarE.c();
        String string = uriC != null ? uriC.toString() : "";
        String strB = j7VarE.b();
        if (!URLUtil.isValidUrl(string) && !StringUtils.isValidString(strB)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.k(this.f21693b, "Companion ad does not have any resources attached. Skipping...");
                return;
            }
            return;
        }
        if (j7VarE.d() == j7.a.STATIC) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Caching static companion ad at " + string + "...");
            }
            Uri uriA = a(string, Collections.EMPTY_LIST, false);
            if (uriA != null) {
                j7VarE.a(uriA);
                this.f19106l.b(true);
                return;
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.b(this.f21693b, "Failed to cache static companion ad");
                    return;
                }
                return;
            }
        }
        if (j7VarE.d() != j7.a.HTML) {
            if (j7VarE.d() == j7.a.IFRAME && com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Skip caching of iFrame resource...");
                return;
            }
            return;
        }
        if (!StringUtils.isValidString(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                C1154e9.m("Caching provided HTML for companion ad. No fetch required. HTML: ", strB, this.f21694c, this.f21693b);
            }
            if (((Boolean) this.f21692a.a(l4.f19753H4)).booleanValue()) {
                strB = d(strB);
            }
            j7VarE.a(a(strB, Collections.EMPTY_LIST, this.f19106l));
            this.f19106l.b(true);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Begin caching HTML companion ad. Fetching from " + string + "...");
        }
        String strC = c(string, null, false);
        if (StringUtils.isValidString(strC)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "HTML fetched. Caching HTML now...");
            }
            j7VarE.a(a(strC, Collections.EMPTY_LIST, this.f19106l));
            this.f19106l.b(true);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.b(this.f21693b, "Unable to load companion ad resources from " + string);
        }
    }

    private void m() {
        if (k() || !n7.a(this.f19106l)) {
            return;
        }
        String strQ1 = this.f19106l.q1();
        if (!StringUtils.isValidString(strQ1)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Unable to load HTML template");
                return;
            }
            return;
        }
        String strA = a(strQ1, this.f19106l.c0(), this.f21896g);
        if (this.f19106l.isOpenMeasurementEnabled()) {
            strA = this.f21692a.d0().a(strA, a2.a((AppLovinAdImpl) this.f21896g));
        }
        this.f19106l.d(strA);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Finish caching HTML template " + this.f19106l.q1() + " for ad #" + this.f19106l.getAdIdNumber());
        }
    }

    private void n() {
        p7 p7VarY1;
        Uri uriE;
        if (k()) {
            return;
        }
        if (!this.f19106l.D1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Video caching disabled. Skipping...");
                return;
            }
            return;
        }
        if (this.f19106l.x1() == null || (p7VarY1 = this.f19106l.y1()) == null || (uriE = p7VarY1.e()) == null) {
            return;
        }
        Uri uriB = b(uriE.toString(), Collections.EMPTY_LIST, false);
        if (uriB != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Video file successfully cached into: " + uriB);
            }
            p7VarY1.a(uriB);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.b(this.f21693b, "Failed to cache video file: " + p7VarY1);
        }
    }

    @Override // com.applovin.impl.z4
    public void a(int i) {
        this.f19106l.getAdEventTracker().f();
        super.a(i);
    }

    @Override // com.applovin.impl.z4
    public void e() {
        this.f19106l.getAdEventTracker().h();
        super.e();
    }

    @Override // com.applovin.impl.z4, java.lang.Runnable
    public void run() {
        super.run();
        boolean zQ0 = this.f19106l.Q0();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f21694c;
            String str = this.f21693b;
            StringBuilder sb = new StringBuilder("Begin caching for VAST ");
            sb.append(zQ0 ? "streaming " : "");
            sb.append("ad #");
            sb.append(this.f21896g.getAdIdNumber());
            sb.append("...");
            oVar.a(str, sb.toString());
        }
        if (zQ0) {
            i();
            if (this.f19106l.A1()) {
                e();
            }
            b7.c cVarR1 = this.f19106l.r1();
            b7.c cVar = b7.c.COMPANION_AD;
            if (cVarR1 == cVar) {
                l();
                m();
                a(this.f19106l);
            } else {
                n();
            }
            if (!this.f19106l.A1()) {
                e();
            }
            if (this.f19106l.r1() == cVar) {
                n();
            } else {
                l();
                m();
                a(this.f19106l);
            }
        } else {
            i();
            l();
            n();
            m();
            a(this.f19106l);
            e();
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Finished caching VAST ad #" + this.f19106l.getAdIdNumber());
        }
        this.f19106l.B1();
        j();
    }
}
