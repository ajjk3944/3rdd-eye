package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class du1 extends hu1 {
    public final boolean h;

    public du1(jt1 jt1Var, fr1 fr1Var, int i) {
        super(jt1Var, "i1MP+hbN0GtKV+UrtunReVDE3xh08srd5laBoZPswSp8P1i6BkpyGoiKZr6P+aBQ", "NQ1lo07HyX6R6o9xhF+JysjB/gJoli3QRzxLpFE7RH8=", fr1Var, i, 61);
        this.h = jt1Var.o.a;
    }

    @Override // defpackage.hu1
    public final void a() {
        long jLongValue = ((Long) this.e.invoke(null, this.a.a, Boolean.valueOf(this.h))).longValue();
        fr1 fr1Var = this.d;
        synchronized (fr1Var) {
            fr1Var.b();
            ((qr1) fr1Var.g).b0(jLongValue);
        }
    }
}
