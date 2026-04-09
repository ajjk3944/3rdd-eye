package T1;

import e2.InterfaceC4306b;

/* compiled from: WorkLauncher.kt */
/* loaded from: classes.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    public final l f12224a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4306b f12225b;

    public y(l processor, InterfaceC4306b workTaskExecutor) {
        kotlin.jvm.internal.l.f(processor, "processor");
        kotlin.jvm.internal.l.f(workTaskExecutor, "workTaskExecutor");
        this.f12224a = processor;
        this.f12225b = workTaskExecutor;
    }

    @Override // T1.x
    public final void a(r workSpecId) {
        kotlin.jvm.internal.l.f(workSpecId, "workSpecId");
        c(workSpecId, -512);
    }

    public final void b(r rVar) {
        this.f12225b.d(new c2.t(this.f12224a, rVar, null));
    }

    public final void c(r workSpecId, int i) {
        kotlin.jvm.internal.l.f(workSpecId, "workSpecId");
        this.f12225b.d(new c2.w(this.f12224a, workSpecId, false, i));
    }
}
