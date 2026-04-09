package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class a8 extends c8 implements Spliterator, Consumer {

    /* renamed from: f, reason: collision with root package name */
    public Object f26500f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return j$.util.c.e(this, i4);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f26500f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (f() != b8.NO_MORE && this.f26535a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.n(this.f26500f);
                this.f26500f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        h7 h7Var = null;
        while (true) {
            b8 b8VarF = f();
            if (b8VarF == b8.NO_MORE) {
                return;
            }
            b8 b8Var = b8.MAYBE_MORE;
            Spliterator spliterator = this.f26535a;
            if (b8VarF == b8Var) {
                int i4 = this.f26537c;
                if (h7Var == null) {
                    h7Var = new h7(i4);
                } else {
                    h7Var.f26620a = 0;
                }
                long j = 0;
                while (spliterator.tryAdvance(h7Var)) {
                    j++;
                    if (j >= i4) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                long jA = a(j);
                for (int i10 = 0; i10 < jA; i10++) {
                    consumer.n(h7Var.f26602b[i10]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // j$.util.stream.c8
    public final Spliterator b(Spliterator spliterator) {
        return new a8(spliterator, this);
    }
}
