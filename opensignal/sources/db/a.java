package db;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import pb.d0;
import pb.e0;
import qb.v;

/* loaded from: classes.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f7198a;

    public a(c cVar) {
        this.f7198a = cVar;
    }

    @Override // db.s
    public final void a() {
        this.f7198a.f7209x.remove(this);
    }

    @Override // db.s
    public final boolean h(Uri uri, e0 e0Var, boolean z10) {
        b bVar;
        c cVar = this.f7198a;
        HashMap map = cVar.f7208r;
        if (cVar.H == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f fVar = cVar.F;
            int i10 = v.f20828a;
            List list = fVar.f7222e;
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                b bVar2 = (b) map.get(((e) list.get(i12)).f7214a);
                if (bVar2 != null && jElapsedRealtime < bVar2.D) {
                    i11++;
                }
            }
            h9.t tVarO = ((sm.m) cVar.f7207g).o(new d0(1, 0, cVar.F.f7222e.size(), i11, 0), e0Var);
            if (tVarO != null && tVarO.f10477a == 2 && (bVar = (b) map.get(uri)) != null) {
                b.a(bVar, tVarO.f10478b);
            }
        }
        return false;
    }
}
