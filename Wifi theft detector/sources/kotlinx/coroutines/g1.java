package kotlinx.coroutines;

/* loaded from: classes4.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.c0 f22498a = new kotlinx.coroutines.internal.c0("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.c0 f22499b = new kotlinx.coroutines.internal.c0("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j10 * 1000000;
    }
}
