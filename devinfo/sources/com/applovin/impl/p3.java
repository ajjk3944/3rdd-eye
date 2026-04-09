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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class p3 implements q0.e {

    /* renamed from: l, reason: collision with root package name */
    private static WeakReference f5049l;

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicBoolean f5050m = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5051a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f5052b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f5053c;

    /* renamed from: d, reason: collision with root package name */
    private final o3 f5054d;
    private boolean g;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5058i;
    private Map j;

    /* renamed from: k, reason: collision with root package name */
    private final b0 f5059k;

    /* renamed from: e, reason: collision with root package name */
    private final Map f5055e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f5056f = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private int f5057h = 2;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started mediation debugger");
                if (!p3.this.c() || p3.f5049l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = p3.f5049l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(p3.this.f5054d, p3.this.f5051a.e());
                }
                p3.f5050m.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = p3.f5049l = null;
            }
        }
    }

    public p3(com.applovin.impl.sdk.k kVar) {
        this.f5051a = kVar;
        this.f5052b = kVar.O();
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f5053c = contextO;
        o3 o3Var = new o3(contextO);
        this.f5054d = o3Var;
        this.f5059k = new b0(kVar, o3Var);
    }

    private void f() {
        this.f5051a.e().a(new a());
    }

    public boolean g() {
        return this.g;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f5054d + "}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = f5049l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity activityU0 = this.f5051a.u0();
        if (activityU0 == null || activityU0.isFinishing()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(activityU0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new aa(0, this)).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    public void e() {
        if (this.f5056f.compareAndSet(false, true)) {
            this.f5051a.q0().a((i5) new w5(this, this.f5051a), d6.b.OTHER);
        }
    }

    public void a(boolean z3, int i4) {
        this.g = z3;
        this.f5057h = i4;
    }

    public void a(Map map) {
        this.j = map;
        e();
        if (!c() && f5050m.compareAndSet(false, true)) {
            if (!this.f5058i) {
                f();
                this.f5058i = true;
            }
            Intent intent = new Intent(this.f5053c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting mediation debugger...");
            this.f5053c.startActivity(intent);
            return;
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List a(String str) {
        Map map = this.j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.j.get(str);
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (e3Var.z() && e3Var.q() == e3.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new z9(this, 1), TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i4) {
        h();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArrayS = a0.g.s("networks", jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayS.length());
        for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayS, i4, (JSONObject) null);
            if (jSONObject2 != null) {
                e3 e3Var = new e3(jSONObject2, kVar);
                arrayList.add(e3Var);
                this.f5055e.put(e3Var.b(), e3Var);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArrayS = a0.g.s("ad_units", jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayS.length());
        for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayS, i4, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new n(jSONObject2, this.f5055e, kVar));
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
                this.f5052b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, JSONObject jSONObject, int i4) {
        List listA = a(jSONObject, this.f5051a);
        List listA2 = a(jSONObject, listA, this.f5051a);
        List listA3 = a(listA2, this.f5051a);
        List listA4 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f5054d.a(listA, listA2, listA3, listA4, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, PglCryptUtils.KEY_MESSAGE, null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f5051a);
        if (!listA4.isEmpty()) {
            this.f5059k.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new z9(this, 0), TimeUnit.SECONDS.toMillis(this.f5057h));
        } else {
            a(listA);
        }
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, int i4, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5052b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i4);
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f5051a.D().a("fetchMediationDebuggerInfo", str, i4, str2);
        this.f5054d.a(null, null, null, null, null, null, null, false, this.f5051a);
        this.f5056f.set(false);
    }
}
