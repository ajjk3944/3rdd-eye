package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t03 implements zz2 {
    public final /* synthetic */ int a = 1;
    public final Context b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public t03(Context context, Executor executor, ei2 ei2Var, z73 z73Var, mv2 mv2Var) {
        this.b = context;
        this.c = ei2Var;
        this.d = executor;
        this.e = z73Var;
        this.f = mv2Var;
    }

    @Override // defpackage.zz2
    public final boolean a(h83 h83Var, a83 a83Var) throws JSONException {
        String string;
        e83 e83Var;
        switch (this.a) {
            case 0:
                Context context = this.b;
                if ((context instanceof Activity) && yz1.a(context)) {
                    try {
                        string = a83Var.v.getString("tab_url");
                    } catch (Exception unused) {
                        string = null;
                    }
                    if (!TextUtils.isEmpty(string)) {
                    }
                }
                break;
            default:
                if (((vz1) this.d) == null || (e83Var = a83Var.s) == null || e83Var.a == null) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.zz2
    public final n70 b(h83 h83Var, a83 a83Var) throws JSONException {
        String string;
        switch (this.a) {
            case 0:
                if (((Boolean) tw1.e.c.a(mz1.Sd)).booleanValue()) {
                    lv2 lv2VarA = ((mv2) this.f).a();
                    lv2VarA.k("action", "cstm_tbs_rndr");
                    lv2VarA.m();
                }
                try {
                    string = a83Var.v.getString("tab_url");
                } catch (Exception unused) {
                    string = null;
                }
                return pu1.O(lq3.g, new s03(this, string != null ? Uri.parse(string) : null, h83Var, a83Var, (c83) h83Var.b.g, 0), (Executor) this.d);
            default:
                d23 d23Var = new d23(new View(this.b), null, tv2.i, (b83) a83Var.u.get(0));
                xb4 xb4Var = new xb4(h83Var, a83Var, (String) null);
                bi2 bi2Var = (bi2) this.c;
                ai2 ai2Var = new ai2(bi2Var.d, bi2Var.e, xb4Var, d23Var);
                bu1 bu1Var = new bu1((sm2) ai2Var.x.d(), (cn2) ai2Var.A.d(), (yp2) ai2Var.C.d(), (vp2) ai2Var.L.d(), (xj2) ai2Var.r.d());
                e83 e83Var = a83Var.s;
                uz1 uz1Var = new uz1(bu1Var, e83Var.b, e83Var.a);
                u93 u93Var = (u93) this.f;
                Objects.requireNonNull(u93Var);
                mr2 mr2Var = new mr2(this, uz1Var, 6, false);
                bu1 bu1Var2 = new bu1(u93Var, s93.v, null, u93.d, Collections.EMPTY_LIST, ((ld2) ((pq3) this.e)).c(new w53(3, mr2Var)));
                bu1 bu1VarA = ((u93) bu1Var2.l).a(bu1Var2.A(), s93.w);
                return new bu1((u93) bu1VarA.l, bu1VarA.g, (String) bu1VarA.h, (n70) bu1VarA.i, (List) bu1VarA.j, pu1.O((n70) bu1VarA.k, new p62(1, pu1.r(ai2Var.z())), md2.g)).A();
        }
    }

    public t03(Context context, bi2 bi2Var, u93 u93Var, pq3 pq3Var, vz1 vz1Var) {
        this.b = context;
        this.c = bi2Var;
        this.f = u93Var;
        this.e = pq3Var;
        this.d = vz1Var;
    }
}
