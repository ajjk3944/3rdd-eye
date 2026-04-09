package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uh1 extends wh1 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public uh1(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uh1.class == obj.getClass()) {
            uh1 uh1Var = (uh1) obj;
            if (Objects.equals(this.b, uh1Var.b) && Objects.equals(this.c, uh1Var.c) && Objects.equals(this.d, uh1Var.d) && Arrays.equals(this.e, uh1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + (((str != null ? str.hashCode() : 0) + 527) * 31)) * 31)) * 31);
    }

    @Override // defpackage.wh1
    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        int length2 = length + 11 + String.valueOf(str2).length() + 11;
        String str3 = this.c;
        int length3 = str3.length() + length2 + 14;
        String str4 = this.d;
        StringBuilder sb = new StringBuilder(str4.length() + length3);
        ex0.q(sb, str, ": mimeType=", str2, ", filename=");
        return ex0.l(sb, str3, ", description=", str4);
    }
}
