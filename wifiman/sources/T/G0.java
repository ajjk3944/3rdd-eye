package T;

import dh.InterfaceC5384i;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class G0 implements F0, InterfaceC3551q0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5384i f20867a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC3551q0 f20868b;

    public G0(InterfaceC3551q0 interfaceC3551q0, InterfaceC5384i interfaceC5384i) {
        this.f20867a = interfaceC5384i;
        this.f20868b = interfaceC3551q0;
    }

    @Override // T.InterfaceC3551q0
    public InterfaceC6835l b() {
        return this.f20868b.b();
    }

    @Override // T.InterfaceC3551q0
    public Object f() {
        return this.f20868b.f();
    }

    @Override // Ii.N
    public InterfaceC5384i getCoroutineContext() {
        return this.f20867a;
    }

    @Override // T.InterfaceC3551q0, T.z1
    public Object getValue() {
        return this.f20868b.getValue();
    }

    @Override // T.InterfaceC3551q0
    public void setValue(Object obj) {
        this.f20868b.setValue(obj);
    }
}
