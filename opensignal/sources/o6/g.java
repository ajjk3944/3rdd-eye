package o6;

/* loaded from: classes.dex */
public final class g extends n6.e implements Comparable {
    public long F;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (g(4) != gVar.g(4)) {
            return g(4) ? 1 : -1;
        }
        long j = this.f3308y - gVar.f3308y;
        if (j == 0) {
            j = this.F - gVar.F;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
