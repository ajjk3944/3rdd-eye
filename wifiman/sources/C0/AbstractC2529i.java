package C0;

import l0.C6537m;

/* renamed from: C0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2529i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(long j10, long j11) {
        return C6537m.g(j11) / C6537m.g(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(long j10, long j11) {
        return Math.max(h(j10, j11), e(j10, j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(long j10, long j11) {
        return Math.min(h(j10, j11), e(j10, j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(long j10, long j11) {
        return C6537m.i(j11) / C6537m.i(j10);
    }
}
