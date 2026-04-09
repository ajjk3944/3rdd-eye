package G5;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l extends b {

    /* renamed from: a, reason: collision with root package name */
    public final d f1923a;

    /* renamed from: b, reason: collision with root package name */
    public final c f1924b;

    /* renamed from: c, reason: collision with root package name */
    public final I5.f f1925c;

    /* renamed from: d, reason: collision with root package name */
    public O5.a f1926d;

    /* renamed from: e, reason: collision with root package name */
    public K5.a f1927e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1928f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1929g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1930h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1931j;

    public l(c cVar, d dVar) throws JSONException {
        K5.a bVar;
        String string = UUID.randomUUID().toString();
        this.f1925c = new I5.f();
        this.f1928f = false;
        this.f1929g = false;
        this.f1924b = cVar;
        this.f1923a = dVar;
        this.f1930h = string;
        this.f1926d = new O5.a(null);
        e eVar = e.HTML;
        e eVar2 = dVar.f1919f;
        if (eVar2 == eVar || eVar2 == e.JAVASCRIPT) {
            bVar = new K5.b(string);
            WebView webView = dVar.f1915b;
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            bVar.f3150b = new O5.b(webView);
        } else {
            bVar = new K5.d(string, Collections.unmodifiableMap(dVar.f1917d), dVar.f1918e);
        }
        this.f1927e = bVar;
        this.f1927e.g();
        I5.c.f2496c.f2497a.add(this);
        K5.a aVar = this.f1927e;
        I5.i iVar = I5.i.f2509a;
        WebView webViewF = aVar.f();
        JSONObject jSONObject = new JSONObject();
        L5.a.b(jSONObject, "impressionOwner", (j) cVar.f1910a);
        L5.a.b(jSONObject, "mediaEventsOwner", (j) cVar.f1911b);
        L5.a.b(jSONObject, "creativeType", (f) cVar.f1912c);
        L5.a.b(jSONObject, "impressionType", (h) cVar.f1913d);
        L5.a.b(jSONObject, "isolateVerificationScripts", Boolean.FALSE);
        iVar.a(webViewF, "init", jSONObject, aVar.f3149a);
    }

    @Override // G5.b
    public final void b() {
        int i = 1;
        if (this.f1929g) {
            return;
        }
        this.f1926d.clear();
        if (!this.f1929g) {
            this.f1925c.f2502a.clear();
        }
        this.f1929g = true;
        K5.a aVar = this.f1927e;
        I5.i.f2509a.a(aVar.f(), "finishSession", aVar.f3149a);
        I5.c cVar = I5.c.f2496c;
        boolean z10 = cVar.f2498b.size() > 0;
        cVar.f2497a.remove(this);
        ArrayList<l> arrayList = cVar.f2498b;
        arrayList.remove(this);
        if (z10 && arrayList.size() <= 0) {
            I5.j jVarB = I5.j.b();
            jVarB.getClass();
            M5.a aVar2 = M5.a.f4180h;
            aVar2.getClass();
            Handler handler = M5.a.f4181j;
            if (handler != null) {
                handler.removeCallbacks(M5.a.f4183l);
                M5.a.f4181j = null;
            }
            aVar2.f4184a.clear();
            M5.a.i.post(new C2.f(aVar2, i));
            I5.b bVar = I5.b.f2495e;
            bVar.f2499b = false;
            bVar.f2501d = null;
            H5.a aVar3 = jVarB.f2513c;
            aVar3.f2028a.getContentResolver().unregisterContentObserver(aVar3);
        }
        this.f1927e.e();
        this.f1927e = null;
    }

    @Override // G5.b
    public final void c(View view) {
        if (this.f1929g || this.f1926d.get() == view) {
            return;
        }
        this.f1926d = new O5.a(view);
        this.f1927e.d();
        Collection<l> collectionUnmodifiableCollection = Collections.unmodifiableCollection(I5.c.f2496c.f2497a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (l lVar : collectionUnmodifiableCollection) {
            if (lVar != this && lVar.f1926d.get() == view) {
                lVar.f1926d.clear();
            }
        }
    }

    @Override // G5.b
    public final void d() {
        if (this.f1928f) {
            return;
        }
        this.f1928f = true;
        I5.c cVar = I5.c.f2496c;
        boolean z10 = cVar.f2498b.size() > 0;
        cVar.f2498b.add(this);
        if (!z10) {
            I5.j jVarB = I5.j.b();
            jVarB.getClass();
            I5.b bVar = I5.b.f2495e;
            bVar.f2501d = jVarB;
            bVar.f2499b = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z11 = runningAppProcessInfo.importance == 100 || bVar.b();
            bVar.f2500c = z11;
            bVar.a(z11);
            M5.a.f4180h.getClass();
            M5.a.b();
            H5.a aVar = jVarB.f2513c;
            aVar.f2032e = aVar.a();
            aVar.b();
            aVar.f2028a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, aVar);
        }
        float f10 = I5.j.b().f2511a;
        K5.a aVar2 = this.f1927e;
        I5.i.f2509a.a(aVar2.f(), "setDeviceVolume", Float.valueOf(f10), aVar2.f3149a);
        K5.a aVar3 = this.f1927e;
        Date date = I5.a.f2489f.f2491b;
        aVar3.c(date != null ? (Date) date.clone() : null);
        this.f1927e.a(this, this.f1923a);
    }
}
