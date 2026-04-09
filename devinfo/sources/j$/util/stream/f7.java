package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class f7 extends g7 implements LongConsumer {

    /* renamed from: c, reason: collision with root package name */
    public final long[] f26580c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    public f7(int i4) {
        this.f26580c = new long[i4];
    }

    @Override // j$.util.stream.g7
    public final void a(Object obj, long j) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i4 = 0; i4 < j; i4++) {
            longConsumer.accept(this.f26580c[i4]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i4 = this.f26590b;
        this.f26590b = i4 + 1;
        this.f26580c[i4] = j;
    }
}
