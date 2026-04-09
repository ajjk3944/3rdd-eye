package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class j extends p implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26320i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i4, int i10, int i11, long j, int i12) {
        super(lVarArr, i4, i10, i11);
        this.f26320i = i12;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f26320i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f26320i) {
        }
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        switch (this.f26320i) {
        }
        return j$.util.c.e(this, i4);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f26320i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f26320i) {
            case 0:
                int i4 = this.f26337f;
                int i10 = this.g;
                int i11 = (i4 + i10) >>> 1;
                if (i11 <= i4) {
                    return null;
                }
                l[] lVarArr = this.f26332a;
                this.g = i11;
                long j = this.j >>> 1;
                this.j = j;
                return new j(lVarArr, this.f26338h, i11, i10, j, 0);
            default:
                int i12 = this.f26337f;
                int i13 = this.g;
                int i14 = (i12 + i13) >>> 1;
                if (i14 <= i12) {
                    return null;
                }
                l[] lVarArr2 = this.f26332a;
                this.g = i14;
                long j8 = this.j >>> 1;
                this.j = j8;
                return new j(lVarArr2, this.f26338h, i14, i13, j8, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f26320i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l lVarA = a();
                    if (lVarA == null) {
                        break;
                    } else {
                        consumer.accept(lVarA.f26325b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    l lVarA2 = a();
                    if (lVarA2 == null) {
                        break;
                    } else {
                        consumer.accept(lVarA2.f26326c);
                    }
                }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f26320i) {
            case 0:
                consumer.getClass();
                l lVarA = a();
                if (lVarA != null) {
                    consumer.accept(lVarA.f26325b);
                    break;
                }
                break;
            default:
                consumer.getClass();
                l lVarA2 = a();
                if (lVarA2 != null) {
                    consumer.accept(lVarA2.f26326c);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f26320i) {
        }
        return this.j;
    }
}
