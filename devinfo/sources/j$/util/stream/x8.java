package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class x8 extends d9 implements DoubleConsumer, j$.util.u0 {

    /* renamed from: e, reason: collision with root package name */
    public double f26820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26821f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8(Spliterator spliterator, int i4) {
        super(spliterator);
        this.f26821f = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8(Spliterator spliterator, d9 d9Var, int i4) {
        super(spliterator, d9Var);
        this.f26821f = i4;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.d9, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.f(this, consumer);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f26562d = (this.f26562d + 1) & 63;
        this.f26820e = d10;
    }

    @Override // j$.util.stream.d9
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f26821f) {
            case 0:
                return new x8((j$.util.u0) spliterator, this, 0);
            default:
                return new x8((j$.util.u0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.d9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f26821f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.d9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        switch (this.f26821f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.u0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f26821f) {
            case 0:
                boolean z3 = this.f26561c;
                Spliterator spliterator = this.f26559a;
                if (z3) {
                    this.f26561c = false;
                    boolean zTryAdvance = ((j$.util.u0) spliterator).tryAdvance((DoubleConsumer) this);
                    if (zTryAdvance && a()) {
                        DoublePredicate doublePredicate = null;
                        doublePredicate.test(this.f26820e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    doubleConsumer.accept(this.f26820e);
                    return zTryAdvance;
                }
                return ((j$.util.u0) spliterator).tryAdvance(doubleConsumer);
            default:
                if (this.f26561c && a() && ((j$.util.u0) this.f26559a).tryAdvance((DoubleConsumer) this)) {
                    DoublePredicate doublePredicate2 = null;
                    doublePredicate2.test(this.f26820e);
                    throw null;
                }
                this.f26561c = false;
                return false;
        }
    }

    @Override // j$.util.stream.d9, j$.util.Spliterator
    public j$.util.u0 trySplit() {
        switch (this.f26821f) {
            case 1:
                if (this.f26560b.get()) {
                    return null;
                }
                return (j$.util.u0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.c1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f26821f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
