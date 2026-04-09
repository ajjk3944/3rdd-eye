package p1;

import H1.l;
import n1.z;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: d, reason: collision with root package name */
    public n1.l f22737d;

    @Override // H1.l
    public final int b(Object obj) {
        z zVar = (z) obj;
        if (zVar == null) {
            return 1;
        }
        return zVar.c();
    }

    @Override // H1.l
    public final void c(Object obj, Object obj2) {
        z zVar = (z) obj2;
        n1.l lVar = this.f22737d;
        if (lVar == null || zVar == null) {
            return;
        }
        lVar.f22248e.f(zVar, true);
    }

    public final void i(int i) {
        long j6;
        if (i >= 40) {
            e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j6 = this.f1771a;
            }
            e(j6 / 2);
        }
    }
}
