package fb;

/* loaded from: classes.dex */
public final class h extends eb.i implements Comparable {
    public long F;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (g(4) != hVar.g(4)) {
            return g(4) ? 1 : -1;
        }
        long j = this.f26793y - hVar.f26793y;
        if (j == 0) {
            j = this.F - hVar.F;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
