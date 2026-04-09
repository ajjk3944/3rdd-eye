package z;

import E0.p0;
import androidx.compose.ui.e;

/* loaded from: classes.dex */
public final class L extends e.c implements p0 {

    /* renamed from: n, reason: collision with root package name */
    private float f66804n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f66805o;

    public L(float f10, boolean z10) {
        this.f66804n = f10;
        this.f66805o = z10;
    }

    @Override // E0.p0
    /* renamed from: D2, reason: merged with bridge method [inline-methods] */
    public V M(Y0.d dVar, Object obj) {
        V v10 = obj instanceof V ? (V) obj : null;
        if (v10 == null) {
            v10 = new V(0.0f, false, null, null, 15, null);
        }
        v10.g(this.f66804n);
        v10.f(this.f66805o);
        return v10;
    }

    public final void E2(boolean z10) {
        this.f66805o = z10;
    }

    public final void F2(float f10) {
        this.f66804n = f10;
    }
}
