package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5976a;

    /* renamed from: b, reason: collision with root package name */
    private n.b f5977b;

    public class a extends n.d {
        public a() {
        }

        @Override // n.d
        public void onCustomTabsServiceConnected(ComponentName componentName, n.b bVar) {
            f1.this.f5976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.this.f5976a.O().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            f1.this.f5977b = bVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f1.this.f5976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.this.f5976a.O().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            f1.this.f5977b = null;
        }
    }

    public class b extends CustomTabsCallback {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f5979a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f5979a = new WeakReference(aVar);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i10, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.f5979a.get();
            if (aVar == null) {
                f1.this.f5976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f5976a.O().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b bVarG = aVar.g();
            if (bVarG == null) {
                f1.this.f5976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f5976a.O().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f5976a.k().trackCustomTabsNavigationStarted(bVarG);
                        break;
                    }
                    break;
                case 2:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f5976a.k().trackCustomTabsNavigationFinished(bVarG);
                        break;
                    }
                    break;
                case 3:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f5976a.k().trackCustomTabsNavigationFailed(bVarG);
                        break;
                    }
                    break;
                case 4:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f5976a.k().trackCustomTabsNavigationAborted(bVarG);
                        break;
                    }
                    break;
                case 5:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f5976a.k().trackCustomTabsTabShown(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    t2.c(aVar.e(), bVarG, aVar.i());
                    break;
                case 6:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f5976a.k().trackCustomTabsTabHidden(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    t2.a(aVar.e(), bVarG, aVar.i());
                    break;
                default:
                    f1.this.f5976a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.this.f5976a.O().a("CustomTabsManager", "Unknown navigation event: " + i10);
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            f1.this.f5976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = f1.this.f5976a.O();
                StringBuilder sb = new StringBuilder();
                sb.append("Validation ");
                sb.append(z10 ? "succeeded" : "failed");
                sb.append(" for session-URL relation(");
                sb.append(i10);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                oVarO.a("CustomTabsManager", sb.toString());
            }
        }
    }

    public class c extends CustomTabsCallback {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f5981a;

        public c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f5981a = new WeakReference(appLovinNativeAdImpl);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i10, Bundle bundle) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) this.f5981a.get();
            if (appLovinNativeAdImpl == null) {
                f1.this.f5976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f5976a.O().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). Native ad is null.");
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f5976a.k().trackNativeAdCustomTabsNavigationStarted(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 2:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f5976a.k().trackNativeAdCustomTabsNavigationFinished(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 3:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f5976a.k().trackNativeAdCustomTabsNavigationFailed(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 4:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f5976a.k().trackNativeAdCustomTabsNavigationAborted(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 5:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f5976a.k().trackNativeAdCustomTabsTabShown(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    break;
                case 6:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f5976a.k().trackNativeAdCustomTabsTabHidden(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    break;
                default:
                    f1.this.f5976a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.this.f5976a.O().a("CustomTabsManager", "Unknown navigation event: " + i10);
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            f1.this.f5976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = f1.this.f5976a.O();
                StringBuilder sb = new StringBuilder();
                sb.append("Validation ");
                sb.append(z10 ? "succeeded" : "failed");
                sb.append(" for session-URL relation(");
                sb.append(i10);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                oVarO.a("CustomTabsManager", sb.toString());
            }
        }
    }

    public f1(com.applovin.impl.sdk.k kVar) {
        this.f5976a = kVar;
    }

    public void b(final List list, final n.e eVar) {
        if (list.isEmpty()) {
            return;
        }
        if (eVar != null) {
            a("warmup urls", new Runnable() { // from class: com.applovin.impl.ga
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6090a.a(list, eVar);
                }
            });
            return;
        }
        this.f5976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5976a.O().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }

    public void a() {
        if (((Boolean) this.f5976a.a(x4.f8449d7)).booleanValue() && this.f5977b == null) {
            String strD = n.b.d(com.applovin.impl.sdk.k.o(), this.f5976a.c(x4.f8458e7), true);
            String strC = n.b.c(com.applovin.impl.sdk.k.o(), null);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f5976a.a(x4.f8467f7)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(strC, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strD, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(strD, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strC, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f5976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5976a.O().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(g1 g1Var, n.e eVar) {
        this.f5977b.g(0L);
        if (g1Var == null) {
            return;
        }
        Integer numE = g1Var.e();
        String strB = g1Var.b();
        if (numE == null || TextUtils.isEmpty(strB)) {
            return;
        }
        if (eVar == null) {
            this.f5976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f5976a.O().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f5976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5976a.O().a("CustomTabsManager", "Validating session-URL relation: " + numE + " with digital asset link: " + strB);
        }
        eVar.k(numE.intValue(), Uri.parse(strB), null);
    }

    private void a(LinkedList linkedList) {
        boolean zIsEmpty;
        boolean zA = false;
        try {
            zA = n.b.a(com.applovin.impl.sdk.k.o(), (String) linkedList.poll(), new a());
            if (!zA) {
                this.f5976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5976a.O().b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
        } catch (Throwable th) {
            try {
                this.f5976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5976a.O().a("CustomTabsManager", "Failed to bind to service", th);
                }
                if (zA) {
                    return;
                } else {
                    if (zIsEmpty) {
                        return;
                    }
                }
            } finally {
                if (!zA && !linkedList.isEmpty()) {
                    this.f5976a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f5976a.O().a("CustomTabsManager", "Retrying with next package name...");
                    }
                    a(linkedList);
                }
            }
        }
        if (zA || linkedList.isEmpty()) {
            return;
        }
        this.f5976a.O();
        if (com.applovin.impl.sdk.o.a()) {
        }
    }

    public n.e a(com.applovin.impl.adview.a aVar) {
        if (this.f5977b == null) {
            this.f5976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f5976a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f5976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5976a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            n.e eVarE = this.f5977b.e(new b(aVar));
            a(eVarE, aVar.g());
            return eVarE;
        } catch (Exception e10) {
            this.f5976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f5976a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e10);
            }
            return null;
        }
    }

    public n.e a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (this.f5977b == null) {
            this.f5976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f5976a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f5976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5976a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            n.e eVarE = this.f5977b.e(new c(appLovinNativeAdImpl));
            a(eVarE, appLovinNativeAdImpl);
            return eVarE;
        } catch (Exception e10) {
            this.f5976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f5976a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e10);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, n.e eVar) {
        this.f5976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5976a.O().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse(str2));
            arrayList.add(bundle);
        }
        boolean zG = eVar.g(Uri.parse(str), null, arrayList);
        this.f5976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVarO = this.f5976a.O();
            StringBuilder sb = new StringBuilder();
            sb.append("Warmup for URLs ");
            sb.append(zG ? "succeeded" : "failed");
            oVarO.a("CustomTabsManager", sb.toString());
        }
    }

    public void a(final Uri uri, final com.applovin.impl.adview.a aVar, final Activity activity) {
        if (aVar.h() == null) {
            this.f5976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f5976a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return;
        }
        if (a("launch uri", new Runnable() { // from class: com.applovin.impl.ia
            @Override // java.lang.Runnable
            public final void run() {
                this.f6244a.a(aVar, activity, uri);
            }
        })) {
            this.f5976a.m0().pauseForClick();
            return;
        }
        this.f5976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5976a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, Uri uri) {
        a(aVar, activity).a(activity, uri);
    }

    public boolean a(final Uri uri, final AppLovinNativeAdImpl appLovinNativeAdImpl, final Activity activity) {
        if (appLovinNativeAdImpl.getCustomTabsSession() == null) {
            this.f5976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f5976a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return false;
        }
        boolean zA = a("launch uri", new Runnable() { // from class: com.applovin.impl.ja
            @Override // java.lang.Runnable
            public final void run() {
                this.f6283a.a(appLovinNativeAdImpl, activity, uri);
            }
        });
        if (zA) {
            this.f5976a.m0().pauseForClick();
            return zA;
        }
        this.f5976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5976a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
        return zA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity, Uri uri) {
        a(appLovinNativeAdImpl, activity).a(activity, uri);
    }

    private void a(n.e eVar, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(bVar.getCustomTabsSettings(), eVar);
    }

    private void a(n.e eVar, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (appLovinNativeAdImpl == null || !appLovinNativeAdImpl.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(appLovinNativeAdImpl.getCustomTabsSettings(), eVar);
    }

    private void a(final g1 g1Var, final n.e eVar) {
        a("client warmup", new Runnable() { // from class: com.applovin.impl.ha
            @Override // java.lang.Runnable
            public final void run() {
                this.f6150a.b(g1Var, eVar);
            }
        });
    }

    private CustomTabsIntent a(com.applovin.impl.adview.a aVar, Activity activity) {
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        return a(bVarG != null ? bVarG.getCustomTabsSettings() : null, bVarG != null ? bVarG.getCustomTabsHeaders() : Bundle.EMPTY, aVar.h(), activity);
    }

    private CustomTabsIntent a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        return a(appLovinNativeAdImpl.getCustomTabsSettings(), appLovinNativeAdImpl.getCustomTabsHeaders(), appLovinNativeAdImpl.getCustomTabsSession(), activity);
    }

    private CustomTabsIntent a(g1 g1Var, Bundle bundle, n.e eVar, Activity activity) {
        this.f5976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5976a.O().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        CustomTabsIntent.d dVar = new CustomTabsIntent.d(eVar);
        if (((Boolean) this.f5976a.a(x4.f8476g7)).booleanValue()) {
            int i10 = R.anim.applovin_slide_up_animation;
            int i11 = R.anim.applovin_slide_down_animation;
            dVar.o(activity, i10, i11);
            dVar.f(activity, i10, i11);
        }
        if (g1Var != null) {
            Integer numH = g1Var.h();
            if (numH != null) {
                dVar.e(new a.C0008a().b(numH.intValue()).a());
            }
            Integer numA = g1Var.a();
            if (numA != null) {
                dVar.c(2, new a.C0008a().b(numA.intValue()).a());
            }
            Boolean boolI = g1Var.i();
            if (boolI != null) {
                dVar.p(boolI.booleanValue());
            }
            Boolean boolG = g1Var.g();
            if (boolG != null) {
                dVar.n(boolG.booleanValue());
            }
            Boolean boolC = g1Var.c();
            if (boolC != null) {
                dVar.i(boolC.booleanValue());
            }
            Integer numF = g1Var.f();
            if (numF != null) {
                dVar.m(numF.intValue());
            }
        }
        CustomTabsIntent customTabsIntentA = dVar.a();
        if (g1Var != null) {
            String strD = g1Var.d();
            if (strD != null) {
                customTabsIntentA.f1427a.putExtra("android.intent.extra.REFERRER", Uri.parse(strD));
            }
            if (!bundle.isEmpty()) {
                customTabsIntentA.f1427a.putExtra("com.android.browser.headers", bundle);
            }
        }
        return customTabsIntentA;
    }

    private void a(Uri uri, Activity activity) {
        if (((Boolean) this.f5976a.a(x4.f8485h7)).booleanValue()) {
            k7.a(uri, activity, this.f5976a);
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", uri));
    }

    private boolean a(String str, Runnable runnable) {
        try {
            this.f5976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f5976a.O().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f5976a.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return true;
            }
            this.f5976a.O().a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th) {
            this.f5976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f5976a.O().a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f5976a.D().a("CustomTabsManager", str, th);
            return false;
        }
    }
}
