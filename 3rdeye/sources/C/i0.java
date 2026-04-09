package C;

import android.util.Size;
import android.view.Surface;

/* compiled from: SurfaceRequest.java */
/* loaded from: classes.dex */
public final class i0 extends androidx.camera.core.impl.X {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f717o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final Object f718p;

    public i0(Surface surface, Size size, int i) {
        super(size, i);
        this.f718p = surface;
    }

    @Override // androidx.camera.core.impl.X
    public final A4.a f() {
        switch (this.f717o) {
            case 0:
                return ((k0) this.f718p).f737g;
            default:
                return I.j.e((Surface) this.f718p);
        }
    }

    public i0(Surface surface) {
        this.f718p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, Size size) {
        super(size, 34);
        this.f718p = k0Var;
    }
}
