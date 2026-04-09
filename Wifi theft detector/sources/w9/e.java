package w9;

import java.util.concurrent.Executor;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* loaded from: classes4.dex */
public abstract class e extends ExecutorCoroutineDispatcher {

    /* renamed from: c, reason: collision with root package name */
    public final int f24846c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24847d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24848e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24849f;

    /* renamed from: g, reason: collision with root package name */
    public CoroutineScheduler f24850g = c0();

    public e(int i10, int i11, long j10, String str) {
        this.f24846c = i10;
        this.f24847d = i11;
        this.f24848e = j10;
        this.f24849f = str;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void X(kotlin.coroutines.d dVar, Runnable runnable) {
        CoroutineScheduler.o(this.f24850g, runnable, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void Y(kotlin.coroutines.d dVar, Runnable runnable) {
        CoroutineScheduler.o(this.f24850g, runnable, null, true, 2, null);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor b0() {
        return this.f24850g;
    }

    public final CoroutineScheduler c0() {
        return new CoroutineScheduler(this.f24846c, this.f24847d, this.f24848e, this.f24849f);
    }

    public final void d0(Runnable runnable, h hVar, boolean z10) {
        this.f24850g.m(runnable, hVar, z10);
    }
}
