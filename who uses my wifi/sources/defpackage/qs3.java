package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qs3 extends tr3 {
    public final int a;
    public final ps3 b;

    public qs3(int i, ps3 ps3Var) {
        this.a = i;
        this.b = ps3Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.b != ps3.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qs3)) {
            return false;
        }
        qs3 qs3Var = (qs3) obj;
        return qs3Var.a == this.a && qs3Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(qs3.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        int length = strValueOf.length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
