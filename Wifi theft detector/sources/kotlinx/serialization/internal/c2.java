package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import y9.f;

/* loaded from: classes4.dex */
public abstract class c2 implements y9.f, y9.d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22836a = new ArrayList();

    private final boolean H(kotlinx.serialization.descriptors.f fVar, int i10) {
        Z(X(fVar, i10));
        return true;
    }

    @Override // y9.f
    public final void B(int i10) {
        Q(Y(), i10);
    }

    @Override // y9.d
    public void C(kotlinx.serialization.descriptors.f descriptor, int i10, kotlinx.serialization.e serializer, Object obj) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        kotlin.jvm.internal.p.e(serializer, "serializer");
        if (H(descriptor, i10)) {
            e(serializer, obj);
        }
    }

    @Override // y9.d
    public final void D(kotlinx.serialization.descriptors.f descriptor, int i10, short s10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        S(X(descriptor, i10), s10);
    }

    @Override // y9.d
    public final void E(kotlinx.serialization.descriptors.f descriptor, int i10, double d10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        M(X(descriptor, i10), d10);
    }

    @Override // y9.d
    public final void F(kotlinx.serialization.descriptors.f descriptor, int i10, long j10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        R(X(descriptor, i10), j10);
    }

    @Override // y9.f
    public final void G(String value) {
        kotlin.jvm.internal.p.e(value, "value");
        T(Y(), value);
    }

    public void I(kotlinx.serialization.e eVar, Object obj) {
        f.a.c(this, eVar, obj);
    }

    public abstract void J(Object obj, boolean z10);

    public abstract void K(Object obj, byte b10);

    public abstract void L(Object obj, char c10);

    public abstract void M(Object obj, double d10);

    public abstract void N(Object obj, kotlinx.serialization.descriptors.f fVar, int i10);

    public abstract void O(Object obj, float f10);

    public y9.f P(Object obj, kotlinx.serialization.descriptors.f inlineDescriptor) {
        kotlin.jvm.internal.p.e(inlineDescriptor, "inlineDescriptor");
        Z(obj);
        return this;
    }

    public abstract void Q(Object obj, int i10);

    public abstract void R(Object obj, long j10);

    public abstract void S(Object obj, short s10);

    public abstract void T(Object obj, String str);

    public abstract void U(kotlinx.serialization.descriptors.f fVar);

    public final Object V() {
        return z8.z.P(this.f22836a);
    }

    public final Object W() {
        return z8.z.Q(this.f22836a);
    }

    public abstract Object X(kotlinx.serialization.descriptors.f fVar, int i10);

    public final Object Y() {
        if (this.f22836a.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList arrayList = this.f22836a;
        return arrayList.remove(z8.r.k(arrayList));
    }

    public final void Z(Object obj) {
        this.f22836a.add(obj);
    }

    @Override // y9.d
    public final void c(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        if (!this.f22836a.isEmpty()) {
            Y();
        }
        U(descriptor);
    }

    @Override // y9.f
    public abstract void e(kotlinx.serialization.e eVar, Object obj);

    @Override // y9.d
    public final y9.f f(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return P(X(descriptor, i10), descriptor.g(i10));
    }

    @Override // y9.f
    public final void g(double d10) {
        M(Y(), d10);
    }

    @Override // y9.f
    public final void h(byte b10) {
        K(Y(), b10);
    }

    @Override // y9.d
    public void i(kotlinx.serialization.descriptors.f descriptor, int i10, kotlinx.serialization.e serializer, Object obj) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        kotlin.jvm.internal.p.e(serializer, "serializer");
        if (H(descriptor, i10)) {
            I(serializer, obj);
        }
    }

    @Override // y9.f
    public y9.d j(kotlinx.serialization.descriptors.f fVar, int i10) {
        return f.a.a(this, fVar, i10);
    }

    @Override // y9.f
    public final void k(kotlinx.serialization.descriptors.f enumDescriptor, int i10) {
        kotlin.jvm.internal.p.e(enumDescriptor, "enumDescriptor");
        N(Y(), enumDescriptor, i10);
    }

    @Override // y9.f
    public final y9.f l(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return P(Y(), descriptor);
    }

    @Override // y9.f
    public final void m(long j10) {
        R(Y(), j10);
    }

    @Override // y9.d
    public final void n(kotlinx.serialization.descriptors.f descriptor, int i10, char c10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        L(X(descriptor, i10), c10);
    }

    @Override // y9.d
    public final void p(kotlinx.serialization.descriptors.f descriptor, int i10, byte b10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        K(X(descriptor, i10), b10);
    }

    @Override // y9.f
    public final void q(short s10) {
        S(Y(), s10);
    }

    @Override // y9.f
    public final void r(boolean z10) {
        J(Y(), z10);
    }

    @Override // y9.d
    public final void s(kotlinx.serialization.descriptors.f descriptor, int i10, float f10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        O(X(descriptor, i10), f10);
    }

    @Override // y9.f
    public final void t(float f10) {
        O(Y(), f10);
    }

    @Override // y9.f
    public final void u(char c10) {
        L(Y(), c10);
    }

    @Override // y9.d
    public final void w(kotlinx.serialization.descriptors.f descriptor, int i10, int i11) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        Q(X(descriptor, i10), i11);
    }

    @Override // y9.d
    public final void x(kotlinx.serialization.descriptors.f descriptor, int i10, boolean z10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        J(X(descriptor, i10), z10);
    }

    @Override // y9.d
    public final void y(kotlinx.serialization.descriptors.f descriptor, int i10, String value) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        kotlin.jvm.internal.p.e(value, "value");
        T(X(descriptor, i10), value);
    }
}
