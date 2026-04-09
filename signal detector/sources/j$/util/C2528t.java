package j$.util;

import j$.util.function.IntConsumer$CC;
import j$.util.stream.InterfaceC2472o2;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2528t implements IntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f21213b;

    public /* synthetic */ C2528t(Consumer consumer, int i) {
        this.f21212a = i;
        this.f21213b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.f21212a) {
            case 0:
                this.f21213b.accept(Integer.valueOf(i));
                break;
            default:
                ((InterfaceC2472o2) this.f21213b).accept(i);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f21212a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
