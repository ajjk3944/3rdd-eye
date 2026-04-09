package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2441i1 extends AbstractC2446j1 {
    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        G0 g0A;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.f21098d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.f21097c == null && (g0A = AbstractC2446j1.a(this.f21099e)) != null) {
                Spliterator spliterator = g0A.spliterator();
                this.f21098d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f21095a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f21095a == null) {
            return;
        }
        if (this.f21098d == null) {
            Spliterator spliterator = this.f21097c;
            if (spliterator == null) {
                Deque dequeB = b();
                while (true) {
                    G0 g0A = AbstractC2446j1.a(dequeB);
                    if (g0A != null) {
                        g0A.forEach(consumer);
                    } else {
                        this.f21095a = null;
                        return;
                    }
                }
            } else {
                spliterator.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
