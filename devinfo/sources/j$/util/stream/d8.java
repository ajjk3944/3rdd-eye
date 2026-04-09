package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class d8 implements m5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f26558b;

    public /* synthetic */ d8(Consumer consumer, int i4) {
        this.f26557a = i4;
        this.f26558b = consumer;
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
        switch (this.f26557a) {
            case 0:
                v3.D();
                throw null;
            default:
                v3.D();
                throw null;
        }
    }

    @Override // j$.util.stream.m5, j$.util.stream.k5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i4) {
        switch (this.f26557a) {
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
        switch (this.f26557a) {
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
    public final void n(Object obj) {
        switch (this.f26557a) {
            case 0:
                ((x6) this.f26558b).n(obj);
                break;
            default:
                this.f26558b.n(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26557a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void c(long j) {
        int i4 = this.f26557a;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        switch (this.f26557a) {
        }
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void end() {
        int i4 = this.f26557a;
    }
}
