package d2;

import Ii.B0;
import Ii.N;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5282a implements AutoCloseable, N {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5384i f45720a;

    public C5282a(InterfaceC5384i coroutineContext) {
        AbstractC6492s.i(coroutineContext, "coroutineContext");
        this.f45720a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        B0.f(getCoroutineContext(), null, 1, null);
    }

    @Override // Ii.N
    public InterfaceC5384i getCoroutineContext() {
        return this.f45720a;
    }
}
