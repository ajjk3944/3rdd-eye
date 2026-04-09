package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* renamed from: j$.util.stream.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2446j1 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public G0 f21095a;

    /* renamed from: b, reason: collision with root package name */
    public int f21096b;

    /* renamed from: c, reason: collision with root package name */
    public Spliterator f21097c;

    /* renamed from: d, reason: collision with root package name */
    public Spliterator f21098d;

    /* renamed from: e, reason: collision with root package name */
    public Deque f21099e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2383c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC2383c.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public AbstractC2446j1(G0 g02) {
        this.f21095a = g02;
    }

    public final Deque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iP = this.f21095a.p();
        while (true) {
            iP--;
            if (iP < this.f21096b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f21095a.a(iP));
        }
    }

    public static G0 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            G0 g02 = (G0) arrayDeque.pollFirst();
            if (g02 == null) {
                return null;
            }
            if (g02.p() != 0) {
                for (int iP = g02.p() - 1; iP >= 0; iP--) {
                    arrayDeque.addFirst(g02.a(iP));
                }
            } else if (g02.count() > 0) {
                return g02;
            }
        }
    }

    public final boolean c() {
        if (this.f21095a == null) {
            return false;
        }
        if (this.f21098d != null) {
            return true;
        }
        Spliterator spliterator = this.f21097c;
        if (spliterator == null) {
            Deque dequeB = b();
            this.f21099e = dequeB;
            G0 g0A = a(dequeB);
            if (g0A != null) {
                this.f21098d = g0A.spliterator();
                return true;
            }
            this.f21095a = null;
            return false;
        }
        this.f21098d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        G0 g02 = this.f21095a;
        if (g02 == null || this.f21098d != null) {
            return null;
        }
        Spliterator spliterator = this.f21097c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f21096b < g02.p() - 1) {
            G0 g03 = this.f21095a;
            int i = this.f21096b;
            this.f21096b = i + 1;
            return g03.a(i).spliterator();
        }
        G0 g0A = this.f21095a.a(this.f21096b);
        this.f21095a = g0A;
        if (g0A.p() == 0) {
            Spliterator spliterator2 = this.f21095a.spliterator();
            this.f21097c = spliterator2;
            return spliterator2.trySplit();
        }
        G0 g04 = this.f21095a;
        this.f21096b = 1;
        return g04.a(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.f21095a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f21097c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.f21096b; i < this.f21095a.p(); i++) {
            jCount += this.f21095a.a(i).count();
        }
        return jCount;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.N trySplit() {
        return (j$.util.N) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.K trySplit() {
        return (j$.util.K) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) trySplit();
    }
}
