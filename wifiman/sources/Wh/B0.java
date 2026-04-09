package wh;

import kotlin.jvm.internal.AbstractC6492s;
import th.m;
import wh.K0;

/* loaded from: classes4.dex */
public class B0 extends K0 implements th.m {

    /* renamed from: o, reason: collision with root package name */
    private final Yg.m f65012o;

    /* renamed from: p, reason: collision with root package name */
    private final Yg.m f65013p;

    public static final class a extends K0.c implements m.a {

        /* renamed from: j, reason: collision with root package name */
        private final B0 f65014j;

        public a(B0 property) {
            AbstractC6492s.i(property, "property");
            this.f65014j = property;
        }

        @Override // mh.InterfaceC6824a
        public Object invoke() {
            return a().get();
        }

        @Override // wh.K0.a
        /* renamed from: k0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public B0 e0() {
            return this.f65014j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(AbstractC8355d0 container, Bh.Y descriptor) {
        super(container, descriptor);
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(descriptor, "descriptor");
        Yg.q qVar = Yg.q.PUBLICATION;
        this.f65012o = Yg.n.a(qVar, new C8398z0(this));
        this.f65013p = Yg.n.a(qVar, new A0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a o0(B0 b02) {
        return new a(b02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object r0(B0 b02) {
        return b02.j0(b02.h0(), null, null);
    }

    @Override // th.m
    public Object get() {
        return d().call(new Object[0]);
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return get();
    }

    @Override // wh.K0
    /* renamed from: s0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a l0() {
        return (a) this.f65012o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(AbstractC8355d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(signature, "signature");
        Yg.q qVar = Yg.q.PUBLICATION;
        this.f65012o = Yg.n.a(qVar, new C8398z0(this));
        this.f65013p = Yg.n.a(qVar, new A0(this));
    }
}
