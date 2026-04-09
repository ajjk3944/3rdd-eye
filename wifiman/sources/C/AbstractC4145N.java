package c;

import android.view.View;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: c.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4145N {
    public static final InterfaceC4141J a(View view) {
        AbstractC6492s.i(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(AbstractC4142K.f33515b);
            InterfaceC4141J interfaceC4141J = tag instanceof InterfaceC4141J ? (InterfaceC4141J) tag : null;
            if (interfaceC4141J != null) {
                return interfaceC4141J;
            }
            Object objA = J1.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, InterfaceC4141J onBackPressedDispatcherOwner) {
        AbstractC6492s.i(view, "<this>");
        AbstractC6492s.i(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(AbstractC4142K.f33515b, onBackPressedDispatcherOwner);
    }
}
