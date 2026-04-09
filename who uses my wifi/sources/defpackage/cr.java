package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class cr implements Serializable {
    public final int f;

    public cr(int i) {
        tn0.c("code", i);
        this.f = i;
    }

    public abstract void a(cm cmVar);

    public abstract String b();

    public abstract void c(t3 t3Var);

    public final boolean equals(Object obj) {
        if (!(obj instanceof cr)) {
            return false;
        }
        cr crVar = (cr) obj;
        if (this.f != crVar.f) {
            return false;
        }
        t3 t3Var = new t3(2, (byte) 0);
        c(t3Var);
        byte[] bArrI = t3Var.i();
        t3 t3Var2 = new t3(2, (byte) 0);
        crVar.c(t3Var2);
        return Arrays.equals(bArrI, t3Var2.i());
    }

    public final int hashCode() {
        t3 t3Var = new t3(2, (byte) 0);
        c(t3Var);
        int i = 0;
        for (byte b : t3Var.i()) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }

    public final String toString() {
        return "{" + br.a.e(this.f) + ": " + b() + "}";
    }
}
