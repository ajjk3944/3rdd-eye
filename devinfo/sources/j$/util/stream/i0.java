package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class i0 implements h8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26604a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26605b;

    @Override // j$.util.stream.m5
    public /* synthetic */ void accept(double d10) {
        v3.D();
        throw null;
    }

    @Override // j$.util.stream.m5, j$.util.stream.k5, java.util.function.IntConsumer
    public /* synthetic */ void accept(int i4) {
        v3.K();
        throw null;
    }

    @Override // j$.util.stream.m5, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j) {
        v3.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void end() {
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void n(Object obj) {
        if (this.f26604a) {
            return;
        }
        this.f26604a = true;
        this.f26605b = obj;
    }

    @Override // j$.util.stream.m5
    public final boolean e() {
        return this.f26604a;
    }
}
