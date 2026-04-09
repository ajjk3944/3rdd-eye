package xj;

import ak.v0;
import cj.q;
import h9.r2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.l2;
import xi.u;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final df.c f25417a;

    /* renamed from: b, reason: collision with root package name */
    public final dj.h f25418b;

    /* renamed from: c, reason: collision with root package name */
    public final q f25419c;

    /* renamed from: d, reason: collision with root package name */
    public final ek.c f25420d;

    /* renamed from: e, reason: collision with root package name */
    public final h f25421e;

    /* renamed from: f, reason: collision with root package name */
    public final r2 f25422f;

    /* renamed from: g, reason: collision with root package name */
    public final l2 f25423g;

    /* renamed from: h, reason: collision with root package name */
    public final r2 f25424h;

    /* renamed from: i, reason: collision with root package name */
    public final bj.c f25425i;
    public final ek.c j;
    public final q3.a k;

    /* renamed from: l, reason: collision with root package name */
    public final u f25426l;

    /* renamed from: m, reason: collision with root package name */
    public final xi.j f25427m;

    /* renamed from: n, reason: collision with root package name */
    public final cj.a f25428n;

    /* renamed from: o, reason: collision with root package name */
    public final io.sentry.hints.i f25429o;

    /* renamed from: p, reason: collision with root package name */
    public final zh.a f25430p;

    public m(df.c cVar, dj.h hVar, q qVar, ek.c cVar2, j jVar, r2 r2Var, l2 l2Var, r2 r2Var2, bj.c cVar3, ek.c cVar4, q3.a aVar, u uVar, xi.j jVar2, cj.a aVar2, sm.f fVar, io.sentry.hints.i iVar, zh.a aVar3) {
        br.l.e(jVar, "scheduleConfigMapper");
        this.f25417a = cVar;
        this.f25418b = hVar;
        this.f25419c = qVar;
        this.f25420d = cVar2;
        this.f25421e = jVar;
        this.f25422f = r2Var;
        this.f25423g = l2Var;
        this.f25424h = r2Var2;
        this.f25425i = cVar3;
        this.j = cVar4;
        this.k = aVar;
        this.f25426l = uVar;
        this.f25427m = jVar2;
        this.f25428n = aVar2;
        this.f25429o = iVar;
        this.f25430p = aVar3;
    }

    public final hk.h a(v0 v0Var) {
        br.l.e(v0Var, "input");
        String str = v0Var.f735a;
        long jCurrentTimeMillis = System.currentTimeMillis() + str.hashCode();
        String str2 = v0Var.f735a;
        String str3 = v0Var.f736b;
        gk.c cVar = (gk.c) this.f25421e.a(v0Var.f737c);
        List list = v0Var.f738d;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vj.b bVarG = this.f25419c.g((String) it.next(), str);
            if (bVarG != null) {
                arrayList.add(bVarG);
            }
        }
        List list2 = v0Var.f739e;
        dj.h hVar = this.f25418b;
        ArrayList arrayListE = hVar.e(list2);
        ArrayList arrayListE2 = hVar.e(v0Var.f740f);
        boolean z10 = v0Var.f741g;
        String str4 = v0Var.f743i;
        String str5 = v0Var.j;
        boolean z11 = v0Var.f742h;
        hk.b bVar = v0Var.f744l;
        long j = bVar.f10798a;
        long j7 = bVar.f10799b;
        boolean z12 = v0Var.f745m;
        return new hk.h(jCurrentTimeMillis, str2, str3, arrayListE, arrayListE2, cVar, arrayList, this.f25420d, this.f25422f, this.f25423g, this.f25425i, this.f25424h, this.j, this.k, this.f25426l, v0Var.f749q, z10, z11, str4, str5, j, j7, bVar.f10800c, z12, v0Var.f746n, v0Var.f747o, v0Var.f748p, this.f25427m, this.f25428n, new fh.f(0), this.f25417a, v0Var.f750r, this.f25429o, this.f25430p, 268599296);
    }
}
