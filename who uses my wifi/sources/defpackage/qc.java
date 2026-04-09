package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qc extends kn0 implements rc {
    public int j;
    public int k;
    public boolean l;

    @Override // defpackage.rc
    public final int a(int i) {
        return this.j - i;
    }

    @Override // defpackage.rc
    public final boolean b() {
        return ((int) (System.currentTimeMillis() / 1000)) >= this.k;
    }

    @Override // defpackage.kn0
    public final String toString() {
        return super.toString() + " cl = " + this.j;
    }
}
