package y9;

import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.g1;
import y9.d;
import y9.f;

/* loaded from: classes4.dex */
public abstract class b implements f, d {
    @Override // y9.f
    public abstract void B(int i10);

    @Override // y9.d
    public void C(kotlinx.serialization.descriptors.f descriptor, int i10, kotlinx.serialization.e serializer, Object obj) {
        p.e(descriptor, "descriptor");
        p.e(serializer, "serializer");
        if (H(descriptor, i10)) {
            e(serializer, obj);
        }
    }

    @Override // y9.d
    public final void D(kotlinx.serialization.descriptors.f descriptor, int i10, short s10) {
        p.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            q(s10);
        }
    }

    @Override // y9.d
    public final void E(kotlinx.serialization.descriptors.f descriptor, int i10, double d10) {
        p.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            g(d10);
        }
    }

    @Override // y9.d
    public final void F(kotlinx.serialization.descriptors.f descriptor, int i10, long j10) {
        p.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            m(j10);
        }
    }

    @Override // y9.f
    public void G(String value) {
        p.e(value, "value");
        J(value);
    }

    public boolean H(kotlinx.serialization.descriptors.f descriptor, int i10) {
        p.e(descriptor, "descriptor");
        return true;
    }

    public void I(kotlinx.serialization.e eVar, Object obj) {
        f.a.c(this, eVar, obj);
    }

    public void J(Object value) {
        p.e(value, "value");
        throw new SerializationException("Non-serializable " + t.b(value.getClass()) + " is not supported by " + t.b(getClass()) + " encoder");
    }

    @Override // y9.f
    public d b(kotlinx.serialization.descriptors.f descriptor) {
        p.e(descriptor, "descriptor");
        return this;
    }

    public void c(kotlinx.serialization.descriptors.f descriptor) {
        p.e(descriptor, "descriptor");
    }

    @Override // y9.f
    public void e(kotlinx.serialization.e eVar, Object obj) {
        f.a.d(this, eVar, obj);
    }

    @Override // y9.d
    public final f f(kotlinx.serialization.descriptors.f descriptor, int i10) {
        p.e(descriptor, "descriptor");
        return H(descriptor, i10) ? l(descriptor.g(i10)) : g1.f22857a;
    }

    @Override // y9.f
    public void g(double d10) {
        J(Double.valueOf(d10));
    }

    @Override // y9.f
    public abstract void h(byte b10);

    public void i(kotlinx.serialization.descriptors.f descriptor, int i10, kotlinx.serialization.e serializer, Object obj) {
        p.e(descriptor, "descriptor");
        p.e(serializer, "serializer");
        if (H(descriptor, i10)) {
            I(serializer, obj);
        }
    }

    @Override // y9.f
    public d j(kotlinx.serialization.descriptors.f fVar, int i10) {
        return f.a.a(this, fVar, i10);
    }

    @Override // y9.f
    public void k(kotlinx.serialization.descriptors.f enumDescriptor, int i10) {
        p.e(enumDescriptor, "enumDescriptor");
        J(Integer.valueOf(i10));
    }

    @Override // y9.f
    public f l(kotlinx.serialization.descriptors.f descriptor) {
        p.e(descriptor, "descriptor");
        return this;
    }

    @Override // y9.f
    public abstract void m(long j10);

    @Override // y9.d
    public final void n(kotlinx.serialization.descriptors.f descriptor, int i10, char c10) {
        p.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            u(c10);
        }
    }

    @Override // y9.f
    public void o() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // y9.d
    public final void p(kotlinx.serialization.descriptors.f descriptor, int i10, byte b10) {
        p.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            h(b10);
        }
    }

    @Override // y9.f
    public abstract void q(short s10);

    @Override // y9.f
    public void r(boolean z10) {
        J(Boolean.valueOf(z10));
    }

    @Override // y9.d
    public final void s(kotlinx.serialization.descriptors.f descriptor, int i10, float f10) {
        p.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            t(f10);
        }
    }

    @Override // y9.f
    public void t(float f10) {
        J(Float.valueOf(f10));
    }

    @Override // y9.f
    public void u(char c10) {
        J(Character.valueOf(c10));
    }

    @Override // y9.f
    public void v() {
        f.a.b(this);
    }

    @Override // y9.d
    public final void w(kotlinx.serialization.descriptors.f descriptor, int i10, int i11) {
        p.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            B(i11);
        }
    }

    @Override // y9.d
    public final void x(kotlinx.serialization.descriptors.f descriptor, int i10, boolean z10) {
        p.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            r(z10);
        }
    }

    @Override // y9.d
    public final void y(kotlinx.serialization.descriptors.f descriptor, int i10, String value) {
        p.e(descriptor, "descriptor");
        p.e(value, "value");
        if (H(descriptor, i10)) {
            G(value);
        }
    }

    public boolean z(kotlinx.serialization.descriptors.f fVar, int i10) {
        return d.a.a(this, fVar, i10);
    }
}
