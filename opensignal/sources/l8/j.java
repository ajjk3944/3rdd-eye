package l8;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14922a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14923b;

    /* renamed from: c, reason: collision with root package name */
    public final n8.a f14924c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap.Config f14925d;

    /* renamed from: e, reason: collision with root package name */
    public final m8.d f14926e;

    /* renamed from: f, reason: collision with root package name */
    public final List f14927f;

    /* renamed from: g, reason: collision with root package name */
    public final p8.a f14928g;

    /* renamed from: h, reason: collision with root package name */
    public final ou.s f14929h;

    /* renamed from: i, reason: collision with root package name */
    public final r f14930i;
    public final boolean j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14931l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f14932m;

    /* renamed from: n, reason: collision with root package name */
    public final b f14933n;

    /* renamed from: o, reason: collision with root package name */
    public final b f14934o;

    /* renamed from: p, reason: collision with root package name */
    public final b f14935p;

    /* renamed from: q, reason: collision with root package name */
    public final wt.q f14936q;

    /* renamed from: r, reason: collision with root package name */
    public final wt.q f14937r;

    /* renamed from: s, reason: collision with root package name */
    public final wt.q f14938s;

    /* renamed from: t, reason: collision with root package name */
    public final wt.q f14939t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.o f14940u;

    /* renamed from: v, reason: collision with root package name */
    public final m8.i f14941v;

    /* renamed from: w, reason: collision with root package name */
    public final m8.g f14942w;

    /* renamed from: x, reason: collision with root package name */
    public final o f14943x;

    /* renamed from: y, reason: collision with root package name */
    public final d f14944y;

    /* renamed from: z, reason: collision with root package name */
    public final c f14945z;

    public j(Context context, Object obj, n8.a aVar, Bitmap.Config config, m8.d dVar, List list, p8.a aVar2, ou.s sVar, r rVar, boolean z10, boolean z11, boolean z12, boolean z13, b bVar, b bVar2, b bVar3, wt.q qVar, wt.q qVar2, wt.q qVar3, wt.q qVar4, androidx.lifecycle.o oVar, m8.i iVar, m8.g gVar, o oVar2, d dVar2, c cVar) {
        this.f14922a = context;
        this.f14923b = obj;
        this.f14924c = aVar;
        this.f14925d = config;
        this.f14926e = dVar;
        this.f14927f = list;
        this.f14928g = aVar2;
        this.f14929h = sVar;
        this.f14930i = rVar;
        this.j = z10;
        this.k = z11;
        this.f14931l = z12;
        this.f14932m = z13;
        this.f14933n = bVar;
        this.f14934o = bVar2;
        this.f14935p = bVar3;
        this.f14936q = qVar;
        this.f14937r = qVar2;
        this.f14938s = qVar3;
        this.f14939t = qVar4;
        this.f14940u = oVar;
        this.f14941v = iVar;
        this.f14942w = gVar;
        this.f14943x = oVar2;
        this.f14944y = dVar2;
        this.f14945z = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return br.l.a(this.f14922a, jVar.f14922a) && this.f14923b.equals(jVar.f14923b) && br.l.a(this.f14924c, jVar.f14924c) && this.f14925d == jVar.f14925d && this.f14926e == jVar.f14926e && br.l.a(this.f14927f, jVar.f14927f) && br.l.a(this.f14928g, jVar.f14928g) && br.l.a(this.f14929h, jVar.f14929h) && this.f14930i.equals(jVar.f14930i) && this.j == jVar.j && this.k == jVar.k && this.f14931l == jVar.f14931l && this.f14932m == jVar.f14932m && this.f14933n == jVar.f14933n && this.f14934o == jVar.f14934o && this.f14935p == jVar.f14935p && br.l.a(this.f14936q, jVar.f14936q) && br.l.a(this.f14937r, jVar.f14937r) && br.l.a(this.f14938s, jVar.f14938s) && br.l.a(this.f14939t, jVar.f14939t) && br.l.a(this.f14940u, jVar.f14940u) && this.f14941v.equals(jVar.f14941v) && this.f14942w == jVar.f14942w && this.f14943x.equals(jVar.f14943x) && this.f14944y.equals(jVar.f14944y) && br.l.a(this.f14945z, jVar.f14945z);
    }

    public final int hashCode() {
        int iHashCode = (this.f14923b.hashCode() + (this.f14922a.hashCode() * 31)) * 31;
        n8.a aVar = this.f14924c;
        int iC = h0.b.c((this.f14926e.hashCode() + ((this.f14925d.hashCode() + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 923521)) * 961)) * 29791, 31, this.f14927f);
        this.f14928g.getClass();
        return this.f14945z.hashCode() + ((this.f14943x.f14962a.hashCode() + ((this.f14942w.hashCode() + ((this.f14941v.hashCode() + ((this.f14940u.hashCode() + ((this.f14939t.hashCode() + ((this.f14938s.hashCode() + ((this.f14937r.hashCode() + ((this.f14936q.hashCode() + ((this.f14935p.hashCode() + ((this.f14934o.hashCode() + ((this.f14933n.hashCode() + w.g.b(w.g.b(w.g.b(w.g.b((this.f14930i.f14971a.hashCode() + ((((p8.a.class.hashCode() + iC) * 31) + Arrays.hashCode(this.f14929h.f19966a)) * 31)) * 31, this.j, 31), this.k, 31), this.f14931l, 31), this.f14932m, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-196513505));
    }
}
