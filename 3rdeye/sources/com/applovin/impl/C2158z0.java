package com.applovin.impl;

import N7.C1154e9;
import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.AbstractC2113d;
import com.applovin.impl.h1;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.singular.sdk.internal.Constants;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2158z0 implements h1.a {

    /* renamed from: m, reason: collision with root package name */
    private static WeakReference f21867m;

    /* renamed from: n, reason: collision with root package name */
    private static final AtomicBoolean f21868n = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21869a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f21870b;

    /* renamed from: e, reason: collision with root package name */
    private final C2156y0 f21873e;

    /* renamed from: g, reason: collision with root package name */
    private h1 f21875g;

    /* renamed from: h, reason: collision with root package name */
    private t6 f21876h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21877j;

    /* renamed from: k, reason: collision with root package name */
    private long f21878k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21879l;

    /* renamed from: c, reason: collision with root package name */
    private final List f21871c = new ArrayList(10);

    /* renamed from: d, reason: collision with root package name */
    private final Object f21872d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private WeakReference f21874f = new WeakReference(null);

    /* renamed from: com.applovin.impl.z0$a */
    public class a extends AbstractC2108b {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC2108b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started Creative Debugger");
                if (!C2158z0.this.h() || C2158z0.f21867m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = C2158z0.f21867m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(C2158z0.this.f21873e, C2158z0.this.f21869a.e());
                }
                C2158z0.f21868n.set(false);
            }
        }

        @Override // com.applovin.impl.AbstractC2108b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = C2158z0.f21867m = null;
            }
        }
    }

    /* renamed from: com.applovin.impl.z0$b */
    public class b implements AbstractC2113d.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f21881a;

        public b(Object obj) {
            this.f21881a = obj;
        }

        @Override // com.applovin.impl.AbstractC2113d.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new l1(this.f21881a, C2158z0.this.f21869a.I().b()), C2158z0.this.f21869a);
            C2158z0.f21868n.set(false);
        }
    }

    public C2158z0(com.applovin.impl.sdk.k kVar) {
        this.f21869a = kVar;
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f21870b = contextO;
        this.f21873e = new C2156y0(contextO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.i = 0;
    }

    private void m() {
        this.f21869a.e().a(new a());
    }

    public void k() {
        h1 h1Var = this.f21875g;
        if (h1Var != null) {
            h1Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.f21877j = ((Boolean) this.f21869a.a(l4.f19950j1)).booleanValue();
            if (this.f21875g == null) {
                this.f21875g = new h1(this.f21869a, this);
            }
            this.f21875g.a();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (h() || !f21868n.compareAndSet(false, true)) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object objA = this.f21869a.I().a();
        if (objA != null) {
            e(objA);
            return;
        }
        synchronized (this.f21872d) {
            arrayList = new ArrayList(this.f21871c);
        }
        this.f21873e.a(arrayList, this.f21869a);
        if (!this.f21879l) {
            m();
            this.f21879l = true;
        }
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger...");
        AbstractC2113d.a(this.f21870b, MaxCreativeDebuggerActivity.class);
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        AbstractC2113d.a(this.f21870b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f21869a.e(), new b(obj));
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        WeakReference weakReference = f21867m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f21878k);
        if (this.f21878k == 0 || seconds < 10) {
            return;
        }
        this.f21869a.E().a(y1.f21788d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f21869a.X0();
    }

    @Override // com.applovin.impl.h1.a
    public void b() {
        if (this.i == 0) {
            this.f21876h = t6.a(TimeUnit.SECONDS.toMillis(3L), this.f21869a, new C.V(this, 17));
        }
        int i = this.i;
        if (i % 2 == 0) {
            this.i = i + 1;
        }
    }

    public boolean g() {
        return ((Boolean) this.f21869a.a(l4.f19942i1)).booleanValue() && this.f21869a.n0().isCreativeDebuggerEnabled();
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof q2 ? ((q2) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!l3.a(obj) || c(obj)) {
                if (l3.b(obj) && c(obj)) {
                    return;
                }
                synchronized (this.f21872d) {
                    try {
                        this.f21871c.add(0, new l1(obj, System.currentTimeMillis()));
                        if (this.f21871c.size() > 10) {
                            this.f21871c.remove(r6.size() - 1);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (g() && this.f21874f.get() == null && !h()) {
            Activity activityB = this.f21869a.e().b();
            if (activityB == null) {
                this.f21869a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21869a.O().b("AppLovinSdk", "Failed to display Creative Debugger button");
                }
            } else {
                View viewFindViewById = activityB.findViewById(R.id.content);
                if (viewFindViewById instanceof FrameLayout) {
                    final FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                    final View viewA = a(frameLayout, activityB);
                    frameLayout.addView(viewA);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(150L);
                    viewA.startAnimation(alphaAnimation);
                    ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.B1
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            this.f18785b.a(viewA, frameLayout);
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    AppLovinSdkUtils.runOnUiThreadDelayed(new W.Q(this, viewA, frameLayout, viewTreeObserver, onGlobalLayoutListener, 1), TimeUnit.SECONDS.toMillis(5L));
                    this.f21874f = new WeakReference(viewA);
                }
            }
        }
    }

    @Override // com.applovin.impl.h1.a
    public void a() {
        int i = this.i;
        if (i % 2 == 1) {
            this.i = i + 1;
        }
        if (this.i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new B.b(this, 25));
            this.i = 0;
            this.f21876h.a();
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.f21877j) {
            view.setOnTouchListener(null);
            this.f21878k = 0L;
        }
        frameLayout.removeView(view);
        this.f21874f = new WeakReference(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f21874f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f21878k > 0 && this.f21877j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public String b(Object obj) {
        JSONObject jSONObjectA;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            return ((com.applovin.impl.sdk.ad.b) obj).getOriginalFullResponse().toString();
        }
        if (!(obj instanceof q2)) {
            return null;
        }
        String strE = ((q2) obj).E();
        return (!l3.b(obj) || (jSONObjectA = new C2125j(strE, this.f21869a).a()) == null) ? strE : jSONObjectA.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.widget.ImageButton, android.widget.ImageView] */
    private View a(final FrameLayout frameLayout, Activity activity) {
        Button button;
        int iDpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i, i, i, i);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i, i, i, i * 2);
            button = imageButton;
        } catch (Throwable unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(f());
        if (this.f21877j) {
            button.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.A1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f18777b.a(frameLayout, view, motionEvent);
                }
            });
        } else {
            button.setOnClickListener(new D8.f(this, 5));
        }
        if (AbstractC2128k0.d()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f21878k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new H(this, 5), TimeUnit.SECONDS.toMillis(10L));
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (view.getVisibility() == 0) {
            this.f21878k = 0L;
            n();
            return true;
        }
        b(view, frameLayout);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Serializable, java.lang.Object[]] */
    public void a(l1 l1Var, Context context, boolean z10) {
        Object objA = l1Var.a();
        String strA = a(l1Var);
        n2 n2Var = new n2();
        if (z10) {
            n2Var.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        n2Var.b(strA);
        String strB = this.f21869a.z().b(objA);
        if (strB != null) {
            n2Var.a("\nBid Response:\n");
            n2Var.a(strB);
        }
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", objA instanceof com.applovin.impl.sdk.ad.b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", n2Var.toString()).setPackage(null), "Share Ad Report");
        if (z10) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")).putExtra("android.intent.extra.SUBJECT", objA instanceof com.applovin.impl.sdk.ad.b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", n2Var.toString()).setPackage("com.google.android.gm");
                String str = this.f21869a.n0().getExtraParameters().get("creative_debugger_email_recipients");
                if (StringUtils.isValidString(str)) {
                    intent.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str).toArray());
                }
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                context.startActivity(intentCreateChooser);
                return;
            }
        }
        context.startActivity(intentCreateChooser);
    }

    public String a(l1 l1Var) {
        Object objA = l1Var.a();
        n2 n2Var = new n2();
        n2Var.b("Ad Info:\n");
        if (objA instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) objA;
            n2Var.a("Network", "APPLOVIN").a(bVar).b(bVar);
        } else if (objA instanceof q2) {
            n2Var.a((q2) objA);
        }
        n2Var.a(this.f21869a);
        n2Var.a("Epoch Timestamp (ms)", Long.valueOf(l1Var.b()));
        n2Var.a("\nDebug Info:\n").a("Platform", "fireos".equals(this.f21869a.B().x()) ? "Fire OS" : Constants.PLATFORM).a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f21869a.a(l4.f19705B3)).a("App Package Name", this.f21870b.getPackageName()).a("Device", Build.BRAND + " " + Build.MODEL + " (" + Build.DEVICE + ")").a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f21869a.h0()).a("Ad Review Version", C2123i.b()).a(a(objA)).a("User ID", this.f21869a.w0().e() != null ? this.f21869a.w0().e() : "None").a("MD", this.f21869a.a(l4.f20026t));
        return n2Var.toString();
    }

    private Bundle a(Object obj) {
        this.f21869a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21869a.O().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String strA = a7.a(obj);
        Bundle bundleA = this.f21869a.j().a(strA);
        this.f21869a.O();
        if (com.applovin.impl.sdk.o.a()) {
            C1154e9.m("Serve id: ", strA, this.f21869a.O(), "CreativeDebuggerService");
        }
        this.f21869a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21869a.O().a("CreativeDebuggerService", "Public data: " + bundleA);
        }
        if (bundleA == null) {
            return null;
        }
        for (String str : bundleA.keySet()) {
            Object obj2 = bundleA.get(str);
            bundleA.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, bundleA);
        }
        return bundleA;
    }
}
