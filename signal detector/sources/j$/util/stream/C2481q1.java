package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2481q1 extends AbstractC2485r1 {

    /* renamed from: h, reason: collision with root package name */
    public final Object[] f21140h;

    public C2481q1(Spliterator spliterator, AbstractC2510w1 abstractC2510w1, Object[] objArr) {
        super(spliterator, abstractC2510w1, objArr.length);
        this.f21140h = objArr;
    }

    public C2481q1(C2481q1 c2481q1, Spliterator spliterator, long j6, long j7) {
        super(c2481q1, spliterator, j6, j7, c2481q1.f21140h.length);
        this.f21140h = c2481q1.f21140h;
    }

    @Override // j$.util.stream.AbstractC2485r1
    public final AbstractC2485r1 a(Spliterator spliterator, long j6, long j7) {
        return new C2481q1(this, spliterator, j6, j7);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        int i = this.f21151f;
        if (i >= this.f21152g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f21151f));
        }
        Object[] objArr = this.f21140h;
        this.f21151f = i + 1;
        objArr[i] = obj;
    }
}
