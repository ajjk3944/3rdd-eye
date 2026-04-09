package k5;

import a5.d0;
import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import pb.e0;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f14041a;

    public a(c cVar) {
        this.f14041a = cVar;
    }

    @Override // k5.r
    public final void a() {
        this.f14041a.f14052x.remove(this);
    }

    @Override // k5.r
    public final boolean b(Uri uri, e0 e0Var, boolean z10) {
        b bVar;
        c cVar = this.f14041a;
        HashMap map = cVar.f14051r;
        if (cVar.H == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.F;
            int i10 = d0.f105a;
            List list = lVar.f14091e;
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                b bVar2 = (b) map.get(((k) list.get(i12)).f14083a);
                if (bVar2 != null && jElapsedRealtime < bVar2.D) {
                    i11++;
                }
            }
            h9.t tVarS = ((df.c) cVar.f14050g).s(new pb.d0(1, 0, cVar.F.f14091e.size(), i11, 1), e0Var);
            if (tVarS != null && tVarS.f10477a == 2 && (bVar = (b) map.get(uri)) != null) {
                b.a(bVar, tVarS.f10478b);
            }
        }
        return false;
    }
}
