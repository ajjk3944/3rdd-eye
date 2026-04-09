package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class o6 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public int f26698a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26699b;

    /* renamed from: c, reason: collision with root package name */
    public int f26700c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26701d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f26702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x6 f26703f;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return j$.util.c.e(this, i4);
    }

    public o6(x6 x6Var, int i4, int i10, int i11, int i12) {
        this.f26703f = x6Var;
        this.f26698a = i4;
        this.f26699b = i10;
        this.f26700c = i11;
        this.f26701d = i12;
        Object[][] objArr = x6Var.f26818f;
        this.f26702e = objArr == null ? x6Var.f26817e : objArr[i4];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i4 = this.f26698a;
        int i10 = this.f26701d;
        int i11 = this.f26699b;
        if (i4 == i11) {
            return i10 - this.f26700c;
        }
        long[] jArr = this.f26703f.f26517d;
        return ((jArr[i11] + i10) - jArr[i4]) - this.f26700c;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i4 = this.f26698a;
        int i10 = this.f26699b;
        if (i4 >= i10 && (i4 != i10 || this.f26700c >= this.f26701d)) {
            return false;
        }
        Object[] objArr = this.f26702e;
        int i11 = this.f26700c;
        this.f26700c = i11 + 1;
        consumer.n(objArr[i11]);
        if (this.f26700c == this.f26702e.length) {
            this.f26700c = 0;
            int i12 = this.f26698a + 1;
            this.f26698a = i12;
            Object[][] objArr2 = this.f26703f.f26818f;
            if (objArr2 != null && i12 <= i10) {
                this.f26702e = objArr2[i12];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        x6 x6Var;
        Objects.requireNonNull(consumer);
        int i4 = this.f26698a;
        int i10 = this.f26701d;
        int i11 = this.f26699b;
        if (i4 < i11 || (i4 == i11 && this.f26700c < i10)) {
            int i12 = this.f26700c;
            while (true) {
                x6Var = this.f26703f;
                if (i4 >= i11) {
                    break;
                }
                Object[] objArr = x6Var.f26818f[i4];
                while (i12 < objArr.length) {
                    consumer.n(objArr[i12]);
                    i12++;
                }
                i4++;
                i12 = 0;
            }
            Object[] objArr2 = this.f26698a == i11 ? this.f26702e : x6Var.f26818f[i11];
            while (i12 < i10) {
                consumer.n(objArr2[i12]);
                i12++;
            }
            this.f26698a = i11;
            this.f26700c = i10;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i4 = this.f26698a;
        int i10 = this.f26699b;
        if (i4 < i10) {
            int i11 = i10 - 1;
            int i12 = this.f26700c;
            x6 x6Var = this.f26703f;
            o6 o6Var = new o6(x6Var, i4, i11, i12, x6Var.f26818f[i11].length);
            this.f26698a = i10;
            this.f26700c = 0;
            this.f26702e = x6Var.f26818f[i10];
            return o6Var;
        }
        if (i4 != i10) {
            return null;
        }
        int i13 = this.f26700c;
        int i14 = (this.f26701d - i13) / 2;
        if (i14 == 0) {
            return null;
        }
        Object[] objArr = this.f26702e;
        int i15 = i13 + i14;
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, i13, i15);
        j$.util.i1 i1Var = new j$.util.i1(objArr, i13, i15, 1040);
        this.f26700c += i14;
        return i1Var;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
