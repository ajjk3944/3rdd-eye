package com.facebook.ads.redexgen.core;

import com.singular.sdk.internal.SingularParamsBase;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.oF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3913oF<K0> {
    public static byte[] A00;
    public static String[] A01 = {"bao8c38n28wPAMqvf0", "eVcWzAuCAXWumTICSFBebUgmb9TguTkL", SingularParamsBase.Constants.PLATFORM_KEY, "gqL7Zo5j54GI4jqi05kLU", "fae6iywUSwwj1RjLTY2P", "asvzUEyWtHVXByXUijz9tuohidd7jT94", "t7lccWit4rbeEMhbm3WlI6hCZ2BNlGb8", "1T7kTgAAsxu7zrmAj3X1"};

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            int i13 = (bArrCopyOfRange[i12] ^ i11) ^ 104;
            String[] strArr = A01;
            if (strArr[0].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[6] = "XFZlfL1njVMJiM3nHtzYTwesPM930KjJ";
            bArrCopyOfRange[i12] = (byte) i13;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{46, 51, 59, 46, 40, 63, 46, 47, 29, 42, 39, 62, 46, 56, 27, 46, 57, 0, 46, 50};
    }

    public abstract <K extends K0, V> Map<K, Collection<V>> A04();

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oF != com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys<K0> */
    private final AW<K0, Object> A00(final int expectedValuesPerKey) {
        AbstractC3761ll.A00(expectedValuesPerKey, A01(0, 20, 35));
        return new AW<K0, Object>() { // from class: com.facebook.ads.redexgen.X.1c
            @Override // com.facebook.ads.redexgen.core.AW
            public final <K extends K0, V> InterfaceC2411Ah<K, V> A00() {
                return AbstractC3917oJ.A00(this.A01.A04(), new AX(expectedValuesPerKey));
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oF != com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys<K0> */
    public final AW<K0, Object> A03() {
        return A00(2);
    }
}
