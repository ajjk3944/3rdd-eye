package kotlinx.serialization.internal;

import java.util.ArrayList;
import y9.c;

/* loaded from: classes4.dex */
public abstract class TaggedDecoder implements y9.e, y9.c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22814a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f22815b;

    @Override // y9.c
    public final char A(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return L(V(descriptor, i10));
    }

    @Override // y9.c
    public final byte B(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return K(V(descriptor, i10));
    }

    @Override // y9.c
    public final boolean C(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return J(V(descriptor, i10));
    }

    @Override // y9.e
    public abstract boolean D();

    @Override // y9.c
    public final short E(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return S(V(descriptor, i10));
    }

    @Override // y9.c
    public final double F(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return M(V(descriptor, i10));
    }

    @Override // y9.e
    public abstract Object G(kotlinx.serialization.a aVar);

    @Override // y9.e
    public final byte H() {
        return K(W());
    }

    public Object I(kotlinx.serialization.a deserializer, Object obj) {
        kotlin.jvm.internal.p.e(deserializer, "deserializer");
        return G(deserializer);
    }

    public abstract boolean J(Object obj);

    public abstract byte K(Object obj);

    public abstract char L(Object obj);

    public abstract double M(Object obj);

    public abstract int N(Object obj, kotlinx.serialization.descriptors.f fVar);

    public abstract float O(Object obj);

    public y9.e P(Object obj, kotlinx.serialization.descriptors.f inlineDescriptor) {
        kotlin.jvm.internal.p.e(inlineDescriptor, "inlineDescriptor");
        X(obj);
        return this;
    }

    public abstract int Q(Object obj);

    public abstract long R(Object obj);

    public abstract short S(Object obj);

    public abstract String T(Object obj);

    public final Object U() {
        return z8.z.Q(this.f22814a);
    }

    public abstract Object V(kotlinx.serialization.descriptors.f fVar, int i10);

    public final Object W() {
        ArrayList arrayList = this.f22814a;
        Object objRemove = arrayList.remove(z8.r.k(arrayList));
        this.f22815b = true;
        return objRemove;
    }

    public final void X(Object obj) {
        this.f22814a.add(obj);
    }

    public final Object Y(Object obj, l9.a aVar) {
        X(obj);
        Object objInvoke = aVar.invoke();
        if (!this.f22815b) {
            W();
        }
        this.f22815b = false;
        return objInvoke;
    }

    @Override // y9.e
    public final int e(kotlinx.serialization.descriptors.f enumDescriptor) {
        kotlin.jvm.internal.p.e(enumDescriptor, "enumDescriptor");
        return N(W(), enumDescriptor);
    }

    @Override // y9.c
    public final long f(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return R(V(descriptor, i10));
    }

    @Override // y9.e
    public final int h() {
        return Q(W());
    }

    @Override // y9.c
    public final int i(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return Q(V(descriptor, i10));
    }

    @Override // y9.e
    public final Void j() {
        return null;
    }

    @Override // y9.c
    public int k(kotlinx.serialization.descriptors.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // y9.e
    public final long l() {
        return R(W());
    }

    @Override // y9.c
    public final String m(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return T(V(descriptor, i10));
    }

    @Override // y9.c
    public final Object n(kotlinx.serialization.descriptors.f descriptor, int i10, final kotlinx.serialization.a deserializer, final Object obj) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        kotlin.jvm.internal.p.e(deserializer, "deserializer");
        return Y(V(descriptor, i10), new l9.a() { // from class: kotlinx.serialization.internal.TaggedDecoder$decodeNullableSerializableElement$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            public final Object invoke() {
                return this.this$0.D() ? this.this$0.I(deserializer, obj) : this.this$0.j();
            }
        });
    }

    @Override // y9.c
    public boolean p() {
        return c.a.b(this);
    }

    @Override // y9.e
    public final y9.e q(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return P(W(), descriptor);
    }

    @Override // y9.c
    public final y9.e r(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return P(V(descriptor, i10), descriptor.g(i10));
    }

    @Override // y9.e
    public final short s() {
        return S(W());
    }

    @Override // y9.e
    public final float t() {
        return O(W());
    }

    @Override // y9.c
    public final float u(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return O(V(descriptor, i10));
    }

    @Override // y9.e
    public final double v() {
        return M(W());
    }

    @Override // y9.e
    public final boolean w() {
        return J(W());
    }

    @Override // y9.e
    public final char x() {
        return L(W());
    }

    @Override // y9.c
    public final Object y(kotlinx.serialization.descriptors.f descriptor, int i10, final kotlinx.serialization.a deserializer, final Object obj) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        kotlin.jvm.internal.p.e(deserializer, "deserializer");
        return Y(V(descriptor, i10), new l9.a() { // from class: kotlinx.serialization.internal.TaggedDecoder$decodeSerializableElement$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            public final Object invoke() {
                return this.this$0.I(deserializer, obj);
            }
        });
    }

    @Override // y9.e
    public final String z() {
        return T(W());
    }
}
