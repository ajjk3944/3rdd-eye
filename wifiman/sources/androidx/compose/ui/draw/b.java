package androidx.compose.ui.draw;

import j0.C6233d;
import j0.InterfaceC6232c;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class b {
    public static final InterfaceC6232c a(InterfaceC6835l interfaceC6835l) {
        return new a(new C6233d(), interfaceC6835l);
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l) {
        return eVar.b0(new DrawBehindElement(interfaceC6835l));
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l) {
        return eVar.b0(new DrawWithCacheElement(interfaceC6835l));
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l) {
        return eVar.b0(new DrawWithContentElement(interfaceC6835l));
    }
}
