package x9;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequencesJVM.kt */
/* renamed from: x9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5783a<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<g<T>> f47818a;

    public C5783a(g<? extends T> gVar) {
        this.f47818a = new AtomicReference<>(gVar);
    }

    @Override // x9.g
    public final Iterator<T> iterator() {
        g<T> andSet = this.f47818a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
