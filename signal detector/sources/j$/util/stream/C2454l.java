package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2454l extends AbstractC2452k2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21110b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21111c;

    /* renamed from: d, reason: collision with root package name */
    public Object f21112d;

    public /* synthetic */ C2454l(InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2454l(L3 l32, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f21112d = l32;
        this.f21111c = true;
    }

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        switch (this.f21110b) {
            case 0:
                this.f21111c = false;
                this.f21112d = null;
                this.f21108a.c(-1L);
                break;
            case 1:
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
        switch (this.f21110b) {
            case 0:
                InterfaceC2472o2 interfaceC2472o2 = this.f21108a;
                if (obj == null) {
                    if (this.f21111c) {
                        return;
                    }
                    this.f21111c = true;
                    this.f21112d = null;
                    interfaceC2472o2.o((InterfaceC2472o2) null);
                    return;
                }
                Object obj2 = this.f21112d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f21112d = obj;
                    interfaceC2472o2.o((InterfaceC2472o2) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.util.function.g) ((C2479q) this.f21112d).f21139t).apply((j$.util.function.g) obj);
                if (stream != null) {
                    try {
                        boolean z6 = this.f21111c;
                        InterfaceC2472o2 interfaceC2472o22 = this.f21108a;
                        if (!z6) {
                            ((Stream) stream.sequential()).forEach(interfaceC2472o22);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC2472o22.e() && spliterator.tryAdvance(interfaceC2472o22)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f21111c) {
                    boolean zTest = ((L3) this.f21112d).f20910s.test(obj);
                    this.f21111c = zTest;
                    if (zTest) {
                        this.f21108a.o((InterfaceC2472o2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public boolean e() {
        switch (this.f21110b) {
            case 1:
                this.f21111c = true;
                return this.f21108a.e();
            case 2:
                return !this.f21111c || this.f21108a.e();
            default:
                return super.e();
        }
    }

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public void m() {
        switch (this.f21110b) {
            case 0:
                this.f21111c = false;
                this.f21112d = null;
                this.f21108a.m();
                break;
            default:
                super.m();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2454l(C2479q c2479q, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f21112d = c2479q;
    }
}
