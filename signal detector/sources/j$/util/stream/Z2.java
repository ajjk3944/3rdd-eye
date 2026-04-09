package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public class Z2 extends AbstractC2414d implements Consumer, Iterable {

    /* renamed from: e, reason: collision with root package name */
    public Object[] f20990e = new Object[1 << 4];

    /* renamed from: f, reason: collision with root package name */
    public Object[][] f20991f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public final void q(long j6) {
        long length;
        int i = this.f21052c;
        if (i == 0) {
            length = this.f20990e.length;
        } else {
            length = this.f21053d[i] + this.f20991f[i].length;
        }
        if (j6 > length) {
            if (this.f20991f == null) {
                Object[][] objArr = new Object[8][];
                this.f20991f = objArr;
                this.f21053d = new long[8];
                objArr[0] = this.f20990e;
            }
            int i3 = i + 1;
            while (j6 > length) {
                Object[][] objArr2 = this.f20991f;
                if (i3 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f20991f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.f21053d = Arrays.copyOf(this.f21053d, length2);
                }
                int iMin = this.f21050a;
                if (i3 != 0 && i3 != 1) {
                    iMin = Math.min((iMin + i3) - 1, 30);
                }
                int i6 = 1 << iMin;
                this.f20991f[i3] = new Object[i6];
                long[] jArr = this.f21053d;
                jArr[i3] = jArr[i3 - 1] + r5[r7].length;
                length += i6;
                i3++;
            }
        }
    }

    @Override // j$.util.stream.AbstractC2414d
    public final void clear() {
        Object[][] objArr = this.f20991f;
        if (objArr != null) {
            this.f20990e = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.f20990e;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.f20991f = null;
            this.f21053d = null;
        } else {
            for (int i3 = 0; i3 < this.f21051b; i3++) {
                this.f20990e[i3] = null;
            }
        }
        this.f21051b = 0;
        this.f21052c = 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.P(spliterator);
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer consumer) {
        for (int i = 0; i < this.f21052c; i++) {
            for (Object obj : this.f20991f[i]) {
                consumer.o(obj);
            }
        }
        for (int i3 = 0; i3 < this.f21051b; i3++) {
            consumer.o(this.f20990e[i3]);
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void o(Object obj) {
        long length;
        int i = this.f21051b;
        Object[] objArr = this.f20990e;
        if (i == objArr.length) {
            if (this.f20991f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f20991f = objArr2;
                this.f21053d = new long[8];
                objArr2[0] = objArr;
            }
            int i3 = this.f21052c;
            int i6 = i3 + 1;
            Object[][] objArr3 = this.f20991f;
            if (i6 >= objArr3.length || objArr3[i6] == null) {
                if (i3 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i3].length + this.f21053d[i3];
                }
                q(length + 1);
            }
            this.f21051b = 0;
            int i7 = this.f21052c + 1;
            this.f21052c = i7;
            this.f20990e = this.f20991f[i7];
        }
        Object[] objArr4 = this.f20990e;
        int i8 = this.f21051b;
        this.f21051b = i8 + 1;
        objArr4[i8] = obj;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new j$.util.function.g(arrayList, 7));
        return "SpinedBuffer:" + arrayList.toString();
    }

    @Override // java.lang.Iterable
    public j$.util.Spliterator spliterator() {
        return new Q2(this, 0, this.f21052c, 0, this.f21051b);
    }
}
