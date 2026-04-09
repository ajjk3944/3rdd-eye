package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class w6 extends c implements Iterable {

    /* renamed from: e, reason: collision with root package name */
    public Object f26804e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f26805f;

    public abstract Object newArray(int i4);

    public abstract void p(Object obj, int i4, int i10, Object obj2);

    public abstract int q(Object obj);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public abstract Object[] t();

    public w6(int i4) {
        super(i4);
        this.f26804e = newArray(1 << this.f26514a);
    }

    public w6() {
        this.f26804e = newArray(16);
    }

    public final void s(long j) {
        long jQ;
        int i4 = this.f26516c;
        if (i4 == 0) {
            jQ = q(this.f26804e);
        } else {
            jQ = q(this.f26805f[i4]) + this.f26517d[i4];
        }
        if (j > jQ) {
            if (this.f26805f == null) {
                Object[] objArrT = t();
                this.f26805f = objArrT;
                this.f26517d = new long[8];
                objArrT[0] = this.f26804e;
            }
            int i10 = this.f26516c + 1;
            while (j > jQ) {
                Object[] objArr = this.f26805f;
                if (i10 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f26805f = Arrays.copyOf(objArr, length);
                    this.f26517d = Arrays.copyOf(this.f26517d, length);
                }
                int iMin = this.f26514a;
                if (i10 != 0 && i10 != 1) {
                    iMin = Math.min((iMin + i10) - 1, 30);
                }
                int i11 = 1 << iMin;
                this.f26805f[i10] = newArray(i11);
                long[] jArr = this.f26517d;
                jArr[i10] = jArr[i10 - 1] + q(this.f26805f[r6]);
                jQ += i11;
                i10++;
            }
        }
    }

    public final int r(long j) {
        if (this.f26516c == 0) {
            if (j < this.f26515b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i4 = 0; i4 <= this.f26516c; i4++) {
            if (j < this.f26517d[i4] + q(this.f26805f[i4])) {
                return i4;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    public void f(int i4, Object obj) {
        long j = i4;
        long jCount = count() + j;
        if (jCount > q(obj) || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f26516c == 0) {
            System.arraycopy(this.f26804e, 0, obj, i4, this.f26515b);
            return;
        }
        for (int i10 = 0; i10 < this.f26516c; i10++) {
            Object obj2 = this.f26805f[i10];
            System.arraycopy(obj2, 0, obj, i4, q(obj2));
            i4 += q(this.f26805f[i10]);
        }
        int i11 = this.f26515b;
        if (i11 > 0) {
            System.arraycopy(this.f26804e, 0, obj, i4, i11);
        }
    }

    public Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) jCount);
        f(0, objNewArray);
        return objNewArray;
    }

    public final void u() {
        long jQ;
        if (this.f26515b == q(this.f26804e)) {
            if (this.f26805f == null) {
                Object[] objArrT = t();
                this.f26805f = objArrT;
                this.f26517d = new long[8];
                objArrT[0] = this.f26804e;
            }
            int i4 = this.f26516c;
            int i10 = i4 + 1;
            Object[] objArr = this.f26805f;
            if (i10 >= objArr.length || objArr[i10] == null) {
                if (i4 == 0) {
                    jQ = q(this.f26804e);
                } else {
                    jQ = q(objArr[i4]) + this.f26517d[i4];
                }
                s(jQ + 1);
            }
            this.f26515b = 0;
            int i11 = this.f26516c + 1;
            this.f26516c = i11;
            this.f26804e = this.f26805f[i11];
        }
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[] objArr = this.f26805f;
        if (objArr != null) {
            this.f26804e = objArr[0];
            this.f26805f = null;
            this.f26517d = null;
        }
        this.f26515b = 0;
        this.f26516c = 0;
    }

    public void g(Object obj) {
        for (int i4 = 0; i4 < this.f26516c; i4++) {
            Object obj2 = this.f26805f[i4];
            p(obj2, 0, q(obj2), obj);
        }
        p(this.f26804e, 0, this.f26515b, obj);
    }
}
