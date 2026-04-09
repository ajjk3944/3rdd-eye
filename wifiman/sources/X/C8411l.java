package x;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6835l;
import r.AbstractC7537l;
import r.InterfaceC7533i;
import w.v;

/* renamed from: x.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8411l implements InterfaceC8401b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7533i f65296a;

    public C8411l(InterfaceC7533i interfaceC7533i) {
        this.f65296a = interfaceC7533i;
    }

    @Override // x.InterfaceC8401b
    public /* bridge */ /* synthetic */ Object a(v vVar, Object obj, Object obj2, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return b(vVar, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), interfaceC6835l, interfaceC5380e);
    }

    public Object b(v vVar, float f10, float f11, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        Object objH = AbstractC8407h.h(vVar, Math.abs(f10) * Math.signum(f11), f10, AbstractC7537l.c(0.0f, f11, 0L, 0L, false, 28, null), this.f65296a, interfaceC6835l, interfaceC5380e);
        return objH == AbstractC5467b.g() ? objH : (C8400a) objH;
    }
}
