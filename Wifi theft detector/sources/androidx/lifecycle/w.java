package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class w implements n {

    /* renamed from: i, reason: collision with root package name */
    public static final b f3540i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    public static final w f3541j = new w();

    /* renamed from: a, reason: collision with root package name */
    public int f3542a;

    /* renamed from: b, reason: collision with root package name */
    public int f3543b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f3546e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3544c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3545d = true;

    /* renamed from: f, reason: collision with root package name */
    public final p f3547f = new p(this);

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f3548g = new Runnable() { // from class: androidx.lifecycle.v
        @Override // java.lang.Runnable
        public final void run() {
            w.i(this.f3539a);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public final ReportFragment.a f3549h = new d();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3550a = new a();

        @JvmStatic
        @DoNotInline
        public static final void a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.p.e(activity, "activity");
            kotlin.jvm.internal.p.e(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final n a() {
            return w.f3541j;
        }

        public final void b(Context context) {
            kotlin.jvm.internal.p.e(context, "context");
            w.f3541j.h(context);
        }

        public b() {
        }
    }

    public static final class c extends e {

        public static final class a extends e {
            final /* synthetic */ w this$0;

            public a(w wVar) {
                this.this$0 = wVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@NotNull Activity activity) {
                kotlin.jvm.internal.p.e(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@NotNull Activity activity) {
                kotlin.jvm.internal.p.e(activity, "activity");
                this.this$0.f();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            kotlin.jvm.internal.p.e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                ReportFragment.INSTANCE.b(activity).f(w.this.f3549h);
            }
        }

        @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            kotlin.jvm.internal.p.e(activity, "activity");
            w.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @RequiresApi(29)
        public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            kotlin.jvm.internal.p.e(activity, "activity");
            a.a(activity, new a(w.this));
        }

        @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            kotlin.jvm.internal.p.e(activity, "activity");
            w.this.g();
        }
    }

    public static final class d implements ReportFragment.a {
        public d() {
        }

        @Override // androidx.lifecycle.ReportFragment.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.ReportFragment.a
        public void onResume() {
            w.this.e();
        }

        @Override // androidx.lifecycle.ReportFragment.a
        public void onStart() {
            w.this.f();
        }
    }

    public static final void i(w this$0) {
        kotlin.jvm.internal.p.e(this$0, "this$0");
        this$0.j();
        this$0.k();
    }

    public static final n l() {
        return f3540i.a();
    }

    public final void d() {
        int i10 = this.f3543b - 1;
        this.f3543b = i10;
        if (i10 == 0) {
            Handler handler = this.f3546e;
            kotlin.jvm.internal.p.b(handler);
            handler.postDelayed(this.f3548g, 700L);
        }
    }

    public final void e() {
        int i10 = this.f3543b + 1;
        this.f3543b = i10;
        if (i10 == 1) {
            if (this.f3544c) {
                this.f3547f.i(Lifecycle.Event.ON_RESUME);
                this.f3544c = false;
            } else {
                Handler handler = this.f3546e;
                kotlin.jvm.internal.p.b(handler);
                handler.removeCallbacks(this.f3548g);
            }
        }
    }

    public final void f() {
        int i10 = this.f3542a + 1;
        this.f3542a = i10;
        if (i10 == 1 && this.f3545d) {
            this.f3547f.i(Lifecycle.Event.ON_START);
            this.f3545d = false;
        }
    }

    public final void g() {
        this.f3542a--;
        k();
    }

    @Override // androidx.lifecycle.n
    public Lifecycle getLifecycle() {
        return this.f3547f;
    }

    public final void h(Context context) {
        kotlin.jvm.internal.p.e(context, "context");
        this.f3546e = new Handler();
        this.f3547f.i(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.p.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f3543b == 0) {
            this.f3544c = true;
            this.f3547f.i(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f3542a == 0 && this.f3544c) {
            this.f3547f.i(Lifecycle.Event.ON_STOP);
            this.f3545d = true;
        }
    }
}
