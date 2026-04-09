package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class S implements A, LongConsumer, InterfaceC2391k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20670a = false;

    /* renamed from: b, reason: collision with root package name */
    public long f20671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f20672c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.B
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (e0.f20782a) {
            e0.a(S.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.A, java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (e0.f20782a) {
            e0.a(S.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new C2532x(consumer, 0));
    }

    public S(K k6) {
        this.f20672c = k6;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f20670a = true;
        this.f20671b = j6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f20670a) {
            this.f20672c.tryAdvance((LongConsumer) this);
        }
        return this.f20670a;
    }

    @Override // j$.util.A
    public final long nextLong() {
        if (!this.f20670a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20670a = false;
        return this.f20671b;
    }
}
