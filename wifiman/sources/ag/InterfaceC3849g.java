package ag;

import java.io.Serializable;
import java.math.BigInteger;

/* renamed from: ag.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3849g extends Comparable, Serializable {
    default boolean A0() {
        return !getCount().equals(BigInteger.ONE);
    }

    boolean B0(int i10);

    byte[] G(byte[] bArr);

    boolean H0();

    boolean L();

    boolean O();

    BigInteger R();

    byte[] R0(byte[] bArr);

    boolean c0();

    int f();

    default BigInteger getCount() {
        return R().subtract(getValue()).add(BigInteger.ONE);
    }

    BigInteger getValue();

    boolean u0(int i10);

    int v0();

    default boolean w() {
        return L() && O();
    }

    @Override // java.lang.Comparable
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    default int compareTo(InterfaceC3849g interfaceC3849g) {
        return inet.ipaddr.a.f49282h.e(this, interfaceC3849g);
    }
}
