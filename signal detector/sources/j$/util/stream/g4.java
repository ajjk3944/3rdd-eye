package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class g4 extends i4 implements LongConsumer, j$.util.K {

    /* renamed from: e, reason: collision with root package name */
    public long f21080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21081f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Spliterator spliterator, int i) {
        super(spliterator);
        this.f21081f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Spliterator spliterator, i4 i4Var, int i) {
        super(spliterator, i4Var);
        this.f21081f = i;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.i4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.h(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f21093d = (this.f21093d + 1) & 63;
        this.f21080e = j6;
    }

    @Override // j$.util.stream.i4
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f21081f) {
            case 0:
                return new g4((j$.util.K) spliterator, this, 0);
            default:
                return new g4((j$.util.K) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.i4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.N trySplit() {
        switch (this.f21081f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.i4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f21081f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.K
    public final boolean tryAdvance(LongConsumer longConsumer) {
        switch (this.f21081f) {
            case 0:
                boolean z6 = this.f21092c;
                Spliterator spliterator = this.f21090a;
                if (z6) {
                    this.f21092c = false;
                    boolean zTryAdvance = ((j$.util.K) spliterator).tryAdvance((LongConsumer) this);
                    if (zTryAdvance && a()) {
                        LongPredicate longPredicate = null;
                        longPredicate.test(this.f21080e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    longConsumer.accept(this.f21080e);
                    return zTryAdvance;
                }
                return ((j$.util.K) spliterator).tryAdvance(longConsumer);
            default:
                if (this.f21092c && a() && ((j$.util.K) this.f21090a).tryAdvance((LongConsumer) this)) {
                    LongPredicate longPredicate2 = null;
                    longPredicate2.test(this.f21080e);
                    throw null;
                }
                this.f21092c = false;
                return false;
        }
    }

    @Override // j$.util.stream.i4, j$.util.Spliterator
    public j$.util.K trySplit() {
        switch (this.f21081f) {
            case 1:
                if (this.f21091b.get()) {
                    return null;
                }
                return (j$.util.K) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.N
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f21081f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }
}
