package k1;

import A9.C0572d0;
import A9.E;
import f9.InterfaceC4350h;
import kotlin.jvm.internal.l;

/* compiled from: CloseableCoroutineScope.kt */
/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5207a implements AutoCloseable, E {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4350h f43149b;

    public C5207a(InterfaceC4350h coroutineContext) {
        l.f(coroutineContext, "coroutineContext");
        this.f43149b = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C0572d0.b(this.f43149b, null);
    }

    @Override // A9.E
    public final InterfaceC4350h k0() {
        return this.f43149b;
    }
}
