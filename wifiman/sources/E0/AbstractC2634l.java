package E0;

import android.view.View;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: E0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2634l {
    public static final View a(InterfaceC2632j interfaceC2632j) {
        if (!interfaceC2632j.h1().k2()) {
            B0.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        Object objB = K.b(AbstractC2633k.m(interfaceC2632j));
        AbstractC6492s.g(objB, "null cannot be cast to non-null type android.view.View");
        return (View) objB;
    }
}
