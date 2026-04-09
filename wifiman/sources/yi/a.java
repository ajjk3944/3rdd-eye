package Yi;

import Vi.InterfaceC3627a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public abstract class a implements e, c {
    @Override // Yi.c
    public final float A(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return G();
    }

    @Override // Yi.c
    public final short C(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return F();
    }

    @Override // Yi.e
    public abstract byte D();

    @Override // Yi.c
    public e E(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return l(descriptor.i(i10));
    }

    @Override // Yi.e
    public abstract short F();

    @Override // Yi.e
    public float G() {
        Object objK = K();
        AbstractC6492s.g(objK, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objK).floatValue();
    }

    @Override // Yi.c
    public final byte H(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return D();
    }

    @Override // Yi.e
    public double I() {
        Object objK = K();
        AbstractC6492s.g(objK, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objK).doubleValue();
    }

    public Object J(InterfaceC3627a deserializer, Object obj) {
        AbstractC6492s.i(deserializer, "deserializer");
        return t(deserializer);
    }

    public Object K() {
        throw new SerializationException(O.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // Yi.c
    public void b(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
    }

    @Override // Yi.e
    public c c(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        return this;
    }

    @Override // Yi.e
    public int e(Xi.f enumDescriptor) {
        AbstractC6492s.i(enumDescriptor, "enumDescriptor");
        Object objK = K();
        AbstractC6492s.g(objK, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objK).intValue();
    }

    @Override // Yi.e
    public boolean f() {
        Object objK = K();
        AbstractC6492s.g(objK, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objK).booleanValue();
    }

    @Override // Yi.e
    public char g() {
        Object objK = K();
        AbstractC6492s.g(objK, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objK).charValue();
    }

    @Override // Yi.c
    public final Object h(Xi.f descriptor, int i10, InterfaceC3627a deserializer, Object obj) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(deserializer, "deserializer");
        return (deserializer.a().c() || y()) ? J(deserializer, obj) : r();
    }

    @Override // Yi.c
    public final int i(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return n();
    }

    @Override // Yi.e
    public e l(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        return this;
    }

    @Override // Yi.e
    public abstract int n();

    @Override // Yi.c
    public final double o(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return I();
    }

    @Override // Yi.c
    public Object p(Xi.f descriptor, int i10, InterfaceC3627a deserializer, Object obj) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(deserializer, "deserializer");
        return J(deserializer, obj);
    }

    @Override // Yi.c
    public final long q(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return v();
    }

    @Override // Yi.e
    public Void r() {
        return null;
    }

    @Override // Yi.e
    public String s() {
        Object objK = K();
        AbstractC6492s.g(objK, "null cannot be cast to non-null type kotlin.String");
        return (String) objK;
    }

    @Override // Yi.c
    public final boolean u(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return f();
    }

    @Override // Yi.e
    public abstract long v();

    @Override // Yi.c
    public final String w(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return s();
    }

    @Override // Yi.e
    public boolean y() {
        return true;
    }

    @Override // Yi.c
    public final char z(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return g();
    }
}
