package z3;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import c.C0364D;
import j$.util.Objects;

/* renamed from: z3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3018c {

    /* renamed from: a, reason: collision with root package name */
    public OnBackInvokedCallback f24468a;

    public OnBackInvokedCallback a(InterfaceC3017b interfaceC3017b) {
        Objects.requireNonNull(interfaceC3017b);
        return new C0364D(3, interfaceC3017b);
    }

    public void b(InterfaceC3017b interfaceC3017b, View view, boolean z6) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.f24468a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback onBackInvokedCallbackA = a(interfaceC3017b);
            this.f24468a = onBackInvokedCallbackA;
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z6 ? 1000000 : 0, onBackInvokedCallbackA);
        }
    }

    public void c(View view) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.f24468a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f24468a);
        this.f24468a = null;
    }
}
