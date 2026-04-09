package W;

/* compiled from: RecordingStats.java */
/* loaded from: classes.dex */
public abstract class N {
    public static C1624l d(long j4, long j10, C1616d c1616d) {
        A2.l.k("duration must be positive value.", j4 >= 0);
        A2.l.k("bytes must be positive value.", j10 >= 0);
        return new C1624l(j4, j10, c1616d);
    }

    public abstract AbstractC1614b a();

    public abstract long b();

    public abstract long c();
}
