package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dt3 extends tr3 {
    public final er3 a;
    public final String b;
    public final z71 c;
    public final tr3 d;

    public dt3(er3 er3Var, String str, z71 z71Var, tr3 tr3Var) {
        this.a = er3Var;
        this.b = str;
        this.c = z71Var;
        this.d = tr3Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.a != er3.l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dt3)) {
            return false;
        }
        dt3 dt3Var = (dt3) obj;
        return dt3Var.c.equals(this.c) && dt3Var.d.equals(this.d) && dt3Var.b.equals(this.b) && dt3Var.a.equals(this.a);
    }

    public final int hashCode() {
        return Objects.hash(dt3.class, this.b, this.c, this.d, this.a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.a);
        String str = this.b;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        ex0.q(sb, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", strValueOf);
        ex0.q(sb, ", dekParametersForNewKeys: ", strValueOf2, ", variant: ", strValueOf3);
        sb.append(")");
        return sb.toString();
    }
}
