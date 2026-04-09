package defpackage;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yd4 {
    public static final yd4 d;
    public final int a;
    public final int b;
    public final dn3 c;

    static {
        yd4 yd4Var;
        if (Build.VERSION.SDK_INT >= 33) {
            cn3 cn3Var = new cn3(4);
            for (int i = 1; i <= 10; i++) {
                cn3Var.f(Integer.valueOf(v23.b(i)));
            }
            yd4Var = new yd4(2, cn3Var.h());
        } else {
            yd4Var = new yd4(2, 10);
        }
        d = yd4Var;
    }

    public yd4(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd4)) {
            return false;
        }
        yd4 yd4Var = (yd4) obj;
        return this.a == yd4Var.a && this.b == yd4Var.b && Objects.equals(this.c, yd4Var.c);
    }

    public final int hashCode() {
        dn3 dn3Var = this.c;
        return (((this.a * 31) + this.b) * 31) + (dn3Var == null ? 0 : dn3Var.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i2).length() + 15 + strValueOf.length() + 1);
        ex0.o(sb, "AudioProfile[format=", i, ", maxChannelCount=", i2);
        return ex0.l(sb, ", channelMasks=", strValueOf, "]");
    }

    public yd4(int i, Set set) {
        this.a = i;
        dn3 dn3VarJ = dn3.j(set);
        this.c = dn3VarJ;
        yq2 yq2VarA = dn3VarJ.a();
        int iMax = 0;
        while (yq2VarA.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) yq2VarA.next()).intValue()));
        }
        this.b = iMax;
    }
}
