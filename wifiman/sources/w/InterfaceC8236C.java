package w;

import dh.InterfaceC5380e;
import mh.InterfaceC6835l;

/* renamed from: w.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8236C extends n {
    static /* synthetic */ Object b(InterfaceC8236C interfaceC8236C, v vVar, float f10, InterfaceC5380e interfaceC5380e) {
        return interfaceC8236C.c(vVar, f10, AbstractC8237D.f63823a, interfaceC5380e);
    }

    @Override // w.n
    default Object a(v vVar, float f10, InterfaceC5380e interfaceC5380e) {
        return b(this, vVar, f10, interfaceC5380e);
    }

    Object c(v vVar, float f10, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e);
}
