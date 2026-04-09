package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ms3 extends tr3 {
    public final int a;
    public final ls3 b;

    public ms3(int i, ls3 ls3Var) {
        this.a = i;
        this.b = ls3Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.b != ls3.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ms3)) {
            return false;
        }
        ms3 ms3Var = (ms3) obj;
        return ms3Var.a == this.a && ms3Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(ms3.class, Integer.valueOf(this.a), 12, 16, this.b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
