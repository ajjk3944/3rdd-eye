package wh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.full.IllegalCallableAccessException;
import th.i;
import wh.K0;

/* renamed from: wh.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8369k0 extends B0 implements th.i {

    /* renamed from: q, reason: collision with root package name */
    private final Yg.m f65167q;

    /* renamed from: wh.k0$a */
    public static final class a extends K0.d implements i.a {

        /* renamed from: j, reason: collision with root package name */
        private final C8369k0 f65168j;

        public a(C8369k0 property) {
            AbstractC6492s.i(property, "property");
            this.f65168j = property;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalCallableAccessException {
            l0(obj);
            return Yg.J.f24997a;
        }

        @Override // wh.K0.a
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public C8369k0 e0() {
            return this.f65168j;
        }

        public void l0(Object obj) throws IllegalCallableAccessException {
            e0().set(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8369k0(AbstractC8355d0 container, Bh.Y descriptor) {
        super(container, descriptor);
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(descriptor, "descriptor");
        this.f65167q = Yg.n.a(Yg.q.PUBLICATION, new C8367j0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a t0(C8369k0 c8369k0) {
        return new a(c8369k0);
    }

    @Override // th.i
    public void set(Object obj) throws IllegalCallableAccessException {
        g().call(obj);
    }

    @Override // th.i, th.h
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public a g() {
        return (a) this.f65167q.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8369k0(AbstractC8355d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(signature, "signature");
        this.f65167q = Yg.n.a(Yg.q.PUBLICATION, new C8367j0(this));
    }
}
