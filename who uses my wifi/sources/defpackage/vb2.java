package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vb2 {
    public final ra4 a;

    public vb2(ra4 ra4Var) {
        this.a = ra4Var;
    }

    public final void a(int i, long j) {
        long j2;
        iz1 iz1Var = mz1.C0;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            return;
        }
        ra4 ra4Var = this.a;
        ra4Var.h();
        synchronized (ra4Var.a) {
            j2 = ra4Var.D;
        }
        if (j - j2 < 0) {
            gi2.G("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) tw1Var.c.a(mz1.D0)).booleanValue()) {
            ra4Var.c(i);
            ra4Var.d(j);
        } else {
            ra4Var.c(-1);
            ra4Var.d(j);
        }
    }
}
