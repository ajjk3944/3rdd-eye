package defpackage;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l03 implements f03 {
    public final /* synthetic */ int a;
    public final Context b;
    public final Executor c;
    public final Object d;

    public /* synthetic */ l03(Context context, Object obj, Executor executor, int i) {
        this.a = i;
        this.b = context;
        this.d = obj;
        this.c = executor;
    }

    private final Object c(h83 h83Var, a83 a83Var, c03 c03Var) {
        xb4 xb4Var = new xb4(h83Var, a83Var, c03Var.a);
        l92 l92Var = new l92(new k03(this, c03Var, a83Var, 0), (Object) null);
        h80 h80Var = new h80(a83Var.a0, 4);
        zh2 zh2Var = (zh2) this.d;
        th2 th2Var = zh2Var.c;
        zh2 zh2Var2 = zh2Var.d;
        xh2 xh2Var = new xh2(th2Var, zh2Var2, xb4Var, l92Var, h80Var);
        ((fn2) xh2Var.s.d()).L1(new cj2(0, (u83) c03Var.b), this.c);
        ((u03) c03Var.c).C3(new c23((sm2) xh2Var.A.d(), (wp2) xh2Var.C.d(), (cn2) xh2Var.w.d(), (gn2) xh2Var.z.d(), (qn2) xh2Var.D.d(), (vo2) zh2Var2.Q.d(), (xn2) xh2Var.E.d(), (fq2) xh2Var.F.d(), (so2) xh2Var.G.d(), (an2) xh2Var.I.d()));
        return xh2Var.y();
    }

    private final Object d(h83 h83Var, a83 a83Var, c03 c03Var) throws n83 {
        n83 n83Var;
        View view;
        Object obj = c03Var.b;
        if (((Boolean) tw1.e.c.a(mz1.z8)).booleanValue() && a83Var.g0) {
            try {
                a72 a72VarA0 = ((u83) obj).a.a0();
                if (a72VarA0 == null) {
                    gi2.Z("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                    throw new n83(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                }
                try {
                    boolean z = true;
                    Parcel parcelY = a72VarA0.Y(a72VarA0.U(), 1);
                    u10 u10VarX0 = oi0.X0(parcelY.readStrongBinder());
                    parcelY.recycle();
                    view = (View) oi0.l1(u10VarX0);
                    Parcel parcelY2 = a72VarA0.Y(a72VarA0.U(), 2);
                    ClassLoader classLoader = iv1.a;
                    if (parcelY2.readInt() == 0) {
                        z = false;
                    }
                    parcelY2.recycle();
                    if (view == null) {
                        throw new n83(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                    if (z) {
                        try {
                            view = (View) pu1.O(lq3.g, new op1(this, view, a83Var, 6), md2.f).get();
                        } catch (InterruptedException | ExecutionException e) {
                            throw new n83(e);
                        }
                    }
                } catch (RemoteException e2) {
                    throw new n83(e2);
                }
            } finally {
            }
        } else {
            try {
                view = (View) oi0.l1(((u83) obj).a.c());
            } finally {
            }
        }
        bi2 bi2Var = (bi2) this.d;
        xb4 xb4Var = new xb4(h83Var, a83Var, c03Var.a);
        u83 u83Var = (u83) obj;
        p21 p21Var = new p21(view, (ag2) null, (dl2) new z71(26, u83Var), (b83) a83Var.u.get(0));
        th2 th2Var = bi2Var.d;
        bi2 bi2Var2 = bi2Var.e;
        ai2 ai2Var = new ai2(th2Var, bi2Var2, xb4Var, p21Var);
        ((vp2) ai2Var.L.d()).U1(view);
        ((fn2) ai2Var.s.d()).L1(new cj2(0, u83Var), this.c);
        ((u03) c03Var.c).C3(new c23((sm2) ai2Var.x.d(), (wp2) ai2Var.D.d(), (cn2) ai2Var.A.d(), (gn2) ai2Var.w.d(), ai2Var.y(), (vo2) bi2Var2.S.d(), (xn2) ai2Var.G.d(), (fq2) ai2Var.H.d(), (so2) ai2Var.I.d(), (an2) ai2Var.J.d()));
        return ai2Var.z();
    }

    public static final boolean e(h83 h83Var, int i) {
        return ((l83) h83Var.a.g).h.contains(Integer.toString(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0542  */
    @Override // defpackage.f03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.h83 r68, defpackage.a83 r69, defpackage.c03 r70) throws defpackage.r13 {
        /*
            Method dump skipped, instructions count: 3142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l03.a(h83, a83, c03):java.lang.Object");
    }

    @Override // defpackage.f03
    public final void b(h83 h83Var, a83 a83Var, c03 c03Var) throws JSONException, IOException {
        n83 n83Var;
        xe4 xe4VarN;
        switch (this.a) {
            case 0:
                u83 u83Var = (u83) c03Var.b;
                l83 l83Var = (l83) h83Var.a.g;
                String string = a83Var.v.toString();
                Context context = this.b;
                z62 z62Var = (z62) c03Var.c;
                try {
                    u83Var.a.S0(new oi0(context), l83Var.d, string, z62Var);
                    return;
                } finally {
                }
            case 1:
                e83 e83Var = a83Var.s;
                JSONObject jSONObject = a83Var.v;
                boolean z = a83Var.g0;
                IInterface iInterface = c03Var.c;
                Object obj = c03Var.b;
                l83 l83Var2 = (l83) h83Var.a.g;
                xe4 xe4Var = l83Var2.f;
                boolean z2 = xe4Var.s;
                int i = xe4Var.g;
                int i2 = xe4Var.j;
                Context context2 = this.b;
                if (z2) {
                    d3 d3Var = new d3(i2, i);
                    d3Var.e = true;
                    d3Var.f = i;
                    xe4VarN = new xe4(context2, d3Var);
                } else {
                    if (((Boolean) tw1.e.c.a(mz1.z8)).booleanValue() && z) {
                        d3 d3Var2 = new d3(i2, i);
                        d3Var2.g = true;
                        d3Var2.h = i;
                        xe4VarN = new xe4(context2, d3Var2);
                    } else {
                        xe4VarN = a30.n(context2, a83Var.u);
                    }
                }
                xe4 xe4Var2 = xe4VarN;
                if (((Boolean) tw1.e.c.a(mz1.z8)).booleanValue() && z) {
                    u83 u83Var2 = (u83) obj;
                    try {
                        u83Var2.a.r2(new oi0(context2), xe4Var2, l83Var2.d, jSONObject.toString(), bd2.Z(e83Var), (z62) iInterface);
                        return;
                    } finally {
                    }
                }
                u83 u83Var3 = (u83) obj;
                try {
                    u83Var3.a.P0(new oi0(context2), xe4Var2, l83Var2.d, jSONObject.toString(), bd2.Z(e83Var), (z62) iInterface);
                    return;
                } finally {
                }
            default:
                u83 u83Var4 = (u83) c03Var.b;
                l83 l83Var3 = (l83) h83Var.a.g;
                String string2 = a83Var.v.toString();
                String strZ = bd2.Z(a83Var.s);
                Context context3 = this.b;
                z62 z62Var2 = (z62) c03Var.c;
                r12 r12Var = l83Var3.j;
                ArrayList arrayList = l83Var3.h;
                try {
                    u83Var4.a.l3(new oi0(context3), l83Var3.d, string2, strZ, z62Var2, r12Var, arrayList);
                    return;
                } finally {
                }
        }
    }
}
