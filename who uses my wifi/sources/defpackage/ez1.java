package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ez1 {
    public static final Object m = new Object();
    public static final fk1 n;
    public Object a = m;
    public fk1 b = n;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public qg1 h;
    public boolean i;
    public long j;
    public int k;
    public int l;

    static {
        vm3 vm3Var = xm3.g;
        sn3 sn3Var = sn3.j;
        List list = Collections.EMPTY_LIST;
        sn3 sn3Var2 = sn3.j;
        zi1 zi1Var = zi1.a;
        Uri uri = Uri.EMPTY;
        n = new fk1("androidx.media3.common.Timeline", new se1(), uri != null ? new kh1(uri, sn3Var2) : null, new qg1(), rm1.B);
        String str = v23.a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final void a(fk1 fk1Var, boolean z, boolean z2, qg1 qg1Var, long j) {
        this.a = m;
        if (fk1Var == null) {
            fk1Var = n;
        }
        this.b = fk1Var;
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = z;
        this.g = z2;
        this.h = qg1Var;
        this.j = j;
        this.k = 0;
        this.l = 0;
        this.i = false;
    }

    public final boolean b() {
        return this.h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ez1.class.equals(obj.getClass())) {
            return false;
        }
        ez1 ez1Var = (ez1) obj;
        return Objects.equals(this.a, ez1Var.a) && Objects.equals(this.b, ez1Var.b) && Objects.equals(this.h, ez1Var.h) && this.c == ez1Var.c && this.d == ez1Var.d && this.e == ez1Var.e && this.f == ez1Var.f && this.g == ez1Var.g && this.i == ez1Var.i && this.j == ez1Var.j && this.k == ez1Var.k && this.l == ez1Var.l;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() + 217) * 31) + this.b.hashCode();
        qg1 qg1Var = this.h;
        int iHashCode2 = ((iHashCode * 961) + (qg1Var == null ? 0 : qg1Var.hashCode())) * 31;
        long j = this.c;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i3 = ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.i ? 1 : 0);
        long j4 = this.j;
        return ((((((i3 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.k) * 31) + this.l) * 31;
    }
}
