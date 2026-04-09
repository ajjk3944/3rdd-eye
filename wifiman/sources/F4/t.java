package F4;

import f5.InterfaceC5536b;

/* loaded from: classes3.dex */
public class t implements InterfaceC5536b {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f6009c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f6010a = f6009c;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC5536b f6011b;

    public t(InterfaceC5536b interfaceC5536b) {
        this.f6011b = interfaceC5536b;
    }

    @Override // f5.InterfaceC5536b
    public Object get() {
        Object obj = this.f6010a;
        Object obj2 = f6009c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f6010a;
                    if (obj == obj2) {
                        obj = this.f6011b.get();
                        this.f6010a = obj;
                        this.f6011b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
