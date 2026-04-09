package ug;

import gg.D;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import kg.InterfaceC6469f;

/* renamed from: ug.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8172g extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D f62984a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6469f f62985b;

    /* renamed from: ug.g$a */
    final class a implements gg.B {

        /* renamed from: a, reason: collision with root package name */
        private final gg.B f62986a;

        a(gg.B b10) {
            this.f62986a = b10;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f62986a.c(interfaceC6043c);
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            try {
                C8172g.this.f62985b.accept(th2);
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f62986a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            this.f62986a.onSuccess(obj);
        }
    }

    public C8172g(D d10, InterfaceC6469f interfaceC6469f) {
        this.f62984a = d10;
        this.f62985b = interfaceC6469f;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f62984a.a(new a(b10));
    }
}
