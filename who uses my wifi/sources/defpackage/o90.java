package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o90 {
    public final u80 a;
    public final Throwable b;

    public o90(u80 u80Var) {
        this.a = u80Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o90)) {
            return false;
        }
        o90 o90Var = (o90) obj;
        u80 u80Var = this.a;
        if (u80Var != null && u80Var.equals(o90Var.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || o90Var.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public o90(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
