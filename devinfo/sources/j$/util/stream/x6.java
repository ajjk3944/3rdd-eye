package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public class x6 extends c implements Consumer, Iterable {

    /* renamed from: e, reason: collision with root package name */
    public Object[] f26817e = new Object[1 << 4];

    /* renamed from: f, reason: collision with root package name */
    public Object[][] f26818f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public final void p(long j) {
        long length;
        int i4 = this.f26516c;
        if (i4 == 0) {
            length = this.f26817e.length;
        } else {
            length = this.f26517d[i4] + this.f26818f[i4].length;
        }
        if (j > length) {
            if (this.f26818f == null) {
                Object[][] objArr = new Object[8][];
                this.f26818f = objArr;
                this.f26517d = new long[8];
                objArr[0] = this.f26817e;
            }
            int i10 = i4 + 1;
            while (j > length) {
                Object[][] objArr2 = this.f26818f;
                if (i10 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f26818f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.f26517d = Arrays.copyOf(this.f26517d, length2);
                }
                int iMin = this.f26514a;
                if (i10 != 0 && i10 != 1) {
                    iMin = Math.min((iMin + i10) - 1, 30);
                }
                int i11 = 1 << iMin;
                this.f26818f[i10] = new Object[i11];
                long[] jArr = this.f26517d;
                jArr[i10] = jArr[i10 - 1] + r5[r7].length;
                length += i11;
                i10++;
            }
        }
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[][] objArr = this.f26818f;
        if (objArr != null) {
            this.f26817e = objArr[0];
            int i4 = 0;
            while (true) {
                Object[] objArr2 = this.f26817e;
                if (i4 >= objArr2.length) {
                    break;
                }
                objArr2[i4] = null;
                i4++;
            }
            this.f26818f = null;
            this.f26517d = null;
        } else {
            for (int i10 = 0; i10 < this.f26515b; i10++) {
                this.f26817e[i10] = null;
            }
        }
        this.f26515b = 0;
        this.f26516c = 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.e1(spliterator);
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer consumer) {
        for (int i4 = 0; i4 < this.f26516c; i4++) {
            for (Object obj : this.f26818f[i4]) {
                consumer.n(obj);
            }
        }
        for (int i10 = 0; i10 < this.f26515b; i10++) {
            consumer.n(this.f26817e[i10]);
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void n(Object obj) {
        long length;
        int i4 = this.f26515b;
        Object[] objArr = this.f26817e;
        if (i4 == objArr.length) {
            if (this.f26818f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f26818f = objArr2;
                this.f26517d = new long[8];
                objArr2[0] = objArr;
            }
            int i10 = this.f26516c;
            int i11 = i10 + 1;
            Object[][] objArr3 = this.f26818f;
            if (i11 >= objArr3.length || objArr3[i11] == null) {
                if (i10 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i10].length + this.f26517d[i10];
                }
                p(length + 1);
            }
            this.f26515b = 0;
            int i12 = this.f26516c + 1;
            this.f26516c = i12;
            this.f26817e = this.f26818f[i12];
        }
        Object[] objArr4 = this.f26817e;
        int i13 = this.f26515b;
        this.f26515b = i13 + 1;
        objArr4[i13] = obj;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new j$.util.q(8, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }

    @Override // java.lang.Iterable
    public j$.util.Spliterator spliterator() {
        return new o6(this, 0, this.f26516c, 0, this.f26515b);
    }
}
