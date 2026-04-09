package ag;

import cg.InterfaceC4258b;
import java.math.BigInteger;

/* renamed from: ag.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3847e extends InterfaceC3849g, InterfaceC4258b {
    Integer A();

    @Override // ag.InterfaceC3849g
    int f();

    @Override // ag.InterfaceC3849g
    default BigInteger getCount() {
        BigInteger bigIntegerMultiply = BigInteger.ONE;
        int iH = H();
        if (iH > 0) {
            for (int i10 = 0; i10 < iH; i10++) {
                InterfaceC3848f interfaceC3848fK = k(i10);
                if (interfaceC3848fK.A0()) {
                    bigIntegerMultiply = bigIntegerMultiply.multiply(interfaceC3848fK.getCount());
                }
            }
        }
        return bigIntegerMultiply;
    }

    boolean i();

    InterfaceC3848f k(int i10);

    default int l0(InterfaceC3847e interfaceC3847e) {
        if (!A0()) {
            return interfaceC3847e.A0() ? -1 : 0;
        }
        if (interfaceC3847e.A0()) {
            return getCount().compareTo(interfaceC3847e.getCount());
        }
        return 1;
    }

    boolean u();

    boolean x();
}
