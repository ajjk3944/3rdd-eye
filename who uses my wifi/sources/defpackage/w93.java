package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w93 implements op2, bn2, qp2 {
    public final da3 f;
    public final aa3 g;

    public w93(Context context, da3 da3Var) {
        this.f = da3Var;
        this.g = aa3.l(context, 13);
    }

    @Override // defpackage.qp2
    public final void a() {
        if (((Boolean) n02.d.w()).booleanValue()) {
            aa3 aa3Var = this.g;
            aa3Var.b(true);
            this.f.a(aa3Var);
        }
    }

    @Override // defpackage.op2
    public final void f() {
        if (((Boolean) n02.d.w()).booleanValue()) {
            this.g.a();
        }
    }

    @Override // defpackage.bn2
    public final void s(nx2 nx2Var) {
        if (((Boolean) n02.d.w()).booleanValue()) {
            String string = nx2Var.a().toString();
            aa3 aa3Var = this.g;
            aa3Var.m(string);
            aa3Var.b(false);
            this.f.a(aa3Var);
        }
    }

    @Override // defpackage.op2
    public final void e() {
    }

    @Override // defpackage.qp2
    public final void y() {
    }
}
