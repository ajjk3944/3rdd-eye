package androidx.compose.ui.platform;

import T.InterfaceC3543m0;
import dh.InterfaceC5384i;
import f0.g;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
final class G0 implements f0.g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3543m0 f29158a = T.C0.a(1.0f);

    public void b(float f10) {
        this.f29158a.k(f10);
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public Object fold(Object obj, InterfaceC6839p interfaceC6839p) {
        return g.a.a(this, obj, interfaceC6839p);
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i.b get(InterfaceC5384i.c cVar) {
        return g.a.b(this, cVar);
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i minusKey(InterfaceC5384i.c cVar) {
        return g.a.c(this, cVar);
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i plus(InterfaceC5384i interfaceC5384i) {
        return g.a.d(this, interfaceC5384i);
    }

    @Override // f0.g
    public float v() {
        return this.f29158a.c();
    }
}
