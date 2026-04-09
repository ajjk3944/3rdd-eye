package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class Q2 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public int f20951a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20952b;

    /* renamed from: c, reason: collision with root package name */
    public int f20953c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20954d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f20955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z2 f20956f;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2383c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC2383c.e(this, i);
    }

    public Q2(Z2 z22, int i, int i3, int i6, int i7) {
        this.f20956f = z22;
        this.f20951a = i;
        this.f20952b = i3;
        this.f20953c = i6;
        this.f20954d = i7;
        Object[][] objArr = z22.f20991f;
        this.f20955e = objArr == null ? z22.f20990e : objArr[i];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.f20951a;
        int i3 = this.f20954d;
        int i6 = this.f20952b;
        if (i == i6) {
            return i3 - this.f20953c;
        }
        long[] jArr = this.f20956f.f21053d;
        return ((jArr[i6] + i3) - jArr[i]) - this.f20953c;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i = this.f20951a;
        int i3 = this.f20952b;
        if (i >= i3 && (i != i3 || this.f20953c >= this.f20954d)) {
            return false;
        }
        Object[] objArr = this.f20955e;
        int i6 = this.f20953c;
        this.f20953c = i6 + 1;
        consumer.o(objArr[i6]);
        if (this.f20953c == this.f20955e.length) {
            this.f20953c = 0;
            int i7 = this.f20951a + 1;
            this.f20951a = i7;
            Object[][] objArr2 = this.f20956f.f20991f;
            if (objArr2 != null && i7 <= i3) {
                this.f20955e = objArr2[i7];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Z2 z22;
        Objects.requireNonNull(consumer);
        int i = this.f20951a;
        int i3 = this.f20954d;
        int i6 = this.f20952b;
        if (i < i6 || (i == i6 && this.f20953c < i3)) {
            int i7 = this.f20953c;
            while (true) {
                z22 = this.f20956f;
                if (i >= i6) {
                    break;
                }
                Object[] objArr = z22.f20991f[i];
                while (i7 < objArr.length) {
                    consumer.o(objArr[i7]);
                    i7++;
                }
                i++;
                i7 = 0;
            }
            Object[] objArr2 = this.f20951a == i6 ? this.f20955e : z22.f20991f[i6];
            while (i7 < i3) {
                consumer.o(objArr2[i7]);
                i7++;
            }
            this.f20951a = i6;
            this.f20953c = i3;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f20951a;
        int i3 = this.f20952b;
        if (i < i3) {
            int i6 = i3 - 1;
            int i7 = this.f20953c;
            Z2 z22 = this.f20956f;
            Q2 q22 = new Q2(z22, i, i6, i7, z22.f20991f[i6].length);
            this.f20951a = i3;
            this.f20953c = 0;
            this.f20955e = z22.f20991f[i3];
            return q22;
        }
        if (i != i3) {
            return null;
        }
        int i8 = this.f20953c;
        int i9 = (this.f20954d - i8) / 2;
        if (i9 == 0) {
            return null;
        }
        Object[] objArr = this.f20955e;
        int i10 = i8 + i9;
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, i8, i10);
        j$.util.U u6 = new j$.util.U(objArr, i8, i10, 1040);
        this.f20953c += i9;
        return u6;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
