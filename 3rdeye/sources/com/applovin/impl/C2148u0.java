package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.C2139p0;
import com.applovin.impl.C2141q0;
import com.applovin.impl.C2144s0;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
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

/* renamed from: com.applovin.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2148u0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21501a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21502b;

    /* renamed from: c, reason: collision with root package name */
    private List f21503c;

    /* renamed from: d, reason: collision with root package name */
    private String f21504d;

    /* renamed from: e, reason: collision with root package name */
    private C2141q0 f21505e;

    /* renamed from: f, reason: collision with root package name */
    private C2139p0.c f21506f;

    /* renamed from: g, reason: collision with root package name */
    private C2141q0 f21507g;

    /* renamed from: h, reason: collision with root package name */
    private Dialog f21508h;
    private C2139p0.b i = new C2139p0.b();

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC2108b f21509j = new a();

    /* renamed from: com.applovin.impl.u0$a */
    public class a extends AbstractC2108b {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC2108b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || C2148u0.this.f21507g == null) {
                return;
            }
            if (C2148u0.this.f21508h != null) {
                C2148u0 c2148u0 = C2148u0.this;
                if (!AbstractC2113d.a(c2148u0.a(c2148u0.f21508h))) {
                    C2148u0.this.f21508h.dismiss();
                }
                C2148u0.this.f21508h = null;
            }
            C2141q0 c2141q0 = C2148u0.this.f21507g;
            C2148u0.this.f21507g = null;
            C2148u0 c2148u02 = C2148u0.this;
            c2148u02.a(c2148u02.f21505e, c2141q0, activity);
        }
    }

    /* renamed from: com.applovin.impl.u0$b */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2144s0 f21511a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2141q0 f21512b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f21513c;

        public b(C2144s0 c2144s0, C2141q0 c2141q0, Activity activity) {
            this.f21511a = c2144s0;
            this.f21512b = c2141q0;
            this.f21513c = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C2148u0.this.f21507g = null;
            C2148u0.this.f21508h = null;
            C2141q0 c2141q0A = C2148u0.this.a(this.f21511a.a());
            if (c2141q0A == null) {
                C2148u0.this.a("Destination state for TOS/PP alert is null");
                return;
            }
            C2148u0.this.a(this.f21512b, c2141q0A, this.f21513c);
            if (c2141q0A.c() != C2141q0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.applovin.impl.u0$c */
    public class c extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f21515a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f21516b;

        public c(Uri uri, Activity activity) {
            this.f21515a = uri;
            this.f21516b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            a7.a(this.f21515a, this.f21516b, C2148u0.this.f21501a);
        }
    }

    /* renamed from: com.applovin.impl.u0$d */
    public class d extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f21518a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f21519b;

        public d(Uri uri, Activity activity) {
            this.f21518a = uri;
            this.f21519b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            a7.a(this.f21518a, this.f21519b, C2148u0.this.f21501a);
        }
    }

    /* renamed from: com.applovin.impl.u0$e */
    public class e implements CmpServiceImpl.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2141q0 f21521a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f21522b;

        public e(C2141q0 c2141q0, Activity activity) {
            this.f21521a = c2141q0;
            this.f21522b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            C2148u0.this.i.a(appLovinCmpError);
            C2148u0.this.a(this.f21521a, this.f21522b, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* renamed from: com.applovin.impl.u0$f */
    public class f implements CmpServiceImpl.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2141q0 f21524a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f21525b;

        public f(C2141q0 c2141q0, Activity activity) {
            this.f21524a = c2141q0;
            this.f21525b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            C2148u0.this.i.a(appLovinCmpError);
            C2148u0.this.a(this.f21524a, this.f21525b, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* renamed from: com.applovin.impl.u0$g */
    public class g implements CmpServiceImpl.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2141q0 f21527a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f21528b;

        public g(C2141q0 c2141q0, Activity activity) {
            this.f21527a = c2141q0;
            this.f21528b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                C2148u0.this.i.a(appLovinCmpError);
            } else {
                C2148u0.this.i.c();
            }
            C2148u0.this.b(this.f21527a, this.f21528b);
        }
    }

    /* renamed from: com.applovin.impl.u0$h */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2141q0 f21530a;

        public h(C2141q0 c2141q0) {
            this.f21530a = c2141q0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2148u0 c2148u0 = C2148u0.this;
            c2148u0.a(c2148u0.f21505e, this.f21530a, C2148u0.this.f21501a.u0());
        }
    }

    public C2148u0(com.applovin.impl.sdk.k kVar) {
        this.f21501a = kVar;
        this.f21502b = ((Integer) kVar.a(l4.f20033t6)).intValue();
    }

    private void c(C2141q0 c2141q0, Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new J4.e(this, c2141q0, activity, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(C2141q0 c2141q0, Activity activity) {
        a(c2141q0, activity, (Boolean) null);
    }

    private void b() {
        this.f21503c = null;
        this.f21505e = null;
        this.f21501a.e().b(this.f21509j);
        C2139p0.c cVar = this.f21506f;
        if (cVar != null) {
            cVar.a(this.i);
            this.f21506f = null;
        }
        this.i = new C2139p0.b();
    }

    public void a(Activity activity, C2139p0.c cVar) {
        a(C2141q0.a.IS_AL_GDPR.b(), activity, cVar);
    }

    public void a(int i, Activity activity, C2139p0.c cVar) {
        if (this.f21503c != null) {
            this.f21501a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21501a.O().a("ConsentFlowStateMachine", "Unable to start states: " + this.f21503c);
            }
            this.f21501a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21501a.O().a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f21503c);
            }
            cVar.a(new C2139p0.b(new C2137o0(C2137o0.f20615d, "Consent flow is already in progress.")));
            return;
        }
        List listA = AbstractC2150v0.a(this.f21501a);
        this.f21503c = listA;
        this.f21504d = String.valueOf(listA);
        this.f21506f = cVar;
        C2141q0 c2141q0A = a(i);
        this.f21501a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21501a.O().a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f21503c + "\nInitial state: " + c2141q0A);
        }
        com.applovin.impl.sdk.k.a(activity).a(this.f21509j);
        a((C2141q0) null, c2141q0A, activity);
    }

    public boolean a() {
        return this.f21503c != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C2141q0 c2141q0, Activity activity, Boolean bool) {
        a(c2141q0, a(c2141q0.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C2141q0 c2141q0, C2141q0 c2141q02, Activity activity) {
        this.f21505e = c2141q0;
        c(c2141q02, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C2141q0 c2141q0, final Activity activity) {
        SpannableString spannableString;
        if (c2141q0 == null) {
            a("Consent flow state is null");
            return;
        }
        this.f21501a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21501a.O().a("ConsentFlowStateMachine", "Transitioning to state: " + c2141q0);
        }
        if (c2141q0.c() == C2141q0.b.ALERT) {
            if (AbstractC2113d.a(activity)) {
                a(c2141q0);
                return;
            }
            this.f21501a.G().trackEvent("cf_start");
            C2142r0 c2142r0 = (C2142r0) c2141q0;
            this.f21507g = c2142r0;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            for (C2144s0 c2144s0 : c2142r0.d()) {
                b bVar = new b(c2144s0, c2141q0, activity);
                if (c2144s0.c() == C2144s0.a.POSITIVE) {
                    builder.setPositiveButton(c2144s0.d(), bVar);
                } else if (c2144s0.c() == C2144s0.a.NEGATIVE) {
                    builder.setNegativeButton(c2144s0.d(), bVar);
                } else {
                    builder.setNeutralButton(c2144s0.d(), bVar);
                }
            }
            String strF = c2142r0.f();
            if (StringUtils.isValidString(strF)) {
                spannableString = new SpannableString(strF);
                String strA = com.applovin.impl.sdk.k.a(R.string.applovin_terms_of_service_text);
                String strA2 = com.applovin.impl.sdk.k.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(strF, Arrays.asList(strA, strA2))) {
                    Uri uriH = this.f21501a.y().h();
                    if (uriH != null) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strA), new c(uriH, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strA2), new d(this.f21501a.y().f(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(c2142r0.e()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.P0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f18847a.a(alertDialogCreate, activity, dialogInterface);
                }
            });
            this.f21508h = alertDialogCreate;
            alertDialogCreate.show();
            this.i.d();
            return;
        }
        if (c2141q0.c() == C2141q0.b.POST_ALERT) {
            if (this.f21501a.y().k() && this.f21501a.y().m()) {
                if (AbstractC2113d.a(activity)) {
                    a(c2141q0);
                    return;
                } else {
                    this.f21501a.t().loadCmp(activity, new e(c2141q0, activity));
                    return;
                }
            }
            a(c2141q0, activity, Boolean.FALSE);
            return;
        }
        if (c2141q0.c() == C2141q0.b.EVENT) {
            C2146t0 c2146t0 = (C2146t0) c2141q0;
            String strE = c2146t0.e();
            Map<String, ?> mapD = c2146t0.d();
            if (mapD == null) {
                mapD = new HashMap<>(1);
            }
            mapD.put("flow_type", "unified");
            this.f21501a.G().trackEvent(strE, mapD);
            b(c2146t0, activity);
            return;
        }
        if (c2141q0.c() == C2141q0.b.CMP_LOAD) {
            if (AbstractC2113d.a(activity)) {
                a(c2141q0);
                return;
            } else if (this.f21501a.y().m()) {
                this.f21501a.t().preloadCmp(activity);
                a(c2141q0, activity, Boolean.FALSE);
                return;
            } else {
                this.f21501a.t().loadCmp(activity, new f(c2141q0, activity));
                return;
            }
        }
        if (c2141q0.c() == C2141q0.b.CMP_SHOW) {
            if (AbstractC2113d.a(activity)) {
                a(c2141q0);
                return;
            }
            if (!this.f21501a.y().m()) {
                this.f21501a.G().trackEvent("cf_start");
            }
            this.f21501a.t().showCmp(activity, new g(c2141q0, activity));
            return;
        }
        if (c2141q0.c() == C2141q0.b.DECISION) {
            C2141q0.a aVarA = c2141q0.a();
            if (aVarA == C2141q0.a.IS_AL_GDPR) {
                a(c2141q0, activity, Boolean.valueOf(this.f21501a.y().k()));
                return;
            }
            if (aVarA == C2141q0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                a(c2141q0, activity, Boolean.valueOf(!this.f21501a.z0() || ((Boolean) this.f21501a.a(n4.f20584r, Boolean.FALSE)).booleanValue()));
                return;
            } else {
                if (aVarA == C2141q0.a.HAS_TERMS_OF_SERVICE_URI) {
                    a(c2141q0, activity, Boolean.valueOf(this.f21501a.y().h() != null));
                    return;
                }
                a("Invalid consent flow decision type: " + aVarA);
                return;
            }
        }
        if (c2141q0.c() == C2141q0.b.REINIT) {
            b();
            return;
        }
        a("Invalid consent flow destination state: " + c2141q0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f21502b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
    }

    private void a(C2141q0 c2141q0) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(c2141q0), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        g1.a(str, new Object[0]);
        this.f21501a.E().a(y1.f21820t0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f21504d + "\nLast successful state: " + this.f21505e));
        C2139p0.b bVar = this.i;
        if (bVar != null) {
            bVar.a(new C2137o0(C2137o0.f20616e, str));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2141q0 a(int i) {
        List<C2141q0> list = this.f21503c;
        if (list == null) {
            return null;
        }
        for (C2141q0 c2141q0 : list) {
            if (i == c2141q0.b()) {
                return c2141q0;
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
}
