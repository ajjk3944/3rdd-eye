package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i53 implements q53 {
    public static final n43 k = new n43(new JSONArray().toString(), new Bundle(), "");
    public final pq3 a;
    public final ScheduledExecutorService b;
    public final j23 c;
    public final Context d;
    public final l83 e;
    public final h23 f;
    public final yu2 g;
    public final nw2 h;
    public final int i;
    public final String j;

    public i53(pq3 pq3Var, ScheduledExecutorService scheduledExecutorService, String str, j23 j23Var, Context context, l83 l83Var, h23 h23Var, yu2 yu2Var, nw2 nw2Var, int i) {
        this.a = pq3Var;
        this.b = scheduledExecutorService;
        this.j = str;
        this.c = j23Var;
        this.d = context;
        this.e = l83Var;
        this.f = h23Var;
        this.g = yu2Var;
        this.h = nw2Var;
        this.i = i;
    }

    @Override // defpackage.q53
    public final n70 a() {
        int i = this.i;
        n43 n43Var = k;
        if (i == 2) {
            return pu1.r(n43Var);
        }
        l83 l83Var = this.e;
        if (l83Var.s) {
            if (!Arrays.asList(((String) tw1.e.c.a(mz1.N1)).split(",")).contains(a30.s(a30.w(l83Var.d)))) {
                return pu1.r(n43Var);
            }
        }
        return pu1.H(new of3(23, this), this.a);
    }

    public final void b(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            m23 m23Var = (m23) ((Map.Entry) it.next()).getValue();
            String str = m23Var.a;
            Bundle bundle = this.e.d.r;
            arrayList.add(c(str, Collections.singletonList(m23Var.e), bundle != null ? bundle.getBundle(str) : null, m23Var.b, m23Var.c));
        }
    }

    public final gq3 c(String str, List list, Bundle bundle, boolean z, boolean z2) {
        g53 g53Var = new g53(this, str, list, bundle, z, z2);
        pq3 pq3Var = this.a;
        gq3 gq3VarR = gq3.r(pu1.H(g53Var, pq3Var));
        iz1 iz1Var = mz1.H1;
        tw1 tw1Var = tw1.e;
        if (!((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            gq3VarR = (gq3) pu1.N(gq3VarR, ((Long) tw1Var.c.a(mz1.A1)).longValue(), TimeUnit.MILLISECONDS, this.b);
        }
        return pu1.J(gq3VarR, Throwable.class, new u32(str, 3), pq3Var);
    }

    @Override // defpackage.q53
    public final int d() {
        return 32;
    }
}
