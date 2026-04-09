package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ou3 extends nu3 {
    public final long[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ou3(mr2 mr2Var) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        super(jArr, jArr2, jArr4);
        this.d = jArr3;
        jr3 jr3Var = (jr3) mr2Var.g;
        pu1.u(jArr, (long[]) jr3Var.h, (long[]) jr3Var.g);
        pu1.y(jArr2, (long[]) jr3Var.h, (long[]) jr3Var.g);
        System.arraycopy((long[]) jr3Var.i, 0, jArr3, 0, 10);
        pu1.G(jArr4, (long[]) mr2Var.h, pu3.b);
    }

    @Override // defpackage.nu3
    public final void a(long[] jArr, long[] jArr2) {
        pu1.G(jArr, jArr2, this.d);
    }
}
