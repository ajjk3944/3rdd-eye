package dt;

import com.google.android.gms.internal.measurement.e5;
import h7.h0;
import java.util.List;
import java.util.Set;
import p.v2;
import rr.f0;
import rr.i0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final gt.l f7493a;

    /* renamed from: b, reason: collision with root package name */
    public final rr.a0 f7494b;

    /* renamed from: c, reason: collision with root package name */
    public final l f7495c;

    /* renamed from: d, reason: collision with root package name */
    public final g f7496d;

    /* renamed from: e, reason: collision with root package name */
    public final b f7497e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f7498f;

    /* renamed from: g, reason: collision with root package name */
    public final l f7499g;

    /* renamed from: h, reason: collision with root package name */
    public final m f7500h;

    /* renamed from: i, reason: collision with root package name */
    public final zr.c f7501i;
    public final n j;
    public final Iterable k;

    /* renamed from: l, reason: collision with root package name */
    public final js.e f7502l;

    /* renamed from: m, reason: collision with root package name */
    public final l f7503m;

    /* renamed from: n, reason: collision with root package name */
    public final tr.b f7504n;

    /* renamed from: o, reason: collision with root package name */
    public final tr.d f7505o;

    /* renamed from: p, reason: collision with root package name */
    public final rs.g f7506p;

    /* renamed from: q, reason: collision with root package name */
    public final jt.k f7507q;

    /* renamed from: r, reason: collision with root package name */
    public final tr.a f7508r;

    /* renamed from: s, reason: collision with root package name */
    public final List f7509s;

    /* renamed from: t, reason: collision with root package name */
    public final i f7510t;

    public k(gt.l lVar, rr.a0 a0Var, g gVar, b bVar, i0 i0Var, m mVar, n nVar, Iterable iterable, js.e eVar, tr.b bVar2, tr.d dVar, rs.g gVar2, jt.k kVar, z.b bVar3, List list, int i10) {
        jt.k kVar2;
        l lVar2 = l.f7511b;
        l lVar3 = l.f7513d;
        if ((i10 & 65536) != 0) {
            jt.k.f13857b.getClass();
            kVar2 = jt.j.f13856b;
        } else {
            kVar2 = kVar;
        }
        tr.a aVar = tr.a.f22956e;
        List listH = (i10 & 524288) != 0 ? e5.H(ht.m.f10929a) : list;
        br.l.e(a0Var, "moduleDescriptor");
        br.l.e(gVar2, "extensionRegistryLite");
        br.l.e(kVar2, "kotlinTypeChecker");
        this.f7493a = lVar;
        this.f7494b = a0Var;
        this.f7495c = lVar2;
        this.f7496d = gVar;
        this.f7497e = bVar;
        this.f7498f = i0Var;
        this.f7499g = lVar3;
        this.f7500h = mVar;
        this.f7501i = zr.c.f27520a;
        this.j = nVar;
        this.k = iterable;
        this.f7502l = eVar;
        this.f7503m = j.f7492a;
        this.f7504n = bVar2;
        this.f7505o = dVar;
        this.f7506p = gVar2;
        this.f7507q = kVar2;
        this.f7508r = aVar;
        this.f7509s = listH;
        this.f7510t = new i(this);
    }

    public final al.b a(f0 f0Var, ns.f fVar, h0 h0Var, ns.h hVar, ns.a aVar, ft.k kVar) {
        br.l.e(fVar, "nameResolver");
        br.l.e(aVar, "metadataVersion");
        return new al.b(this, fVar, (rr.l) f0Var, h0Var, hVar, aVar, kVar, (v2) null, (List) mq.w.f16945a);
    }

    public final rr.f b(qs.b bVar) {
        br.l.e(bVar, "classId");
        Set set = i.f7489c;
        return this.f7510t.a(bVar, null);
    }
}
