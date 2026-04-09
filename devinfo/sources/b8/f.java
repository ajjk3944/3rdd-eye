package b8;

import com.google.android.gms.internal.ads.r9;
import z7.k;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends r9 {

    /* renamed from: d, reason: collision with root package name */
    public k f2079d;

    @Override // com.google.android.gms.internal.ads.r9
    public final int c(Object obj) {
        y yVar = (y) obj;
        if (yVar == null) {
            return 1;
        }
        return yVar.getSize();
    }

    @Override // com.google.android.gms.internal.ads.r9
    public final void d(Object obj, Object obj2) {
        y yVar = (y) obj2;
        k kVar = this.f2079d;
        if (kVar == null || yVar == null) {
            return;
        }
        kVar.f38054e.l(yVar, true);
    }

    public final void k(int i4) {
        long j;
        if (i4 >= 40) {
            g(0L);
        } else if (i4 >= 20 || i4 == 15) {
            synchronized (this) {
                j = this.f15576a;
            }
            g(j / 2);
        }
    }
}
