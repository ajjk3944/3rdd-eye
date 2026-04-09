package ag;

import dg.InterfaceC5371a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
abstract class m implements InterfaceC5371a {

    /* renamed from: a, reason: collision with root package name */
    protected long f26269a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f26270b;

    m() {
    }

    void c(Iterator it, Consumer consumer, long j10) {
        while (this.f26269a < j10) {
            try {
                Object next = it.next();
                this.f26269a++;
                consumer.accept(next);
            } catch (NoSuchElementException unused) {
                return;
            }
        }
    }

    @Override // java.util.Spliterator
    public int characteristics() {
        return 20821;
    }

    boolean d(Iterator it, Consumer consumer) {
        try {
            Object next = it.next();
            this.f26269a++;
            consumer.accept(next);
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    public String toString() {
        return "spliterator for " + a();
    }
}
