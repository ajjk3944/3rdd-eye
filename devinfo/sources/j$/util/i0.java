package j$.util;

import j$.util.function.IntConsumer$CC;
import j$.util.stream.m5;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements IntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f26409b;

    public /* synthetic */ i0(Consumer consumer, int i4) {
        this.f26408a = i4;
        this.f26409b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i4) {
        switch (this.f26408a) {
            case 0:
                this.f26409b.accept(Integer.valueOf(i4));
                break;
            default:
                ((m5) this.f26409b).accept(i4);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f26408a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
