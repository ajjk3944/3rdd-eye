package C6;

import java.util.Iterator;
import q9.InterfaceC5499a;

/* compiled from: SparseArrays.kt */
/* loaded from: classes.dex */
public final class n<T> implements Iterable<T>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final m0.j<T> f954b;

    public n(m0.j<T> jVar) {
        this.f954b = jVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new o(this.f954b, 0);
    }
}
