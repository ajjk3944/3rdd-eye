package wg;

import gg.y;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes4.dex */
public final class g extends y {

    /* renamed from: d, reason: collision with root package name */
    private static final j f64969d = new j("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())));

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f64970c;

    public g() {
        this(f64969d);
    }

    @Override // gg.y
    public y.c c() {
        return new h(this.f64970c);
    }

    public g(ThreadFactory threadFactory) {
        this.f64970c = threadFactory;
    }
}
