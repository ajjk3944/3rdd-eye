package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.AbstractC1781n;

/* compiled from: ProcessLifecycleOwner.kt */
/* loaded from: classes.dex */
public final class J implements InterfaceC1790x {

    /* renamed from: j, reason: collision with root package name */
    public static final J f16049j = new J();

    /* renamed from: b, reason: collision with root package name */
    public int f16050b;

    /* renamed from: c, reason: collision with root package name */
    public int f16051c;

    /* renamed from: f, reason: collision with root package name */
    public Handler f16054f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16052d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16053e = true;

    /* renamed from: g, reason: collision with root package name */
    public final C1791y f16055g = new C1791y(this);

    /* renamed from: h, reason: collision with root package name */
    public final B.b f16056h = new B.b(this, 12);
    public final b i = new b();

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class a {
        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.l.f(activity, "activity");
            kotlin.jvm.internal.l.f(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class b {
        public b() {
        }
    }

    public final void a() {
        int i = this.f16051c + 1;
        this.f16051c = i;
        if (i == 1) {
            if (this.f16052d) {
                this.f16055g.d(AbstractC1781n.a.ON_RESUME);
                this.f16052d = false;
            } else {
                Handler handler = this.f16054f;
                kotlin.jvm.internal.l.c(handler);
                handler.removeCallbacks(this.f16056h);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC1790x
    public final AbstractC1781n getLifecycle() {
        return this.f16055g;
    }
}
