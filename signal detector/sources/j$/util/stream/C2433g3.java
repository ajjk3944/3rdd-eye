package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2433g3 extends AbstractC2443i3 implements IntConsumer {

    /* renamed from: c, reason: collision with root package name */
    public final int[] f21079c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    public C2433g3(int i) {
        this.f21079c = new int[i];
    }

    @Override // j$.util.stream.AbstractC2443i3
    public final void a(Object obj, long j6) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < j6; i++) {
            intConsumer.accept(this.f21079c[i]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i3 = this.f21089b;
        this.f21089b = i3 + 1;
        this.f21079c[i3] = i;
    }
}
