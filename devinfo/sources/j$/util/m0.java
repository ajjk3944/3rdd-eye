package j$.util;

import j$.util.stream.m5;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class m0 implements LongConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f26428b;

    public /* synthetic */ m0(Consumer consumer, int i4) {
        this.f26427a = i4;
        this.f26428b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.f26427a) {
            case 0:
                this.f26428b.accept(Long.valueOf(j));
                break;
            default:
                ((m5) this.f26428b).accept(j);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f26427a) {
        }
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }
}
