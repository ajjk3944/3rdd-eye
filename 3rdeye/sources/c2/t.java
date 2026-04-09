package c2;

import androidx.work.WorkerParameters;

/* compiled from: StartWorkRunnable.kt */
/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final T1.l f18433b;

    /* renamed from: c, reason: collision with root package name */
    public final T1.r f18434c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkerParameters.a f18435d;

    public t(T1.l processor, T1.r rVar, WorkerParameters.a aVar) {
        kotlin.jvm.internal.l.f(processor, "processor");
        this.f18433b = processor;
        this.f18434c = rVar;
        this.f18435d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f18433b.j(this.f18434c, this.f18435d);
    }
}
