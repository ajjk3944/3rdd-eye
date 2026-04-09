package F4;

import f5.InterfaceC5535a;
import f5.InterfaceC5536b;

/* loaded from: classes3.dex */
class y implements InterfaceC5536b, InterfaceC5535a {

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC5535a.InterfaceC1759a f6016c = new InterfaceC5535a.InterfaceC1759a() { // from class: F4.v
        @Override // f5.InterfaceC5535a.InterfaceC1759a
        public final void a(InterfaceC5536b interfaceC5536b) {
            y.f(interfaceC5536b);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC5536b f6017d = new InterfaceC5536b() { // from class: F4.w
        @Override // f5.InterfaceC5536b
        public final Object get() {
            return y.g();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC5535a.InterfaceC1759a f6018a;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC5536b f6019b;

    private y(InterfaceC5535a.InterfaceC1759a interfaceC1759a, InterfaceC5536b interfaceC5536b) {
        this.f6018a = interfaceC1759a;
        this.f6019b = interfaceC5536b;
    }

    static y e() {
        return new y(f6016c, f6017d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(InterfaceC5536b interfaceC5536b) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(InterfaceC5535a.InterfaceC1759a interfaceC1759a, InterfaceC5535a.InterfaceC1759a interfaceC1759a2, InterfaceC5536b interfaceC5536b) {
        interfaceC1759a.a(interfaceC5536b);
        interfaceC1759a2.a(interfaceC5536b);
    }

    static y i(InterfaceC5536b interfaceC5536b) {
        return new y(null, interfaceC5536b);
    }

    @Override // f5.InterfaceC5535a
    public void a(final InterfaceC5535a.InterfaceC1759a interfaceC1759a) {
        InterfaceC5536b interfaceC5536b;
        InterfaceC5536b interfaceC5536b2;
        InterfaceC5536b interfaceC5536b3 = this.f6019b;
        InterfaceC5536b interfaceC5536b4 = f6017d;
        if (interfaceC5536b3 != interfaceC5536b4) {
            interfaceC1759a.a(interfaceC5536b3);
            return;
        }
        synchronized (this) {
            interfaceC5536b = this.f6019b;
            if (interfaceC5536b != interfaceC5536b4) {
                interfaceC5536b2 = interfaceC5536b;
            } else {
                final InterfaceC5535a.InterfaceC1759a interfaceC1759a2 = this.f6018a;
                this.f6018a = new InterfaceC5535a.InterfaceC1759a() { // from class: F4.x
                    @Override // f5.InterfaceC5535a.InterfaceC1759a
                    public final void a(InterfaceC5536b interfaceC5536b5) {
                        y.h(interfaceC1759a2, interfaceC1759a, interfaceC5536b5);
                    }
                };
                interfaceC5536b2 = null;
            }
        }
        if (interfaceC5536b2 != null) {
            interfaceC1759a.a(interfaceC5536b);
        }
    }

    @Override // f5.InterfaceC5536b
    public Object get() {
        return this.f6019b.get();
    }

    void j(InterfaceC5536b interfaceC5536b) {
        InterfaceC5535a.InterfaceC1759a interfaceC1759a;
        if (this.f6019b != f6017d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC1759a = this.f6018a;
            this.f6018a = null;
            this.f6019b = interfaceC5536b;
        }
        interfaceC1759a.a(interfaceC5536b);
    }
}
