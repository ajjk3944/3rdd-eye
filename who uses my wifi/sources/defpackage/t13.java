package defpackage;

import android.content.Context;
import android.os.IInterface;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t13 implements f03 {
    public final /* synthetic */ int a;
    public final Context b;
    public final Executor c;
    public final ji2 d;

    public /* synthetic */ t13(Context context, Executor executor, ji2 ji2Var, int i) {
        this.a = i;
        this.b = context;
        this.c = executor;
        this.d = ji2Var;
    }

    public static final void c(h83 h83Var, a83 a83Var, c03 c03Var) {
        try {
            u83 u83Var = (u83) c03Var.b;
            pc4 pc4Var = ((l83) h83Var.a.g).d;
            try {
                u83Var.a.U1(a83Var.v.toString(), pc4Var);
            } catch (Throwable th) {
                throw new n83(th);
            }
        } catch (Exception unused) {
            "Fail to load ad from adapter ".concat(String.valueOf(c03Var.a));
            gi2.q0(5);
        }
    }

    @Override // defpackage.f03
    public final Object a(h83 h83Var, a83 a83Var, c03 c03Var) {
        switch (this.a) {
            case 0:
                xb4 xb4Var = new xb4(h83Var, a83Var, c03Var.a);
                ju2 ju2Var = new ju2(new lv2(this, c03Var, a83Var, 3), null, 0);
                ji2 ji2Var = this.d;
                ii2 ii2Var = new ii2(ji2Var.c, ji2Var.d, xb4Var, ju2Var);
                ((fn2) ii2Var.r.d()).L1(new cj2(0, (u83) c03Var.b), this.c);
                ((u03) c03Var.c).C3((v13) ii2Var.M.d());
                return ii2Var.y();
            default:
                xb4 xb4Var2 = new xb4(h83Var, a83Var, c03Var.a);
                ju2 ju2Var2 = new ju2(new k03(this, c03Var, a83Var, 1), null, 0);
                ji2 ji2Var2 = this.d;
                ii2 ii2Var2 = new ii2(ji2Var2.c, ji2Var2.d, xb4Var2, ju2Var2);
                ((fn2) ii2Var2.r.d()).L1(new cj2(0, (u83) c03Var.b), this.c);
                gn2 gn2Var = (gn2) ii2Var2.y.d();
                sm2 sm2Var = (sm2) ii2Var2.z.d();
                xn2 xn2Var = (xn2) ii2Var2.E.d();
                cq2 cq2Var = (cq2) ii2Var2.K.d();
                w03 w03Var = (w03) c03Var.c;
                y13 y13Var = new y13(this, xn2Var, sm2Var, gn2Var, cq2Var);
                synchronized (w03Var) {
                    w03Var.f = y13Var;
                }
                return ii2Var2.y();
        }
    }

    @Override // defpackage.f03
    public final void b(h83 h83Var, a83 a83Var, c03 c03Var) {
        n83 n83Var;
        switch (this.a) {
            case 0:
                JSONObject jSONObject = a83Var.v;
                IInterface iInterface = c03Var.c;
                Object obj = c03Var.b;
                Context context = this.b;
                try {
                    l83 l83Var = (l83) h83Var.a.g;
                    h80 h80Var = l83Var.p;
                    pc4 pc4Var = l83Var.d;
                    if (h80Var.g == 3) {
                        u83 u83Var = (u83) obj;
                        try {
                            u83Var.a.b3(new oi0(context), pc4Var, jSONObject.toString(), (z62) iInterface);
                            return;
                        } finally {
                        }
                    }
                    u83 u83Var2 = (u83) obj;
                    try {
                        u83Var2.a.y0(new oi0(context), pc4Var, jSONObject.toString(), (z62) iInterface);
                        return;
                    } finally {
                    }
                } catch (Exception unused) {
                    "Fail to load ad from adapter ".concat(String.valueOf(c03Var.a));
                    gi2.q0(5);
                    return;
                }
                "Fail to load ad from adapter ".concat(String.valueOf(c03Var.a));
                gi2.q0(5);
                return;
            default:
                u83 u83Var3 = (u83) c03Var.b;
                if (u83Var3.a()) {
                    c(h83Var, a83Var, c03Var);
                    return;
                }
                mc2 mc2Var = new mc2(this, h83Var, a83Var, c03Var, 17);
                IInterface iInterface2 = c03Var.c;
                w03 w03Var = (w03) iInterface2;
                synchronized (w03Var) {
                    w03Var.h = mc2Var;
                }
                Context context2 = this.b;
                l83 l83Var2 = (l83) h83Var.a.g;
                sa2 sa2Var = (sa2) iInterface2;
                String string = a83Var.v.toString();
                try {
                    u83Var3.a.u1(new oi0(context2), l83Var2.d, sa2Var, string);
                    return;
                } finally {
                }
        }
    }
}
