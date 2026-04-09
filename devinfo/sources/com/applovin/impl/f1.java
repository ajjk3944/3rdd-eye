package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4094a;

    /* renamed from: b, reason: collision with root package name */
    private u.h f4095b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends u.o {
        public a() {
        }

        @Override // u.o
        public void onCustomTabsServiceConnected(ComponentName componentName, u.h hVar) {
            f1.this.f4094a.O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.this.f4094a.O().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            f1.this.f4095b = hVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f1.this.f4094a.O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.this.f4094a.O().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            f1.this.f4095b = null;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b extends u.a {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f4097a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f4097a = new WeakReference(aVar);
        }

        @Override // u.a
        public void onNavigationEvent(int i4, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.f4097a.get();
            if (aVar == null) {
                f1.this.f4094a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f4094a.O().b("CustomTabsManager", "Unable to track navigation event (" + i4 + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b bVarG = aVar.g();
            if (bVarG == null) {
                f1.this.f4094a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f4094a.O().b("CustomTabsManager", "Unable to track navigation event (" + i4 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i4) {
                case 1:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f4094a.k().trackCustomTabsNavigationStarted(bVarG);
                        break;
                    }
                    break;
                case 2:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f4094a.k().trackCustomTabsNavigationFinished(bVarG);
                        break;
                    }
                    break;
                case 3:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f4094a.k().trackCustomTabsNavigationFailed(bVarG);
                        break;
                    }
                    break;
                case 4:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f4094a.k().trackCustomTabsNavigationAborted(bVarG);
                        break;
                    }
                    break;
                case 5:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f4094a.k().trackCustomTabsTabShown(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    t2.c(aVar.e(), bVarG, aVar.i());
                    break;
                case 6:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f4094a.k().trackCustomTabsTabHidden(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    t2.a(aVar.e(), bVarG, aVar.i());
                    break;
                default:
                    f1.this.f4094a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.this.f4094a.O().a("CustomTabsManager", "Unknown navigation event: " + i4);
                        break;
                    }
                    break;
            }
        }

        @Override // u.a
        public void onRelationshipValidationResult(int i4, Uri uri, boolean z3, Bundle bundle) {
            f1.this.f4094a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = f1.this.f4094a.O();
                StringBuilder sb2 = new StringBuilder("Validation ");
                sb2.append(z3 ? "succeeded" : "failed");
                sb2.append(" for session-URL relation(");
                sb2.append(i4);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                oVarO.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class c extends u.a {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f4099a;

        public c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f4099a = new WeakReference(appLovinNativeAdImpl);
        }

        @Override // u.a
        public void onNavigationEvent(int i4, Bundle bundle) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) this.f4099a.get();
            if (appLovinNativeAdImpl == null) {
                f1.this.f4094a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f4094a.O().b("CustomTabsManager", "Unable to track navigation event (" + i4 + "). Native ad is null.");
                }
                return;
            }
            switch (i4) {
                case 1:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f4094a.k().trackNativeAdCustomTabsNavigationStarted(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 2:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f4094a.k().trackNativeAdCustomTabsNavigationFinished(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 3:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f4094a.k().trackNativeAdCustomTabsNavigationFailed(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 4:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f4094a.k().trackNativeAdCustomTabsNavigationAborted(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 5:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f4094a.k().trackNativeAdCustomTabsTabShown(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    break;
                case 6:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f4094a.k().trackNativeAdCustomTabsTabHidden(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    break;
                default:
                    f1.this.f4094a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.this.f4094a.O().a("CustomTabsManager", "Unknown navigation event: " + i4);
                        break;
                    }
                    break;
            }
        }

        @Override // u.a
        public void onRelationshipValidationResult(int i4, Uri uri, boolean z3, Bundle bundle) {
            f1.this.f4094a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = f1.this.f4094a.O();
                StringBuilder sb2 = new StringBuilder("Validation ");
                sb2.append(z3 ? "succeeded" : "failed");
                sb2.append(" for session-URL relation(");
                sb2.append(i4);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                oVarO.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    public f1(com.applovin.impl.sdk.k kVar) {
        this.f4094a = kVar;
    }

    public void b(List list, u.p pVar) {
        if (list.isEmpty()) {
            return;
        }
        if (pVar != null) {
            a("warmup urls", new b5.e(this, list, pVar, 4));
            return;
        }
        this.f4094a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4094a.O().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }

    public void a() {
        if (((Boolean) this.f4094a.a(x4.f6019d7)).booleanValue() && this.f4095b == null) {
            String strB = u.h.b(com.applovin.impl.sdk.k.o(), this.f4094a.c(x4.f6027e7), true);
            String strB2 = u.h.b(com.applovin.impl.sdk.k.o(), null, false);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f4094a.a(x4.f6036f7)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(strB2, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strB, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(strB, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strB2, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f4094a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4094a.O().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(g1 g1Var, u.p pVar) {
        u.h hVar = this.f4095b;
        hVar.getClass();
        try {
            ((b.b) hVar.f34709a).g1();
        } catch (RemoteException unused) {
        }
        if (g1Var == null) {
            return;
        }
        Integer numE = g1Var.e();
        String strB = g1Var.b();
        if (numE == null || TextUtils.isEmpty(strB)) {
            return;
        }
        if (pVar == null) {
            this.f4094a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4094a.O().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f4094a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4094a.O().a("CustomTabsManager", "Validating session-URL relation: " + numE + " with digital asset link: " + strB);
        }
        int iIntValue = numE.intValue();
        Uri uri = Uri.parse(strB);
        if (iIntValue < 1 || iIntValue > 2) {
            return;
        }
        try {
            ((b.b) pVar.f34721b).U0(pVar.f34722c, iIntValue, uri, new Bundle());
        } catch (RemoteException unused2) {
        }
    }

    private void a(LinkedList linkedList) {
        boolean zIsEmpty;
        boolean zA = false;
        try {
            zA = u.h.a(com.applovin.impl.sdk.k.o(), (String) linkedList.poll(), new a());
            if (!zA) {
                this.f4094a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4094a.O().b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
        } catch (Throwable th2) {
            try {
                this.f4094a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4094a.O().a("CustomTabsManager", "Failed to bind to service", th2);
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
                    this.f4094a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f4094a.O().a("CustomTabsManager", "Retrying with next package name...");
                    }
                    a(linkedList);
                }
            }
        }
        if (zA || linkedList.isEmpty()) {
            return;
        }
        this.f4094a.O();
        if (com.applovin.impl.sdk.o.a()) {
        }
    }

    public u.p a(com.applovin.impl.adview.a aVar) {
        if (this.f4095b == null) {
            this.f4094a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4094a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f4094a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4094a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            u.p pVarC = this.f4095b.c(new b(aVar));
            a(pVarC, aVar.g());
            return pVarC;
        } catch (Exception e2) {
            this.f4094a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4094a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e2);
            }
            return null;
        }
    }

    public u.p a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (this.f4095b == null) {
            this.f4094a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4094a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f4094a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4094a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            u.p pVarC = this.f4095b.c(new c(appLovinNativeAdImpl));
            a(pVarC, appLovinNativeAdImpl);
            return pVarC;
        } catch (Exception e2) {
            this.f4094a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4094a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e2);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list, u.p pVar) {
        this.f4094a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4094a.O().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        boolean zO = false;
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse(str2));
            arrayList.add(bundle);
        }
        Uri uri = Uri.parse(str);
        pVar.getClass();
        try {
            zO = ((b.b) pVar.f34721b).O(pVar.f34722c, uri, new Bundle(), arrayList);
        } catch (RemoteException unused) {
        }
        this.f4094a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4094a.O().a("CustomTabsManager", "Warmup for URLs ".concat(zO ? "succeeded" : "failed"));
        }
    }

    public void a(Uri uri, com.applovin.impl.adview.a aVar, Activity activity) {
        if (aVar.h() == null) {
            this.f4094a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4094a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return;
        }
        if (a("launch uri", new ci.a(this, aVar, activity, uri, 2))) {
            this.f4094a.m0().pauseForClick();
            return;
        }
        this.f4094a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4094a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, Uri uri) {
        a(aVar, activity).a(activity, uri);
    }

    public boolean a(Uri uri, AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        if (appLovinNativeAdImpl.getCustomTabsSession() == null) {
            this.f4094a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4094a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return false;
        }
        boolean zA = a("launch uri", new ci.a(this, appLovinNativeAdImpl, activity, uri, 3));
        if (zA) {
            this.f4094a.m0().pauseForClick();
            return zA;
        }
        this.f4094a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4094a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
        return zA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity, Uri uri) {
        a(appLovinNativeAdImpl, activity).a(activity, uri);
    }

    private void a(u.p pVar, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(bVar.getCustomTabsSettings(), pVar);
    }

    private void a(u.p pVar, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (appLovinNativeAdImpl == null || !appLovinNativeAdImpl.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(appLovinNativeAdImpl.getCustomTabsSettings(), pVar);
    }

    private void a(g1 g1Var, u.p pVar) {
        a("client warmup", new b5.e(this, g1Var, pVar, 5));
    }

    private u.m a(com.applovin.impl.adview.a aVar, Activity activity) {
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        return a(bVarG != null ? bVarG.getCustomTabsSettings() : null, bVarG != null ? bVarG.getCustomTabsHeaders() : Bundle.EMPTY, aVar.h(), activity);
    }

    private u.m a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        return a(appLovinNativeAdImpl.getCustomTabsSettings(), appLovinNativeAdImpl.getCustomTabsHeaders(), appLovinNativeAdImpl.getCustomTabsSession(), activity);
    }

    private u.m a(g1 g1Var, Bundle bundle, u.p pVar, Activity activity) {
        this.f4094a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4094a.O().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        u.l lVar = new u.l(pVar);
        Intent intent = (Intent) lVar.f34714c;
        if (((Boolean) this.f4094a.a(x4.f6043g7)).booleanValue()) {
            lVar.f34716e = ActivityOptions.makeCustomAnimation(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation);
            intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation).toBundle());
        }
        if (g1Var != null) {
            Integer numH = g1Var.h();
            if (numH != null) {
                int iIntValue = numH.intValue() | (-16777216);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", iIntValue);
                lVar.g = bundle2;
            }
            Integer numA = g1Var.a();
            if (numA != null) {
                int iIntValue2 = numA.intValue() | (-16777216);
                if (((SparseArray) lVar.f34717f) == null) {
                    lVar.f34717f = new SparseArray();
                }
                SparseArray sparseArray = (SparseArray) lVar.f34717f;
                Bundle bundle3 = new Bundle();
                bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", iIntValue2);
                sparseArray.put(2, bundle3);
            }
            Boolean boolI = g1Var.i();
            if (boolI != null) {
                intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", boolI.booleanValue());
            }
            Boolean boolG = g1Var.g();
            if (boolG != null) {
                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", boolG.booleanValue() ? 1 : 0);
            }
            Boolean boolC = g1Var.c();
            if (boolC != null) {
                lVar.f34712a = boolC.booleanValue();
            }
            Integer numF = g1Var.f();
            if (numF != null) {
                lVar.c(numF.intValue());
            }
        }
        u.m mVarA = lVar.a();
        Intent intent2 = mVarA.f34718a;
        if (g1Var != null) {
            String strD = g1Var.d();
            if (strD != null) {
                intent2.putExtra("android.intent.extra.REFERRER", Uri.parse(strD));
            }
            if (!bundle.isEmpty()) {
                intent2.putExtra("com.android.browser.headers", bundle);
            }
        }
        return mVarA;
    }

    private void a(Uri uri, Activity activity) {
        if (((Boolean) this.f4094a.a(x4.f6052h7)).booleanValue()) {
            k7.a(uri, activity, this.f4094a);
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", uri));
    }

    private boolean a(String str, Runnable runnable) {
        try {
            this.f4094a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4094a.O().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f4094a.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return true;
            }
            this.f4094a.O().a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th2) {
            this.f4094a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4094a.O().a("CustomTabsManager", "Failed to run operation: " + str, th2);
            }
            this.f4094a.D().a("CustomTabsManager", str, th2);
            return false;
        }
    }
}
