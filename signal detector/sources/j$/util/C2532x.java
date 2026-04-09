package j$.util;

import j$.util.stream.InterfaceC2472o2;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2532x implements LongConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f21217b;

    public /* synthetic */ C2532x(Consumer consumer, int i) {
        this.f21216a = i;
        this.f21217b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        switch (this.f21216a) {
            case 0:
                this.f21217b.accept(Long.valueOf(j6));
                break;
            default:
                ((InterfaceC2472o2) this.f21217b).accept(j6);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f21216a) {
        }
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }
}
