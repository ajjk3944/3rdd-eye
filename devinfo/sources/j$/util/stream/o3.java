package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class o3 extends q3 implements l5 {

    /* renamed from: h, reason: collision with root package name */
    public final long[] f26692h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void l(Long l10) {
        v3.I(this, l10);
    }

    public o3(Spliterator spliterator, v3 v3Var, long[] jArr) {
        super(spliterator, v3Var, jArr.length);
        this.f26692h = jArr;
    }

    public o3(o3 o3Var, Spliterator spliterator, long j, long j8) {
        super(o3Var, spliterator, j, j8, o3Var.f26692h.length);
        this.f26692h = o3Var.f26692h;
    }

    @Override // j$.util.stream.q3
    public final q3 a(Spliterator spliterator, long j, long j8) {
        return new o3(this, spliterator, j, j8);
    }

    @Override // j$.util.stream.q3, j$.util.stream.m5, java.util.function.LongConsumer
    public final void accept(long j) {
        int i4 = this.f26732f;
        if (i4 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f26732f));
        }
        long[] jArr = this.f26692h;
        this.f26732f = i4 + 1;
        jArr[i4] = j;
    }
}
