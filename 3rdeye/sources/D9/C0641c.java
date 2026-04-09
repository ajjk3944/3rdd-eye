package D9;

import b9.C1992A;
import f9.C4351i;
import f9.InterfaceC4347e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: Channels.kt */
/* renamed from: D9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0641c<T> extends E9.g<T> {
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final C9.b f1183e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(C0641c.class, "consumed$volatile");
    }

    public C0641c(C9.b bVar) {
        super(C4351i.f37871b, -3, C9.a.SUSPEND);
        this.f1183e = bVar;
        this.consumed$volatile = 0;
    }

    @Override // E9.g, D9.InterfaceC0644f
    public final Object b(InterfaceC0645g<? super T> interfaceC0645g, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        if (this.f1499c == -3) {
            Object objA = C0646h.a(interfaceC0645g, this.f1183e, false, interfaceC4347e);
            return objA == g9.a.COROUTINE_SUSPENDED ? objA : C1992A.f18074a;
        }
        Object objB = super.b(interfaceC0645g, interfaceC4347e);
        return objB == g9.a.COROUTINE_SUSPENDED ? objB : C1992A.f18074a;
    }

    @Override // E9.g
    public final String c() {
        return "channel=" + this.f1183e;
    }

    @Override // E9.g
    public final Object d(C9.u<? super T> uVar, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        Object objA = C0646h.a(new E9.r(uVar), this.f1183e, false, interfaceC4347e);
        return objA == g9.a.COROUTINE_SUSPENDED ? objA : C1992A.f18074a;
    }

    @Override // E9.g
    public final InterfaceC0644f<T> e() {
        return new C0641c(this.f1183e);
    }

    @Override // E9.g
    public final C9.w<T> f(A9.E e4) {
        return this.f1499c == -3 ? this.f1183e : super.f(e4);
    }
}
