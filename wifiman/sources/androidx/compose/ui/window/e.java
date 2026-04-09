package androidx.compose.ui.window;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import mh.InterfaceC6824a;
import org.snmp4j.mp.SnmpConstants;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f29928a = new e();

    private e() {
    }

    public static final OnBackInvokedCallback b(final InterfaceC6824a interfaceC6824a) {
        return new OnBackInvokedCallback() { // from class: androidx.compose.ui.window.d
            public final void onBackInvoked() {
                e.c(interfaceC6824a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a != null) {
            interfaceC6824a.invoke();
        }
    }

    public static final void d(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(SnmpConstants.MILLISECOND_TO_NANOSECOND, (OnBackInvokedCallback) obj);
    }

    public static final void e(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
    }
}
