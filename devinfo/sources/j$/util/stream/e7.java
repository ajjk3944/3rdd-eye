package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class e7 extends g7 implements IntConsumer {

    /* renamed from: c, reason: collision with root package name */
    public final int[] f26568c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    public e7(int i4) {
        this.f26568c = new int[i4];
    }

    @Override // j$.util.stream.g7
    public final void a(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i4 = 0; i4 < j; i4++) {
            intConsumer.accept(this.f26568c[i4]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i4) {
        int i10 = this.f26590b;
        this.f26590b = i10 + 1;
        this.f26568c[i10] = i4;
    }
}
