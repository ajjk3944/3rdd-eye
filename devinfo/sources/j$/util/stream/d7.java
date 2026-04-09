package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class d7 extends g7 implements DoubleConsumer {

    /* renamed from: c, reason: collision with root package name */
    public final double[] f26556c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    public d7(int i4) {
        this.f26556c = new double[i4];
    }

    @Override // j$.util.stream.g7
    public final void a(Object obj, long j) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i4 = 0; i4 < j; i4++) {
            doubleConsumer.accept(this.f26556c[i4]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        int i4 = this.f26590b;
        this.f26590b = i4 + 1;
        this.f26556c[i4] = d10;
    }
}
