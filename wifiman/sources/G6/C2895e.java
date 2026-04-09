package G6;

import G6.InterfaceC2891a;
import java.util.concurrent.ExecutorService;
import z2.InterfaceC8708a;

/* renamed from: G6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2895e implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7051a;

    public C2895e(InterfaceC8708a interfaceC8708a) {
        this.f7051a = interfaceC8708a;
    }

    public static C2895e a(InterfaceC8708a interfaceC8708a) {
        return new C2895e(interfaceC8708a);
    }

    public static gg.y c(ExecutorService executorService) {
        return (gg.y) y2.e.d(InterfaceC2891a.c.d(executorService));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public gg.y get() {
        return c((ExecutorService) this.f7051a.get());
    }
}
