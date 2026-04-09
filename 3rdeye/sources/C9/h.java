package C9;

import A9.AbstractC0565a;
import A9.C0596p0;
import C9.b;
import b9.C1992A;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import java.util.concurrent.CancellationException;

/* compiled from: ChannelCoroutine.kt */
/* loaded from: classes3.dex */
public class h<E> extends AbstractC0565a<C1992A> implements g<E> {

    /* renamed from: e, reason: collision with root package name */
    public final b f1003e;

    public h(InterfaceC4350h interfaceC4350h, b bVar) {
        super(interfaceC4350h, true, true);
        this.f1003e = bVar;
    }

    @Override // C9.x
    public final void b(p9.l<? super Throwable, C1992A> lVar) {
        this.f1003e.b(lVar);
    }

    @Override // A9.C0605u0, A9.InterfaceC0594o0
    public final void c(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0596p0(x(), null, this);
        }
        v(cancellationException);
    }

    @Override // C9.w
    public final Object d() {
        return this.f1003e.d();
    }

    @Override // C9.w
    public final Object f(h9.i iVar) {
        b bVar = this.f1003e;
        bVar.getClass();
        Object objD = b.D(bVar, iVar);
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        return objD;
    }

    @Override // C9.x
    public final boolean h(Throwable th) {
        return this.f1003e.k(false, th);
    }

    @Override // C9.x
    public final Object i(E e4) {
        return this.f1003e.i(e4);
    }

    @Override // C9.w
    public final i<E> iterator() {
        b bVar = this.f1003e;
        bVar.getClass();
        return new b.a();
    }

    @Override // C9.x
    public final Object m(InterfaceC4347e interfaceC4347e, Object obj) {
        return this.f1003e.m(interfaceC4347e, obj);
    }

    @Override // C9.x
    public final boolean o() {
        return this.f1003e.o();
    }

    @Override // A9.C0605u0
    public final void v(CancellationException cancellationException) {
        this.f1003e.k(true, cancellationException);
        u(cancellationException);
    }
}
