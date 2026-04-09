package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vt0 {

    /* renamed from: a, reason: collision with root package name */
    public final b7 f17699a;

    /* renamed from: d, reason: collision with root package name */
    public pu0 f17702d;
    public final String g;

    /* renamed from: b, reason: collision with root package name */
    public final lu0 f17700b = new lu0();

    /* renamed from: e, reason: collision with root package name */
    public boolean f17703e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17704f = false;

    /* renamed from: c, reason: collision with root package name */
    public c1.r f17701c = new c1.r(null);

    public vt0(aw0 aw0Var, b7 b7Var, String str) throws JSONException {
        this.f17699a = b7Var;
        this.g = str;
        ut0 ut0Var = (ut0) b7Var.g;
        if (ut0Var == ut0.HTML || ut0Var == ut0.JAVASCRIPT) {
            WebView webView = (WebView) b7Var.f9606b;
            qu0 qu0Var = new qu0(str);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            qu0Var.f15109b = new c1.r(webView);
            this.f17702d = qu0Var;
        } else {
            this.f17702d = new tu0(str, DesugarCollections.unmodifiableMap((HashMap) b7Var.f9608d));
        }
        this.f17702d.a();
        hu0.f11974c.f11975a.add(this);
        pu0 pu0Var = this.f17702d;
        w5 w5Var = w5.g;
        WebView webViewC = pu0Var.c();
        String str2 = pu0Var.f15108a;
        JSONObject jSONObject = new JSONObject();
        uu0.b(jSONObject, "impressionOwner", (au0) aw0Var.f9457b);
        uu0.b(jSONObject, "mediaEventsOwner", (au0) aw0Var.f9458c);
        uu0.b(jSONObject, "creativeType", (wt0) aw0Var.f9459d);
        uu0.b(jSONObject, "impressionType", (yt0) aw0Var.f9460e);
        uu0.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(aw0Var.f9456a));
        w5Var.C(webViewC, "init", jSONObject, str2);
    }

    public final void a() {
        if (this.f17703e || this.f17702d == null) {
            return;
        }
        this.f17703e = true;
        ArrayList arrayList = hu0.f11974c.f11976b;
        int i4 = 0;
        boolean z3 = arrayList.size() > 0;
        arrayList.add(this);
        if (!z3) {
            nu0 nu0VarA = nu0.a();
            nu0VarA.getClass();
            gu0 gu0Var = gu0.f11610d;
            gu0Var.f12836c = nu0VarA;
            gu0Var.f12834a = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z10 = runningAppProcessInfo.importance == 100 || gu0Var.a();
            gu0Var.f12835b = z10;
            gu0Var.b(z10);
            yu0.g.getClass();
            yu0.b();
            eu0 eu0Var = nu0VarA.f14440b;
            eu0Var.getClass();
            eu0Var.f10870f.submit(new du0(i4, eu0Var));
            eu0Var.f10866b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, eu0Var);
        }
        float f10 = nu0.a().f14439a;
        pu0 pu0Var = this.f17702d;
        w5.g.C(pu0Var.c(), "setDeviceVolume", Float.valueOf(f10), pu0Var.f15108a);
        pu0 pu0Var2 = this.f17702d;
        Date date = (Date) fu0.f11260e.f11263c;
        pu0Var2.f(date != null ? (Date) date.clone() : null);
        this.f17702d.d(this, this.f17699a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (this.f17704f || ((View) this.f17701c.get()) == view) {
            return;
        }
        this.f17701c = new c1.r(view);
        pu0 pu0Var = this.f17702d;
        pu0Var.getClass();
        pu0Var.f15110c = System.nanoTime();
        pu0Var.f15111d = 1;
        Collection<vt0> collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(hu0.f11974c.f11975a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (vt0 vt0Var : collectionUnmodifiableCollection) {
            if (vt0Var != this && ((View) vt0Var.f17701c.get()) == view) {
                vt0Var.f17701c.clear();
            }
        }
    }

    public final void c() {
        if (this.f17704f) {
            return;
        }
        this.f17701c.clear();
        if (!this.f17704f) {
            this.f17700b.f13632a.clear();
        }
        this.f17704f = true;
        pu0 pu0Var = this.f17702d;
        w5.g.C(pu0Var.c(), "finishSession", pu0Var.f15108a);
        hu0 hu0Var = hu0.f11974c;
        ArrayList arrayList = hu0Var.f11975a;
        ArrayList arrayList2 = hu0Var.f11976b;
        boolean z3 = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z3 && arrayList2.size() <= 0) {
            nu0 nu0VarA = nu0.a();
            nu0VarA.getClass();
            yu0 yu0Var = yu0.g;
            yu0Var.getClass();
            Handler handler = yu0.f18867i;
            if (handler != null) {
                handler.removeCallbacks(yu0.f18868k);
                yu0.f18867i = null;
            }
            yu0Var.f18869a.clear();
            yu0.f18866h.post(new du0(yu0Var));
            gu0 gu0Var = gu0.f11610d;
            gu0Var.f12834a = false;
            gu0Var.f12836c = null;
            eu0 eu0Var = nu0VarA.f14440b;
            eu0Var.f10866b.getContentResolver().unregisterContentObserver(eu0Var);
        }
        this.f17702d.b();
        this.f17702d = null;
    }
}
