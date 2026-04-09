package xg;

import gg.l;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class c extends AtomicReference implements l, Dj.c, InterfaceC6043c {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC6469f f66078a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6469f f66079b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6464a f66080c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC6469f f66081d;

    public c(InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a, InterfaceC6469f interfaceC6469f3) {
        this.f66078a = interfaceC6469f;
        this.f66079b = interfaceC6469f2;
        this.f66080c = interfaceC6464a;
        this.f66081d = interfaceC6469f3;
    }

    @Override // Dj.b
    public void a() {
        Object obj = get();
        EnumC8672g enumC8672g = EnumC8672g.CANCELLED;
        if (obj != enumC8672g) {
            lazySet(enumC8672g);
            try {
                this.f66080c.run();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                Eg.a.v(th2);
            }
        }
    }

    @Override // Dj.c
    public void cancel() {
        EnumC8672g.cancel(this);
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        cancel();
    }

    @Override // Dj.b
    public void h(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f66078a.accept(obj);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            ((Dj.c) get()).cancel();
            onError(th2);
        }
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return get() == EnumC8672g.CANCELLED;
    }

    @Override // gg.l
    public void j(Dj.c cVar) {
        if (EnumC8672g.setOnce(this, cVar)) {
            try {
                this.f66081d.accept(this);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                cVar.cancel();
                onError(th2);
            }
        }
    }

    @Override // Dj.b
    public void onError(Throwable th2) {
        Object obj = get();
        EnumC8672g enumC8672g = EnumC8672g.CANCELLED;
        if (obj == enumC8672g) {
            Eg.a.v(th2);
            return;
        }
        lazySet(enumC8672g);
        try {
            this.f66079b.accept(th2);
        } catch (Throwable th3) {
            AbstractC6152a.b(th3);
            Eg.a.v(new CompositeException(th2, th3));
        }
    }

    @Override // Dj.c
    public void request(long j10) {
        ((Dj.c) get()).request(j10);
    }
}
