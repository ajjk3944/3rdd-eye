package c;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: c.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365E {

    /* renamed from: a, reason: collision with root package name */
    public static final C0365E f5790a = new C0365E();

    public final OnBackInvokedCallback a(p5.a aVar) {
        q5.i.e(aVar, "onBackInvoked");
        return new C0364D(0, aVar);
    }

    public final void b(Object obj, int i, Object obj2) {
        q5.i.e(obj, "dispatcher");
        q5.i.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        q5.i.e(obj, "dispatcher");
        q5.i.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
