package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class k7 implements j5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f26649b;

    public /* synthetic */ k7(DoubleConsumer doubleConsumer, int i4) {
        this.f26648a = i4;
        this.f26649b = doubleConsumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // j$.util.stream.j5, j$.util.stream.m5
    public final void accept(double d10) {
        switch (this.f26648a) {
            case 0:
                this.f26649b.accept(d10);
                break;
            default:
                ((q6) this.f26649b).accept(d10);
                break;
        }
    }

    @Override // j$.util.stream.m5, j$.util.stream.k5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i4) {
        switch (this.f26648a) {
            case 0:
                v3.K();
                throw null;
            default:
                v3.K();
                throw null;
        }
    }

    @Override // j$.util.stream.m5, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        switch (this.f26648a) {
            case 0:
                v3.L();
                throw null;
            default:
                v3.L();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        switch (this.f26648a) {
            case 0:
                n((Double) obj);
                break;
            default:
                n((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26648a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f26648a) {
        }
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void c(long j) {
        int i4 = this.f26648a;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        switch (this.f26648a) {
        }
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void end() {
        int i4 = this.f26648a;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void n(Double d10) {
        switch (this.f26648a) {
            case 0:
                v3.E(this, d10);
                break;
            default:
                v3.E(this, d10);
                break;
        }
    }
}
