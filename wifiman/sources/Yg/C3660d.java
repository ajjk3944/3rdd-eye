package Yg;

import Yg.u;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.V;

/* renamed from: Yg.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3660d extends AbstractC3659c implements InterfaceC5380e {

    /* renamed from: a, reason: collision with root package name */
    private mh.q f25002a;

    /* renamed from: b, reason: collision with root package name */
    private Object f25003b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5380e f25004c;

    /* renamed from: d, reason: collision with root package name */
    private Object f25005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3660d(mh.q block, Object obj) {
        super(null);
        AbstractC6492s.i(block, "block");
        this.f25002a = block;
        this.f25003b = obj;
        AbstractC6492s.g(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f25004c = this;
        this.f25005d = AbstractC3658b.f25001a;
    }

    @Override // Yg.AbstractC3659c
    public Object a(Object obj, InterfaceC5380e interfaceC5380e) {
        AbstractC6492s.g(interfaceC5380e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f25004c = interfaceC5380e;
        this.f25003b = obj;
        Object objG = AbstractC5467b.g();
        if (objG == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objG;
    }

    public final Object b() {
        while (true) {
            Object obj = this.f25005d;
            InterfaceC5380e interfaceC5380e = this.f25004c;
            if (interfaceC5380e == null) {
                v.b(obj);
                return obj;
            }
            if (u.g(AbstractC3658b.f25001a, obj)) {
                try {
                    mh.q qVar = this.f25002a;
                    Object obj2 = this.f25003b;
                    Object objF = !(qVar instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC5467b.f(qVar, this, obj2, interfaceC5380e) : ((mh.q) V.f(qVar, 3)).s(this, obj2, interfaceC5380e);
                    if (objF != AbstractC5467b.g()) {
                        interfaceC5380e.resumeWith(u.c(objF));
                    }
                } catch (Throwable th2) {
                    u.a aVar = u.f25017b;
                    interfaceC5380e.resumeWith(u.c(v.a(th2)));
                }
            } else {
                this.f25005d = AbstractC3658b.f25001a;
                interfaceC5380e.resumeWith(obj);
            }
        }
    }

    @Override // dh.InterfaceC5380e
    public InterfaceC5384i getContext() {
        return C5385j.f46088a;
    }

    @Override // dh.InterfaceC5380e
    public void resumeWith(Object obj) {
        this.f25004c = null;
        this.f25005d = obj;
    }
}
