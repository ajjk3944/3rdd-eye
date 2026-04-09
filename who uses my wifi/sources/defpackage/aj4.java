package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class aj4 extends jj4 implements Comparable {
    public final int j;
    public final int k;

    public aj4(int i, d02 d02Var, int i2, dj4 dj4Var, int i3) {
        int i4;
        super(i, d02Var, i2);
        this.j = kg4.I(i3, dj4Var.B) ? 1 : 0;
        ph4 ph4Var = this.i;
        int i5 = ph4Var.t;
        int i6 = -1;
        if (i5 != -1 && (i4 = ph4Var.u) != -1) {
            i6 = i5 * i4;
        }
        this.k = i6;
    }

    @Override // defpackage.jj4
    public final int a() {
        return this.j;
    }

    @Override // defpackage.jj4
    public final /* bridge */ /* synthetic */ boolean b(jj4 jj4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.k, ((aj4) obj).k);
    }
}
