package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.O;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher.kt */
/* renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1787u {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f16182a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.kt */
    /* renamed from: androidx.lifecycle.u$a */
    public static final class a extends C1774g {
        @Override // androidx.lifecycle.C1774g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.f(activity, "activity");
            int i = O.f16088c;
            O.a.b(activity);
        }
    }
}
