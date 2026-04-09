package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mq3 extends AbstractOwnableSynchronizer implements Runnable {
    public final nq3 f;

    public final /* synthetic */ void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
