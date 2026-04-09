package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.C4139k0;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.x22;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4118h0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28049a;

    /* renamed from: b, reason: collision with root package name */
    private final C4139k0 f28050b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4083c0 f28051c;

    /* renamed from: d, reason: collision with root package name */
    private final x22 f28052d;

    /* renamed from: e, reason: collision with root package name */
    private final a f28053e;

    public C4118h0(Context context, C4072a3 adConfiguration, InterfaceC4132j0 interactionEventListener, Context applicationContext, C4139k0 activityInteractionTracker, InterfaceC4083c0 activityBackgroundListener, x22 strongReferenceKeepingManager) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(interactionEventListener, "interactionEventListener");
        kotlin.jvm.internal.l.f(applicationContext, "applicationContext");
        kotlin.jvm.internal.l.f(activityInteractionTracker, "activityInteractionTracker");
        kotlin.jvm.internal.l.f(activityBackgroundListener, "activityBackgroundListener");
        kotlin.jvm.internal.l.f(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        this.f28049a = applicationContext;
        this.f28050b = activityInteractionTracker;
        this.f28051c = activityBackgroundListener;
        this.f28052d = strongReferenceKeepingManager;
        this.f28053e = new a(this);
    }

    public final void a() {
        this.f28051c.b(this.f28049a, (InterfaceC4160n0) this.f28053e);
        this.f28051c.b(this.f28049a, this.f28053e);
    }

    public final void b() {
        this.f28050b.a(C4139k0.a.f29444e);
    }

    public final void c() {
        this.f28050b.b(C4139k0.a.f29444e);
    }

    public final void d() {
        this.f28050b.a(C4139k0.a.f29442c);
        this.f28051c.a(this.f28049a, (InterfaceC4160n0) this.f28053e);
        this.f28051c.a(this.f28049a, this.f28053e);
        this.f28052d.a(kq0.f29757d, this);
    }

    public final void e() {
        this.f28052d.b(kq0.f29757d, this);
        this.f28051c.b(this.f28049a, (InterfaceC4160n0) this.f28053e);
        this.f28051c.b(this.f28049a, this.f28053e);
        this.f28050b.b(C4139k0.a.f29442c);
    }

    public final void f() {
        this.f28050b.a(C4139k0.a.f29443d);
    }

    public final void g() {
        this.f28050b.b(C4139k0.a.f29443d);
    }

    public final void a(o71 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f28050b.a(reportParameterManager);
    }

    /* renamed from: com.yandex.mobile.ads.impl.h0$a */
    public static final class a implements InterfaceC4160n0, fr1 {

        /* renamed from: a, reason: collision with root package name */
        private final C4118h0 f28054a;

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<Activity> f28055b;

        /* renamed from: c, reason: collision with root package name */
        private String f28056c;

        public a(C4118h0 activityInteractionController) {
            kotlin.jvm.internal.l.f(activityInteractionController, "activityInteractionController");
            this.f28054a = activityInteractionController;
        }

        @Override // com.yandex.mobile.ads.impl.fr1
        public final void a(Activity activity, Bundle bundle) {
            String string;
            kotlin.jvm.internal.l.f(activity, "activity");
            activity.toString();
            fp0.a(new Object[0]);
            if (bundle == null || (string = bundle.getString("monetization_ads_activity_id")) == null || !string.equals(this.f28056c)) {
                return;
            }
            this.f28054a.d();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4160n0
        public final void b(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            activity.toString();
            boolean z10 = false;
            fp0.a(new Object[0]);
            du1 du1VarA = ew1.a.a().a(activity);
            boolean z11 = du1VarA != null && du1VarA.w0();
            Intent intent = activity.getIntent();
            if (intent != null && intent.getBooleanExtra("monetization_ads_activity_click", false)) {
                z10 = true;
            }
            WeakReference<Activity> weakReference = this.f28055b;
            if ((weakReference == null || !activity.equals(weakReference.get()) || z11) && (!z11 || z10)) {
                return;
            }
            this.f28054a.d();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4160n0
        public final void a(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            activity.toString();
            fp0.a(new Object[0]);
            if (this.f28055b == null) {
                this.f28055b = new WeakReference<>(activity);
            }
        }

        @Override // com.yandex.mobile.ads.impl.fr1
        public final void b(Activity activity, Bundle bundle) {
            WeakReference<Activity> weakReference;
            kotlin.jvm.internal.l.f(activity, "activity");
            activity.toString();
            fp0.a(new Object[0]);
            if (bundle == null || (weakReference = this.f28055b) == null || !activity.equals(weakReference.get())) {
                return;
            }
            String string = UUID.randomUUID().toString();
            this.f28056c = string;
            bundle.putString("monetization_ads_activity_id", string);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4118h0(Context context, C4072a3 c4072a3, a8 a8Var, InterfaceC4132j0 interfaceC4132j0, h80 h80Var) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, c4072a3, interfaceC4132j0, applicationContext, new C4139k0(context, c4072a3, a8Var, interfaceC4132j0, h80Var), C4090d0.a(), x22.a.a());
    }
}
