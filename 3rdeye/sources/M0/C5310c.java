package m0;

import c9.C2088i;
import y1.C5797h;

/* compiled from: CircularArray.kt */
/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5310c<E> {

    /* renamed from: a, reason: collision with root package name */
    public E[] f44012a;

    /* renamed from: b, reason: collision with root package name */
    public int f44013b;

    /* renamed from: c, reason: collision with root package name */
    public int f44014c;

    /* renamed from: d, reason: collision with root package name */
    public int f44015d;

    public final void a(C5797h c5797h) {
        E[] eArr = this.f44012a;
        int i = this.f44014c;
        eArr[i] = c5797h;
        int i10 = this.f44015d & (i + 1);
        this.f44014c = i10;
        int i11 = this.f44013b;
        if (i10 == i11) {
            int length = eArr.length;
            int i12 = length - i11;
            int i13 = length << 1;
            if (i13 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            E[] eArr2 = (E[]) new Object[i13];
            C2088i.e(eArr, 0, eArr2, i11, length);
            C2088i.e(this.f44012a, i12, eArr2, 0, this.f44013b);
            this.f44012a = eArr2;
            this.f44013b = 0;
            this.f44014c = length;
            this.f44015d = i13 - 1;
        }
    }
}
