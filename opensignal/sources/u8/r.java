package u8;

import java.util.Collections;

/* loaded from: classes.dex */
public final class r extends d {

    /* renamed from: i, reason: collision with root package name */
    public final Object f23505i;

    public r(bm.e eVar, Object obj) {
        super(Collections.EMPTY_LIST);
        k(eVar);
        this.f23505i = obj;
    }

    @Override // u8.d
    public final float c() {
        return 1.0f;
    }

    @Override // u8.d
    public final Object f() {
        bm.e eVar = this.f23451e;
        Object obj = this.f23505i;
        float f10 = this.f23450d;
        return eVar.B(0.0f, 0.0f, obj, obj, f10, f10, f10);
    }

    @Override // u8.d
    public final Object g(f9.a aVar, float f10) {
        return f();
    }

    @Override // u8.d
    public final void i() {
        if (this.f23451e != null) {
            super.i();
        }
    }

    @Override // u8.d
    public final void j(float f10) {
        this.f23450d = f10;
    }
}
