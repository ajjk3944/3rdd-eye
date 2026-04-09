package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class nu3 {
    public final long[] a;
    public final long[] b;
    public final long[] c;

    public nu3(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(nu3 nu3Var, int i) {
        i30.c0(this.a, nu3Var.a, i);
        i30.c0(this.b, nu3Var.b, i);
        i30.c0(this.c, nu3Var.c, i);
    }

    public nu3() {
        nu3 nu3Var = ou1.r;
        this.a = Arrays.copyOf(nu3Var.a, 10);
        this.b = Arrays.copyOf(nu3Var.b, 10);
        this.c = Arrays.copyOf(nu3Var.c, 10);
    }
}
