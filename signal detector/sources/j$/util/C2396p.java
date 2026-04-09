package j$.util;

import j$.util.stream.InterfaceC2472o2;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2396p implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f20817b;

    public /* synthetic */ C2396p(Consumer consumer, int i) {
        this.f20816a = i;
        this.f20817b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d6) {
        switch (this.f20816a) {
            case 0:
                this.f20817b.accept(Double.valueOf(d6));
                break;
            default:
                ((InterfaceC2472o2) this.f20817b).accept(d6);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f20816a) {
        }
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }
}
