package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nu0 {
    public static final nu0 d = new nu0(1, null, false);
    public static final nu0 e = new nu0(1, null, true);
    public static final nu0 f = new nu0(2, null, false);
    public static final nu0 g = new nu0(2, null, true);
    public static final nu0 h = new nu0(3, null, false);
    public static final nu0 i = new nu0(3, null, true);
    public final int a;
    public boolean b;
    public ArrayList c;

    public nu0(int i2, kn0 kn0Var, boolean z) {
        this.a = i2;
        this.b = z;
        if (kn0Var != null) {
            a(kn0Var);
        }
    }

    public static nu0 b(int i2, kn0 kn0Var, boolean z) {
        switch (ex0.s(i2)) {
            case 0:
                return z ? e : d;
            case 1:
                return z ? g : f;
            case 2:
                return z ? i : h;
            case 3:
            case 4:
            case 5:
            case 6:
                return new nu0(i2, kn0Var, z);
            default:
                throw new IllegalArgumentException("invalid type");
        }
    }

    public final void a(kn0 kn0Var) {
        int i2 = this.a;
        boolean z = true;
        switch (i2) {
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                z = false;
                break;
            default:
                throw null;
        }
        if (z) {
            throw new IllegalStateException("Attempted to add RRset to sealed response of type ".concat(ex0.u(i2)));
        }
        if (this.c == null) {
            this.c = new ArrayList();
            if (kn0Var instanceof qc) {
                this.b = ((qc) kn0Var).l;
            }
        } else if ((kn0Var instanceof qc) && this.b) {
            this.b = ((qc) kn0Var).l;
        }
        this.c.add(kn0Var);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i2 = this.a;
        sb.append(ex0.u(i2));
        boolean z = true;
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 7:
                z = false;
                break;
            case 4:
            case 5:
            case 6:
                break;
            default:
                throw null;
        }
        if (z) {
            str = ": " + this.c.get(0);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
