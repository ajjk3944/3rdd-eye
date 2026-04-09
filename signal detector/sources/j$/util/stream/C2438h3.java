package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2438h3 extends AbstractC2443i3 implements LongConsumer {

    /* renamed from: c, reason: collision with root package name */
    public final long[] f21083c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    public C2438h3(int i) {
        this.f21083c = new long[i];
    }

    @Override // j$.util.stream.AbstractC2443i3
    public final void a(Object obj, long j6) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < j6; i++) {
            longConsumer.accept(this.f21083c[i]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        int i = this.f21089b;
        this.f21089b = i + 1;
        this.f21083c[i] = j6;
    }
}
