package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jx3 extends mr3 {
    public final int a;

    public jx3(int i) {
        this.a = i;
    }

    public static jx3 b(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new jx3(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jx3) && ((jx3) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(jx3.class, Integer.valueOf(this.a));
    }

    public final String toString() {
        int i = this.a;
        return ga1.k(new StringBuilder(String.valueOf(i).length() + 34), "AesCmac PRF Parameters (", i, "-byte key)");
    }
}
