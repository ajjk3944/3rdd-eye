package defpackage;

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
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xb3 {
    public final uk1 a;
    public sc3 d;
    public final String g;
    public final mc3 b = new mc3();
    public boolean e = false;
    public boolean f = false;
    public dd3 c = new dd3(null);

    public xb3(de3 de3Var, uk1 uk1Var, String str) throws JSONException {
        this.a = uk1Var;
        this.g = str;
        wb3 wb3Var = (wb3) uk1Var.l;
        if (wb3Var == wb3.g || wb3Var == wb3.h) {
            WebView webView = (WebView) uk1Var.g;
            tc3 tc3Var = new tc3(str);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            tc3Var.b = new dd3(webView);
            this.d = tc3Var;
        } else {
            this.d = new uc3(str, Collections.unmodifiableMap((HashMap) uk1Var.i));
        }
        this.d.a();
        ic3.c.a.add(this);
        sc3 sc3Var = this.d;
        fr frVar = fr.q;
        WebView webViewC = sc3Var.c();
        String str2 = sc3Var.a;
        JSONObject jSONObject = new JSONObject();
        vc3.b(jSONObject, "impressionOwner", (dc3) de3Var.g);
        vc3.b(jSONObject, "mediaEventsOwner", (dc3) de3Var.h);
        vc3.b(jSONObject, "creativeType", (yb3) de3Var.i);
        vc3.b(jSONObject, "impressionType", (bc3) de3Var.j);
        vc3.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(de3Var.f));
        frVar.s(webViewC, "init", jSONObject, str2);
    }

    public final void a() {
        if (this.e || this.d == null) {
            return;
        }
        this.e = true;
        ArrayList arrayList = ic3.c.b;
        boolean z = arrayList.size() > 0;
        arrayList.add(this);
        if (!z) {
            pc3 pc3VarA = pc3.a();
            pc3VarA.getClass();
            hc3 hc3Var = hc3.i;
            hc3Var.h = pc3VarA;
            hc3Var.f = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z2 = runningAppProcessInfo.importance == 100 || hc3Var.a();
            hc3Var.g = z2;
            hc3Var.b(z2);
            zc3.g.getClass();
            zc3.b();
            fc3 fc3Var = pc3VarA.b;
            fc3Var.getClass();
            fc3Var.f.submit(new bs2(25, fc3Var));
            fc3Var.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, fc3Var);
        }
        float f = pc3.a().a;
        sc3 sc3Var = this.d;
        fr.q.s(sc3Var.c(), "setDeviceVolume", Float.valueOf(f), sc3Var.a);
        sc3 sc3Var2 = this.d;
        Date date = (Date) gc3.e.c;
        sc3Var2.f(date != null ? (Date) date.clone() : null);
        this.d.d(this, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (this.f || ((View) this.c.get()) == view) {
            return;
        }
        this.c = new dd3(view);
        sc3 sc3Var = this.d;
        sc3Var.getClass();
        sc3Var.c = System.nanoTime();
        sc3Var.d = 1;
        Collection<xb3> collectionUnmodifiableCollection = Collections.unmodifiableCollection(ic3.c.a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (xb3 xb3Var : collectionUnmodifiableCollection) {
            if (xb3Var != this && ((View) xb3Var.c.get()) == view) {
                xb3Var.c.clear();
            }
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.c.clear();
        if (!this.f) {
            this.b.a.clear();
        }
        this.f = true;
        sc3 sc3Var = this.d;
        fr.q.s(sc3Var.c(), "finishSession", sc3Var.a);
        ic3 ic3Var = ic3.c;
        ArrayList arrayList = ic3Var.a;
        ArrayList arrayList2 = ic3Var.b;
        boolean z = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z && arrayList2.size() <= 0) {
            pc3 pc3VarA = pc3.a();
            pc3VarA.getClass();
            zc3 zc3Var = zc3.g;
            zc3Var.getClass();
            Handler handler = zc3.i;
            if (handler != null) {
                handler.removeCallbacks(zc3.k);
                zc3.i = null;
            }
            zc3Var.a.clear();
            zc3.h.post(new bs2(zc3Var));
            hc3 hc3Var = hc3.i;
            hc3Var.f = false;
            hc3Var.h = null;
            fc3 fc3Var = pc3VarA.b;
            fc3Var.b.getContentResolver().unregisterContentObserver(fc3Var);
        }
        this.d.b();
        this.d = null;
    }
}
