package wh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.full.IllegalCallableAccessException;
import th.j;
import wh.K0;

/* renamed from: wh.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8373m0 extends E0 implements th.j {

    /* renamed from: q, reason: collision with root package name */
    private final Yg.m f65174q;

    /* renamed from: wh.m0$a */
    public static final class a extends K0.d implements j.a {

        /* renamed from: j, reason: collision with root package name */
        private final C8373m0 f65175j;

        public a(C8373m0 property) {
            AbstractC6492s.i(property, "property");
            this.f65175j = property;
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
            l0(obj, obj2);
            return Yg.J.f24997a;
        }

        @Override // wh.K0.a
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public C8373m0 e0() {
            return this.f65175j;
        }

        public void l0(Object obj, Object obj2) throws IllegalCallableAccessException {
            e0().w0(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8373m0(AbstractC8355d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(signature, "signature");
        this.f65174q = Yg.n.a(Yg.q.PUBLICATION, new C8371l0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a t0(C8373m0 c8373m0) {
        return new a(c8373m0);
    }

    @Override // th.j, th.h
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public a g() {
        return (a) this.f65174q.getValue();
    }

    public void w0(Object obj, Object obj2) throws IllegalCallableAccessException {
        g().call(obj, obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8373m0(AbstractC8355d0 container, Bh.Y descriptor) {
        super(container, descriptor);
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(descriptor, "descriptor");
        this.f65174q = Yg.n.a(Yg.q.PUBLICATION, new C8371l0(this));
    }
}
