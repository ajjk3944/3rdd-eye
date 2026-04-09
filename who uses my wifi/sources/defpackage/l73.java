package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l73 implements ca4 {
    public final /* synthetic */ int a;
    public final da4 b;
    public final ga4 c;
    public final ga4 d;

    public /* synthetic */ l73(da4 da4Var, ba4 ba4Var, ba4 ba4Var2, int i) {
        this.a = i;
        this.b = da4Var;
        this.c = ba4Var;
        this.d = ba4Var2;
    }

    public k73 a() {
        ed2 ed2VarM;
        ed2 ed2VarM2;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b.a;
                x83 x83Var = (x83) this.c.d();
                j93 j93Var = (j93) this.d.d();
                iz1 iz1Var = mz1.H6;
                tw1 tw1Var = tw1.e;
                if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                    ed2VarM = hg4.C.h.g().m();
                } else {
                    ra4 ra4VarG = hg4.C.h.g();
                    synchronized (ra4VarG.a) {
                        ed2VarM = ra4VarG.n;
                    }
                }
                boolean z = false;
                if (ed2VarM != null && ed2VarM.j) {
                    z = true;
                }
                if (((Integer) tw1Var.c.a(mz1.X6)).intValue() > 0) {
                    if (!((Boolean) tw1Var.c.a(mz1.G6)).booleanValue() || z) {
                        i93 i93VarA = j93Var.a(c93.h, context, x83Var, new z71(28, new vg0(24)));
                        mr2 mr2Var = new mr2(new zs1(26, false));
                        t83 t83Var = i93VarA.a;
                        ld2 ld2Var = md2.a;
                        return new bu1(mr2Var, new xb4(t83Var, ld2Var), i93VarA.b, ((d93) t83Var.h).l, ld2Var);
                    }
                }
                return new zs1(26, false);
            default:
                Context context2 = (Context) this.b.a;
                x83 x83Var2 = (x83) this.c.d();
                j93 j93Var2 = (j93) this.d.d();
                iz1 iz1Var2 = mz1.H6;
                tw1 tw1Var2 = tw1.e;
                if (((Boolean) tw1Var2.c.a(iz1Var2)).booleanValue()) {
                    ed2VarM2 = hg4.C.h.g().m();
                } else {
                    ra4 ra4VarG2 = hg4.C.h.g();
                    synchronized (ra4VarG2.a) {
                        ed2VarM2 = ra4VarG2.n;
                    }
                }
                boolean z2 = false;
                if (ed2VarM2 != null && ed2VarM2.j) {
                    z2 = true;
                }
                if (((Integer) tw1Var2.c.a(mz1.J6)).intValue() > 0) {
                    if (!((Boolean) tw1Var2.c.a(mz1.G6)).booleanValue() || z2) {
                        i93 i93VarA2 = j93Var2.a(c93.f, context2, x83Var2, new z71(28, new vg0(24)));
                        mr2 mr2Var2 = new mr2(new zs1(26, false));
                        t83 t83Var2 = i93VarA2.a;
                        ld2 ld2Var2 = md2.a;
                        return new bu1(mr2Var2, new xb4(t83Var2, ld2Var2), i93VarA2.b, ((d93) t83Var2.h).l, ld2Var2);
                    }
                }
                return new zs1(26, false);
        }
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return new qi3("dFQH+5qiD2PRdi0XHMSOoNm+a3fekCOGUzmH+eYRmk9bJvOb468Cs8O4aRQ5LdYP", "cV7R50f2/HQumOgCDB4L1ZcSwVOfPPdtbjhx11w36hE=", (fr1) this.b.a, (gi3) this.c.d(), ((gk3) this.d.d()).a(114), 1);
            default:
                return new qi3("Zh6cd+aDndZV+YUcVHG1KoZXWtL97j2QmZXbwOqvXvMv7NRw9MmD/Gx8wRyupV8R", "kj+4OypsnIcMTfpnmlGzqqY0pqeQ7F3FRQZTzB0M60E=", (fr1) this.b.a, (gi3) this.c.d(), ((gk3) this.d.d()).a(117), 0);
        }
    }
}
