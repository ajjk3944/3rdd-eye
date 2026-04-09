package E5;

import h5.InterfaceC2375i;
import z5.AbstractC3025a;
import z5.AbstractC3046w;

/* loaded from: classes3.dex */
public class s extends AbstractC3025a implements j5.c {

    /* renamed from: d, reason: collision with root package name */
    public final j5.b f1411d;

    public s(InterfaceC2375i interfaceC2375i, j5.b bVar) {
        super(interfaceC2375i, true);
        this.f1411d = bVar;
    }

    @Override // z5.c0
    public final boolean D() {
        return true;
    }

    @Override // z5.c0
    public void c(Object obj) {
        a.g(com.bumptech.glide.c.B(this.f1411d), AbstractC3046w.m(obj));
    }

    @Override // j5.c
    public final j5.c d() {
        j5.b bVar = this.f1411d;
        if (A.f.y(bVar)) {
            return bVar;
        }
        return null;
    }

    @Override // z5.c0
    public void f(Object obj) {
        this.f1411d.e(AbstractC3046w.m(obj));
    }
}
