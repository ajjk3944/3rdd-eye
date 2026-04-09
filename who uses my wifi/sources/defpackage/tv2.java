package defpackage;

import android.content.Context;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tv2 implements o93, g62, dl2, e73, ll3, kl3, hr3, bw3, av3, wv3 {
    public static final /* synthetic */ tv2 A;
    public static final /* synthetic */ tv2 B;
    public static final /* synthetic */ tv2 C;
    public static final /* synthetic */ tv2 D;
    public static final /* synthetic */ tv2 g;
    public static final /* synthetic */ tv2 h;
    public static final /* synthetic */ tv2 i;
    public static final /* synthetic */ tv2 j;
    public static final /* synthetic */ tv2 k;
    public static final /* synthetic */ tv2 l;
    public static final /* synthetic */ tv2 m;
    public static final /* synthetic */ tv2 n;
    public static final /* synthetic */ tv2 o;
    public static final /* synthetic */ tv2 p;
    public static final /* synthetic */ tv2 q;
    public static final /* synthetic */ tv2 r;
    public static final /* synthetic */ tv2 s;
    public static final /* synthetic */ tv2 t;
    public static final /* synthetic */ tv2 u;
    public static final /* synthetic */ tv2 v;
    public static final /* synthetic */ tv2 w;
    public static final /* synthetic */ tv2 x;
    public static final /* synthetic */ tv2 y;
    public static final /* synthetic */ tv2 z;
    public final /* synthetic */ int f;

    static {
        byte b = 0;
        g = new tv2(1, b);
        h = new tv2(2, b);
        i = new tv2(4, b);
        j = new tv2(6, b);
        k = new tv2(7, b);
        l = new tv2(8, b);
        m = new tv2(10, b);
        n = new tv2(13, b);
        o = new tv2(14, b);
        p = new tv2(15, b);
        q = new tv2(16, b);
        r = new tv2(17, b);
        s = new tv2(18, b);
        t = new tv2(19, b);
        u = new tv2(20, b);
        v = new tv2(21, b);
        w = new tv2(22, b);
        x = new tv2(23, b);
        y = new tv2(24, b);
        z = new tv2(25, b);
        A = new tv2(26, b);
        B = new tv2(27, b);
        C = new tv2(28, b);
        D = new tv2(29, b);
    }

    public tv2(int i2) {
        this.f = 9;
    }

    public static final Set g(vv2 vv2Var, Executor executor) {
        return ((Boolean) u02.a.w()).booleanValue() ? Collections.singleton(new up2(vv2Var, executor)) : Collections.EMPTY_SET;
    }

    @Override // defpackage.ll3
    public /* synthetic */ Object a() {
        return -1;
    }

    @Override // defpackage.bw3
    /* renamed from: b */
    public Object mo19b(gi2 gi2Var) throws GeneralSecurityException {
        switch (this.f) {
            case 14:
                pt3 pt3Var = (pt3) gi2Var;
                su3 su3Var = rr3.a;
                return ((Cipher) bu3.f.get()) != null ? new gu3(1, ((v34) pt3Var.k.f).b(), pt3Var.l.b()) : new gu3(4, ((v34) pt3Var.k.f).b(), pt3Var.l.b());
            case 15:
                return f34.a((es3) gi2Var);
            case 16:
                return ku3.a((ns3) gi2Var);
            case 17:
                mt3 mt3Var = (mt3) gi2Var;
                mt3Var.getClass();
                return new hu3(((v34) mt3Var.k.f).b(), mt3Var.l, mt3Var.j.b);
            case 18:
                return j34.a((xr3) gi2Var);
            case 19:
                is3 is3Var = (is3) gi2Var;
                is3Var.getClass();
                return new gu3(((v34) is3Var.k.f).b(), is3Var.l);
            case 20:
                rs3 rs3Var = (rs3) gi2Var;
                aw3 aw3Var = ss3.a;
                return bu3.f.get() != null ? new bu3(((v34) rs3Var.k.f).b(), rs3Var.l.b()) : new gu3(3, ((v34) rs3Var.k.f).b(), rs3Var.l.b());
            case zy1.zzm /* 21 */:
                cv3 cv3Var = xs3.a;
                kr3.a(((ct3) gi2Var).j.b);
                throw null;
            default:
                pt3 pt3Var2 = (pt3) gi2Var;
                aw3 aw3Var2 = qt3.a;
                return ((Cipher) bu3.f.get()) != null ? new gu3(1, ((v34) pt3Var2.k.f).b(), pt3Var2.l.b()) : new gu3(4, ((v34) pt3Var2.k.f).b(), pt3Var2.l.b());
        }
    }

    @Override // defpackage.e73
    /* renamed from: c, reason: collision with other method in class */
    public /* synthetic */ void mo17c(Object obj) {
        switch (this.f) {
            case 6:
                ((wn2) obj).i();
                break;
            case 7:
                ((ye4) obj).R2();
                break;
            default:
                ((bb2) obj).k();
                break;
        }
    }

    @Override // defpackage.kl3
    public Iterator d(sq0 sq0Var, CharSequence charSequence) {
        return new hl3(charSequence);
    }

    public zq e(Context context, yq yqVar) {
        zq zqVar = new zq();
        zqVar.a = 0;
        zqVar.b = 0;
        zqVar.c = 0;
        int iM = yqVar.m(context, true);
        zqVar.b = iM;
        if (iM != 0) {
            zqVar.c = 1;
            return zqVar;
        }
        int iL = yqVar.l(context);
        zqVar.a = iL;
        if (iL != 0) {
            zqVar.c = -1;
        }
        return zqVar;
    }

    @Override // defpackage.wv3
    public gw3 f(mr3 mr3Var) {
        switch (this.f) {
            case 23:
                at3 at3Var = (at3) mr3Var;
                vv3 vv3Var = bt3.a;
                pz3 pz3VarE = qz3.E();
                pz3VarE.g("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                c04 c04VarC = d04.C();
                String str = at3Var.a;
                c04VarC.b();
                ((d04) c04VarC.g).E(str);
                pz3VarE.h(((d04) c04VarC.d()).a());
                pz3VarE.i(bt3.a(at3Var.b));
                return gw3.D((qz3) pz3VarE.d());
            case 24:
            default:
                ds3 ds3Var = (ds3) mr3Var;
                vv3 vv3Var2 = st3.a;
                pz3 pz3VarE2 = qz3.E();
                pz3VarE2.g("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                ux3 ux3VarD = vx3.D();
                yx3 yx3VarC = zx3.C();
                ay3 ay3VarB = by3.B();
                int i2 = ds3Var.c;
                ay3VarB.b();
                ((by3) ay3VarB.g).D(i2);
                by3 by3Var = (by3) ay3VarB.d();
                yx3VarC.b();
                ((zx3) yx3VarC.g).E(by3Var);
                int i3 = ds3Var.a;
                yx3VarC.b();
                ((zx3) yx3VarC.g).F(i3);
                zx3 zx3Var = (zx3) yx3VarC.d();
                ux3VarD.b();
                ((vx3) ux3VarD.g).E(zx3Var);
                jz3 jz3VarE = kz3.E();
                mz3 mz3VarD = st3.d(ds3Var);
                jz3VarE.b();
                ((kz3) jz3VarE.g).G(mz3VarD);
                int i4 = ds3Var.b;
                jz3VarE.b();
                ((kz3) jz3VarE.g).H(i4);
                kz3 kz3Var = (kz3) jz3VarE.d();
                ux3VarD.b();
                ((vx3) ux3VarD.g).F(kz3Var);
                pz3VarE2.h(((vx3) ux3VarD.d()).a());
                pz3VarE2.i(st3.a(ds3Var.e));
                return gw3.D((qz3) pz3VarE2.d());
            case 25:
                dt3 dt3Var = (dt3) mr3Var;
                vv3 vv3Var3 = et3.a;
                pz3 pz3VarE3 = qz3.E();
                pz3VarE3.g("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                pz3VarE3.h(et3.b(dt3Var).a());
                pz3VarE3.i(et3.a(dt3Var.a));
                return gw3.D((qz3) pz3VarE3.d());
        }
    }

    @Override // defpackage.g62
    public JSONObject p(Object obj) throws JSONException {
        ty2 ty2Var = (ty2) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) tw1.e.c.a(mz1.ba)).booleanValue()) {
            ga2 ga2Var = ty2Var.c;
            jSONObject2.put("ad_request_url", ga2Var.f);
            jSONObject2.put("ad_request_post_body", ga2Var.c);
        }
        ga2 ga2Var2 = ty2Var.c;
        jSONObject2.put("base_url", ga2Var2.b);
        jSONObject2.put("signals", ty2Var.b);
        zy2 zy2Var = ty2Var.a;
        jSONObject3.put("body", zy2Var.c);
        jSONObject3.put("headers", sv1.f.a.i(zy2Var.b));
        jSONObject3.put("response_code", zy2Var.a);
        jSONObject3.put("latency", zy2Var.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", ga2Var2.h);
        return jSONObject;
    }

    public /* synthetic */ tv2(int i2, byte b) {
        this.f = i2;
    }

    @Override // defpackage.dl2, defpackage.ll3
    public /* synthetic */ py2 a() {
        return null;
    }

    @Override // defpackage.hr3
    /* renamed from: a */
    public /* synthetic */ void mo15a() {
    }

    @Override // defpackage.o93
    public /* synthetic */ Object c(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        gi2.G("Ad request signals:");
        gi2.G(jSONObject.toString(2));
        return jSONObject;
    }

    @Override // defpackage.bw3
    /* renamed from: b */
    public fw3 mo19b(gi2 gi2Var) {
        switch (this.f) {
            case 22:
                ys3 ys3Var = (ys3) gi2Var;
                vv3 vv3Var = bt3.a;
                a04 a04VarD = b04.D();
                c04 c04VarC = d04.C();
                String str = ys3Var.j.a;
                c04VarC.b();
                ((d04) c04VarC.g).E(str);
                d04 d04Var = (d04) c04VarC.d();
                a04VarD.b();
                ((b04) a04VarD.g).F(d04Var);
                return fw3.v("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((b04) a04VarD.d()).a(), 5, bt3.a(ys3Var.j.b), ys3Var.l);
            case 24:
                ct3 ct3Var = (ct3) gi2Var;
                vv3 vv3Var2 = et3.a;
                e04 e04VarD = f04.D();
                h04 h04VarB = et3.b(ct3Var.j);
                e04VarD.b();
                ((f04) e04VarD.g).F(h04VarB);
                return fw3.v("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((f04) e04VarD.d()).a(), 5, et3.a(ct3Var.j.a), ct3Var.l);
            case 27:
                xr3 xr3Var = (xr3) gi2Var;
                vv3 vv3Var3 = st3.a;
                sx3 sx3VarE = tx3.E();
                wx3 wx3VarD = xx3.D();
                ay3 ay3VarB = by3.B();
                int i2 = xr3Var.j.c;
                ay3VarB.b();
                ((by3) ay3VarB.g).D(i2);
                by3 by3Var = (by3) ay3VarB.d();
                wx3VarD.b();
                ((xx3) wx3VarD.g).F(by3Var);
                byte[] bArrB = ((v34) xr3Var.k.f).b();
                y44 y44VarN = a54.n(bArrB, 0, bArrB.length);
                wx3VarD.b();
                ((xx3) wx3VarD.g).G(y44VarN);
                xx3 xx3Var = (xx3) wx3VarD.d();
                sx3VarE.b();
                ((tx3) sx3VarE.g).G(xx3Var);
                hz3 hz3VarE = iz3.E();
                ds3 ds3Var = xr3Var.j;
                mz3 mz3VarD = st3.d(ds3Var);
                hz3VarE.b();
                ((iz3) hz3VarE.g).H(mz3VarD);
                byte[] bArrB2 = ((v34) xr3Var.l.f).b();
                y44 y44VarN2 = a54.n(bArrB2, 0, bArrB2.length);
                hz3VarE.b();
                ((iz3) hz3VarE.g).I(y44VarN2);
                iz3 iz3Var = (iz3) hz3VarE.d();
                sx3VarE.b();
                ((tx3) sx3VarE.g).H(iz3Var);
                return fw3.v("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((tx3) sx3VarE.d()).a(), 2, st3.a(ds3Var.e), xr3Var.n);
            default:
                es3 es3Var = (es3) gi2Var;
                vv3 vv3Var4 = wt3.a;
                cy3 cy3VarE = dy3.E();
                hs3 hs3Var = es3Var.j;
                gy3 gy3VarB = hy3.B();
                int i3 = hs3Var.b;
                gy3VarB.b();
                ((hy3) gy3VarB.g).D(i3);
                hy3 hy3Var = (hy3) gy3VarB.d();
                cy3VarE.b();
                ((dy3) cy3VarE.g).G(hy3Var);
                byte[] bArrB3 = ((v34) es3Var.k.f).b();
                y44 y44VarN3 = a54.n(bArrB3, 0, bArrB3.length);
                cy3VarE.b();
                ((dy3) cy3VarE.g).H(y44VarN3);
                return fw3.v("type.googleapis.com/google.crypto.tink.AesEaxKey", ((dy3) cy3VarE.d()).a(), 2, wt3.a(es3Var.j.c), es3Var.m);
        }
    }
}
