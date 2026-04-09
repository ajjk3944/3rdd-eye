package androidx.compose.foundation.layout;

import E0.p0;
import androidx.compose.ui.e;

/* loaded from: classes.dex */
final class c extends e.c implements p0 {

    /* renamed from: n, reason: collision with root package name */
    private f0.c f28105n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28106o;

    public c(f0.c cVar, boolean z10) {
        this.f28105n = cVar;
        this.f28106o = z10;
    }

    public final f0.c D2() {
        return this.f28105n;
    }

    public final boolean E2() {
        return this.f28106o;
    }

    @Override // E0.p0
    /* renamed from: F2, reason: merged with bridge method [inline-methods] */
    public c M(Y0.d dVar, Object obj) {
        return this;
    }

    public final void G2(f0.c cVar) {
        this.f28105n = cVar;
    }

    public final void H2(boolean z10) {
        this.f28106o = z10;
    }
}
