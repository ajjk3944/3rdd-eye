package j$.util.concurrent;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class j extends p implements Spliterator {
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public long f20733j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i, int i3, int i6, long j6, int i7) {
        super(lVarArr, i, i3, i6);
        this.i = i7;
        this.f20733j = j6;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.i) {
        }
        return AbstractC2383c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.i) {
        }
        return AbstractC2383c.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.i) {
            case 0:
                int i = this.f20750f;
                int i3 = this.f20751g;
                int i6 = (i + i3) >>> 1;
                if (i6 <= i) {
                    return null;
                }
                l[] lVarArr = this.f20745a;
                this.f20751g = i6;
                long j6 = this.f20733j >>> 1;
                this.f20733j = j6;
                return new j(lVarArr, this.f20752h, i6, i3, j6, 0);
            default:
                int i7 = this.f20750f;
                int i8 = this.f20751g;
                int i9 = (i7 + i8) >>> 1;
                if (i9 <= i7) {
                    return null;
                }
                l[] lVarArr2 = this.f20745a;
                this.f20751g = i9;
                long j7 = this.f20733j >>> 1;
                this.f20733j = j7;
                return new j(lVarArr2, this.f20752h, i9, i8, j7, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l lVarA = a();
                    if (lVarA == null) {
                        break;
                    } else {
                        consumer.accept(lVarA.f20738b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    l lVarA2 = a();
                    if (lVarA2 == null) {
                        break;
                    } else {
                        consumer.accept(lVarA2.f20739c);
                    }
                }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                l lVarA = a();
                if (lVarA != null) {
                    consumer.accept(lVarA.f20738b);
                    break;
                }
                break;
            default:
                consumer.getClass();
                l lVarA2 = a();
                if (lVarA2 != null) {
                    consumer.accept(lVarA2.f20739c);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.i) {
        }
        return this.f20733j;
    }
}
