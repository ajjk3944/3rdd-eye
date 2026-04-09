package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ri {
    public static final ri i;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int a = 1;
    public long f = -1;
    public long g = -1;
    public hj h = new hj();

    static {
        hj hjVar = new hj();
        ri riVar = new ri();
        riVar.a = 1;
        riVar.f = -1L;
        riVar.g = -1L;
        new HashSet();
        riVar.b = false;
        riVar.c = false;
        riVar.a = 1;
        riVar.d = false;
        riVar.e = false;
        riVar.h = hjVar;
        riVar.f = -1L;
        riVar.g = -1L;
        i = riVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ri.class != obj.getClass()) {
            return false;
        }
        ri riVar = (ri) obj;
        if (this.b == riVar.b && this.c == riVar.c && this.d == riVar.d && this.e == riVar.e && this.f == riVar.f && this.g == riVar.g && this.a == riVar.a) {
            return this.h.equals(riVar.h);
        }
        return false;
    }

    public final int hashCode() {
        int iS = ((((((((ex0.s(this.a) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (iS + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return this.h.a.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
