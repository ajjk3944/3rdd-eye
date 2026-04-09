package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ri4 {
    public static final ri4 d = new ri4(new d02[0]);
    public final int a;
    public final sn3 b;
    public int c;

    static {
        String str = v23.a;
        Integer.toString(0, 36);
    }

    public ri4(d02... d02VarArr) {
        this.b = xm3.n(d02VarArr);
        this.a = d02VarArr.length;
        int i = 0;
        while (i < this.b.i) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                sn3 sn3Var = this.b;
                if (i3 < sn3Var.i) {
                    if (((d02) sn3Var.get(i)).equals(this.b.get(i3))) {
                        a30.C("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }

    public final d02 a(int i) {
        return (d02) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ri4.class != obj.getClass()) {
            return false;
        }
        ri4 ri4Var = (ri4) obj;
        return this.a == ri4Var.a && this.b.equals(ri4Var.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b.toString();
    }
}
