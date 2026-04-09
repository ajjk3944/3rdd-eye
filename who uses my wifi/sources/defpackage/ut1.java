package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ut1 extends hu1 {
    public final long h;

    public ut1(jt1 jt1Var, fr1 fr1Var, long j, int i) {
        super(jt1Var, "6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L", "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc=", fr1Var, i, 25);
        this.h = j;
    }

    @Override // defpackage.hu1
    public final void a() {
        long jLongValue = ((Long) this.e.invoke(null, null)).longValue();
        fr1 fr1Var = this.d;
        synchronized (fr1Var) {
            fr1Var.b();
            ((qr1) fr1Var.g).n0(jLongValue);
            long j = this.h;
            if (j != 0) {
                fr1Var.b();
                ((qr1) fr1Var.g).O0(jLongValue - j);
                fr1Var.b();
                ((qr1) fr1Var.g).R0(j);
            }
        }
    }
}
