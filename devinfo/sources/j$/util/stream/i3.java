package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* loaded from: classes2.dex */
public abstract class i3 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public e2 f26609a;

    /* renamed from: b, reason: collision with root package name */
    public int f26610b;

    /* renamed from: c, reason: collision with root package name */
    public Spliterator f26611c;

    /* renamed from: d, reason: collision with root package name */
    public Spliterator f26612d;

    /* renamed from: e, reason: collision with root package name */
    public Deque f26613e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
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

    public i3(e2 e2Var) {
        this.f26609a = e2Var;
    }

    public final Deque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iO = this.f26609a.o();
        while (true) {
            iO--;
            if (iO < this.f26610b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f26609a.a(iO));
        }
    }

    public static e2 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            e2 e2Var = (e2) arrayDeque.pollFirst();
            if (e2Var == null) {
                return null;
            }
            if (e2Var.o() != 0) {
                for (int iO = e2Var.o() - 1; iO >= 0; iO--) {
                    arrayDeque.addFirst(e2Var.a(iO));
                }
            } else if (e2Var.count() > 0) {
                return e2Var;
            }
        }
    }

    public final boolean c() {
        if (this.f26609a == null) {
            return false;
        }
        if (this.f26612d != null) {
            return true;
        }
        Spliterator spliterator = this.f26611c;
        if (spliterator == null) {
            Deque dequeB = b();
            this.f26613e = dequeB;
            e2 e2VarA = a(dequeB);
            if (e2VarA != null) {
                this.f26612d = e2VarA.spliterator();
                return true;
            }
            this.f26609a = null;
            return false;
        }
        this.f26612d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        e2 e2Var = this.f26609a;
        if (e2Var == null || this.f26612d != null) {
            return null;
        }
        Spliterator spliterator = this.f26611c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f26610b < e2Var.o() - 1) {
            e2 e2Var2 = this.f26609a;
            int i4 = this.f26610b;
            this.f26610b = i4 + 1;
            return e2Var2.a(i4).spliterator();
        }
        e2 e2VarA = this.f26609a.a(this.f26610b);
        this.f26609a = e2VarA;
        if (e2VarA.o() == 0) {
            Spliterator spliterator2 = this.f26609a.spliterator();
            this.f26611c = spliterator2;
            return spliterator2.trySplit();
        }
        e2 e2Var3 = this.f26609a;
        this.f26610b = 1;
        return e2Var3.a(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.f26609a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f26611c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i4 = this.f26610b; i4 < this.f26609a.o(); i4++) {
            jCount += this.f26609a.a(i4).count();
        }
        return jCount;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        return (j$.util.c1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.z0 trySplit() {
        return (j$.util.z0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
