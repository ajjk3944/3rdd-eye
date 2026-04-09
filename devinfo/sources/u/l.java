package u;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f34712a;

    /* renamed from: b, reason: collision with root package name */
    public int f34713b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34714c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f34715d;

    /* renamed from: e, reason: collision with root package name */
    public Object f34716e;

    /* renamed from: f, reason: collision with root package name */
    public Object f34717f;
    public Cloneable g;

    public l(rl.a aVar, km.i iVar, vl.m mVar, boolean z3) {
        List listK;
        nk.k.e(iVar, "routeDatabase");
        this.f34714c = aVar;
        this.f34715d = iVar;
        this.f34712a = z3;
        s sVar = s.f38317a;
        this.f34716e = sVar;
        this.f34717f = sVar;
        this.g = new ArrayList();
        rl.n nVar = aVar.f33026h;
        nk.k.e(nVar, "url");
        URI uriH = nVar.h();
        if (uriH.getHost() == null) {
            listK = sl.h.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = aVar.g.select(uriH);
            listK = (listSelect == null || listSelect.isEmpty()) ? sl.h.k(new Proxy[]{Proxy.NO_PROXY}) : sl.h.j(listSelect);
        }
        this.f34716e = listK;
        this.f34713b = 0;
    }

    public m a() {
        Intent intent = (Intent) this.f34714c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f34712a);
        ((j6.i) this.f34715d).getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = (Bundle) this.g;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        if (((SparseArray) this.f34717f) != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", (SparseArray) this.f34717f);
            intent.putExtras(bundle3);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f34713b);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 24) {
            String strA = j.a();
            if (!TextUtils.isEmpty(strA)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", strA);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }
        if (i4 >= 34) {
            if (((ActivityOptions) this.f34716e) == null) {
                this.f34716e = i.a();
            }
            k.a((ActivityOptions) this.f34716e, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f34716e;
        return new m(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public boolean b() {
        return this.f34713b < ((List) this.f34716e).size() || !((ArrayList) this.g).isEmpty();
    }

    public void c(int i4) {
        Intent intent = (Intent) this.f34714c;
        if (i4 < 0 || i4 > 2) {
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }
        this.f34713b = i4;
        if (i4 == 1) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        } else if (i4 == 2) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        } else {
            intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
        }
    }

    public l() {
        this.f34714c = new Intent("android.intent.action.VIEW");
        this.f34715d = new j6.i(18);
        this.f34713b = 0;
        this.f34712a = true;
    }

    public l(p pVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f34714c = intent;
        this.f34715d = new j6.i(18);
        this.f34713b = 0;
        this.f34712a = true;
        if (pVar != null) {
            intent.setPackage(pVar.f34723d.getPackageName());
            g gVar = pVar.f34722c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", gVar);
            intent.putExtras(bundle);
        }
    }
}
