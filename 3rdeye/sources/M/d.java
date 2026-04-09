package M;

import C.L;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.EnumC1716u;
import androidx.camera.core.impl.EnumC1719w;
import androidx.camera.core.impl.EnumC1721y;

/* compiled from: ZslRingBuffer.java */
/* loaded from: classes.dex */
public final class d extends a<androidx.camera.core.c> {
    @Override // M.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void b(androidx.camera.core.c cVar) {
        L lI0 = cVar.i0();
        A a10 = lI0 instanceof J.c ? ((J.c) lI0).f2652a : null;
        if ((a10.g() == EnumC1719w.LOCKED_FOCUSED || a10.g() == EnumC1719w.PASSIVE_FOCUSED) && a10.e() == EnumC1716u.CONVERGED && a10.c() == EnumC1721y.CONVERGED) {
            super.b(cVar);
        } else {
            this.f4109d.getClass();
            cVar.close();
        }
    }
}
