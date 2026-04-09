package wh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.full.IllegalCallableAccessException;
import th.h;
import wh.K0;

/* renamed from: wh.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8377o0 extends H0 implements th.o, th.h {

    /* renamed from: q, reason: collision with root package name */
    private final Yg.m f65186q;

    /* renamed from: wh.o0$a */
    public static final class a extends K0.d implements h.a, mh.q {

        /* renamed from: j, reason: collision with root package name */
        private final C8377o0 f65187j;

        public a(C8377o0 property) {
            AbstractC6492s.i(property, "property");
            this.f65187j = property;
        }

        @Override // wh.K0.a
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public C8377o0 e0() {
            return this.f65187j;
        }

        public void l0(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            e0().w0(obj, obj2, obj3);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            l0(obj, obj2, obj3);
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8377o0(AbstractC8355d0 container, Bh.Y descriptor) {
        super(container, descriptor);
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(descriptor, "descriptor");
        this.f65186q = Yg.n.a(Yg.q.PUBLICATION, new C8375n0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a t0(C8377o0 c8377o0) {
        return new a(c8377o0);
    }

    @Override // th.h
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public a g() {
        return (a) this.f65186q.getValue();
    }

    public void w0(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
        g().call(obj, obj2, obj3);
    }
}
