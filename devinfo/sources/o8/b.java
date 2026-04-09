package o8;

import al.f0;
import al.h;
import al.z0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import b7.r;
import java.util.ArrayList;
import nk.k;
import x6.i;
import z6.f;
import z6.l;
import zj.m;
import zj.n;
import zj.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f30424a;

    public b() {
        this.f30424a = new ArrayList();
    }

    public h a(r rVar) {
        k.e(rVar, "spec");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f30424a;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            if (((y6.d) obj).a(rVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(o.T(arrayList, 10));
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList3.add(((y6.d) obj2).c(rVar.j));
        }
        return z0.i(new f0(5, (h[]) n.r0(arrayList3).toArray(new h[0])));
    }

    public b(l lVar) {
        x6.d dVar;
        k.e(lVar, "trackers");
        y6.c cVar = new y6.c((f) lVar.f37970b, 0);
        y6.c cVar2 = new y6.c((z6.a) lVar.f37973e);
        y6.c cVar3 = new y6.c((f) lVar.f37972d, 4);
        f fVar = (f) lVar.f37971c;
        y6.c cVar4 = new y6.c(fVar, 2);
        y6.c cVar5 = new y6.c(fVar, 3);
        y6.f fVar2 = new y6.f(fVar);
        y6.e eVar = new y6.e(fVar);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = (Context) lVar.f37969a;
            String str = i.f36992a;
            k.e(context, "context");
            Object systemService = context.getSystemService("connectivity");
            k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            dVar = new x6.d((ConnectivityManager) systemService);
        } else {
            dVar = null;
        }
        this.f30424a = m.Y(new y6.d[]{cVar, cVar2, cVar3, cVar4, cVar5, fVar2, eVar, dVar});
    }
}
