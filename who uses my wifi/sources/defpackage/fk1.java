package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fk1 {
    public final String a;
    public final kh1 b;
    public final qg1 c;
    public final rm1 d;
    public final se1 e;

    static {
        vm3 vm3Var = xm3.g;
        sn3 sn3Var = sn3.j;
        List list = Collections.EMPTY_LIST;
        zi1 zi1Var = zi1.a;
        new se1();
        rm1 rm1Var = rm1.B;
        String str = v23.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ fk1(String str, se1 se1Var, kh1 kh1Var, qg1 qg1Var, rm1 rm1Var) {
        zi1 zi1Var = zi1.a;
        this.a = str;
        this.b = kh1Var;
        this.c = qg1Var;
        this.d = rm1Var;
        this.e = se1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk1)) {
            return false;
        }
        fk1 fk1Var = (fk1) obj;
        if (!this.a.equals(fk1Var.a) || !this.e.equals(fk1Var.e) || !Objects.equals(this.b, fk1Var.b) || !this.c.equals(fk1Var.c) || !Objects.equals(this.d, fk1Var.d)) {
            return false;
        }
        zi1 zi1Var = zi1.a;
        return zi1Var.equals(zi1Var);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        kh1 kh1Var = this.b;
        return (this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (kh1Var != null ? kh1Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
