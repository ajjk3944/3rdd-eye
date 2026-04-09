package c;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* renamed from: c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384i {

    /* renamed from: a, reason: collision with root package name */
    public static final C0384i f5833a = new C0384i();

    public final OnBackInvokedDispatcher a(Activity activity) {
        q5.i.e(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        q5.i.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
