package O6;

import K6.B;
import gg.y;
import java.util.concurrent.ExecutorService;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class f implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f17605a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f17606b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f17607c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f17608d;

    public f(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        this.f17605a = interfaceC8708a;
        this.f17606b = interfaceC8708a2;
        this.f17607c = interfaceC8708a3;
        this.f17608d = interfaceC8708a4;
    }

    public static f a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        return new f(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4);
    }

    public static e c(String str, B b10, ExecutorService executorService, y yVar) {
        return new e(str, b10, executorService, yVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c((String) this.f17605a.get(), (B) this.f17606b.get(), (ExecutorService) this.f17607c.get(), (y) this.f17608d.get());
    }
}
