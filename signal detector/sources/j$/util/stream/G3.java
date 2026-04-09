package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class G3 extends AbstractC2423e3 {
    @Override // j$.util.stream.AbstractC2423e3
    public final AbstractC2423e3 e(Spliterator spliterator) {
        return new G3(this.f21066b, spliterator, this.f21065a);
    }

    @Override // j$.util.stream.AbstractC2423e3
    public final void d() {
        Z2 z22 = new Z2();
        this.f21072h = z22;
        Objects.requireNonNull(z22);
        this.f21069e = this.f21066b.x0(new F3(z22, 0));
        this.f21070f = new j$.util.function.g(this, 12);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        Z2 z22 = (Z2) this.f21072h;
        long j6 = this.f21071g;
        if (z22.f21052c != 0) {
            if (j6 >= z22.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j6));
            }
            for (int i = 0; i <= z22.f21052c; i++) {
                long j7 = z22.f21053d[i];
                Object[] objArr = z22.f20991f[i];
                if (j6 < objArr.length + j7) {
                    obj = objArr[(int) (j6 - j7)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j6));
        }
        if (j6 < z22.f21051b) {
            obj = z22.f20990e[(int) j6];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j6));
        }
        consumer.o(obj);
        return zA;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f21072h == null && !this.i) {
            Objects.requireNonNull(consumer);
            c();
            Objects.requireNonNull(consumer);
            F3 f32 = new F3(consumer, 1);
            this.f21066b.w0(this.f21068d, f32);
            this.i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
