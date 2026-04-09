package y9;

import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import kotlinx.serialization.SerializationException;
import y9.c;
import y9.e;

/* loaded from: classes4.dex */
public abstract class a implements e, c {
    @Override // y9.c
    public final char A(kotlinx.serialization.descriptors.f descriptor, int i10) {
        p.e(descriptor, "descriptor");
        return x();
    }

    @Override // y9.c
    public final byte B(kotlinx.serialization.descriptors.f descriptor, int i10) {
        p.e(descriptor, "descriptor");
        return H();
    }

    @Override // y9.c
    public final boolean C(kotlinx.serialization.descriptors.f descriptor, int i10) {
        p.e(descriptor, "descriptor");
        return w();
    }

    @Override // y9.e
    public boolean D() {
        return true;
    }

    @Override // y9.c
    public final short E(kotlinx.serialization.descriptors.f descriptor, int i10) {
        p.e(descriptor, "descriptor");
        return s();
    }

    @Override // y9.c
    public final double F(kotlinx.serialization.descriptors.f descriptor, int i10) {
        p.e(descriptor, "descriptor");
        return v();
    }

    @Override // y9.e
    public Object G(kotlinx.serialization.a aVar) {
        return e.a.a(this, aVar);
    }

    @Override // y9.e
    public abstract byte H();

    public Object I(kotlinx.serialization.a deserializer, Object obj) {
        p.e(deserializer, "deserializer");
        return G(deserializer);
    }

    public Object J() {
        throw new SerializationException(t.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // y9.e
    public c b(kotlinx.serialization.descriptors.f descriptor) {
        p.e(descriptor, "descriptor");
        return this;
    }

    public void c(kotlinx.serialization.descriptors.f descriptor) {
        p.e(descriptor, "descriptor");
    }

    @Override // y9.e
    public int e(kotlinx.serialization.descriptors.f enumDescriptor) {
        p.e(enumDescriptor, "enumDescriptor");
        Object objJ = J();
        p.c(objJ, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objJ).intValue();
    }

    @Override // y9.c
    public final long f(kotlinx.serialization.descriptors.f descriptor, int i10) {
        p.e(descriptor, "descriptor");
        return l();
    }

    @Override // y9.e
    public abstract int h();

    @Override // y9.c
    public final int i(kotlinx.serialization.descriptors.f descriptor, int i10) {
        p.e(descriptor, "descriptor");
        return h();
    }

    @Override // y9.e
    public Void j() {
        return null;
    }

    @Override // y9.c
    public int k(kotlinx.serialization.descriptors.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // y9.e
    public abstract long l();

    @Override // y9.c
    public final String m(kotlinx.serialization.descriptors.f descriptor, int i10) {
        p.e(descriptor, "descriptor");
        return z();
    }

    @Override // y9.c
    public final Object n(kotlinx.serialization.descriptors.f descriptor, int i10, kotlinx.serialization.a deserializer, Object obj) {
        p.e(descriptor, "descriptor");
        p.e(deserializer, "deserializer");
        return (deserializer.getDescriptor().b() || D()) ? I(deserializer, obj) : j();
    }

    @Override // y9.c
    public boolean p() {
        return c.a.b(this);
    }

    @Override // y9.e
    public e q(kotlinx.serialization.descriptors.f descriptor) {
        p.e(descriptor, "descriptor");
        return this;
    }

    @Override // y9.c
    public e r(kotlinx.serialization.descriptors.f descriptor, int i10) {
        p.e(descriptor, "descriptor");
        return q(descriptor.g(i10));
    }

    @Override // y9.e
    public abstract short s();

    @Override // y9.e
    public float t() {
        Object objJ = J();
        p.c(objJ, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objJ).floatValue();
    }

    @Override // y9.c
    public final float u(kotlinx.serialization.descriptors.f descriptor, int i10) {
        p.e(descriptor, "descriptor");
        return t();
    }

    @Override // y9.e
    public double v() {
        Object objJ = J();
        p.c(objJ, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objJ).doubleValue();
    }

    @Override // y9.e
    public boolean w() {
        Object objJ = J();
        p.c(objJ, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objJ).booleanValue();
    }

    @Override // y9.e
    public char x() {
        Object objJ = J();
        p.c(objJ, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objJ).charValue();
    }

    public Object y(kotlinx.serialization.descriptors.f descriptor, int i10, kotlinx.serialization.a deserializer, Object obj) {
        p.e(descriptor, "descriptor");
        p.e(deserializer, "deserializer");
        return I(deserializer, obj);
    }

    @Override // y9.e
    public String z() {
        Object objJ = J();
        p.c(objJ, "null cannot be cast to non-null type kotlin.String");
        return (String) objJ;
    }
}
