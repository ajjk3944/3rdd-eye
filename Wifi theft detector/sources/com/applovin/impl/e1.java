package com.applovin.impl;

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
import android.util.Base64;
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
import com.applovin.impl.d;
import com.applovin.impl.m1;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class e1 implements m1.a {

    /* renamed from: m, reason: collision with root package name */
    private static WeakReference f5860m;

    /* renamed from: n, reason: collision with root package name */
    private static final AtomicBoolean f5861n = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5862a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5863b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f5864c;

    /* renamed from: e, reason: collision with root package name */
    private final d1 f5866e;

    /* renamed from: g, reason: collision with root package name */
    private m1 f5868g;

    /* renamed from: h, reason: collision with root package name */
    private g7 f5869h;

    /* renamed from: i, reason: collision with root package name */
    private int f5870i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5871j;

    /* renamed from: k, reason: collision with root package name */
    private long f5872k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5873l;

    /* renamed from: d, reason: collision with root package name */
    private final Object f5865d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private WeakReference f5867f = new WeakReference(null);

    public class a extends LinkedHashMap {
        public a(int i10) {
            super(i10);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 10;
        }
    }

    public class b extends com.applovin.impl.b {
        public b() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started Creative Debugger");
                if (!e1.this.h() || e1.f5860m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = e1.f5860m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(e1.this.f5866e, e1.this.f5862a.e());
                }
                e1.f5861n.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = e1.f5860m = null;
            }
        }
    }

    public class c implements d.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f5876a;

        public c(Object obj) {
            this.f5876a = obj;
        }

        @Override // com.applovin.impl.d.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new q1(this.f5876a, e1.this.f5862a.H().b()), e1.this.f5862a);
            e1.f5861n.set(false);
        }
    }

    public e1(com.applovin.impl.sdk.k kVar) {
        this.f5862a = kVar;
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f5863b = contextO;
        this.f5864c = new a(10);
        this.f5866e = new d1(contextO);
    }

    private void m() {
        this.f5862a.e().a(new b());
    }

    public void k() {
        m1 m1Var = this.f5868g;
        if (m1Var != null) {
            m1Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.f5871j = ((Boolean) this.f5862a.a(x4.f8515l1)).booleanValue();
            if (this.f5868g == null) {
                this.f5868g = new m1(this.f5862a, this);
            }
            this.f5868g.a();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (h() || !f5861n.compareAndSet(false, true)) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object objA = this.f5862a.H().a();
        if (objA != null) {
            e(objA);
            return;
        }
        synchronized (this.f5865d) {
            arrayList = new ArrayList(this.f5864c.values());
        }
        Collections.reverse(arrayList);
        this.f5866e.a(arrayList, this.f5862a);
        if (!this.f5873l) {
            m();
            this.f5873l = true;
        }
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger...");
        d.a(this.f5863b, MaxCreativeDebuggerActivity.class);
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        d.a(this.f5863b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f5862a.e(), new c(obj));
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
        WeakReference weakReference = f5860m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f5872k);
        if (this.f5872k == 0 || seconds < 10) {
            return;
        }
        this.f5862a.D().a(d2.f5721d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f5862a.W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f5870i = 0;
    }

    @Override // com.applovin.impl.m1.a
    public void b() {
        if (this.f5870i == 0) {
            this.f5869h = g7.a(TimeUnit.SECONDS.toMillis(3L), this.f5862a, new Runnable() { // from class: com.applovin.impl.s9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7570a.j();
                }
            });
        }
        int i10 = this.f5870i;
        if (i10 % 2 == 0) {
            this.f5870i = i10 + 1;
        }
    }

    public boolean g() {
        return ((Boolean) this.f5862a.a(x4.f8506k1)).booleanValue() && this.f5862a.n0().isCreativeDebuggerEnabled();
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof y2 ? ((y2) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    @Override // com.applovin.impl.m1.a
    public void a() {
        int i10 = this.f5870i;
        if (i10 % 2 == 1) {
            this.f5870i = i10 + 1;
        }
        if (this.f5870i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8292a.e();
                }
            });
            this.f5870i = 0;
            this.f5869h.a();
        }
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!w3.a(obj) || c(obj)) {
                String strB = b(obj);
                synchronized (this.f5865d) {
                    try {
                        q1 q1Var = (q1) this.f5864c.get(strB);
                        if (q1Var != null) {
                            q1Var.a(obj);
                        } else {
                            this.f5864c.put(strB, new q1(obj, System.currentTimeMillis()));
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
        if (g() && this.f5867f.get() == null && !h()) {
            Activity activityB = this.f5862a.e().b();
            if (activityB == null) {
                this.f5862a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5862a.O().b("AppLovinSdk", "Failed to display Creative Debugger button");
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
                    final ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
                    final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.t9
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            this.f8171a.a(viewA, frameLayout);
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.u9
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8229a.a(viewA, frameLayout, viewTreeObserver, onGlobalLayoutListener);
                        }
                    }, TimeUnit.SECONDS.toMillis(5L));
                    this.f5867f = new WeakReference(viewA);
                }
            }
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.f5871j) {
            view.setOnTouchListener(null);
            this.f5872k = 0L;
        }
        frameLayout.removeView(view);
        this.f5867f = new WeakReference(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f5867f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f5872k > 0 && this.f5871j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public String b(q1 q1Var) {
        com.applovin.impl.sdk.ad.b bVarC = q1Var.c();
        y2 y2VarE = q1Var.e();
        if (bVarC == null) {
            if (y2VarE != null) {
                return y2VarE.D();
            }
            return null;
        }
        return "json_v3!" + Base64.encodeToString(bVarC.getOriginalFullResponse().toString().getBytes(), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.widget.ImageButton, android.widget.ImageView] */
    private View a(final FrameLayout frameLayout, Activity activity) {
        Button button;
        int iDpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i10 = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i10, i10, i10, i10);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i10, i10, i10, i10 * 2);
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
        if (this.f5871j) {
            button.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.w9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f8384a.a(frameLayout, view, motionEvent);
                }
            });
        } else {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.x9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8640a.a(view);
                }
            });
        }
        if (o0.d()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    private String b(Object obj) {
        String strQ;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            strQ = ((com.applovin.impl.sdk.ad.b) obj).getMediationServeId();
        } else {
            strQ = obj instanceof y2 ? ((y2) obj).Q() : null;
        }
        return StringUtils.isValidString(strQ) ? strQ : UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5872k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.y9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8719a.i();
                }
            }, TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.f5872k = 0L;
                n();
            } else {
                b(view, frameLayout);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Serializable, java.lang.Object[]] */
    public void a(q1 q1Var, Context context, boolean z10) {
        String strA = a(q1Var);
        v2 v2Var = new v2();
        if (z10) {
            v2Var.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        v2Var.b(strA);
        String strB = b(q1Var);
        if (strB != null) {
            v2Var.a("\nBid Response:\n");
            v2Var.a(strB);
        }
        String str = q1Var.c() != null ? "AppLovin Ad Report" : "MAX Ad Report";
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage(null), "Share Ad Report");
        if (z10) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage("com.google.android.gm");
                String str2 = this.f5862a.n0().getExtraParameters().get("creative_debugger_email_recipients");
                if (StringUtils.isValidString(str2)) {
                    intent.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str2).toArray());
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

    public String a(q1 q1Var) {
        v2 v2Var = new v2();
        v2Var.b("Ad Info:\n");
        y2 y2VarE = q1Var.e();
        com.applovin.impl.sdk.ad.b bVarC = q1Var.c();
        if (y2VarE != null) {
            v2Var.a(y2VarE);
        } else if (bVarC != null) {
            v2Var.a(AndroidInitializeBoldSDK.MSG_NETWORK, "APPLOVIN").a(bVarC).b(bVarC);
        }
        v2Var.a(this.f5862a);
        v2Var.a("Epoch Timestamp (ms)", Long.valueOf(q1Var.b()));
        v2 v2Var2 = new v2();
        v2Var2.a("Platform", "fireos".equals(this.f5862a.A().A()) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f5862a.a(x4.L3)).a("App Package Name", this.f5863b.getPackageName()).a("Device", String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f5862a.h0()).a("Ad Review Version", j.b()).a(a(q1Var.a())).a("User ID", this.f5862a.w0().e() != null ? this.f5862a.w0().e() : "None").a("MD", this.f5862a.a(x4.f8578t));
        v2Var.a("\nDebug Info:\n").a(u4.b(v2Var2.toString(), n7.a(this.f5862a), u4.a.V2, this.f5862a.i0(), this.f5862a));
        return v2Var.toString();
    }

    private Bundle a(Object obj) {
        this.f5862a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5862a.O().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String strA = n7.a(obj);
        Bundle bundleA = this.f5862a.j().a(strA);
        this.f5862a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5862a.O().a("CreativeDebuggerService", "Serve id: " + strA);
        }
        this.f5862a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5862a.O().a("CreativeDebuggerService", "Public data: " + bundleA);
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
