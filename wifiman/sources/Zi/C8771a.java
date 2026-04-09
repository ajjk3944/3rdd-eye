package zi;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: zi.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8771a implements InterfaceC8780j {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f67330a;

    public C8771a(InterfaceC8780j sequence) {
        AbstractC6492s.i(sequence, "sequence");
        this.f67330a = new AtomicReference(sequence);
    }

    @Override // zi.InterfaceC8780j
    public Iterator iterator() {
        InterfaceC8780j interfaceC8780j = (InterfaceC8780j) this.f67330a.getAndSet(null);
        if (interfaceC8780j != null) {
            return interfaceC8780j.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
