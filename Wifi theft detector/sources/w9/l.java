package w9;

import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class l extends CoroutineDispatcher {

    /* renamed from: b, reason: collision with root package name */
    public static final l f24863b = new l();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void X(kotlin.coroutines.d dVar, Runnable runnable) {
        b.f24844h.d0(runnable, k.f24862h, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void Y(kotlin.coroutines.d dVar, Runnable runnable) {
        b.f24844h.d0(runnable, k.f24862h, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher a0(int i10) {
        kotlinx.coroutines.internal.m.a(i10);
        return i10 >= k.f24858d ? this : super.a0(i10);
    }
}
