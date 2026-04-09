package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.d6;
import com.applovin.impl.e3;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p3 implements q0.e {

    /* renamed from: l, reason: collision with root package name */
    private static WeakReference f7227l;

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicBoolean f7228m = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7229a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f7230b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f7231c;

    /* renamed from: d, reason: collision with root package name */
    private final o3 f7232d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7235g;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7237i;

    /* renamed from: j, reason: collision with root package name */
    private Map f7238j;

    /* renamed from: k, reason: collision with root package name */
    private final b0 f7239k;

    /* renamed from: e, reason: collision with root package name */
    private final Map f7233e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f7234f = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private int f7236h = 2;

    public class a extends b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started mediation debugger");
                if (!p3.this.c() || p3.f7227l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = p3.f7227l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(p3.this.f7232d, p3.this.f7229a.e());
                }
                p3.f7228m.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = p3.f7227l = null;
            }
        }
    }

    public p3(com.applovin.impl.sdk.k kVar) {
        this.f7229a = kVar;
        this.f7230b = kVar.O();
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f7231c = contextO;
        o3 o3Var = new o3(contextO);
        this.f7232d = o3Var;
        this.f7239k = new b0(kVar, o3Var);
    }

    private void f() {
        this.f7229a.e().a(new a());
    }

    public boolean g() {
        return this.f7235g;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f7232d + "}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = f7227l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity activityU0 = this.f7229a.u0();
        if (activityU0 == null || activityU0.isFinishing()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(activityU0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.rd
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f7514a.a(dialogInterface, i10);
                }
            }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    public void e() {
        if (this.f7234f.compareAndSet(false, true)) {
            this.f7229a.q0().a((i5) new w5(this, this.f7229a), d6.b.OTHER);
        }
    }

    public void a(boolean z10, int i10) {
        this.f7235g = z10;
        this.f7236h = i10;
    }

    public void a(Map map) {
        this.f7238j = map;
        e();
        if (!c() && f7228m.compareAndSet(false, true)) {
            if (!this.f7237i) {
                f();
                this.f7237i = true;
            }
            Intent intent = new Intent(this.f7231c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting mediation debugger...");
            this.f7231c.startActivity(intent);
            return;
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List a(String str) {
        Map map = this.f7238j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f7238j.get(str);
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (e3Var.z() && e3Var.q() == e3.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sd
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7578a.d();
                    }
                }, TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i10) {
        h();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                e3 e3Var = new e3(jSONObject2, kVar);
                arrayList.add(e3Var);
                this.f7233e.put(e3Var.b(), e3Var);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new n(jSONObject2, this.f7233e, kVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(List list, com.applovin.impl.sdk.k kVar) {
        List<String> adUnitIds = kVar.J() != null ? kVar.J().getAdUnitIds() : null;
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (adUnitIds.contains(nVar.c())) {
                    arrayList.add(nVar);
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            a0 a0Var = new a0(str);
            if (a0Var.h()) {
                arrayList.add(a0Var);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f7230b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, JSONObject jSONObject, int i10) {
        List listA = a(jSONObject, this.f7229a);
        List listA2 = a(jSONObject, listA, this.f7229a);
        List listA3 = a(listA2, this.f7229a);
        List listA4 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f7232d.a(listA, listA2, listA3, listA4, JsonUtils.getString(jSONObject2, CampaignEx.JSON_KEY_TITLE, null), JsonUtils.getString(jSONObject2, PglCryptUtils.KEY_MESSAGE, null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f7229a);
        if (!listA4.isEmpty()) {
            this.f7239k.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.qd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7406a.h();
                }
            }, TimeUnit.SECONDS.toMillis(this.f7236h));
        } else {
            a(listA);
        }
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, int i10, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7230b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i10);
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f7229a.D().a("fetchMediationDebuggerInfo", str, i10, str2);
        this.f7232d.a(null, null, null, null, null, null, null, false, this.f7229a);
        this.f7234f.set(false);
    }
}
