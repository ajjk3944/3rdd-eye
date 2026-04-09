package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rc4 {
    public final int a;
    public final int b;
    public final boolean c;

    public rc4(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rc4) {
            rc4 rc4Var = (rc4) obj;
            if (this.a == rc4Var.a && this.b == rc4Var.b && this.c == rc4Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.c ? 1237 : 1231) ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z).length() + 1);
        ex0.o(sb, "OfflineAdConfig{impressionPrerequisite=", i, ", clickPrerequisite=", i2);
        sb.append(", notificationFlowEnabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
