package wh;

import java.lang.reflect.Member;
import kotlin.jvm.internal.AbstractC6492s;
import th.n;
import wh.K0;

/* loaded from: classes4.dex */
public class E0 extends K0 implements th.n {

    /* renamed from: o, reason: collision with root package name */
    private final Yg.m f65020o;

    /* renamed from: p, reason: collision with root package name */
    private final Yg.m f65021p;

    public static final class a extends K0.c implements n.a {

        /* renamed from: j, reason: collision with root package name */
        private final E0 f65022j;

        public a(E0 property) {
            AbstractC6492s.i(property, "property");
            this.f65022j = property;
        }

        @Override // mh.InterfaceC6835l
        public Object invoke(Object obj) {
            return e0().get(obj);
        }

        @Override // wh.K0.a
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public E0 e0() {
            return this.f65022j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(AbstractC8355d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(signature, "signature");
        Yg.q qVar = Yg.q.PUBLICATION;
        this.f65020o = Yg.n.a(qVar, new C0(this));
        this.f65021p = Yg.n.a(qVar, new D0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a o0(E0 e02) {
        return new a(e02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member r0(E0 e02) {
        return e02.h0();
    }

    @Override // th.n
    public Object get(Object obj) {
        return l0().call(obj);
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // wh.K0
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public a l0() {
        return (a) this.f65020o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(AbstractC8355d0 container, Bh.Y descriptor) {
        super(container, descriptor);
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(descriptor, "descriptor");
        Yg.q qVar = Yg.q.PUBLICATION;
        this.f65020o = Yg.n.a(qVar, new C0(this));
        this.f65021p = Yg.n.a(qVar, new D0(this));
    }
}
