package tg;

import java.util.concurrent.atomic.AtomicInteger;
import kg.InterfaceC6469f;

/* renamed from: tg.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8092c extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final Bg.a f62308a;

    /* renamed from: b, reason: collision with root package name */
    final int f62309b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6469f f62310c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicInteger f62311d = new AtomicInteger();

    public C8092c(Bg.a aVar, int i10, InterfaceC6469f interfaceC6469f) {
        this.f62308a = aVar;
        this.f62309b = i10;
        this.f62310c = interfaceC6469f;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62308a.d(xVar);
        if (this.f62311d.incrementAndGet() == this.f62309b) {
            this.f62308a.k1(this.f62310c);
        }
    }
}
