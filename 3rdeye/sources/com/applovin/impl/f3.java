package com.applovin.impl;

import N7.H7;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.C2132m0;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.github.appintro.AppIntroBaseFragmentKt;
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
public class f3 implements C2132m0.e {

    /* renamed from: l, reason: collision with root package name */
    private static WeakReference f19335l;

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicBoolean f19336m = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f19337a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f19338b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f19339c;

    /* renamed from: d, reason: collision with root package name */
    private final e3 f19340d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19343g;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private Map f19345j;

    /* renamed from: k, reason: collision with root package name */
    private final C2106a0 f19346k;

    /* renamed from: e, reason: collision with root package name */
    private final Map f19341e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f19342f = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private int f19344h = 2;

    public class a extends AbstractC2108b {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC2108b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started mediation debugger");
                if (!f3.this.c() || f3.f19335l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = f3.f19335l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(f3.this.f19340d, f3.this.f19337a.e());
                }
                f3.f19336m.set(false);
            }
        }

        @Override // com.applovin.impl.AbstractC2108b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = f3.f19335l = null;
            }
        }
    }

    public f3(com.applovin.impl.sdk.k kVar) {
        this.f19337a = kVar;
        this.f19338b = kVar.O();
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f19339c = contextO;
        e3 e3Var = new e3(contextO);
        this.f19340d = e3Var;
        this.f19346k = new C2106a0(kVar, e3Var);
    }

    private void f() {
        this.f19337a.e().a(new a());
    }

    public boolean g() {
        return this.f19343g;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f19340d + "}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = f19335l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity activityU0 = this.f19337a.u0();
        if (activityU0 == null || activityU0.isFinishing()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(activityU0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.I
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f18810b.a(dialogInterface, i);
                }
            }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    public void e() {
        if (this.f19342f.compareAndSet(false, true)) {
            this.f19337a.q0().a((w4) new k5(this, this.f19337a), r5.b.OTHER);
        }
    }

    public void a(boolean z10, int i) {
        this.f19343g = z10;
        this.f19344h = i;
    }

    public void a(Map map) {
        this.f19345j = map;
        e();
        if (!c() && f19336m.compareAndSet(false, true)) {
            if (!this.i) {
                f();
                this.i = true;
            }
            Intent intent = new Intent(this.f19339c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting mediation debugger...");
            this.f19339c.startActivity(intent);
            return;
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List a(String str) {
        Map map = this.f19345j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f19345j.get(str);
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v2 v2Var = (v2) it.next();
            if (v2Var.A() && v2Var.q() == v2.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new B.b(this, 17), TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        h();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArrayQ = H7.q("networks", jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayQ.length());
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayQ, i, (JSONObject) null);
            if (jSONObject2 != null) {
                v2 v2Var = new v2(jSONObject2, kVar);
                arrayList.add(v2Var);
                this.f19341e.put(v2Var.b(), v2Var);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArrayQ = H7.q("ad_units", jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayQ.length());
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayQ, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C2131m(jSONObject2, this.f19341e, kVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(List list, com.applovin.impl.sdk.k kVar) {
        List<String> adUnitIds = kVar.K() != null ? kVar.K().getAdUnitIds() : null;
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2131m c2131m = (C2131m) it.next();
                if (adUnitIds.contains(c2131m.c())) {
                    arrayList.add(c2131m);
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            C2157z c2157z = new C2157z(str);
            if (c2157z.h()) {
                arrayList.add(c2157z);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f19338b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.C2132m0.e
    public void a(String str, JSONObject jSONObject, int i) {
        List listA = a(jSONObject, this.f19337a);
        List listA2 = a(jSONObject, listA, this.f19337a);
        List listA3 = a(listA2, this.f19337a);
        List listA4 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f19340d.a(listA, listA2, listA3, listA4, JsonUtils.getString(jSONObject2, AppIntroBaseFragmentKt.ARG_TITLE, null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f19337a);
        if (!listA4.isEmpty()) {
            this.f19346k.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new H(this, 2), TimeUnit.SECONDS.toMillis(this.f19344h));
        } else {
            a(listA);
        }
    }

    @Override // com.applovin.impl.C2132m0.e
    public void a(String str, int i, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f19338b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i);
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f19337a.E().a("fetchMediationDebuggerInfo", str, i, str2);
        this.f19340d.a(null, null, null, null, null, null, null, false, this.f19337a);
        this.f19342f.set(false);
    }
}
