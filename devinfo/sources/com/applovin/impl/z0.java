package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u0;
import com.applovin.impl.v0;
import com.applovin.impl.x0;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6268a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6269b;

    /* renamed from: d, reason: collision with root package name */
    private List f6271d;

    /* renamed from: e, reason: collision with root package name */
    private String f6272e;

    /* renamed from: f, reason: collision with root package name */
    private v0 f6273f;
    private u0.c g;

    /* renamed from: h, reason: collision with root package name */
    private v0 f6274h;

    /* renamed from: i, reason: collision with root package name */
    private Dialog f6275i;
    private long j;

    /* renamed from: k, reason: collision with root package name */
    private long f6276k;

    /* renamed from: l, reason: collision with root package name */
    private long f6277l;

    /* renamed from: c, reason: collision with root package name */
    private final t0 f6270c = new t0();

    /* renamed from: m, reason: collision with root package name */
    private u0.b f6278m = new u0.b();

    /* renamed from: n, reason: collision with root package name */
    private final com.applovin.impl.b f6279n = new a();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || z0.this.f6274h == null) {
                return;
            }
            if (z0.this.f6275i != null) {
                z0 z0Var = z0.this;
                if (!com.applovin.impl.d.d(z0Var.a(z0Var.f6275i))) {
                    z0.this.f6275i.dismiss();
                }
                z0.this.f6275i = null;
            }
            v0 v0Var = z0.this.f6274h;
            z0.this.f6274h = null;
            z0 z0Var2 = z0.this;
            z0Var2.a(z0Var2.f6273f, v0Var, activity);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6281a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x0 f6282b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v0 f6283c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f6284d;

        public b(boolean z3, x0 x0Var, v0 v0Var, Activity activity) {
            this.f6281a = z3;
            this.f6282b = x0Var;
            this.f6283c = v0Var;
            this.f6284d = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            z0.this.f6274h = null;
            z0.this.f6275i = null;
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - z0.this.f6277l));
            CollectionUtils.putStringIfValid("details", String.valueOf(this.f6281a), mapHashMap);
            z0.this.f6268a.v0().d(d2.f3899p, mapHashMap);
            v0 v0VarA = z0.this.a(this.f6282b.a());
            if (v0VarA == null) {
                z0.this.a("Destination state for TOS/PP alert is null");
                return;
            }
            z0.this.a(this.f6283c, v0VarA, this.f6284d);
            if (v0VarA.d() != v0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class c extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f6286a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f6287b;

        public c(Uri uri, Activity activity) {
            this.f6286a = uri;
            this.f6287b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.f6286a, this.f6287b, z0.this.f6268a);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class d extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f6289a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f6290b;

        public d(Uri uri, Activity activity) {
            this.f6289a = uri;
            this.f6290b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.f6289a, this.f6290b, z0.this.f6268a);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class e implements CmpServiceImpl.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6292a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f6293b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f6294c;

        public e(long j, v0 v0Var, Activity activity) {
            this.f6292a = j;
            this.f6293b = v0Var;
            this.f6294c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.f6278m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f6292a);
            z0.this.a(this.f6293b, this.f6294c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class f implements CmpServiceImpl.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6296a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f6297b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f6298c;

        public f(long j, v0 v0Var, Activity activity) {
            this.f6296a = j;
            this.f6297b = v0Var;
            this.f6298c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.f6278m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f6296a);
            z0.this.a(this.f6297b, this.f6298c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class g implements CmpServiceImpl.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6300a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f6301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f6302c;

        public g(long j, v0 v0Var, Activity activity) {
            this.f6300a = j;
            this.f6301b = v0Var;
            this.f6302c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f6300a));
            if (appLovinCmpError != null) {
                z0.this.f6278m.a(appLovinCmpError);
                mapHashMap.putAll(z0.this.a(appLovinCmpError));
                z0.this.f6268a.v0().d(d2.f3909u, mapHashMap);
            } else {
                z0.this.f6278m.c();
                z0.this.f6268a.v0().d(d2.f3911v, mapHashMap);
            }
            z0.this.b(this.f6301b, this.f6302c);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v0 f6304a;

        public h(v0 v0Var) {
            this.f6304a = v0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z0 z0Var = z0.this;
            z0Var.a(z0Var.f6273f, this.f6304a, z0.this.f6268a.u0());
        }
    }

    public z0(com.applovin.impl.sdk.k kVar) {
        this.f6268a = kVar;
        this.f6269b = ((Integer) kVar.a(x4.f5993a7)).intValue();
    }

    private void c(v0 v0Var, Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new b5.e(this, v0Var, activity, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(v0 v0Var, Activity activity) {
        a(v0Var, activity, (Boolean) null);
    }

    private void b() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.j));
        CollectionUtils.putStringIfValid("details", this.f6270c.toString(), mapHashMap);
        this.f6268a.v0().d(d2.f3913w, mapHashMap);
        this.f6271d = null;
        this.f6273f = null;
        this.j = 0L;
        this.f6276k = 0L;
        this.f6277l = 0L;
        this.f6270c.a();
        this.f6268a.e().b(this.f6279n);
        u0.c cVar = this.g;
        if (cVar != null) {
            cVar.a(this.f6278m);
            this.g = null;
        }
        this.f6278m = new u0.b();
    }

    public void a(Activity activity, u0.c cVar) {
        a(v0.a.IS_AL_GDPR.b(), activity, cVar);
    }

    public void a(int i4, Activity activity, u0.c cVar) {
        if (this.f6271d != null) {
            this.f6268a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6268a.O().a("ConsentFlowStateMachine", "Unable to start states: " + this.f6271d);
            }
            this.f6268a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6268a.O().a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f6271d);
            }
            cVar.a(new u0.b(new s0(s0.f5275d, "Consent flow is already in progress.")));
            return;
        }
        List listA = a1.a(this.f6268a);
        this.f6271d = listA;
        this.f6272e = String.valueOf(listA);
        this.g = cVar;
        v0 v0VarA = a(i4);
        this.f6268a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6268a.O().a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f6271d + "\nInitial state: " + v0VarA);
        }
        com.applovin.impl.sdk.k.a(activity).a(this.f6279n);
        this.f6268a.v0().a(d2.f3895n);
        this.j = SystemClock.elapsedRealtime();
        a((v0) null, v0VarA, activity);
    }

    public boolean a() {
        return this.f6271d != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, Activity activity, Boolean bool) {
        a(v0Var, a(v0Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, v0 v0Var2, Activity activity) {
        this.f6273f = v0Var;
        c(v0Var2, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(v0 v0Var, final Activity activity) {
        boolean z3;
        SpannableString spannableString;
        if (v0Var == null) {
            a("Consent flow state is null");
            return;
        }
        this.f6268a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6268a.O().a("ConsentFlowStateMachine", "Transitioning to state: " + v0Var);
        }
        long jElapsedRealtime = this.f6273f != null ? SystemClock.elapsedRealtime() - this.f6276k : 0L;
        this.f6276k = SystemClock.elapsedRealtime();
        this.f6270c.a(v0Var, jElapsedRealtime);
        if (v0Var.d() == v0.b.ALERT) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            }
            this.f6268a.F().trackEvent("cf_start");
            w0 w0Var = (w0) v0Var;
            this.f6274h = w0Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            Uri uriH = this.f6268a.x().h();
            final boolean z10 = uriH != null;
            for (x0 x0Var : w0Var.f()) {
                b bVar = new b(z10, x0Var, v0Var, activity);
                if (x0Var.c() == x0.a.POSITIVE) {
                    builder.setPositiveButton(x0Var.d(), bVar);
                } else if (x0Var.c() == x0.a.NEGATIVE) {
                    builder.setNegativeButton(x0Var.d(), bVar);
                } else {
                    builder.setNeutralButton(x0Var.d(), bVar);
                }
            }
            String strH = w0Var.h();
            if (StringUtils.isValidString(strH)) {
                spannableString = new SpannableString(strH);
                String strA = com.applovin.impl.sdk.k.a(R.string.applovin_terms_of_service_text);
                String strA2 = com.applovin.impl.sdk.k.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(strH, Arrays.asList(strA, strA2))) {
                    if (z10) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strA), new c(uriH, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strA2), new d(this.f6268a.x().f(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(w0Var.g()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.ra
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f5270a.a(alertDialogCreate, activity, z10, dialogInterface);
                }
            });
            this.f6275i = alertDialogCreate;
            alertDialogCreate.show();
            this.f6278m.d();
            return;
        }
        if (v0Var.d() == v0.b.POST_ALERT) {
            if (this.f6268a.x().k() && this.f6268a.x().m()) {
                if (com.applovin.impl.d.d(activity)) {
                    a(v0Var);
                    return;
                } else {
                    this.f6268a.v0().a(d2.f3901q);
                    this.f6268a.s().loadCmp(activity, new e(SystemClock.elapsedRealtime(), v0Var, activity));
                    return;
                }
            }
            a(v0Var, activity, Boolean.FALSE);
            return;
        }
        if (v0Var.d() == v0.b.EVENT) {
            y0 y0Var = (y0) v0Var;
            String strG = y0Var.g();
            Map<String, ?> mapF = y0Var.f();
            if (mapF == null) {
                mapF = new HashMap<>(1);
            }
            mapF.put("flow_type", "unified");
            this.f6268a.F().trackEvent(strG, mapF);
            b(y0Var, activity);
            return;
        }
        if (v0Var.d() == v0.b.CMP_LOAD) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            } else if (this.f6268a.x().m()) {
                this.f6268a.s().preloadCmp(activity);
                a(v0Var, activity, Boolean.FALSE);
                return;
            } else {
                this.f6268a.v0().a(d2.f3901q);
                this.f6268a.s().loadCmp(activity, new f(SystemClock.elapsedRealtime(), v0Var, activity));
                return;
            }
        }
        if (v0Var.d() == v0.b.CMP_SHOW) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            }
            if (!this.f6268a.x().m()) {
                this.f6268a.F().trackEvent("cf_start");
            }
            this.f6268a.v0().a(d2.f3907t);
            this.f6268a.s().showCmp(activity, new g(SystemClock.elapsedRealtime(), v0Var, activity));
            return;
        }
        if (v0Var.d() == v0.b.DECISION) {
            v0.a aVarA = v0Var.a();
            if (aVarA == v0.a.IS_AL_GDPR) {
                boolean zK = this.f6268a.x().k();
                this.f6270c.a(v0Var, zK, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(zK));
                return;
            } else if (aVarA == v0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                z3 = !this.f6268a.z0() || ((Boolean) this.f6268a.a(z4.f6326t, Boolean.FALSE)).booleanValue();
                this.f6270c.a(v0Var, z3, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(z3));
                return;
            } else {
                if (aVarA != v0.a.HAS_TERMS_OF_SERVICE_URI) {
                    a("Invalid consent flow decision type: " + aVarA);
                    return;
                }
                z3 = this.f6268a.x().h() != null;
                this.f6270c.a(v0Var, z3, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(z3));
                return;
            }
        }
        if (v0Var.d() == v0.b.REINIT) {
            b();
            return;
        }
        a("Invalid consent flow destination state: " + v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, boolean z3, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f6269b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
        this.f6277l = SystemClock.elapsedRealtime();
        this.f6268a.v0().d(d2.f3897o, CollectionUtils.hashMap("details", String.valueOf(z3)));
    }

    private void a(v0 v0Var) {
        this.f6270c.b();
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(v0Var), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        l1.a(str, new Object[0]);
        this.f6268a.D().a(d2.O0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f6272e + "\nLast successful state: " + this.f6273f));
        this.f6270c.b(str);
        u0.b bVar = this.f6278m;
        if (bVar != null) {
            bVar.a(new s0(s0.f5276e, str));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v0 a(int i4) {
        List<v0> list = this.f6271d;
        if (list == null) {
            return null;
        }
        for (v0 v0Var : list) {
            if (i4 == v0Var.c()) {
                return v0Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinCmpError appLovinCmpError, long j) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(j));
        if (appLovinCmpError == null) {
            this.f6268a.v0().d(d2.f3903r, mapHashMap);
        } else {
            mapHashMap.putAll(a(appLovinCmpError));
            this.f6268a.v0().d(d2.f3905s, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(AppLovinCmpError appLovinCmpError) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", appLovinCmpError.getMessage());
        CollectionUtils.putStringIfValid("mediated_network_error_message", appLovinCmpError.getCmpMessage(), mapHashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinCmpError.getCode().getValue()), mapHashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(appLovinCmpError.getCmpCode()), mapHashMap);
        return mapHashMap;
    }
}
