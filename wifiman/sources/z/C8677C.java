package z;

import E0.p0;
import androidx.compose.ui.e;
import f0.c;

/* renamed from: z.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8677C extends e.c implements p0 {

    /* renamed from: n, reason: collision with root package name */
    private c.b f66785n;

    public C8677C(c.b bVar) {
        this.f66785n = bVar;
    }

    @Override // E0.p0
    /* renamed from: D2, reason: merged with bridge method [inline-methods] */
    public V M(Y0.d dVar, Object obj) {
        V v10 = obj instanceof V ? (V) obj : null;
        if (v10 == null) {
            v10 = new V(0.0f, false, null, null, 15, null);
        }
        v10.e(AbstractC8690m.f66926a.a(this.f66785n));
        return v10;
    }

    public final void E2(c.b bVar) {
        this.f66785n = bVar;
    }
}
