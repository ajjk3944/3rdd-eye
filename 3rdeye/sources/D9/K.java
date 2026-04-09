package D9;

import f9.InterfaceC4347e;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: StateFlow.kt */
/* loaded from: classes3.dex */
public final class K extends E9.d<J<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<Object> f1169a = new AtomicReference<>(null);

    @Override // E9.d
    public final boolean a(E9.b bVar) {
        AtomicReference<Object> atomicReference = this.f1169a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(E.f1152b);
        return true;
    }

    @Override // E9.d
    public final InterfaceC4347e[] b(E9.b bVar) {
        this.f1169a.set(null);
        return E9.c.f1488a;
    }
}
