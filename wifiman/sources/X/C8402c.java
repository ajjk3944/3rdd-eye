package x;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6835l;
import r.AbstractC7537l;
import r.InterfaceC7550z;
import w.v;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8402c implements InterfaceC8401b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7550z f65243a;

    public C8402c(InterfaceC7550z interfaceC7550z) {
        this.f65243a = interfaceC7550z;
    }

    @Override // x.InterfaceC8401b
    public /* bridge */ /* synthetic */ Object a(v vVar, Object obj, Object obj2, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return b(vVar, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), interfaceC6835l, interfaceC5380e);
    }

    public Object b(v vVar, float f10, float f11, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        Object objF = AbstractC8407h.f(vVar, f10, AbstractC7537l.c(0.0f, f11, 0L, 0L, false, 28, null), this.f65243a, interfaceC6835l, interfaceC5380e);
        return objF == AbstractC5467b.g() ? objF : (C8400a) objF;
    }
}
