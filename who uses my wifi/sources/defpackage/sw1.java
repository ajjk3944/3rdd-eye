package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sw1 {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public boolean e;
    public zb2 f = zb2.b;

    static {
        String str = v23.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final void a(Object obj, Object obj2, int i, long j, boolean z) {
        zb2 zb2Var = zb2.b;
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.f = zb2Var;
        this.e = z;
    }

    public final long b(int i, int i2) {
        cd1 cd1VarA = this.f.a(i);
        if (cd1VarA.a != -1) {
            return cd1VarA.e[i2];
        }
        return -9223372036854775807L;
    }

    public final void c(int i) {
        this.f.a(i).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !sw1.class.equals(obj.getClass())) {
            return false;
        }
        sw1 sw1Var = (sw1) obj;
        return Objects.equals(this.a, sw1Var.a) && Objects.equals(this.b, sw1Var.b) && this.c == sw1Var.c && this.d == sw1Var.d && this.e == sw1Var.e && Objects.equals(this.f, sw1Var.f);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c;
        long j = this.d;
        return this.f.hashCode() + (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.e ? 1 : 0)) * 31);
    }
}
