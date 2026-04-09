package b7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.measurement.d5;
import java.util.Iterator;
import java.util.List;
import me.t1;
import t6.g0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final t5.s f2066a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2067b = new d(5);

    public y(t5.s sVar) {
        this.f2066a = sVar;
    }

    public final void a(d6.a aVar, x.e eVar) {
        x.b bVar = (x.b) eVar.keySet();
        x.e eVar2 = bVar.f36848a;
        if (eVar2.isEmpty()) {
            return;
        }
        if (eVar.f36920c > 999) {
            d5.s(eVar, new v(this, aVar, 0));
            return;
        }
        StringBuilder sbZ = d.h.z("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        t1.c(eVar2.f36920c, sbZ);
        sbZ.append(")");
        String string = sbZ.toString();
        nk.k.d(string, "toString(...)");
        d6.c cVarS = aVar.S(string);
        Iterator it = bVar.iterator();
        int i4 = 1;
        while (true) {
            x.a aVar2 = (x.a) it;
            if (!aVar2.hasNext()) {
                try {
                    break;
                } finally {
                    cVarS.close();
                }
            } else {
                cVarS.q(i4, (String) aVar2.next());
                i4++;
            }
        }
        nk.k.e(cVarS, "stmt");
        int iG = ii.a.g(cVarS, "work_spec_id");
        if (iG == -1) {
            return;
        }
        while (cVarS.P()) {
            List list = (List) eVar.get(cVarS.D(iG));
            if (list != null) {
                byte[] blob = cVarS.getBlob(0);
                t6.h hVar = t6.h.f34355b;
                list.add(jm.a.h(blob));
            }
        }
    }

    public final void b(d6.a aVar, x.e eVar) {
        x.b bVar = (x.b) eVar.keySet();
        x.e eVar2 = bVar.f36848a;
        if (eVar2.isEmpty()) {
            return;
        }
        if (eVar.f36920c > 999) {
            d5.s(eVar, new v(this, aVar, 1));
            return;
        }
        StringBuilder sbZ = d.h.z("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        t1.c(eVar2.f36920c, sbZ);
        sbZ.append(")");
        String string = sbZ.toString();
        nk.k.d(string, "toString(...)");
        d6.c cVarS = aVar.S(string);
        Iterator it = bVar.iterator();
        int i4 = 1;
        while (true) {
            x.a aVar2 = (x.a) it;
            if (!aVar2.hasNext()) {
                try {
                    break;
                } finally {
                    cVarS.close();
                }
            } else {
                cVarS.q(i4, (String) aVar2.next());
                i4++;
            }
        }
        nk.k.e(cVarS, "stmt");
        int iG = ii.a.g(cVarS, "work_spec_id");
        if (iG == -1) {
            return;
        }
        while (cVarS.P()) {
            List list = (List) eVar.get(cVarS.D(iG));
            if (list != null) {
                list.add(cVarS.D(0));
            }
        }
    }

    public final g0 c(String str) {
        nk.k.e(str, FacebookMediationAdapter.KEY_ID);
        return (g0) com.bumptech.glide.f.r(this.f2066a, true, false, new c(str, 7));
    }

    public final r d(String str) {
        nk.k.e(str, FacebookMediationAdapter.KEY_ID);
        return (r) com.bumptech.glide.f.r(this.f2066a, true, false, new c(str, 6));
    }

    public final int e(long j, String str) {
        nk.k.e(str, FacebookMediationAdapter.KEY_ID);
        return ((Number) com.bumptech.glide.f.r(this.f2066a, false, true, new t(0, j, str))).intValue();
    }

    public final void f(int i4, String str) {
        nk.k.e(str, FacebookMediationAdapter.KEY_ID);
        com.bumptech.glide.f.r(this.f2066a, false, true, new j(str, i4, 1));
    }

    public final void g(long j, String str) {
        nk.k.e(str, FacebookMediationAdapter.KEY_ID);
        com.bumptech.glide.f.r(this.f2066a, false, true, new t(1, j, str));
    }

    public final int h(g0 g0Var, String str) {
        nk.k.e(str, FacebookMediationAdapter.KEY_ID);
        return ((Number) com.bumptech.glide.f.r(this.f2066a, false, true, new b(4, g0Var, str))).intValue();
    }

    public final void i(int i4, String str) {
        nk.k.e(str, FacebookMediationAdapter.KEY_ID);
        com.bumptech.glide.f.r(this.f2066a, false, true, new j(i4, str, 2));
    }
}
