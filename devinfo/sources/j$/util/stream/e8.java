package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class e8 extends c7 {
    @Override // j$.util.stream.c7
    public final c7 e(Spliterator spliterator) {
        return new e8(this.f26528b, spliterator, this.f26527a);
    }

    @Override // j$.util.stream.c7
    public final void d() {
        x6 x6Var = new x6();
        this.f26533h = x6Var;
        Objects.requireNonNull(x6Var);
        this.f26531e = this.f26528b.x0(new d8(x6Var, 0));
        this.f26532f = new j$.util.q(12, this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        x6 x6Var = (x6) this.f26533h;
        long j = this.g;
        if (x6Var.f26516c != 0) {
            if (j >= x6Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i4 = 0; i4 <= x6Var.f26516c; i4++) {
                long j8 = x6Var.f26517d[i4];
                Object[] objArr = x6Var.f26818f[i4];
                if (j < objArr.length + j8) {
                    obj = objArr[(int) (j - j8)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j < x6Var.f26515b) {
            obj = x6Var.f26817e[(int) j];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        consumer.n(obj);
        return zA;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f26533h == null && !this.f26534i) {
            Objects.requireNonNull(consumer);
            c();
            Objects.requireNonNull(consumer);
            d8 d8Var = new d8(consumer, 1);
            this.f26528b.w0(this.f26530d, d8Var);
            this.f26534i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
