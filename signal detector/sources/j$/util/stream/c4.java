package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class c4 extends i4 implements DoubleConsumer, j$.util.F {

    /* renamed from: e, reason: collision with root package name */
    public double f21048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4(Spliterator spliterator, int i) {
        super(spliterator);
        this.f21049f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4(Spliterator spliterator, i4 i4Var, int i) {
        super(spliterator, i4Var);
        this.f21049f = i;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.i4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.f(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d6) {
        this.f21093d = (this.f21093d + 1) & 63;
        this.f21048e = d6;
    }

    @Override // j$.util.stream.i4
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f21049f) {
            case 0:
                return new c4((j$.util.F) spliterator, this, 0);
            default:
                return new c4((j$.util.F) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.i4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.N trySplit() {
        switch (this.f21049f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.i4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f21049f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.F
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f21049f) {
            case 0:
                boolean z6 = this.f21092c;
                Spliterator spliterator = this.f21090a;
                if (z6) {
                    this.f21092c = false;
                    boolean zTryAdvance = ((j$.util.F) spliterator).tryAdvance((DoubleConsumer) this);
                    if (zTryAdvance && a()) {
                        DoublePredicate doublePredicate = null;
                        doublePredicate.test(this.f21048e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    doubleConsumer.accept(this.f21048e);
                    return zTryAdvance;
                }
                return ((j$.util.F) spliterator).tryAdvance(doubleConsumer);
            default:
                if (this.f21092c && a() && ((j$.util.F) this.f21090a).tryAdvance((DoubleConsumer) this)) {
                    DoublePredicate doublePredicate2 = null;
                    doublePredicate2.test(this.f21048e);
                    throw null;
                }
                this.f21092c = false;
                return false;
        }
    }

    @Override // j$.util.stream.i4, j$.util.Spliterator
    public j$.util.F trySplit() {
        switch (this.f21049f) {
            case 1:
                if (this.f21091b.get()) {
                    return null;
                }
                return (j$.util.F) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.N
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f21049f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
