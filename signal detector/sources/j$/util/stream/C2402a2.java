package j$.util.stream;

import j$.util.C2396p;
import j$.util.C2532x;
import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2402a2 extends AbstractC2452k2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20993b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20994c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC2404b f20996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2402a2(C2503v c2503v, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f20996e = c2503v;
        InterfaceC2472o2 interfaceC2472o22 = this.f21108a;
        Objects.requireNonNull(interfaceC2472o22);
        this.f20995d = new C2396p(interfaceC2472o22, 1);
    }

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        switch (this.f20993b) {
            case 0:
                this.f21108a.c(-1L);
                break;
            default:
                this.f21108a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) throws Exception {
        switch (this.f20993b) {
            case 0:
                C2532x c2532x = (C2532x) this.f20995d;
                InterfaceC2460m0 interfaceC2460m0 = (InterfaceC2460m0) ((j$.util.function.g) ((C2425f0) this.f20996e).f21075t).apply((j$.util.function.g) obj);
                if (interfaceC2460m0 != null) {
                    try {
                        if (!this.f20994c) {
                            interfaceC2460m0.sequential().forEach(c2532x);
                        } else {
                            j$.util.K kSpliterator = interfaceC2460m0.sequential().spliterator();
                            while (!this.f21108a.e() && kSpliterator.tryAdvance((LongConsumer) c2532x)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            interfaceC2460m0.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (interfaceC2460m0 != null) {
                    interfaceC2460m0.close();
                    return;
                }
                return;
            default:
                C2396p c2396p = (C2396p) this.f20995d;
                C c6 = (C) ((j$.util.function.g) ((C2503v) this.f20996e).f21175t).apply((j$.util.function.g) obj);
                if (c6 != null) {
                    try {
                        if (!this.f20994c) {
                            c6.sequential().forEach(c2396p);
                        } else {
                            j$.util.F fSpliterator = c6.sequential().spliterator();
                            while (!this.f21108a.e() && fSpliterator.tryAdvance((DoubleConsumer) c2396p)) {
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            c6.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (c6 != null) {
                    c6.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        switch (this.f20993b) {
            case 0:
                this.f20994c = true;
                break;
            default:
                this.f20994c = true;
                break;
        }
        return this.f21108a.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2402a2(C2425f0 c2425f0, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f20996e = c2425f0;
        InterfaceC2472o2 interfaceC2472o22 = this.f21108a;
        Objects.requireNonNull(interfaceC2472o22);
        this.f20995d = new C2532x(interfaceC2472o22, 1);
    }
}
