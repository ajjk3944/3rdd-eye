package Yi;

import Vi.o;
import Zi.C3725p0;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public abstract class b implements f, d {
    @Override // Yi.f
    public void A(int i10) {
        I(Integer.valueOf(i10));
    }

    @Override // Yi.f
    public f B(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        return this;
    }

    @Override // Yi.d
    public final void C(Xi.f descriptor, int i10, int i11) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            A(i11);
        }
    }

    @Override // Yi.f
    public void D(Xi.f enumDescriptor, int i10) {
        AbstractC6492s.i(enumDescriptor, "enumDescriptor");
        I(Integer.valueOf(i10));
    }

    @Override // Yi.f
    public void E(long j10) {
        I(Long.valueOf(j10));
    }

    @Override // Yi.d
    public final void F(Xi.f descriptor, int i10, byte b10) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            l(b10);
        }
    }

    @Override // Yi.f
    public void G(String value) {
        AbstractC6492s.i(value, "value");
        I(value);
    }

    public boolean H(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return true;
    }

    public void I(Object value) {
        AbstractC6492s.i(value, "value");
        throw new SerializationException("Non-serializable " + O.b(value.getClass()) + " is not supported by " + O.b(getClass()) + " encoder");
    }

    @Override // Yi.d
    public void b(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
    }

    @Override // Yi.f
    public d c(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        return this;
    }

    @Override // Yi.d
    public final f e(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return H(descriptor, i10) ? B(descriptor.i(i10)) : C3725p0.f25674a;
    }

    @Override // Yi.d
    public final void h(Xi.f descriptor, int i10, float f10) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            r(f10);
        }
    }

    @Override // Yi.d
    public final void i(Xi.f descriptor, int i10, boolean z10) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            m(z10);
        }
    }

    @Override // Yi.f
    public void j(double d10) {
        I(Double.valueOf(d10));
    }

    @Override // Yi.f
    public void k(short s10) {
        I(Short.valueOf(s10));
    }

    @Override // Yi.f
    public void l(byte b10) {
        I(Byte.valueOf(b10));
    }

    @Override // Yi.f
    public void m(boolean z10) {
        I(Boolean.valueOf(z10));
    }

    @Override // Yi.d
    public final void n(Xi.f descriptor, int i10, short s10) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            k(s10);
        }
    }

    @Override // Yi.d
    public final void p(Xi.f descriptor, int i10, long j10) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            E(j10);
        }
    }

    @Override // Yi.d
    public void q(Xi.f descriptor, int i10, o serializer, Object obj) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(serializer, "serializer");
        if (H(descriptor, i10)) {
            z(serializer, obj);
        }
    }

    @Override // Yi.f
    public void r(float f10) {
        I(Float.valueOf(f10));
    }

    @Override // Yi.d
    public final void s(Xi.f descriptor, int i10, char c10) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            u(c10);
        }
    }

    @Override // Yi.d
    public void t(Xi.f descriptor, int i10, o serializer, Object obj) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(serializer, "serializer");
        if (H(descriptor, i10)) {
            g(serializer, obj);
        }
    }

    @Override // Yi.f
    public void u(char c10) {
        I(Character.valueOf(c10));
    }

    @Override // Yi.d
    public final void w(Xi.f descriptor, int i10, double d10) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            j(d10);
        }
    }

    @Override // Yi.d
    public final void y(Xi.f descriptor, int i10, String value) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(value, "value");
        if (H(descriptor, i10)) {
            G(value);
        }
    }
}
