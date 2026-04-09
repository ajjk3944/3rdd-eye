package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Rv {

    /* renamed from: a, reason: collision with root package name */
    public final C0969c3 f11078a;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1502lw f11081d;

    /* renamed from: g, reason: collision with root package name */
    public final String f11084g;

    /* renamed from: b, reason: collision with root package name */
    public final C1234gw f11079b = new C1234gw();

    /* renamed from: e, reason: collision with root package name */
    public boolean f11082e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11083f = false;

    /* renamed from: c, reason: collision with root package name */
    public C2203yw f11080c = new C2203yw(null);

    public Rv(Ww ww, C0969c3 c0969c3, String str) {
        this.f11078a = c0969c3;
        this.f11084g = str;
        Qv qv = (Qv) c0969c3.f13526g;
        if (qv == Qv.HTML || qv == Qv.JAVASCRIPT) {
            WebView webView = (WebView) c0969c3.f13521b;
            C1556mw c1556mw = new C1556mw(str);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            c1556mw.f15489b = new C2203yw(webView);
            this.f11081d = c1556mw;
        } else {
            this.f11081d = new C1664ow(str, Collections.unmodifiableMap((HashMap) c0969c3.f13523d));
        }
        this.f11081d.a();
        C1016cw.f13696c.f13697a.add(this);
        AbstractC1502lw abstractC1502lw = this.f11081d;
        C1994v2 c1994v2 = C1994v2.f17210g;
        WebView webViewC = abstractC1502lw.c();
        String str2 = abstractC1502lw.f15488a;
        JSONObject jSONObject = new JSONObject();
        AbstractC1718pw.b(jSONObject, "impressionOwner", (Wv) ww.f12345b);
        AbstractC1718pw.b(jSONObject, "mediaEventsOwner", (Wv) ww.f12346c);
        AbstractC1718pw.b(jSONObject, "creativeType", (Sv) ww.f12347d);
        AbstractC1718pw.b(jSONObject, "impressionType", (Uv) ww.f12348e);
        AbstractC1718pw.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(ww.f12344a));
        c1994v2.D(webViewC, "init", jSONObject, str2);
    }

    public final void a() {
        if (this.f11082e || this.f11081d == null) {
            return;
        }
        int i = 1;
        this.f11082e = true;
        ArrayList arrayList = C1016cw.f13696c.f13698b;
        boolean z6 = arrayList.size() > 0;
        arrayList.add(this);
        if (!z6) {
            C1340iw c1340iwA = C1340iw.a();
            c1340iwA.getClass();
            C0962bw c0962bw = C0962bw.f13501d;
            c0962bw.f13999c = c1340iwA;
            c0962bw.f13997a = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z7 = runningAppProcessInfo.importance == 100 || c0962bw.a();
            c0962bw.f13998b = z7;
            c0962bw.b(z7);
            C1933tw.f16994g.getClass();
            C1933tw.b();
            Zv zv = c1340iwA.f14827b;
            zv.getClass();
            zv.f12986f.submit(new Fu(i, zv));
            zv.f12982b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, zv);
        }
        float f2 = C1340iw.a().f14826a;
        AbstractC1502lw abstractC1502lw = this.f11081d;
        C1994v2.f17210g.D(abstractC1502lw.c(), "setDeviceVolume", Float.valueOf(f2), abstractC1502lw.f15488a);
        AbstractC1502lw abstractC1502lw2 = this.f11081d;
        Date date = (Date) C0907aw.f13263e.f13266c;
        abstractC1502lw2.f(date != null ? (Date) date.clone() : null);
        this.f11081d.d(this, this.f11078a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (this.f11083f || ((View) this.f11080c.get()) == view) {
            return;
        }
        this.f11080c = new C2203yw(view);
        AbstractC1502lw abstractC1502lw = this.f11081d;
        abstractC1502lw.getClass();
        abstractC1502lw.f15490c = System.nanoTime();
        abstractC1502lw.f15491d = 1;
        Collection<Rv> collectionUnmodifiableCollection = Collections.unmodifiableCollection(C1016cw.f13696c.f13697a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (Rv rv : collectionUnmodifiableCollection) {
            if (rv != this && ((View) rv.f11080c.get()) == view) {
                rv.f11080c.clear();
            }
        }
    }

    public final void c() {
        if (this.f11083f) {
            return;
        }
        this.f11080c.clear();
        if (!this.f11083f) {
            this.f11079b.f14399a.clear();
        }
        this.f11083f = true;
        AbstractC1502lw abstractC1502lw = this.f11081d;
        C1994v2.f17210g.D(abstractC1502lw.c(), "finishSession", abstractC1502lw.f15488a);
        C1016cw c1016cw = C1016cw.f13696c;
        ArrayList arrayList = c1016cw.f13697a;
        ArrayList arrayList2 = c1016cw.f13698b;
        boolean z6 = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z6 && arrayList2.size() <= 0) {
            C1340iw c1340iwA = C1340iw.a();
            c1340iwA.getClass();
            C1933tw c1933tw = C1933tw.f16994g;
            c1933tw.getClass();
            Handler handler = C1933tw.i;
            if (handler != null) {
                handler.removeCallbacks(C1933tw.f16997k);
                C1933tw.i = null;
            }
            c1933tw.f16998a.clear();
            C1933tw.f16995h.post(new Fu(c1933tw));
            C0962bw c0962bw = C0962bw.f13501d;
            c0962bw.f13997a = false;
            c0962bw.f13999c = null;
            Zv zv = c1340iwA.f14827b;
            zv.f12982b.getContentResolver().unregisterContentObserver(zv);
        }
        this.f11081d.b();
        this.f11081d = null;
    }
}
