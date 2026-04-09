package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sl1 implements Comparable {
    public final int f;
    public final ol1 g;

    public sl1(int i, ol1 ol1Var) {
        this.f = i;
        this.g = ol1Var;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f, ((sl1) obj).f);
    }
}
