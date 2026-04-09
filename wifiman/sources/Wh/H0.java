package wh;

import java.lang.reflect.Member;
import kotlin.jvm.internal.AbstractC6480f;
import kotlin.jvm.internal.AbstractC6492s;
import th.o;
import wh.K0;

/* loaded from: classes4.dex */
public class H0 extends K0 implements th.o {

    /* renamed from: o, reason: collision with root package name */
    private final Yg.m f65028o;

    /* renamed from: p, reason: collision with root package name */
    private final Yg.m f65029p;

    public static final class a extends K0.c implements o.a {

        /* renamed from: j, reason: collision with root package name */
        private final H0 f65030j;

        public a(H0 property) {
            AbstractC6492s.i(property, "property");
            this.f65030j = property;
        }

        @Override // mh.InterfaceC6839p
        public Object invoke(Object obj, Object obj2) {
            return e0().P(obj, obj2);
        }

        @Override // wh.K0.a
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public H0 e0() {
            return this.f65030j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(AbstractC8355d0 container, String name, String signature) {
        super(container, name, signature, AbstractC6480f.NO_RECEIVER);
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(signature, "signature");
        Yg.q qVar = Yg.q.PUBLICATION;
        this.f65028o = Yg.n.a(qVar, new F0(this));
        this.f65029p = Yg.n.a(qVar, new G0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a o0(H0 h02) {
        return new a(h02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member r0(H0 h02) {
        return h02.h0();
    }

    @Override // th.o
    public Object P(Object obj, Object obj2) {
        return l0().call(obj, obj2);
    }

    @Override // mh.InterfaceC6839p
    public Object invoke(Object obj, Object obj2) {
        return P(obj, obj2);
    }

    @Override // wh.K0
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public a l0() {
        return (a) this.f65028o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(AbstractC8355d0 container, Bh.Y descriptor) {
        super(container, descriptor);
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(descriptor, "descriptor");
        Yg.q qVar = Yg.q.PUBLICATION;
        this.f65028o = Yg.n.a(qVar, new F0(this));
        this.f65029p = Yg.n.a(qVar, new G0(this));
    }
}
