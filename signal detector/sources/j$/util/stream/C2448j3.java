package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2448j3 extends AbstractC2453k3 implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f21101b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public C2448j3(int i) {
        this.f21101b = new Object[i];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f21109a;
        this.f21109a = i + 1;
        this.f21101b[i] = obj;
    }
}
