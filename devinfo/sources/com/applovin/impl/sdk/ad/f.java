package com.applovin.impl.sdk.ad;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.f1;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.Purchase;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.google.ads.mediation.applovin.n;
import com.google.android.gms.internal.consent_sdk.a0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.analyzer.StorageAnalyzeActivity;
import com.liuzh.deviceinfo.location.RealtimeSatelliteActivity;
import com.liuzh.deviceinfo.settings.SettingsActivity;
import com.liuzho.lib.appinfo.NewInstalledAppAnalyzeActivity;
import e4.c2;
import e4.s;
import e4.v0;
import ec.r1;
import h3.i;
import j0.x0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import la.h;
import lf.l;
import nk.k;
import org.json.JSONObject;
import pf.u;
import sh.c1;
import sh.n0;
import t6.o;
import t6.p;
import ti.m;
import u0.z1;
import ui.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements s.a, com.google.ads.mediation.applovin.e, f.b, cf.a, s, z1, de.d, ma.b, la.f, SuccessContinuation, Continuation, ConsentInformation.OnConsentInfoUpdateFailureListener, i, m, zg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5447c;

    public /* synthetic */ f(int i4, Object obj, Object obj2) {
        this.f5445a = i4;
        this.f5446b = obj;
        this.f5447c = obj2;
    }

    private final Object g(Task task) {
        lf.g gVar = (lf.g) this.f5446b;
        Date date = (Date) this.f5447c;
        if (task.isSuccessful()) {
            l lVar = gVar.g;
            synchronized (lVar.f28798b) {
                lVar.f28797a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return task;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return task;
        }
        if (exception instanceof kf.e) {
            gVar.g.i();
            return task;
        }
        gVar.g.h();
        return task;
    }

    @Override // u0.z1
    public boolean a() {
        x0 x0Var = (x0) this.f5446b;
        j0.b bVar = (j0.b) this.f5447c;
        if (!x0Var.f27022q) {
            x0Var.j();
            bVar.f26862a = j0.b.a(x0Var.f27020o, bVar.f26862a);
            x0Var.f27022q = !x0Var.i(x0Var.f27019n, r2 + bVar.f26863b);
        }
        return x0Var.f27022q;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:22:0x008b, B:24:0x0091, B:26:0x00a1, B:27:0x00ad), top: B:46:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    @Override // s.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.ad.f.apply(java.lang.Object):java.lang.Object");
    }

    @Override // ti.m
    public void b(Uri uri) {
        y yVar = (y) this.f5446b;
        new Thread(new r1(yVar.f35488l, (com.liuzho.lib.appinfo.a) this.f5447c, yVar.f35489m, uri)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    @Override // de.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(androidx.lifecycle.f1 r5) {
        /*
            r4 = this;
            int r0 = r4.f5445a
            switch(r0) {
                case 7: goto L1f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f5446b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.f5447c
            de.a r1 = (de.a) r1
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1a
            de.d r0 = r1.f22194f     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r5 = r0.c(r5)     // Catch: java.lang.Throwable -> L1a
            android.os.Trace.endSection()
            return r5
        L1a:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
        L1f:
            java.lang.Object r0 = r4.f5446b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.f5447c
            pf.u r1 = (pf.u) r1
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Object r5 = r5.a(r2)
            android.content.Context r5 = (android.content.Context) r5
            int r1 = r1.f31903a
            switch(r1) {
                case 26: goto L91;
                case 27: goto L8c;
                case 28: goto L4a;
                default: goto L34;
            }
        L34:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r5 = r1.getInstallerPackageName(r5)
            if (r5 == 0) goto L47
            java.lang.String r5 = com.google.firebase.FirebaseCommonRegistrar.b(r5)
            goto L9d
        L47:
            java.lang.String r5 = ""
            goto L9d
        L4a:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.television"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L5b
            java.lang.String r5 = "tv"
            goto L9d
        L5b:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.watch"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L6a
            java.lang.String r5 = "watch"
            goto L9d
        L6a:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.automotive"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L79
            java.lang.String r5 = "auto"
            goto L9d
        L79:
            r2 = 26
            if (r1 < r2) goto L47
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r1 = "android.hardware.type.embedded"
            boolean r5 = r5.hasSystemFeature(r1)
            if (r5 == 0) goto L47
            java.lang.String r5 = "embedded"
            goto L9d
        L8c:
            java.lang.String r5 = com.google.firebase.FirebaseCommonRegistrar.a(r5)
            goto L9d
        L91:
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            if (r5 == 0) goto L47
            int r5 = r5.targetSdkVersion
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L9d:
            jf.a r1 = new jf.a
            r1.<init>(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.ad.f.c(androidx.lifecycle.f1):java.lang.Object");
    }

    @Override // cf.a
    public void d(cf.b bVar) {
        cf.a aVar = (cf.a) this.f5446b;
        cf.a aVar2 = (cf.a) this.f5447c;
        aVar.d(bVar);
        aVar2.d(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r3.b.V(r0, new java.lang.String[]{"android.permission.POST_NOTIFICATIONS"}[0]) != false) goto L10;
     */
    @Override // zg.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5446b
            i.g r0 = (i.g) r0
            java.lang.Object r1 = r7.f5447c
            f.d r1 = (f.d) r1
            boolean r2 = wi.h.f36762h
            if (r2 != 0) goto Ld
            goto L33
        Ld:
            android.content.SharedPreferences r2 = com.liuzh.deviceinfo.utilities.f.f21257c
            java.lang.String r3 = "already_request_post_notification_permission"
            r4 = 0
            boolean r2 = r2.getBoolean(r3, r4)
            java.lang.String r5 = "android.permission.POST_NOTIFICATIONS"
            if (r2 != 0) goto L1b
            goto L29
        L1b:
            java.lang.String[] r2 = new java.lang.String[]{r5}
            x.n0 r6 = wi.i.f36764a
            r2 = r2[r4]
            boolean r2 = r3.b.V(r0, r2)
            if (r2 == 0) goto L33
        L29:
            com.liuzh.deviceinfo.utilities.f r0 = com.liuzh.deviceinfo.utilities.f.f21256b
            r0 = 1
            com.liuzh.deviceinfo.utilities.f.k(r3, r0)
            r1.a(r5)
            return
        L33:
            zg.c.h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.ad.f.e():void");
    }

    @Override // ma.b
    public Object execute() {
        switch (this.f5445a) {
            case 8:
                com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f5446b;
                Iterable iterable = (Iterable) this.f5447c;
                h hVar = (h) ((la.d) dVar.f19297c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.c().compileStatement("DELETE FROM events WHERE _id in " + h.w(iterable)).execute();
                    break;
                }
                break;
            default:
                com.google.android.gms.internal.consent_sdk.d dVar2 = (com.google.android.gms.internal.consent_sdk.d) this.f5446b;
                for (Map.Entry entry : ((HashMap) this.f5447c).entrySet()) {
                    ((h) ((la.c) dVar2.f19302i)).p(((Integer) entry.getValue()).intValue(), ha.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    public void f(t7.c cVar, List list) {
        f1 f1Var = (f1) this.f5446b;
        Handler handler = (Handler) f1Var.f1135c;
        final yb.i iVar = (yb.i) this.f5447c;
        k.e(cVar, "billingResult");
        k.e(list, "list");
        if (cVar.f34435a != 0) {
            final int i4 = 0;
            handler.post(new Runnable() { // from class: ri.b
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            iVar.c();
                            break;
                        default:
                            iVar.h(zj.s.f38317a);
                            break;
                    }
                }
            });
            return;
        }
        if (list.isEmpty()) {
            final int i10 = 1;
            handler.post(new Runnable() { // from class: ri.b
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            iVar.c();
                            break;
                        default:
                            iVar.h(zj.s.f38317a);
                            break;
                    }
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            JSONObject jSONObject = purchase.f3001c;
            JSONObject jSONObject2 = purchase.f3001c;
            if (jSONObject.optInt("purchaseState", 1) != 4) {
                if (!jSONObject2.optBoolean("acknowledged", true)) {
                    String strB = purchase.b();
                    if (strB == null) {
                        throw new IllegalArgumentException("Purchase token must be set");
                    }
                    km.i iVar2 = new km.i(19, false);
                    iVar2.f28426b = strB;
                    ((t7.a) f1Var.f1134b).a(iVar2, new u(12));
                }
                ArrayList arrayListA = purchase.a();
                int size = arrayListA.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayListA.get(i11);
                    i11++;
                    String str = (String) obj;
                    k.b(str);
                    String strB2 = purchase.b();
                    k.d(strB2, "getPurchaseToken(...)");
                    arrayList.add(new si.c(str, strB2, jSONObject2.optBoolean("autoRenewing")));
                }
            }
        }
        handler.post(new k1.b(13, iVar, arrayList));
    }

    @Override // h3.i
    public Object i(h3.h hVar) {
        Executor executor = (Executor) this.f5446b;
        mk.a aVar = (mk.a) this.f5447c;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        o oVar = new o(atomicBoolean, 1);
        h3.m mVar = hVar.f24835c;
        if (mVar != null) {
            mVar.a(oVar, t6.k.f34375a);
        }
        executor.execute(new p(atomicBoolean, hVar, aVar, 1));
        return yj.u.f37649a;
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) throws Resources.NotFoundException {
        int i4 = this.f5445a;
        Object obj = this.f5447c;
        Object obj2 = this.f5446b;
        switch (i4) {
            case 4:
                Toolbar toolbar = (Toolbar) obj;
                int i10 = StorageAnalyzeActivity.C;
                zh.i.a(toolbar, nh.a.x(c2Var));
                ((StorageAnalyzeActivity) obj2).findViewById(R.id.content_container).setPadding(0, toolbar.getLayoutParams().height, 0, 0);
                return v0.j(view, c2Var);
            case 5:
                ej.i iVar = (ej.i) obj2;
                k.e(view, "v");
                iVar.f23511g0 = c2Var;
                v3.b bVarX = nh.a.x(c2Var);
                RecyclerView recyclerView = (RecyclerView) iVar.d0().g;
                Context context = ((View) obj).getContext();
                k.d(context, "getContext(...)");
                int iN = cm.g.n(R.attr.analyzer_content_padding_half, context);
                int i11 = bVarX.f35796d;
                int i12 = bVarX.f35795c;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), i12, iN + i11);
                TextView textView = (TextView) iVar.d0().f36148d;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (i11 * 2) + pd.b.j(60);
                textView.setLayoutParams(marginLayoutParams);
                nj.b bVar = iVar.f23506b0;
                if (bVar != null) {
                    bVar.a(c2Var);
                }
                RecyclerView recyclerView2 = (RecyclerView) iVar.d0().g;
                recyclerView2.setPadding(bVarX.f35793a, recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), recyclerView2.getPaddingBottom());
                return v0.j(view, c2Var);
            case 17:
                v3.b bVarX2 = nh.a.x(c2Var);
                int i13 = bVarX2.f35793a;
                int i14 = bVarX2.f35795c;
                int i15 = bVarX2.f35796d;
                ((ScrollView) obj2).setPadding(i13, 0, i14, i15);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ((View) obj).findViewById(R.id.fullscreen).getLayoutParams();
                int iB = a4.a.b(26.0f);
                marginLayoutParams2.setMargins(i13 + iB, 0, i14 + iB, iB + i15);
                return v0.j(view, c2Var);
            case 18:
                n0 n0Var = (n0) obj2;
                View view2 = (View) obj;
                v3.b bVarX3 = nh.a.x(c2Var);
                view2.setPadding(bVarX3.f35793a, view2.getPaddingTop(), bVarX3.f35795c, 0);
                int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.content_padding_half);
                RecyclerView recyclerView3 = n0Var.f33739a0;
                recyclerView3.setPadding(recyclerView3.getPaddingLeft(), n0Var.f33739a0.getPaddingTop(), n0Var.f33739a0.getPaddingRight(), dimensionPixelSize + bVarX3.f35796d);
                return v0.j(view, c2Var);
            case 19:
                c1 c1Var = (c1) obj2;
                v3.b bVarX4 = nh.a.x(c2Var);
                ((View) obj).setPadding(bVarX4.f35793a, 0, bVarX4.f35795c, 0);
                int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(R.dimen.content_padding_half);
                RecyclerView recyclerView4 = c1Var.Z;
                recyclerView4.setPadding(recyclerView4.getPaddingLeft(), c1Var.Z.getPaddingTop(), c1Var.Z.getPaddingRight(), dimensionPixelSize2 + bVarX4.f35796d);
                return v0.j(view, c2Var);
            case 22:
                View view3 = (View) obj2;
                k.e(view, "v");
                v3.b bVarX5 = nh.a.x(c2Var);
                view3.setPadding(bVarX5.f35793a, view3.getPaddingTop(), bVarX5.f35795c, 0);
                int dimensionPixelSize3 = view.getContext().getResources().getDimensionPixelSize(R.dimen.content_padding_half);
                a0 a0Var = ((th.f) obj).Z;
                if (a0Var == null) {
                    k.k("binding");
                    throw null;
                }
                RecyclerView recyclerView5 = (RecyclerView) a0Var.f19260h;
                recyclerView5.setPadding(recyclerView5.getPaddingLeft(), recyclerView5.getPaddingTop(), recyclerView5.getPaddingRight(), dimensionPixelSize3 + bVarX5.f35796d);
                return v0.j(view, c2Var);
            case 23:
                NewInstalledAppAnalyzeActivity newInstalledAppAnalyzeActivity = (NewInstalledAppAnalyzeActivity) obj2;
                Toolbar toolbar2 = (Toolbar) obj;
                int i16 = NewInstalledAppAnalyzeActivity.F;
                v3.b bVarX6 = nh.a.x(c2Var);
                ViewGroup.LayoutParams layoutParams2 = toolbar2.getLayoutParams();
                int iN2 = cm.g.n(R.attr.actionBarSize, newInstalledAppAnalyzeActivity);
                int i17 = bVarX6.f35794b;
                layoutParams2.height = iN2 + i17;
                toolbar2.setLayoutParams(layoutParams2);
                int i18 = bVarX6.f35793a;
                int i19 = bVarX6.f35795c;
                toolbar2.setPadding(i18, i17, i19, 0);
                newInstalledAppAnalyzeActivity.findViewById(R.id.scrollview).setPadding(i18, toolbar2.getLayoutParams().height, i19, bVarX6.f35796d);
                return v0.j(view, c2Var);
            default:
                Toolbar toolbar3 = (Toolbar) obj2;
                View view4 = (View) obj;
                int i20 = RealtimeSatelliteActivity.S;
                v3.b bVarX7 = nh.a.x(c2Var);
                int i21 = bVarX7.f35795c;
                int i22 = bVarX7.f35793a;
                int i23 = bVarX7.f35796d;
                zh.i.a(toolbar3, bVarX7);
                ScrollView scrollView = (ScrollView) view4.findViewById(R.id.scrollview);
                if (scrollView != null) {
                    scrollView.setPadding(i22, toolbar3.getLayoutParams().height, i21, i23);
                }
                View viewFindViewById = view4.findViewById(R.id.btm_ad_container);
                if (viewFindViewById != null) {
                    viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), i23);
                }
                View viewFindViewById2 = view4.findViewById(R.id.content_container_land);
                if (viewFindViewById2 != null) {
                    int dimensionPixelSize4 = toolbar3.getContext().getResources().getDimensionPixelSize(R.dimen.content_padding);
                    viewFindViewById2.setPadding(i22 + dimensionPixelSize4, dimensionPixelSize4, i21 + dimensionPixelSize4, i23 + dimensionPixelSize4);
                }
                return v0.j(view, c2Var);
        }
    }

    @Override // f.b
    public void k(Object obj) {
        com.liuzh.deviceinfo.utilities.g gVar = (com.liuzh.deviceinfo.utilities.g) this.f5446b;
        SettingsActivity settingsActivity = (SettingsActivity) this.f5447c;
        Uri uri = (Uri) obj;
        if (uri == null) {
            return;
        }
        String str = gVar.f21260b;
        rg.c cVarB = rg.c.f32943p0.B(settingsActivity, null);
        cVarB.f0(false);
        bi.d.c(new ci.a(14, uri, settingsActivity, cVarB, str));
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public void onConsentInfoUpdateFailure(FormError formError) {
        mg.c cVar = (mg.c) this.f5446b;
        mg.a aVar = (mg.a) this.f5447c;
        k.e(formError, "err");
        formError.getErrorCode();
        formError.getMessage();
        cVar.f29371a.canRequestAds();
        a.a.q();
        formError.getErrorCode();
        formError.getMessage();
        aVar.q();
    }

    @Override // com.google.ads.mediation.applovin.e
    public void onInitializeSuccess() {
        n nVar = (n) this.f5446b;
        String str = (String) this.f5447c;
        nVar.f8986b.getClass();
        MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(str);
        nVar.f8987c = maxAppOpenAd;
        maxAppOpenAd.setListener(nVar);
        MaxAppOpenAd maxAppOpenAd2 = nVar.f8987c;
        if (maxAppOpenAd2 != null) {
            maxAppOpenAd2.loadAd();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        lf.b bVar = (lf.b) this.f5446b;
        lf.c cVar = (lf.c) this.f5447c;
        synchronized (bVar) {
            bVar.f28744c = Tasks.forResult(cVar);
        }
        return Tasks.forResult(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5 A[Catch: all -> 0x0055, TryCatch #3 {all -> 0x0055, blocks: (B:11:0x003c, B:14:0x0041, B:15:0x0042, B:23:0x005d, B:56:0x00d1, B:58:0x00d5, B:59:0x00d9), top: B:102:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #3 {all -> 0x0055, blocks: (B:11:0x003c, B:14:0x0041, B:15:0x0042, B:23:0x005d, B:56:0x00d1, B:58:0x00d5, B:59:0x00d9), top: B:102:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v3, types: [lf.j] */
    @Override // com.google.android.gms.tasks.Continuation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object then(com.google.android.gms.tasks.Task r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.ad.f.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
