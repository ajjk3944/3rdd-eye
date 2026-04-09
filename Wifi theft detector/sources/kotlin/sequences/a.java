package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f22082a;

    public a(g sequence) {
        kotlin.jvm.internal.p.e(sequence, "sequence");
        this.f22082a = new AtomicReference(sequence);
    }

    @Override // kotlin.sequences.g
    public Iterator iterator() {
        g gVar = (g) this.f22082a.getAndSet(null);
        if (gVar != null) {
            return gVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
