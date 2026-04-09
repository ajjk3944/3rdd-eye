package js;

import ls.c0;

/* loaded from: classes.dex */
public final class i implements ft.k {

    /* renamed from: a, reason: collision with root package name */
    public final ys.b f13810a;

    /* renamed from: d, reason: collision with root package name */
    public final ys.b f13811d;

    /* renamed from: g, reason: collision with root package name */
    public final wr.b f13812g;

    public i(wr.b bVar, c0 c0Var, ps.g gVar, ft.j jVar) {
        br.l.e(bVar, "kotlinClass");
        br.l.e(c0Var, "packageProto");
        br.l.e(gVar, "nameResolver");
        br.l.e(jVar, "abiStability");
        ys.b bVarB = ys.b.b(xr.d.a(bVar.f24588a));
        ks.c cVar = bVar.f24589b;
        ys.b bVarD = null;
        String str = ((ks.b) cVar.f14489c) != ks.b.MULTIFILE_CLASS_PART ? null : (String) cVar.f14494h;
        if (str != null && str.length() > 0) {
            bVarD = ys.b.d(str);
        }
        this.f13810a = bVarB;
        this.f13811d = bVarD;
        this.f13812g = bVar;
        rs.o oVar = os.k.f19788m;
        br.l.d(oVar, "packageModuleName");
        Integer num = (Integer) a.a.o(c0Var, oVar);
        if (num != null) {
            gVar.getString(num.intValue());
        }
    }

    public final qs.b a() {
        qs.c cVar;
        ys.b bVar = this.f13810a;
        String str = bVar.f26415a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            cVar = qs.c.f21024c;
            if (cVar == null) {
                ys.b.a(7);
                throw null;
            }
        } else {
            cVar = new qs.c(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strE = bVar.e();
        br.l.d(strE, "className.internalName");
        return new qs.b(cVar, qs.g.e(tt.l.T0('/', strE, strE)));
    }

    public final String toString() {
        return i.class.getSimpleName() + ": " + this.f13810a;
    }

    @Override // ft.k
    public final String y() {
        return "Class '" + a().b().b() + '\'';
    }
}
