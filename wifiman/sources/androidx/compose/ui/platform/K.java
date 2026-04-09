package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.AbstractC6492s;
import y0.C8580a;
import y0.InterfaceC8599t;

/* loaded from: classes.dex */
final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final K f29214a = new K();

    private K() {
    }

    public final void a(View view, InterfaceC8599t interfaceC8599t) {
        PointerIcon systemIcon = interfaceC8599t instanceof C8580a ? PointerIcon.getSystemIcon(view.getContext(), ((C8580a) interfaceC8599t).a()) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (AbstractC6492s.d(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
