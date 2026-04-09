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
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import s.C5537a;
import s.g;
import z0.C5848a;

/* renamed from: com.applovin.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2107a1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f18920a;

    /* renamed from: b, reason: collision with root package name */
    private s.f f18921b;

    /* renamed from: com.applovin.impl.a1$a */
    public class a extends s.h {
        public a() {
        }

        @Override // s.h
        public void onCustomTabsServiceConnected(ComponentName componentName, s.f fVar) {
            C2107a1.this.f18920a.O();
            if (com.applovin.impl.sdk.o.a()) {
                C2107a1.this.f18920a.O().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            C2107a1.this.f18921b = fVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C2107a1.this.f18920a.O();
            if (com.applovin.impl.sdk.o.a()) {
                C2107a1.this.f18920a.O().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            C2107a1.this.f18921b = null;
        }
    }

    /* renamed from: com.applovin.impl.a1$b */
    public class b extends C5537a {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f18923a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f18923a = new WeakReference(aVar);
        }

        @Override // s.C5537a
        public void onNavigationEvent(int i, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.f18923a.get();
            if (aVar == null) {
                C2107a1.this.f18920a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    C2107a1.this.f18920a.O().b("CustomTabsManager", "Unable to track navigation event (" + i + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b bVarG = aVar.g();
            if (bVarG == null) {
                C2107a1.this.f18920a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    C2107a1.this.f18920a.O().b("CustomTabsManager", "Unable to track navigation event (" + i + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (bVarG.X0()) {
                        C2107a1.this.f18920a.k().trackCustomTabsNavigationStarted(bVarG);
                        break;
                    }
                    break;
                case 2:
                    if (bVarG.X0()) {
                        C2107a1.this.f18920a.k().trackCustomTabsNavigationFinished(bVarG);
                        break;
                    }
                    break;
                case 3:
                    if (bVarG.X0()) {
                        C2107a1.this.f18920a.k().trackCustomTabsNavigationFailed(bVarG);
                        break;
                    }
                    break;
                case 4:
                    if (bVarG.X0()) {
                        C2107a1.this.f18920a.k().trackCustomTabsNavigationAborted(bVarG);
                        break;
                    }
                    break;
                case 5:
                    if (bVarG.X0()) {
                        C2107a1.this.f18920a.k().trackCustomTabsTabShown(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    l2.c(aVar.e(), bVarG, aVar.i());
                    break;
                case 6:
                    if (bVarG.X0()) {
                        C2107a1.this.f18920a.k().trackCustomTabsTabHidden(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    l2.a(aVar.e(), bVarG, aVar.i());
                    break;
                default:
                    C2107a1.this.f18920a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        C2107a1.this.f18920a.O().a("CustomTabsManager", "Unknown navigation event: " + i);
                        break;
                    }
                    break;
            }
        }

        @Override // s.C5537a
        public void onRelationshipValidationResult(int i, Uri uri, boolean z10, Bundle bundle) {
            C2107a1.this.f18920a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = C2107a1.this.f18920a.O();
                StringBuilder sb = new StringBuilder("Validation ");
                sb.append(z10 ? "succeeded" : "failed");
                sb.append(" for session-URL relation(");
                sb.append(i);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                oVarO.a("CustomTabsManager", sb.toString());
            }
        }
    }

    public C2107a1(com.applovin.impl.sdk.k kVar) {
        this.f18920a = kVar;
    }

    public void b(List list, s.i iVar) {
        if (list.isEmpty()) {
            return;
        }
        if (iVar != null) {
            a("warmup urls", new J4.h(this, list, iVar, 5));
            return;
        }
        this.f18920a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f18920a.O().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }

    public void a() {
        if (((Boolean) this.f18920a.a(l4.f20057w6)).booleanValue() && this.f18921b == null) {
            String strB = s.f.b(com.applovin.impl.sdk.k.o(), this.f18920a.c(l4.f20065x6), true);
            String strB2 = s.f.b(com.applovin.impl.sdk.k.o(), null, false);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f18920a.a(l4.f20073y6)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(strB2, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strB, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(strB, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strB2, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f18920a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f18920a.O().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    private void a(LinkedList linkedList) {
        boolean zIsEmpty;
        boolean zA = false;
        try {
            zA = s.f.a(com.applovin.impl.sdk.k.o(), (String) linkedList.poll(), new a());
            if (!zA) {
                this.f18920a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f18920a.O().b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
        } catch (Throwable th) {
            try {
                this.f18920a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f18920a.O().a("CustomTabsManager", "Failed to bind to service", th);
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
                    this.f18920a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f18920a.O().a("CustomTabsManager", "Retrying with next package name...");
                    }
                    a(linkedList);
                }
            }
        }
        if (zA || linkedList.isEmpty()) {
            return;
        }
        this.f18920a.O();
        if (com.applovin.impl.sdk.o.a()) {
        }
    }

    public s.i a(com.applovin.impl.adview.a aVar) {
        if (this.f18921b == null) {
            this.f18920a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f18920a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f18920a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f18920a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            s.i iVarC = this.f18921b.c(new b(aVar));
            a(iVarC, aVar.g());
            return iVarC;
        } catch (Exception e4) {
            this.f18920a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f18920a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e4);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list, s.i iVar) {
        this.f18920a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f18920a.O().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        boolean zQ = false;
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
        iVar.getClass();
        try {
            zQ = iVar.f45895b.q(iVar.f45896c, uri, new Bundle(), arrayList);
        } catch (RemoteException unused) {
        }
        this.f18920a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f18920a.O().a("CustomTabsManager", "Warmup for URLs ".concat(zQ ? "succeeded" : "failed"));
        }
    }

    public void a(String str, com.applovin.impl.adview.a aVar, Activity activity) {
        if (a("launch url", new T1.p(this, aVar, activity, str, 1))) {
            this.f18920a.m0().pauseForClick();
        } else {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map(ImagesContract.URL, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.adview.a aVar, Activity activity, String str) {
        s.g gVarA = a(aVar, activity);
        Uri uri = Uri.parse(str);
        Intent intent = gVarA.f45885a;
        intent.setData(uri);
        C5848a.startActivity(activity, intent, gVarA.f45886b);
    }

    private void a(s.i iVar, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.H0()) {
            return;
        }
        a("client warmup", new Z.e(this, bVar, iVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, s.i iVar) {
        s.f fVar = this.f18921b;
        fVar.getClass();
        try {
            fVar.f45883a.r();
        } catch (RemoteException unused) {
        }
        C2110b1 c2110b1A = bVar.A();
        if (c2110b1A == null) {
            return;
        }
        Integer numE = c2110b1A.e();
        String strB = c2110b1A.b();
        if (numE == null || TextUtils.isEmpty(strB)) {
            return;
        }
        if (iVar == null) {
            this.f18920a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f18920a.O().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f18920a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f18920a.O().a("CustomTabsManager", "Validating session-URL relation: " + numE + " with digital asset link: " + strB);
        }
        int iIntValue = numE.intValue();
        Uri uri = Uri.parse(strB);
        if (iIntValue < 1 || iIntValue > 2) {
            return;
        }
        try {
            iVar.f45895b.l(iVar.f45896c, iIntValue, uri, new Bundle());
        } catch (RemoteException unused2) {
        }
    }

    private s.g a(com.applovin.impl.adview.a aVar, Activity activity) {
        this.f18920a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f18920a.O().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        g.d dVar = new g.d(aVar.h());
        C2110b1 c2110b1A = bVarG != null ? bVarG.A() : null;
        boolean zBooleanValue = ((Boolean) this.f18920a.a(l4.f20081z6)).booleanValue();
        Intent intent = dVar.f45887a;
        if (zBooleanValue) {
            int i = R.anim.applovin_slide_up_animation;
            int i10 = R.anim.applovin_slide_down_animation;
            dVar.f45889c = ActivityOptions.makeCustomAnimation(activity, i, i10);
            intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(activity, i, i10).toBundle());
        }
        if (c2110b1A != null) {
            Integer numH = c2110b1A.h();
            if (numH != null) {
                int iIntValue = numH.intValue() | (-16777216);
                Bundle bundle = new Bundle();
                bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", iIntValue);
                dVar.f45891e = bundle;
            }
            Integer numA = c2110b1A.a();
            if (numA != null) {
                int iIntValue2 = numA.intValue() | (-16777216);
                if (dVar.f45890d == null) {
                    dVar.f45890d = new SparseArray<>();
                }
                SparseArray<Bundle> sparseArray = dVar.f45890d;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", iIntValue2);
                sparseArray.put(2, bundle2);
            }
            Boolean boolI = c2110b1A.i();
            if (boolI != null) {
                intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", boolI.booleanValue());
            }
            Boolean boolG = c2110b1A.g();
            if (boolG != null) {
                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", boolG.booleanValue() ? 1 : 0);
            }
            Boolean boolC = c2110b1A.c();
            if (boolC != null) {
                dVar.f45893g = boolC.booleanValue();
            }
            Integer numF = c2110b1A.f();
            if (numF != null) {
                int iIntValue3 = numF.intValue();
                if (iIntValue3 >= 0 && iIntValue3 <= 2) {
                    dVar.f45892f = iIntValue3;
                    if (iIntValue3 == 1) {
                        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                    } else if (iIntValue3 == 2) {
                        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                    } else {
                        intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
                    }
                } else {
                    throw new IllegalArgumentException("Invalid value for the shareState argument");
                }
            }
        }
        s.g gVarA = dVar.a();
        if (c2110b1A != null) {
            String strD = c2110b1A.d();
            Intent intent2 = gVarA.f45885a;
            if (strD != null) {
                intent2.putExtra("android.intent.extra.REFERRER", Uri.parse(strD));
            }
            Bundle bundleV = bVarG.v();
            if (!bundleV.isEmpty()) {
                intent2.putExtra("com.android.browser.headers", bundleV);
            }
        }
        return gVarA;
    }

    private boolean a(String str, Runnable runnable) {
        try {
            this.f18920a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f18920a.O().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f18920a.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return true;
            }
            this.f18920a.O().a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th) {
            this.f18920a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f18920a.O().a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f18920a.E().a("CustomTabsManager", str, th);
            return false;
        }
    }
}
