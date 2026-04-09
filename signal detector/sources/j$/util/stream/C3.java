package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class C3 extends E3 implements Spliterator, Consumer {

    /* renamed from: f, reason: collision with root package name */
    public Object f20836f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2383c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC2383c.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        this.f20836f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (f() != D3.NO_MORE && this.f20852a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.o(this.f20836f);
                this.f20836f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C2448j3 c2448j3 = null;
        while (true) {
            D3 d3F = f();
            if (d3F == D3.NO_MORE) {
                return;
            }
            D3 d32 = D3.MAYBE_MORE;
            Spliterator spliterator = this.f20852a;
            if (d3F == d32) {
                int i = this.f20854c;
                if (c2448j3 == null) {
                    c2448j3 = new C2448j3(i);
                } else {
                    c2448j3.f21109a = 0;
                }
                long j6 = 0;
                while (spliterator.tryAdvance(c2448j3)) {
                    j6++;
                    if (j6 >= i) {
                        break;
                    }
                }
                if (j6 == 0) {
                    return;
                }
                long jA = a(j6);
                for (int i3 = 0; i3 < jA; i3++) {
                    consumer.o(c2448j3.f21101b[i3]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // j$.util.stream.E3
    public final Spliterator b(Spliterator spliterator) {
        return new C3(spliterator, this);
    }
}
