package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4014l {

    /* renamed from: a, reason: collision with root package name */
    public static final C4014l f31660a = new C4014l();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f31661b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.l$a */
    public static final class a extends AbstractC4009g {
        @Override // androidx.lifecycle.AbstractC4009g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC6492s.i(activity, "activity");
            B.INSTANCE.c(activity);
        }
    }

    private C4014l() {
    }

    public static final void a(Context context) {
        AbstractC6492s.i(context, "context");
        if (f31661b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        AbstractC6492s.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
