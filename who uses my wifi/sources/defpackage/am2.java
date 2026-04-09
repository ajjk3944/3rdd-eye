package defpackage;

import android.content.Context;
import org.json.JSONException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class am2 implements jo2, dq2 {
    public final Context f;
    public final l83 g;
    public final e51 h;
    public final ra4 i;
    public final mw2 j;
    public final ea3 k;
    public final zw2 l;

    public am2(Context context, l83 l83Var, e51 e51Var, ra4 ra4Var, mw2 mw2Var, ea3 ea3Var, zw2 zw2Var) {
        this.f = context;
        this.g = l83Var;
        this.h = e51Var;
        this.i = ra4Var;
        this.j = mw2Var;
        this.k = ea3Var;
        this.l = zw2Var;
    }

    @Override // defpackage.jo2
    public final void G0(fa2 fa2Var) throws JSONException {
        b();
    }

    @Override // defpackage.dq2
    public final void a(l22 l22Var) throws JSONException {
        if (((Boolean) tw1.e.c.a(mz1.t4)).booleanValue()) {
            b();
        }
    }

    public final void b() throws JSONException {
        String str;
        if (((Boolean) tw1.e.c.a(mz1.s4)).booleanValue()) {
            String str2 = this.g.g;
            ed2 ed2VarM = this.i.m();
            ue ueVar = hg4.C.l;
            boolean zF = this.l.f();
            if (ed2VarM != null) {
                ueVar.getClass();
                str = ed2VarM.d;
            } else {
                str = null;
            }
            ueVar.F(this.f, this.h, false, ed2VarM, str, str2, null, this.k, null, null, zF);
        }
        this.j.a();
    }

    @Override // defpackage.jo2
    public final void B(h83 h83Var) {
    }

    @Override // defpackage.dq2
    public final void G(String str) {
    }
}
