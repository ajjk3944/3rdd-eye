package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ai1 extends wh1 {
    public final String b;
    public final byte[] c;

    public ai1(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ai1.class == obj.getClass()) {
            ai1 ai1Var = (ai1) obj;
            if (Objects.equals(this.b, ai1Var.b) && Arrays.equals(this.c, ai1Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + 527) * 31);
    }

    @Override // defpackage.wh1
    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length() + 8;
        String str2 = this.b;
        return ex0.l(new StringBuilder(str2.length() + length), str, ": owner=", str2);
    }
}
