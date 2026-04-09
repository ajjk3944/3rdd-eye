package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class b9 extends d9 implements LongConsumer, j$.util.z0 {

    /* renamed from: e, reason: collision with root package name */
    public long f26512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26513f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(Spliterator spliterator, int i4) {
        super(spliterator);
        this.f26513f = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(Spliterator spliterator, d9 d9Var, int i4) {
        super(spliterator, d9Var);
        this.f26513f = i4;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.d9, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.h(this, consumer);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f26562d = (this.f26562d + 1) & 63;
        this.f26512e = j;
    }

    @Override // j$.util.stream.d9
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f26513f) {
            case 0:
                return new b9((j$.util.z0) spliterator, this, 0);
            default:
                return new b9((j$.util.z0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.d9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f26513f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.d9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        switch (this.f26513f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.z0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        switch (this.f26513f) {
            case 0:
                boolean z3 = this.f26561c;
                Spliterator spliterator = this.f26559a;
                if (z3) {
                    this.f26561c = false;
                    boolean zTryAdvance = ((j$.util.z0) spliterator).tryAdvance((LongConsumer) this);
                    if (zTryAdvance && a()) {
                        LongPredicate longPredicate = null;
                        longPredicate.test(this.f26512e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    longConsumer.accept(this.f26512e);
                    return zTryAdvance;
                }
                return ((j$.util.z0) spliterator).tryAdvance(longConsumer);
            default:
                if (this.f26561c && a() && ((j$.util.z0) this.f26559a).tryAdvance((LongConsumer) this)) {
                    LongPredicate longPredicate2 = null;
                    longPredicate2.test(this.f26512e);
                    throw null;
                }
                this.f26561c = false;
                return false;
        }
    }

    @Override // j$.util.stream.d9, j$.util.Spliterator
    public j$.util.z0 trySplit() {
        switch (this.f26513f) {
            case 1:
                if (this.f26560b.get()) {
                    return null;
                }
                return (j$.util.z0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.c1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f26513f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }
}
