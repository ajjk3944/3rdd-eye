package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class Y2 extends AbstractC2414d implements Iterable {

    /* renamed from: e, reason: collision with root package name */
    public Object f20987e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f20988f;

    public abstract Object newArray(int i);

    public abstract void q(Object obj, int i, int i3, Object obj2);

    public abstract int r(Object obj);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public abstract Object[] u();

    public Y2(int i) {
        super(i);
        this.f20987e = newArray(1 << this.f21050a);
    }

    public Y2() {
        this.f20987e = newArray(16);
    }

    public final void t(long j6) {
        long jR;
        int i = this.f21052c;
        if (i == 0) {
            jR = r(this.f20987e);
        } else {
            jR = r(this.f20988f[i]) + this.f21053d[i];
        }
        if (j6 > jR) {
            if (this.f20988f == null) {
                Object[] objArrU = u();
                this.f20988f = objArrU;
                this.f21053d = new long[8];
                objArrU[0] = this.f20987e;
            }
            int i3 = this.f21052c + 1;
            while (j6 > jR) {
                Object[] objArr = this.f20988f;
                if (i3 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f20988f = Arrays.copyOf(objArr, length);
                    this.f21053d = Arrays.copyOf(this.f21053d, length);
                }
                int iMin = this.f21050a;
                if (i3 != 0 && i3 != 1) {
                    iMin = Math.min((iMin + i3) - 1, 30);
                }
                int i6 = 1 << iMin;
                this.f20988f[i3] = newArray(i6);
                long[] jArr = this.f21053d;
                jArr[i3] = jArr[i3 - 1] + r(this.f20988f[r6]);
                jR += i6;
                i3++;
            }
        }
    }

    public final int s(long j6) {
        if (this.f21052c == 0) {
            if (j6 < this.f21051b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j6));
        }
        if (j6 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j6));
        }
        for (int i = 0; i <= this.f21052c; i++) {
            if (j6 < this.f21053d[i] + r(this.f20988f[i])) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j6));
    }

    public void f(Object obj, int i) {
        long j6 = i;
        long jCount = count() + j6;
        if (jCount > r(obj) || jCount < j6) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f21052c == 0) {
            System.arraycopy(this.f20987e, 0, obj, i, this.f21051b);
            return;
        }
        for (int i3 = 0; i3 < this.f21052c; i3++) {
            Object obj2 = this.f20988f[i3];
            System.arraycopy(obj2, 0, obj, i, r(obj2));
            i += r(this.f20988f[i3]);
        }
        int i6 = this.f21051b;
        if (i6 > 0) {
            System.arraycopy(this.f20987e, 0, obj, i, i6);
        }
    }

    public Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) jCount);
        f(objNewArray, 0);
        return objNewArray;
    }

    public final void v() {
        long jR;
        if (this.f21051b == r(this.f20987e)) {
            if (this.f20988f == null) {
                Object[] objArrU = u();
                this.f20988f = objArrU;
                this.f21053d = new long[8];
                objArrU[0] = this.f20987e;
            }
            int i = this.f21052c;
            int i3 = i + 1;
            Object[] objArr = this.f20988f;
            if (i3 >= objArr.length || objArr[i3] == null) {
                if (i == 0) {
                    jR = r(this.f20987e);
                } else {
                    jR = r(objArr[i]) + this.f21053d[i];
                }
                t(jR + 1);
            }
            this.f21051b = 0;
            int i6 = this.f21052c + 1;
            this.f21052c = i6;
            this.f20987e = this.f20988f[i6];
        }
    }

    @Override // j$.util.stream.AbstractC2414d
    public final void clear() {
        Object[] objArr = this.f20988f;
        if (objArr != null) {
            this.f20987e = objArr[0];
            this.f20988f = null;
            this.f21053d = null;
        }
        this.f21051b = 0;
        this.f21052c = 0;
    }

    public void g(Object obj) {
        for (int i = 0; i < this.f21052c; i++) {
            Object obj2 = this.f20988f[i];
            q(obj2, 0, r(obj2), obj);
        }
        q(this.f20987e, 0, this.f21051b, obj);
    }
}
