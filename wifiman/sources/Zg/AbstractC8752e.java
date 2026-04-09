package zg;

/* renamed from: zg.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8752e {
    public static void a() {
        if (Eg.a.l()) {
            if ((Thread.currentThread() instanceof wg.i) || Eg.a.t()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
