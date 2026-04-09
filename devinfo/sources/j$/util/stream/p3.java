package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class p3 extends q3 {

    /* renamed from: h, reason: collision with root package name */
    public final Object[] f26709h;

    public p3(Spliterator spliterator, v3 v3Var, Object[] objArr) {
        super(spliterator, v3Var, objArr.length);
        this.f26709h = objArr;
    }

    public p3(p3 p3Var, Spliterator spliterator, long j, long j8) {
        super(p3Var, spliterator, j, j8, p3Var.f26709h.length);
        this.f26709h = p3Var.f26709h;
    }

    @Override // j$.util.stream.q3
    public final q3 a(Spliterator spliterator, long j, long j8) {
        return new p3(this, spliterator, j, j8);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        int i4 = this.f26732f;
        if (i4 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f26732f));
        }
        Object[] objArr = this.f26709h;
        this.f26732f = i4 + 1;
        objArr[i4] = obj;
    }
}
