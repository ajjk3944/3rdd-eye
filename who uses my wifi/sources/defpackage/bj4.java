package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bj4 implements Comparable {
    public final boolean f;
    public final boolean g;

    public bj4(ph4 ph4Var, int i) {
        this.f = 1 == (ph4Var.e & 1);
        this.g = kg4.I(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        bj4 bj4Var = (bj4) obj;
        return pm3.a.d(this.g, bj4Var.g).d(this.f, bj4Var.f).e();
    }
}
