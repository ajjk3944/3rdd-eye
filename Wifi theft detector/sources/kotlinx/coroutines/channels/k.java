package kotlinx.coroutines.channels;

import kotlinx.coroutines.channels.o;
import kotlinx.coroutines.h0;
import y8.s;

/* loaded from: classes4.dex */
public final class k extends b implements l {
    public k(kotlin.coroutines.d dVar, a aVar) {
        super(dVar, aVar, true, true);
    }

    @Override // kotlinx.coroutines.a
    public void R0(Throwable th, boolean z10) {
        if (U0().A(th) || z10) {
            return;
        }
        h0.a(getContext(), th);
    }

    @Override // kotlinx.coroutines.a
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public void S0(s sVar) {
        o.a.a(U0(), null, 1, null);
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.y1, kotlinx.coroutines.r1
    public boolean isActive() {
        return super.isActive();
    }
}
