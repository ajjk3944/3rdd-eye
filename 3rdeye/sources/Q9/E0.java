package Q9;

import P9.e;
import c9.C2092m;
import java.util.ArrayList;

/* compiled from: Tagged.kt */
/* loaded from: classes3.dex */
public abstract class E0<Tag> implements P9.e, P9.c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Tag> f11414a = new ArrayList<>();

    @Override // P9.c
    public final void A(C1552r0 descriptor, int i, short s10) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        Q(T(descriptor, i), s10);
    }

    @Override // P9.c
    public final void B(O9.e descriptor, int i, boolean z10) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        H(T(descriptor, i), z10);
    }

    @Override // P9.e
    public final void C(int i) {
        O(i, U());
    }

    @Override // P9.e
    public final void D(long j4) {
        P(j4, U());
    }

    @Override // P9.c
    public final void E(C1552r0 descriptor, int i, char c10) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        J(T(descriptor, i), c10);
    }

    @Override // P9.e
    public final void G(String value) {
        kotlin.jvm.internal.l.f(value, "value");
        R(U(), value);
    }

    public abstract void H(Tag tag, boolean z10);

    public abstract void I(byte b10, Object obj);

    public abstract void J(Tag tag, char c10);

    public abstract void K(Tag tag, double d10);

    public abstract void L(Tag tag, O9.e eVar, int i);

    public abstract void M(Tag tag, float f10);

    public abstract P9.e N(Tag tag, O9.e eVar);

    public abstract void O(int i, Object obj);

    public abstract void P(long j4, Object obj);

    public abstract void Q(Tag tag, short s10);

    public abstract void R(Tag tag, String str);

    public abstract void S(O9.e eVar);

    public abstract String T(O9.e eVar, int i);

    public final Tag U() {
        ArrayList<Tag> arrayList = this.f11414a;
        if (arrayList.isEmpty()) {
            throw new M9.i("No tag in stack for requested element");
        }
        return arrayList.remove(C2092m.V(arrayList));
    }

    @Override // P9.c
    public final void b(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        if (!this.f11414a.isEmpty()) {
            U();
        }
        S(descriptor);
    }

    @Override // P9.c
    public final P9.e e(C1552r0 descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return N(T(descriptor, i), descriptor.i(i));
    }

    @Override // P9.e
    public final void g(double d10) {
        K(U(), d10);
    }

    @Override // P9.e
    public final void h(short s10) {
        Q(U(), s10);
    }

    @Override // P9.c
    public final void i(O9.e descriptor, int i, double d10) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        K(T(descriptor, i), d10);
    }

    @Override // P9.e
    public final void j(byte b10) {
        I(b10, U());
    }

    @Override // P9.c
    public final void k(O9.e descriptor, int i, String value) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        kotlin.jvm.internal.l.f(value, "value");
        R(T(descriptor, i), value);
    }

    @Override // P9.e
    public final void l(boolean z10) {
        H(U(), z10);
    }

    @Override // P9.c
    public final void m(O9.e descriptor, int i, long j4) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        P(j4, T(descriptor, i));
    }

    @Override // P9.c
    public final void n(int i, int i10, O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        O(i10, T(descriptor, i));
    }

    @Override // P9.e
    public final void o(float f10) {
        M(U(), f10);
    }

    @Override // P9.e
    public final void p(O9.e enumDescriptor, int i) {
        kotlin.jvm.internal.l.f(enumDescriptor, "enumDescriptor");
        L(U(), enumDescriptor, i);
    }

    @Override // P9.e
    public final void q(char c10) {
        J(U(), c10);
    }

    @Override // P9.c
    public final void s(O9.e descriptor, int i, float f10) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        M(T(descriptor, i), f10);
    }

    @Override // P9.c
    public final void u(C1552r0 descriptor, int i, byte b10) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        I(b10, T(descriptor, i));
    }

    @Override // P9.e
    public final P9.c v(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return d(descriptor);
    }

    @Override // P9.c
    public <T> void w(O9.e descriptor, int i, M9.b serializer, T t10) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        kotlin.jvm.internal.l.f(serializer, "serializer");
        this.f11414a.add(T(descriptor, i));
        e.a.a(this, serializer, t10);
    }

    @Override // P9.e
    public abstract <T> void x(M9.b bVar, T t10);

    @Override // P9.c
    public final <T> void y(O9.e descriptor, int i, M9.b serializer, T t10) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        kotlin.jvm.internal.l.f(serializer, "serializer");
        this.f11414a.add(T(descriptor, i));
        x(serializer, t10);
    }

    @Override // P9.e
    public P9.e z(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return N(U(), descriptor);
    }
}
