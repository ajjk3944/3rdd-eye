package z;

import E0.p0;
import androidx.compose.ui.e;
import f0.c;

/* loaded from: classes.dex */
public final class e0 extends e.c implements p0 {

    /* renamed from: n, reason: collision with root package name */
    private c.InterfaceC1752c f66871n;

    public e0(c.InterfaceC1752c interfaceC1752c) {
        this.f66871n = interfaceC1752c;
    }

    @Override // E0.p0
    /* renamed from: D2, reason: merged with bridge method [inline-methods] */
    public V M(Y0.d dVar, Object obj) {
        V v10 = obj instanceof V ? (V) obj : null;
        if (v10 == null) {
            v10 = new V(0.0f, false, null, null, 15, null);
        }
        v10.e(AbstractC8690m.f66926a.b(this.f66871n));
        return v10;
    }

    public final void E2(c.InterfaceC1752c interfaceC1752c) {
        this.f66871n = interfaceC1752c;
    }
}
