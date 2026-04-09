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
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class e1 implements m1.a {

    /* renamed from: m, reason: collision with root package name */
    private static WeakReference f3999m;

    /* renamed from: n, reason: collision with root package name */
    private static final AtomicBoolean f4000n = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4001a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4002b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f4003c;

    /* renamed from: e, reason: collision with root package name */
    private final d1 f4005e;
    private m1 g;

    /* renamed from: h, reason: collision with root package name */
    private g7 f4007h;

    /* renamed from: i, reason: collision with root package name */
    private int f4008i;
    private boolean j;

    /* renamed from: k, reason: collision with root package name */
    private long f4009k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4010l;

    /* renamed from: d, reason: collision with root package name */
    private final Object f4004d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private WeakReference f4006f = new WeakReference(null);

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends LinkedHashMap {
        public a(int i4) {
            super(i4);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 10;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b extends com.applovin.impl.b {
        public b() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started Creative Debugger");
                if (!e1.this.h() || e1.f3999m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = e1.f3999m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(e1.this.f4005e, e1.this.f4001a.e());
                }
                e1.f4000n.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = e1.f3999m = null;
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class c implements d.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4013a;

        public c(Object obj) {
            this.f4013a = obj;
        }

        @Override // com.applovin.impl.d.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new q1(this.f4013a, e1.this.f4001a.H().b()), e1.this.f4001a);
            e1.f4000n.set(false);
        }
    }

    public e1(com.applovin.impl.sdk.k kVar) {
        this.f4001a = kVar;
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f4002b = contextO;
        this.f4003c = new a(10);
        this.f4005e = new d1(contextO);
    }

    private void m() {
        this.f4001a.e().a(new b());
    }

    public void k() {
        m1 m1Var = this.g;
        if (m1Var != null) {
            m1Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.j = ((Boolean) this.f4001a.a(x4.f6079l1)).booleanValue();
            if (this.g == null) {
                this.g = new m1(this.f4001a, this);
            }
            this.g.a();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (h() || !f4000n.compareAndSet(false, true)) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object objA = this.f4001a.H().a();
        if (objA != null) {
            e(objA);
            return;
        }
        synchronized (this.f4004d) {
            arrayList = new ArrayList(this.f4003c.values());
        }
        Collections.reverse(arrayList);
        this.f4005e.a(arrayList, this.f4001a);
        if (!this.f4010l) {
            m();
            this.f4010l = true;
        }
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger...");
        d.a(this.f4002b, MaxCreativeDebuggerActivity.class);
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        d.a(this.f4002b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f4001a.e(), new c(obj));
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
        WeakReference weakReference = f3999m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f4009k);
        if (this.f4009k == 0 || seconds < 10) {
            return;
        }
        this.f4001a.D().a(d2.f3877d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f4001a.W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f4008i = 0;
    }

    @Override // com.applovin.impl.m1.a
    public void b() {
        if (this.f4008i == 0) {
            this.f4007h = g7.a(TimeUnit.SECONDS.toMillis(3L), this.f4001a, new a9(this, 0));
        }
        int i4 = this.f4008i;
        if (i4 % 2 == 0) {
            this.f4008i = i4 + 1;
        }
    }

    public boolean g() {
        return ((Boolean) this.f4001a.a(x4.f6071k1)).booleanValue() && this.f4001a.n0().isCreativeDebuggerEnabled();
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
        int i4 = this.f4008i;
        if (i4 % 2 == 1) {
            this.f4008i = i4 + 1;
        }
        if (this.f4008i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new a9(this, 1));
            this.f4008i = 0;
            this.f4007h.a();
        }
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!w3.a(obj) || c(obj)) {
                String strB = b(obj);
                synchronized (this.f4004d) {
                    try {
                        q1 q1Var = (q1) this.f4003c.get(strB);
                        if (q1Var != null) {
                            q1Var.a(obj);
                        } else {
                            this.f4003c.put(strB, new q1(obj, System.currentTimeMillis()));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (g() && this.f4006f.get() == null && !h()) {
            Activity activityB = this.f4001a.e().b();
            if (activityB == null) {
                this.f4001a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4001a.O().b("AppLovinSdk", "Failed to display Creative Debugger button");
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
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.b9
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            this.f3788a.a(viewA, frameLayout);
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    AppLovinSdkUtils.runOnUiThreadDelayed(new c9(this, viewA, frameLayout, viewTreeObserver, onGlobalLayoutListener, 0), TimeUnit.SECONDS.toMillis(5L));
                    this.f4006f = new WeakReference(viewA);
                }
            }
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.j) {
            view.setOnTouchListener(null);
            this.f4009k = 0L;
        }
        frameLayout.removeView(view);
        this.f4006f = new WeakReference(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f4006f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f4009k > 0 && this.j) {
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
        int i4 = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i4, i4, i4, i4);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i4, i4, i4, i4 * 2);
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
        if (this.j) {
            button.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.d9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f3987a.a(frameLayout, view, motionEvent);
                }
            });
        } else {
            button.setOnClickListener(new e9(0, this));
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
            this.f4009k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new a9(this, 2), TimeUnit.SECONDS.toMillis(10L));
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (view.getVisibility() == 0) {
            this.f4009k = 0L;
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
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Serializable, java.lang.Object[]] */
    public void a(q1 q1Var, Context context, boolean z3) {
        String strA = a(q1Var);
        v2 v2Var = new v2();
        if (z3) {
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
        if (z3) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage("com.google.android.gm");
                String str2 = this.f4001a.n0().getExtraParameters().get("creative_debugger_email_recipients");
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
            v2Var.a("Network", "APPLOVIN").a(bVarC).b(bVarC);
        }
        v2Var.a(this.f4001a);
        v2Var.a("Epoch Timestamp (ms)", Long.valueOf(q1Var.b()));
        v2 v2Var2 = new v2();
        v2Var2.a("Platform", "fireos".equals(this.f4001a.A().A()) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f4001a.a(x4.L3)).a("App Package Name", this.f4002b.getPackageName()).a("Device", Build.BRAND + " " + Build.MODEL + " (" + Build.DEVICE + ")").a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f4001a.h0()).a("Ad Review Version", j.b()).a(a(q1Var.a())).a("User ID", this.f4001a.w0().e() != null ? this.f4001a.w0().e() : "None").a("MD", this.f4001a.a(x4.f6138t));
        v2Var.a("\nDebug Info:\n").a(u4.b(v2Var2.toString(), n7.a(this.f4001a), u4.a.V2, this.f4001a.i0(), this.f4001a));
        return v2Var.toString();
    }

    private Bundle a(Object obj) {
        this.f4001a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4001a.O().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String strA = n7.a(obj);
        Bundle bundleA = this.f4001a.j().a(strA);
        this.f4001a.O();
        if (com.applovin.impl.sdk.o.a()) {
            a0.g.x("Serve id: ", strA, this.f4001a.O(), "CreativeDebuggerService");
        }
        this.f4001a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4001a.O().a("CreativeDebuggerService", "Public data: " + bundleA);
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
