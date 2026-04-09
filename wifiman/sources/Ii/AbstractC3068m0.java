package Ii;

/* renamed from: Ii.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3068m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Ni.C f9343a = new Ni.C("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    private static final Ni.C f9344b = new Ni.C("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}
