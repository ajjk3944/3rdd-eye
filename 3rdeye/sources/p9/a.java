package P9;

import M9.i;
import P9.e;
import Q9.C1552r0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;

/* compiled from: AbstractEncoder.kt */
/* loaded from: classes3.dex */
public abstract class a implements e, c {
    @Override // P9.c
    public final void A(C1552r0 descriptor, int i, short s10) {
        l.f(descriptor, "descriptor");
        H(descriptor, i);
        h(s10);
    }

    @Override // P9.c
    public final void B(O9.e descriptor, int i, boolean z10) {
        l.f(descriptor, "descriptor");
        H(descriptor, i);
        l(z10);
    }

    @Override // P9.e
    public void C(int i) {
        I(Integer.valueOf(i));
    }

    @Override // P9.e
    public void D(long j4) {
        I(Long.valueOf(j4));
    }

    @Override // P9.c
    public final void E(C1552r0 descriptor, int i, char c10) {
        l.f(descriptor, "descriptor");
        H(descriptor, i);
        q(c10);
    }

    @Override // P9.c
    public boolean F(O9.e descriptor, int i) {
        l.f(descriptor, "descriptor");
        return true;
    }

    @Override // P9.e
    public void G(String value) {
        l.f(value, "value");
        I(value);
    }

    public void H(O9.e descriptor, int i) {
        l.f(descriptor, "descriptor");
    }

    public void I(Object value) {
        l.f(value, "value");
        throw new i("Non-serializable " + x.a(value.getClass()) + " is not supported by " + x.a(getClass()) + " encoder");
    }

    @Override // P9.c
    public void b(O9.e descriptor) {
        l.f(descriptor, "descriptor");
    }

    @Override // P9.e
    public c d(O9.e descriptor) {
        l.f(descriptor, "descriptor");
        return this;
    }

    @Override // P9.c
    public final e e(C1552r0 descriptor, int i) {
        l.f(descriptor, "descriptor");
        H(descriptor, i);
        return z(descriptor.i(i));
    }

    @Override // P9.e
    public void f() {
        throw new i("'null' is not supported by default");
    }

    @Override // P9.e
    public void g(double d10) {
        I(Double.valueOf(d10));
    }

    @Override // P9.e
    public void h(short s10) {
        I(Short.valueOf(s10));
    }

    @Override // P9.c
    public final void i(O9.e descriptor, int i, double d10) {
        l.f(descriptor, "descriptor");
        H(descriptor, i);
        g(d10);
    }

    @Override // P9.e
    public void j(byte b10) {
        I(Byte.valueOf(b10));
    }

    @Override // P9.c
    public final void k(O9.e descriptor, int i, String value) {
        l.f(descriptor, "descriptor");
        l.f(value, "value");
        H(descriptor, i);
        G(value);
    }

    @Override // P9.e
    public void l(boolean z10) {
        I(Boolean.valueOf(z10));
    }

    @Override // P9.c
    public final void m(O9.e descriptor, int i, long j4) {
        l.f(descriptor, "descriptor");
        H(descriptor, i);
        D(j4);
    }

    @Override // P9.c
    public final void n(int i, int i10, O9.e descriptor) {
        l.f(descriptor, "descriptor");
        H(descriptor, i);
        C(i10);
    }

    @Override // P9.e
    public void o(float f10) {
        I(Float.valueOf(f10));
    }

    @Override // P9.e
    public void p(O9.e enumDescriptor, int i) {
        l.f(enumDescriptor, "enumDescriptor");
        I(Integer.valueOf(i));
    }

    @Override // P9.e
    public void q(char c10) {
        I(Character.valueOf(c10));
    }

    @Override // P9.c
    public final void s(O9.e descriptor, int i, float f10) {
        l.f(descriptor, "descriptor");
        H(descriptor, i);
        o(f10);
    }

    @Override // P9.c
    public final void u(C1552r0 descriptor, int i, byte b10) {
        l.f(descriptor, "descriptor");
        H(descriptor, i);
        j(b10);
    }

    @Override // P9.e
    public final c v(O9.e descriptor, int i) {
        l.f(descriptor, "descriptor");
        return d(descriptor);
    }

    @Override // P9.c
    public <T> void w(O9.e descriptor, int i, M9.b serializer, T t10) {
        l.f(descriptor, "descriptor");
        l.f(serializer, "serializer");
        H(descriptor, i);
        e.a.a(this, serializer, t10);
    }

    @Override // P9.e
    public <T> void x(M9.b serializer, T t10) {
        l.f(serializer, "serializer");
        serializer.serialize(this, t10);
    }

    @Override // P9.c
    public final <T> void y(O9.e descriptor, int i, M9.b serializer, T t10) {
        l.f(descriptor, "descriptor");
        l.f(serializer, "serializer");
        H(descriptor, i);
        x(serializer, t10);
    }

    @Override // P9.e
    public e z(O9.e descriptor) {
        l.f(descriptor, "descriptor");
        return this;
    }

    @Override // P9.e
    public final void r() {
    }
}
