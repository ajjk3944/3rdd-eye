package C;

import r.InterfaceC7533i;
import sh.AbstractC7978m;
import w.InterfaceC8243d;

/* loaded from: classes.dex */
final class j implements InterfaceC8243d {

    /* renamed from: b, reason: collision with root package name */
    private final C f1997b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8243d f1998c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC7533i f1999d;

    public j(C c10, InterfaceC8243d interfaceC8243d) {
        this.f1997b = c10;
        this.f1998c = interfaceC8243d;
        this.f1999d = interfaceC8243d.b();
    }

    private final float c(float f10) {
        float fZ = this.f1997b.z() * (-1);
        while (f10 > 0.0f && fZ < f10) {
            fZ += this.f1997b.H();
        }
        while (f10 < 0.0f && fZ > f10) {
            fZ -= this.f1997b.H();
        }
        return fZ;
    }

    @Override // w.InterfaceC8243d
    public float a(float f10, float f11, float f12) {
        float fA = this.f1998c.a(f10, f11, f12);
        if (fA != 0.0f) {
            return c(fA);
        }
        if (this.f1997b.z() == 0) {
            return 0.0f;
        }
        float fZ = this.f1997b.z() * (-1.0f);
        if (this.f1997b.B()) {
            fZ += this.f1997b.H();
        }
        return AbstractC7978m.j(fZ, -f12, f12);
    }

    @Override // w.InterfaceC8243d
    public InterfaceC7533i b() {
        return this.f1999d;
    }
}
