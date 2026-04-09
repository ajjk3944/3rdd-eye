package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.B;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class y implements InterfaceC4017o {

    /* renamed from: i, reason: collision with root package name */
    public static final b f31698i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    private static final y f31699j = new y();

    /* renamed from: a, reason: collision with root package name */
    private int f31700a;

    /* renamed from: b, reason: collision with root package name */
    private int f31701b;

    /* renamed from: e, reason: collision with root package name */
    private Handler f31704e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31702c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31703d = true;

    /* renamed from: f, reason: collision with root package name */
    private final C4018p f31705f = new C4018p(this);

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f31706g = new Runnable() { // from class: androidx.lifecycle.x
        @Override // java.lang.Runnable
        public final void run() {
            y.j(this.f31697a);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private final B.a f31707h = new d();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31708a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            AbstractC6492s.i(activity, "activity");
            AbstractC6492s.i(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4017o a() {
            return y.f31699j;
        }

        public final void b(Context context) {
            AbstractC6492s.i(context, "context");
            y.f31699j.i(context);
        }

        private b() {
        }
    }

    public static final class c extends AbstractC4009g {

        public static final class a extends AbstractC4009g {
            final /* synthetic */ y this$0;

            a(y yVar) {
                this.this$0 = yVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                AbstractC6492s.i(activity, "activity");
                this.this$0.f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                AbstractC6492s.i(activity, "activity");
                this.this$0.g();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.AbstractC4009g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC6492s.i(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                B.INSTANCE.b(activity).e(y.this.f31707h);
            }
        }

        @Override // androidx.lifecycle.AbstractC4009g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC6492s.i(activity, "activity");
            y.this.e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            AbstractC6492s.i(activity, "activity");
            a.a(activity, new a(y.this));
        }

        @Override // androidx.lifecycle.AbstractC4009g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC6492s.i(activity, "activity");
            y.this.h();
        }
    }

    public static final class d implements B.a {
        d() {
        }

        @Override // androidx.lifecycle.B.a
        public void a() {
        }

        @Override // androidx.lifecycle.B.a
        public void b() {
            y.this.g();
        }

        @Override // androidx.lifecycle.B.a
        public void c() {
            y.this.f();
        }
    }

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(y this$0) {
        AbstractC6492s.i(this$0, "this$0");
        this$0.k();
        this$0.l();
    }

    @Override // androidx.lifecycle.InterfaceC4017o
    public AbstractC4013k O() {
        return this.f31705f;
    }

    public final void e() {
        int i10 = this.f31701b - 1;
        this.f31701b = i10;
        if (i10 == 0) {
            Handler handler = this.f31704e;
            AbstractC6492s.f(handler);
            handler.postDelayed(this.f31706g, 700L);
        }
    }

    public final void f() {
        int i10 = this.f31701b + 1;
        this.f31701b = i10;
        if (i10 == 1) {
            if (this.f31702c) {
                this.f31705f.h(AbstractC4013k.a.ON_RESUME);
                this.f31702c = false;
            } else {
                Handler handler = this.f31704e;
                AbstractC6492s.f(handler);
                handler.removeCallbacks(this.f31706g);
            }
        }
    }

    public final void g() {
        int i10 = this.f31700a + 1;
        this.f31700a = i10;
        if (i10 == 1 && this.f31703d) {
            this.f31705f.h(AbstractC4013k.a.ON_START);
            this.f31703d = false;
        }
    }

    public final void h() {
        this.f31700a--;
        l();
    }

    public final void i(Context context) {
        AbstractC6492s.i(context, "context");
        this.f31704e = new Handler();
        this.f31705f.h(AbstractC4013k.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        AbstractC6492s.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void k() {
        if (this.f31701b == 0) {
            this.f31702c = true;
            this.f31705f.h(AbstractC4013k.a.ON_PAUSE);
        }
    }

    public final void l() {
        if (this.f31700a == 0 && this.f31702c) {
            this.f31705f.h(AbstractC4013k.a.ON_STOP);
            this.f31703d = true;
        }
    }
}
