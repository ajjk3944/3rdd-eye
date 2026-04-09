package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class m7 implements k5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f26676b;

    public /* synthetic */ m7(IntConsumer intConsumer, int i4) {
        this.f26675a = i4;
        this.f26676b = intConsumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void accept(double d10) {
        switch (this.f26675a) {
            case 0:
                v3.D();
                throw null;
            default:
                v3.D();
                throw null;
        }
    }

    @Override // j$.util.stream.k5, java.util.function.IntConsumer
    public final void accept(int i4) {
        switch (this.f26675a) {
            case 0:
                this.f26676b.accept(i4);
                break;
            default:
                ((s6) this.f26676b).accept(i4);
                break;
        }
    }

    @Override // j$.util.stream.m5, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        switch (this.f26675a) {
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
        switch (this.f26675a) {
            case 0:
                d((Integer) obj);
                break;
            default:
                d((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26675a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f26675a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void c(long j) {
        int i4 = this.f26675a;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void d(Integer num) {
        switch (this.f26675a) {
            case 0:
                v3.G(this, num);
                break;
            default:
                v3.G(this, num);
                break;
        }
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        switch (this.f26675a) {
        }
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void end() {
        int i4 = this.f26675a;
    }
}
