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

/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8731a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8732b;

    /* renamed from: d, reason: collision with root package name */
    private List f8734d;

    /* renamed from: e, reason: collision with root package name */
    private String f8735e;

    /* renamed from: f, reason: collision with root package name */
    private v0 f8736f;

    /* renamed from: g, reason: collision with root package name */
    private u0.c f8737g;

    /* renamed from: h, reason: collision with root package name */
    private v0 f8738h;

    /* renamed from: i, reason: collision with root package name */
    private Dialog f8739i;

    /* renamed from: j, reason: collision with root package name */
    private long f8740j;

    /* renamed from: k, reason: collision with root package name */
    private long f8741k;

    /* renamed from: l, reason: collision with root package name */
    private long f8742l;

    /* renamed from: c, reason: collision with root package name */
    private final t0 f8733c = new t0();

    /* renamed from: m, reason: collision with root package name */
    private u0.b f8743m = new u0.b();

    /* renamed from: n, reason: collision with root package name */
    private final com.applovin.impl.b f8744n = new a();

    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || z0.this.f8738h == null) {
                return;
            }
            if (z0.this.f8739i != null) {
                z0 z0Var = z0.this;
                if (!com.applovin.impl.d.d(z0Var.a(z0Var.f8739i))) {
                    z0.this.f8739i.dismiss();
                }
                z0.this.f8739i = null;
            }
            v0 v0Var = z0.this.f8738h;
            z0.this.f8738h = null;
            z0 z0Var2 = z0.this;
            z0Var2.a(z0Var2.f8736f, v0Var, activity);
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8746a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x0 f8747b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v0 f8748c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f8749d;

        public b(boolean z10, x0 x0Var, v0 v0Var, Activity activity) {
            this.f8746a = z10;
            this.f8747b = x0Var;
            this.f8748c = v0Var;
            this.f8749d = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            z0.this.f8738h = null;
            z0.this.f8739i = null;
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - z0.this.f8742l));
            CollectionUtils.putStringIfValid("details", String.valueOf(this.f8746a), mapHashMap);
            z0.this.f8731a.v0().d(d2.f5745p, mapHashMap);
            v0 v0VarA = z0.this.a(this.f8747b.a());
            if (v0VarA == null) {
                z0.this.a("Destination state for TOS/PP alert is null");
                return;
            }
            z0.this.a(this.f8748c, v0VarA, this.f8749d);
            if (v0VarA.d() != v0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    public class c extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f8751a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f8752b;

        public c(Uri uri, Activity activity) {
            this.f8751a = uri;
            this.f8752b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.f8751a, this.f8752b, z0.this.f8731a);
        }
    }

    public class d extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f8754a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f8755b;

        public d(Uri uri, Activity activity) {
            this.f8754a = uri;
            this.f8755b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.f8754a, this.f8755b, z0.this.f8731a);
        }
    }

    public class e implements CmpServiceImpl.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8757a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f8758b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f8759c;

        public e(long j10, v0 v0Var, Activity activity) {
            this.f8757a = j10;
            this.f8758b = v0Var;
            this.f8759c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.f8743m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f8757a);
            z0.this.a(this.f8758b, this.f8759c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    public class f implements CmpServiceImpl.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8761a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f8762b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f8763c;

        public f(long j10, v0 v0Var, Activity activity) {
            this.f8761a = j10;
            this.f8762b = v0Var;
            this.f8763c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.f8743m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f8761a);
            z0.this.a(this.f8762b, this.f8763c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    public class g implements CmpServiceImpl.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8765a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f8766b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f8767c;

        public g(long j10, v0 v0Var, Activity activity) {
            this.f8765a = j10;
            this.f8766b = v0Var;
            this.f8767c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f8765a));
            if (appLovinCmpError != null) {
                z0.this.f8743m.a(appLovinCmpError);
                mapHashMap.putAll(z0.this.a(appLovinCmpError));
                z0.this.f8731a.v0().d(d2.f5755u, mapHashMap);
            } else {
                z0.this.f8743m.c();
                z0.this.f8731a.v0().d(d2.f5757v, mapHashMap);
            }
            z0.this.b(this.f8766b, this.f8767c);
        }
    }

    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v0 f8769a;

        public h(v0 v0Var) {
            this.f8769a = v0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z0 z0Var = z0.this;
            z0Var.a(z0Var.f8736f, this.f8769a, z0.this.f8731a.u0());
        }
    }

    public z0(com.applovin.impl.sdk.k kVar) {
        this.f8731a = kVar;
        this.f8732b = ((Integer) kVar.a(x4.f8423a7)).intValue();
    }

    private void c(final v0 v0Var, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.wg
            @Override // java.lang.Runnable
            public final void run() {
                this.f8394a.a(v0Var, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(v0 v0Var, Activity activity) {
        a(v0Var, activity, (Boolean) null);
    }

    private void b() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f8740j));
        CollectionUtils.putStringIfValid("details", this.f8733c.toString(), mapHashMap);
        this.f8731a.v0().d(d2.f5759w, mapHashMap);
        this.f8734d = null;
        this.f8736f = null;
        this.f8740j = 0L;
        this.f8741k = 0L;
        this.f8742l = 0L;
        this.f8733c.a();
        this.f8731a.e().b(this.f8744n);
        u0.c cVar = this.f8737g;
        if (cVar != null) {
            cVar.a(this.f8743m);
            this.f8737g = null;
        }
        this.f8743m = new u0.b();
    }

    public void a(Activity activity, u0.c cVar) {
        a(v0.a.IS_AL_GDPR.b(), activity, cVar);
    }

    public void a(int i10, Activity activity, u0.c cVar) {
        if (this.f8734d != null) {
            this.f8731a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8731a.O().a("ConsentFlowStateMachine", "Unable to start states: " + this.f8734d);
            }
            this.f8731a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8731a.O().a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f8734d);
            }
            cVar.a(new u0.b(new s0(s0.f7523d, "Consent flow is already in progress.")));
            return;
        }
        List listA = a1.a(this.f8731a);
        this.f8734d = listA;
        this.f8735e = String.valueOf(listA);
        this.f8737g = cVar;
        v0 v0VarA = a(i10);
        this.f8731a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8731a.O().a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f8734d + "\nInitial state: " + v0VarA);
        }
        com.applovin.impl.sdk.k.a(activity).a(this.f8744n);
        this.f8731a.v0().a(d2.f5741n);
        this.f8740j = SystemClock.elapsedRealtime();
        a((v0) null, v0VarA, activity);
    }

    public boolean a() {
        return this.f8734d != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, Activity activity, Boolean bool) {
        a(v0Var, a(v0Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, v0 v0Var2, Activity activity) {
        this.f8736f = v0Var;
        c(v0Var2, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(v0 v0Var, final Activity activity) {
        boolean z10;
        SpannableString spannableString;
        if (v0Var == null) {
            a("Consent flow state is null");
            return;
        }
        this.f8731a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8731a.O().a("ConsentFlowStateMachine", "Transitioning to state: " + v0Var);
        }
        long jElapsedRealtime = this.f8736f != null ? SystemClock.elapsedRealtime() - this.f8741k : 0L;
        this.f8741k = SystemClock.elapsedRealtime();
        this.f8733c.a(v0Var, jElapsedRealtime);
        if (v0Var.d() == v0.b.ALERT) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            }
            this.f8731a.F().trackEvent("cf_start");
            w0 w0Var = (w0) v0Var;
            this.f8738h = w0Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            Uri uriH = this.f8731a.x().h();
            final boolean z11 = uriH != null;
            for (x0 x0Var : w0Var.f()) {
                b bVar = new b(z11, x0Var, v0Var, activity);
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
                    if (z11) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strA), new c(uriH, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strA2), new d(this.f8731a.x().f(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(w0Var.g()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.vg
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f8301a.a(alertDialogCreate, activity, z11, dialogInterface);
                }
            });
            this.f8739i = alertDialogCreate;
            alertDialogCreate.show();
            this.f8743m.d();
            return;
        }
        if (v0Var.d() == v0.b.POST_ALERT) {
            if (this.f8731a.x().k() && this.f8731a.x().m()) {
                if (com.applovin.impl.d.d(activity)) {
                    a(v0Var);
                    return;
                } else {
                    this.f8731a.v0().a(d2.f5747q);
                    this.f8731a.s().loadCmp(activity, new e(SystemClock.elapsedRealtime(), v0Var, activity));
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
            this.f8731a.F().trackEvent(strG, mapF);
            b(y0Var, activity);
            return;
        }
        if (v0Var.d() == v0.b.CMP_LOAD) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            } else if (this.f8731a.x().m()) {
                this.f8731a.s().preloadCmp(activity);
                a(v0Var, activity, Boolean.FALSE);
                return;
            } else {
                this.f8731a.v0().a(d2.f5747q);
                this.f8731a.s().loadCmp(activity, new f(SystemClock.elapsedRealtime(), v0Var, activity));
                return;
            }
        }
        if (v0Var.d() == v0.b.CMP_SHOW) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            }
            if (!this.f8731a.x().m()) {
                this.f8731a.F().trackEvent("cf_start");
            }
            this.f8731a.v0().a(d2.f5753t);
            this.f8731a.s().showCmp(activity, new g(SystemClock.elapsedRealtime(), v0Var, activity));
            return;
        }
        if (v0Var.d() == v0.b.DECISION) {
            v0.a aVarA = v0Var.a();
            if (aVarA == v0.a.IS_AL_GDPR) {
                boolean zK = this.f8731a.x().k();
                this.f8733c.a(v0Var, zK, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(zK));
                return;
            } else if (aVarA == v0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                z10 = !this.f8731a.z0() || ((Boolean) this.f8731a.a(z4.f8793t, Boolean.FALSE)).booleanValue();
                this.f8733c.a(v0Var, z10, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(z10));
                return;
            } else {
                if (aVarA != v0.a.HAS_TERMS_OF_SERVICE_URI) {
                    a("Invalid consent flow decision type: " + aVarA);
                    return;
                }
                z10 = this.f8731a.x().h() != null;
                this.f8733c.a(v0Var, z10, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(z10));
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
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, boolean z10, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f8732b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
        this.f8742l = SystemClock.elapsedRealtime();
        this.f8731a.v0().d(d2.f5743o, CollectionUtils.hashMap("details", String.valueOf(z10)));
    }

    private void a(v0 v0Var) {
        this.f8733c.b();
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(v0Var), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        l1.a(str, new Object[0]);
        this.f8731a.D().a(d2.O0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f8735e + "\nLast successful state: " + this.f8736f));
        this.f8733c.b(str);
        u0.b bVar = this.f8743m;
        if (bVar != null) {
            bVar.a(new s0(s0.f7524e, str));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v0 a(int i10) {
        List<v0> list = this.f8734d;
        if (list == null) {
            return null;
        }
        for (v0 v0Var : list) {
            if (i10 == v0Var.c()) {
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
    public void a(AppLovinCmpError appLovinCmpError, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(j10));
        if (appLovinCmpError == null) {
            this.f8731a.v0().d(d2.f5749r, mapHashMap);
        } else {
            mapHashMap.putAll(a(appLovinCmpError));
            this.f8731a.v0().d(d2.f5751s, mapHashMap);
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
