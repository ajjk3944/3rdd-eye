package defpackage;

import java.net.InetAddress;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class nq0 {
    public static final gg0 a = gg0.h("in-addr.arpa.");
    public static final gg0 b = gg0.h("ip6.arpa.");

    public static gg0 a(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        if (address.length != 4 && address.length != 16) {
            throw new IllegalArgumentException("array must contain 4 or 16 elements");
        }
        StringBuilder sb = new StringBuilder();
        if (address.length == 4) {
            for (int length = address.length - 1; length >= 0; length--) {
                sb.append(address[length] & 255);
                if (length > 0) {
                    sb.append(".");
                }
            }
        } else {
            for (int length2 = address.length - 1; length2 >= 0; length2--) {
                int i = address[length2];
                int[] iArr = {(i & 255) >> 4, i & 15};
                for (int i2 = 1; i2 >= 0; i2--) {
                    sb.append(Integer.toHexString(iArr[i2]));
                    if (length2 > 0 || i2 > 0) {
                        sb.append(".");
                    }
                }
            }
        }
        try {
            return address.length == 4 ? gg0.j(sb.toString(), a) : gg0.j(sb.toString(), b);
        } catch (f11 unused) {
            throw new IllegalStateException("name cannot be invalid");
        }
    }
}
