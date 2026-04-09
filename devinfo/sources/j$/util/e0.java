package j$.util;

import j$.util.stream.m5;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class e0 implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f26372b;

    public /* synthetic */ e0(Consumer consumer, int i4) {
        this.f26371a = i4;
        this.f26372b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        switch (this.f26371a) {
            case 0:
                this.f26372b.accept(Double.valueOf(d10));
                break;
            default:
                ((m5) this.f26372b).accept(d10);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f26371a) {
        }
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }
}
