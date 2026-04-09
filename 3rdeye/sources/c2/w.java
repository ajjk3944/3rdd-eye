package c2;

import T1.K;

/* compiled from: StopWorkRunnable.kt */
/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final T1.l f18439b;

    /* renamed from: c, reason: collision with root package name */
    public final T1.r f18440c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18441d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18442e;

    public w(T1.l processor, T1.r token, boolean z10, int i) {
        kotlin.jvm.internal.l.f(processor, "processor");
        kotlin.jvm.internal.l.f(token, "token");
        this.f18439b = processor;
        this.f18440c = token;
        this.f18441d = z10;
        this.f18442e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zK;
        K kB;
        if (this.f18441d) {
            T1.l lVar = this.f18439b;
            T1.r rVar = this.f18440c;
            int i = this.f18442e;
            lVar.getClass();
            String str = rVar.f12210a.f17128a;
            synchronized (lVar.f12198k) {
                kB = lVar.b(str);
            }
            zK = T1.l.e(str, kB, i);
        } else {
            zK = this.f18439b.k(this.f18440c, this.f18442e);
        }
        androidx.work.m.e().a(androidx.work.m.g("StopWorkRunnable"), "StopWorkRunnable for " + this.f18440c.f12210a.f17128a + "; Processor.stopWork = " + zK);
    }
}
