package R;

import C.m0;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.H0;
import java.util.Iterator;

/* compiled from: VirtualCameraAdapter.java */
/* loaded from: classes.dex */
public final class g extends AbstractC1707p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f11583a;

    public g(h hVar) {
        this.f11583a = hVar;
    }

    @Override // androidx.camera.core.impl.AbstractC1707p
    public final void b(int i, A a10) {
        Iterator it = this.f11583a.f11584b.iterator();
        while (it.hasNext()) {
            H0 h02 = ((m0) it.next()).f760n;
            Iterator<AbstractC1707p> it2 = h02.f14884g.f14944e.iterator();
            while (it2.hasNext()) {
                it2.next().b(i, new i(a10, h02.f14884g.f14946g, -1L));
            }
        }
    }
}
