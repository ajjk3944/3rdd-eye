package Zi;

import Vi.InterfaceC3627a;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public abstract class Z0 implements Yi.e, Yi.c {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f25610b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f25611c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object L(Z0 z02, InterfaceC3627a interfaceC3627a, Object obj) {
        return (interfaceC3627a.a().c() || z02.y()) ? z02.N(interfaceC3627a, obj) : z02.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object M(Z0 z02, InterfaceC3627a interfaceC3627a, Object obj) {
        return z02.N(interfaceC3627a, obj);
    }

    private final Object e0(Object obj, InterfaceC6824a interfaceC6824a) {
        d0(obj);
        Object objInvoke = interfaceC6824a.invoke();
        if (!this.f25611c) {
            c0();
        }
        this.f25611c = false;
        return objInvoke;
    }

    @Override // Yi.c
    public final float A(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return T(a0(descriptor, i10));
    }

    @Override // Yi.c
    public final short C(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return X(a0(descriptor, i10));
    }

    @Override // Yi.e
    public final byte D() {
        return P(c0());
    }

    @Override // Yi.c
    public final Yi.e E(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return U(a0(descriptor, i10), descriptor.i(i10));
    }

    @Override // Yi.e
    public final short F() {
        return X(c0());
    }

    @Override // Yi.e
    public final float G() {
        return T(c0());
    }

    @Override // Yi.c
    public final byte H(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return P(a0(descriptor, i10));
    }

    @Override // Yi.e
    public final double I() {
        return R(c0());
    }

    protected Object N(InterfaceC3627a deserializer, Object obj) {
        AbstractC6492s.i(deserializer, "deserializer");
        return t(deserializer);
    }

    protected abstract boolean O(Object obj);

    protected abstract byte P(Object obj);

    protected abstract char Q(Object obj);

    protected abstract double R(Object obj);

    protected abstract int S(Object obj, Xi.f fVar);

    protected abstract float T(Object obj);

    protected Yi.e U(Object obj, Xi.f inlineDescriptor) {
        AbstractC6492s.i(inlineDescriptor, "inlineDescriptor");
        d0(obj);
        return this;
    }

    protected abstract int V(Object obj);

    protected abstract long W(Object obj);

    protected abstract short X(Object obj);

    protected abstract String Y(Object obj);

    protected final Object Z() {
        return AbstractC3689v.D0(this.f25610b);
    }

    protected abstract Object a0(Xi.f fVar, int i10);

    public final ArrayList b0() {
        return this.f25610b;
    }

    protected final Object c0() {
        ArrayList arrayList = this.f25610b;
        Object objRemove = arrayList.remove(AbstractC3689v.n(arrayList));
        this.f25611c = true;
        return objRemove;
    }

    protected final void d0(Object obj) {
        this.f25610b.add(obj);
    }

    @Override // Yi.e
    public final int e(Xi.f enumDescriptor) {
        AbstractC6492s.i(enumDescriptor, "enumDescriptor");
        return S(c0(), enumDescriptor);
    }

    @Override // Yi.e
    public final boolean f() {
        return O(c0());
    }

    @Override // Yi.e
    public final char g() {
        return Q(c0());
    }

    @Override // Yi.c
    public final Object h(Xi.f descriptor, int i10, final InterfaceC3627a deserializer, final Object obj) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(deserializer, "deserializer");
        return e0(a0(descriptor, i10), new InterfaceC6824a() { // from class: Zi.Y0
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return Z0.L(this.f25605a, deserializer, obj);
            }
        });
    }

    @Override // Yi.c
    public final int i(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return V(a0(descriptor, i10));
    }

    @Override // Yi.e
    public Yi.e l(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        return U(c0(), descriptor);
    }

    @Override // Yi.e
    public final int n() {
        return V(c0());
    }

    @Override // Yi.c
    public final double o(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return R(a0(descriptor, i10));
    }

    @Override // Yi.c
    public final Object p(Xi.f descriptor, int i10, final InterfaceC3627a deserializer, final Object obj) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(deserializer, "deserializer");
        return e0(a0(descriptor, i10), new InterfaceC6824a() { // from class: Zi.X0
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return Z0.M(this.f25601a, deserializer, obj);
            }
        });
    }

    @Override // Yi.c
    public final long q(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return W(a0(descriptor, i10));
    }

    @Override // Yi.e
    public final Void r() {
        return null;
    }

    @Override // Yi.e
    public final String s() {
        return Y(c0());
    }

    @Override // Yi.c
    public final boolean u(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return O(a0(descriptor, i10));
    }

    @Override // Yi.e
    public final long v() {
        return W(c0());
    }

    @Override // Yi.c
    public final String w(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return Y(a0(descriptor, i10));
    }

    @Override // Yi.c
    public final char z(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return Q(a0(descriptor, i10));
    }
}
