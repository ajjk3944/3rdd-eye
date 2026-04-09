package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class v6 implements j$.util.c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f26781a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26782b;

    /* renamed from: c, reason: collision with root package name */
    public int f26783c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26784d;

    /* renamed from: e, reason: collision with root package name */
    public Object f26785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w6 f26786f;

    public abstract void a(int i4, Object obj, Object obj2);

    public abstract j$.util.c1 b(Object obj, int i4, int i10);

    public abstract j$.util.c1 c(int i4, int i10, int i11, int i12);

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

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public v6(w6 w6Var, int i4, int i10, int i11, int i12) {
        this.f26786f = w6Var;
        this.f26781a = i4;
        this.f26782b = i10;
        this.f26783c = i11;
        this.f26784d = i12;
        Object[] objArr = w6Var.f26805f;
        this.f26785e = objArr == null ? w6Var.f26804e : objArr[i4];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i4 = this.f26781a;
        int i10 = this.f26784d;
        int i11 = this.f26782b;
        if (i4 == i11) {
            return i10 - this.f26783c;
        }
        long[] jArr = this.f26786f.f26517d;
        return ((jArr[i11] + i10) - jArr[i4]) - this.f26783c;
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i4 = this.f26781a;
        int i10 = this.f26782b;
        if (i4 >= i10 && (i4 != i10 || this.f26783c >= this.f26784d)) {
            return false;
        }
        Object obj2 = this.f26785e;
        int i11 = this.f26783c;
        this.f26783c = i11 + 1;
        a(i11, obj2, obj);
        int i12 = this.f26783c;
        Object obj3 = this.f26785e;
        w6 w6Var = this.f26786f;
        if (i12 == w6Var.q(obj3)) {
            this.f26783c = 0;
            int i13 = this.f26781a + 1;
            this.f26781a = i13;
            Object[] objArr = w6Var.f26805f;
            if (objArr != null && i13 <= i10) {
                this.f26785e = objArr[i13];
            }
        }
        return true;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(Object obj) {
        w6 w6Var;
        Objects.requireNonNull(obj);
        int i4 = this.f26781a;
        int i10 = this.f26784d;
        int i11 = this.f26782b;
        if (i4 < i11 || (i4 == i11 && this.f26783c < i10)) {
            int i12 = this.f26783c;
            while (true) {
                w6Var = this.f26786f;
                if (i4 >= i11) {
                    break;
                }
                Object obj2 = w6Var.f26805f[i4];
                w6Var.p(obj2, i12, w6Var.q(obj2), obj);
                i4++;
                i12 = 0;
            }
            w6Var.p(this.f26781a == i11 ? this.f26785e : w6Var.f26805f[i11], i12, i10, obj);
            this.f26781a = i11;
            this.f26783c = i10;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.c1 trySplit() {
        int i4 = this.f26781a;
        int i10 = this.f26782b;
        if (i4 < i10) {
            int i11 = i10 - 1;
            int i12 = this.f26783c;
            w6 w6Var = this.f26786f;
            j$.util.c1 c1VarC = c(i4, i11, i12, w6Var.q(w6Var.f26805f[i11]));
            this.f26781a = i10;
            this.f26783c = 0;
            this.f26785e = w6Var.f26805f[i10];
            return c1VarC;
        }
        if (i4 != i10) {
            return null;
        }
        int i13 = this.f26783c;
        int i14 = (this.f26784d - i13) / 2;
        if (i14 == 0) {
            return null;
        }
        j$.util.c1 c1VarB = b(this.f26785e, i13, i14);
        this.f26783c += i14;
        return c1VarB;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.z0 trySplit() {
        return (j$.util.z0) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
