package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sh1 extends wh1 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final wh1[] f;

    public sh1(String str, boolean z, boolean z2, String[] strArr, wh1[] wh1VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = wh1VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sh1.class == obj.getClass()) {
            sh1 sh1Var = (sh1) obj;
            if (this.c == sh1Var.c && this.d == sh1Var.d && Objects.equals(this.b, sh1Var.b) && Arrays.equals(this.e, sh1Var.e) && Arrays.equals(this.f, sh1Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (((((this.c ? 1 : 0) + 527) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
