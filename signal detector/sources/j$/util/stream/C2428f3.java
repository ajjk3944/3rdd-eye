package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2428f3 extends AbstractC2443i3 implements DoubleConsumer {

    /* renamed from: c, reason: collision with root package name */
    public final double[] f21076c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    public C2428f3(int i) {
        this.f21076c = new double[i];
    }

    @Override // j$.util.stream.AbstractC2443i3
    public final void a(Object obj, long j6) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < j6; i++) {
            doubleConsumer.accept(this.f21076c[i]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d6) {
        int i = this.f21089b;
        this.f21089b = i + 1;
        this.f21076c[i] = d6;
    }
}
