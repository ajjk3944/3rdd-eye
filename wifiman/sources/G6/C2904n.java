package G6;

import G6.InterfaceC2891a;
import java.util.concurrent.ExecutorService;
import z2.InterfaceC8708a;

/* renamed from: G6.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2904n implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7060a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f7061b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f7062c;

    public C2904n(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        this.f7060a = interfaceC8708a;
        this.f7061b = interfaceC8708a2;
        this.f7062c = interfaceC8708a3;
    }

    public static C2904n a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        return new C2904n(interfaceC8708a, interfaceC8708a2, interfaceC8708a3);
    }

    public static InterfaceC2891a.b c(ExecutorService executorService, gg.y yVar, ExecutorService executorService2) {
        return (InterfaceC2891a.b) y2.e.d(InterfaceC2891a.c.m(executorService, yVar, executorService2));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2891a.b get() {
        return c((ExecutorService) this.f7060a.get(), (gg.y) this.f7061b.get(), (ExecutorService) this.f7062c.get());
    }
}
