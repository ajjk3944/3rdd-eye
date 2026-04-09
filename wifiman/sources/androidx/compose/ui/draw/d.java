package androidx.compose.ui.draw;

import C0.InterfaceC2528h;
import m0.AbstractC6735w0;
import r0.AbstractC7554d;

/* loaded from: classes.dex */
public abstract class d {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, AbstractC7554d abstractC7554d, boolean z10, f0.c cVar, InterfaceC2528h interfaceC2528h, float f10, AbstractC6735w0 abstractC6735w0) {
        return eVar.b0(new PainterElement(abstractC7554d, z10, cVar, interfaceC2528h, f10, abstractC6735w0));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, AbstractC7554d abstractC7554d, boolean z10, f0.c cVar, InterfaceC2528h interfaceC2528h, float f10, AbstractC6735w0 abstractC6735w0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            cVar = f0.c.f46573a.e();
        }
        f0.c cVar2 = cVar;
        if ((i10 & 8) != 0) {
            interfaceC2528h = InterfaceC2528h.f2145a.c();
        }
        InterfaceC2528h interfaceC2528h2 = interfaceC2528h;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            abstractC6735w0 = null;
        }
        return a(eVar, abstractC7554d, z11, cVar2, interfaceC2528h2, f11, abstractC6735w0);
    }
}
