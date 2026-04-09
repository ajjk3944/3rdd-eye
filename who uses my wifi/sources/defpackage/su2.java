package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.webkit.WebView;
import java.security.GeneralSecurityException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class su2 implements yq, f62, e73, ws2, iq3, pj, ll3, hr3, bw3, uv3, xu3 {
    public final /* synthetic */ int f;
    public static final /* synthetic */ su2 g = new su2(1);
    public static final /* synthetic */ su2 h = new su2(3);
    public static final /* synthetic */ su2 i = new su2(5);
    public static final /* synthetic */ su2 j = new su2(7);
    public static final /* synthetic */ su2 k = new su2(9);
    public static final /* synthetic */ su2 l = new su2(10);
    public static final /* synthetic */ su2 m = new su2(13);
    public static final /* synthetic */ su2 n = new su2(15);
    public static final /* synthetic */ su2 o = new su2(16);
    public static final /* synthetic */ su2 p = new su2(17);
    public static final /* synthetic */ su2 q = new su2(18);
    public static final /* synthetic */ su2 r = new su2(19);
    public static final /* synthetic */ su2 s = new su2(20);
    public static final /* synthetic */ su2 t = new su2(21);
    public static final /* synthetic */ su2 u = new su2(22);
    public static final /* synthetic */ su2 v = new su2(23);
    public static final /* synthetic */ su2 w = new su2(24);
    public static final /* synthetic */ su2 x = new su2(25);
    public static final /* synthetic */ su2 y = new su2(26);
    public static final /* synthetic */ su2 z = new su2(27);
    public static final /* synthetic */ su2 A = new su2(28);
    public static final /* synthetic */ su2 B = new su2(29);

    public /* synthetic */ su2(int i2) {
        this.f = i2;
    }

    public static boolean d(Context context) {
        if (((Boolean) tw1.e.c.a(mz1.G5)).booleanValue()) {
            Boolean bool = (Boolean) r(new lz1(context, 1));
            return bool != null && bool.booleanValue();
        }
        gi2.i0("Omid flag is disabled");
        return false;
    }

    public static String h() {
        if (((Boolean) tw1.e.c.a(mz1.G5)).booleanValue()) {
            return "a.1.5.2-google_20241009";
        }
        return null;
    }

    public static xz2 i(int i2, int i3, WebView webView, String str, String str2, String str3) {
        if (((Boolean) tw1.e.c.a(mz1.G5)).booleanValue() && m54.f.g) {
            return (xz2) r(new ue0(i3, i2, webView, str, str2, str3));
        }
        return null;
    }

    public static void j(xb3 xb3Var) {
        if (((Boolean) tw1.e.c.a(mz1.G5)).booleanValue() && m54.f.g) {
            t(new qz2(xb3Var, 0));
        }
    }

    public static void k(xb3 xb3Var, View view) {
        t(new rz2(xb3Var, view, 1));
    }

    public static dc3 n(String str) {
        return "native".equals(str) ? dc3.g : "javascript".equals(str) ? dc3.h : dc3.i;
    }

    public static bc3 o(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    return bc3.j;
                }
            } else if (str.equals("definedByJavascript")) {
                return bc3.g;
            }
        } else if (str.equals("beginToRender")) {
            return bc3.i;
        }
        return bc3.h;
    }

    public static yb3 q(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return yb3.h;
            }
            return null;
        }
        if (iHashCode == 112202875) {
            if (str.equals("video")) {
                return yb3.j;
            }
            return null;
        }
        if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
            return yb3.i;
        }
        return null;
    }

    public static final Object r(tz2 tz2Var) {
        try {
            return tz2Var.mo18a();
        } catch (RuntimeException e) {
            hg4.C.h.e("omid exception", e);
            return null;
        }
    }

    public static final void t(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            hg4.C.h.e("omid exception", e);
        }
    }

    @Override // defpackage.hr3
    /* renamed from: a, reason: collision with other method in class */
    public void mo15a() {
        nv3.b.a().getClass();
    }

    @Override // defpackage.bw3
    /* renamed from: b */
    public Object mo19b(gi2 gi2Var) throws GeneralSecurityException {
        byte[] bArrB;
        switch (this.f) {
            case 15:
                rs3 rs3Var = (rs3) gi2Var;
                su3 su3Var = rr3.a;
                return bu3.f.get() != null ? new bu3(((v34) rs3Var.k.f).b(), rs3Var.l.b()) : new gu3(3, ((v34) rs3Var.k.f).b(), rs3Var.l.b());
            case 16:
                is3 is3Var = (is3) gi2Var;
                is3Var.getClass();
                return new gu3(((v34) is3Var.k.f).b(), is3Var.l);
            case 17:
                return j34.a((xr3) gi2Var);
            case 18:
                fw3 fw3Var = ((fv3) gi2Var).j;
                int[] iArr = dv3.b;
                int i2 = fw3Var.f;
                Integer num = (Integer) fw3Var.k;
                int i3 = iArr[ex0.s(i2)];
                cr3 cr3Var = (cr3) vu3.d.b(cr3.class, (String) fw3Var.g).a((a54) fw3Var.i);
                i04 i04Var = (i04) fw3Var.j;
                int iOrdinal = i04Var.ordinal();
                if (iOrdinal == 1) {
                    bArrB = sv3.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    bArrB = sv3.a(num.intValue()).b();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(i04Var)));
                    }
                    bArrB = sv3.a(num.intValue()).b();
                } else {
                    bArrB = sv3.a.b();
                }
                return new gu3(cr3Var, bArrB);
            case 19:
                return f34.a((es3) gi2Var);
            case 20:
                return ku3.a((ns3) gi2Var);
            case zy1.zzm /* 21 */:
                aw3 aw3Var = vs3.a;
                kr3.a(((ys3) gi2Var).j.a);
                throw null;
            default:
                mt3 mt3Var = (mt3) gi2Var;
                mt3Var.getClass();
                return new hu3(((v34) mt3Var.k.f).b(), mt3Var.l, mt3Var.j.b);
        }
    }

    @Override // defpackage.e73
    /* renamed from: c */
    public /* synthetic */ void mo17c(Object obj) {
        switch (this.f) {
            case 5:
                ((d32) obj).g();
                break;
            case 6:
            default:
                ((si0) obj).l();
                break;
            case 7:
                ((ye4) obj).M1();
                break;
        }
    }

    @Override // defpackage.uv3
    public mr3 e(gw3 gw3Var) throws GeneralSecurityException {
        switch (this.f) {
            case 22:
                vv3 vv3Var = bt3.a;
                qz3 qz3Var = (qz3) gw3Var.h;
                if (!qz3Var.A().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var.A())));
                }
                try {
                    a54 a54VarB = qz3Var.B();
                    h54 h54Var = h54.a;
                    int i2 = u44.a;
                    return new at3(d04.B(a54VarB, h54.b).A(), bt3.b(qz3Var.C()));
                } catch (a64 e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            case 24:
                vv3 vv3Var2 = et3.a;
                qz3 qz3Var2 = (qz3) gw3Var.h;
                if (!qz3Var2.A().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var2.A())));
                }
                try {
                    a54 a54VarB2 = qz3Var2.B();
                    h54 h54Var2 = h54.a;
                    int i3 = u44.a;
                    return et3.c(h04.C(a54VarB2, h54.b), qz3Var2.C());
                } catch (a64 e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
                }
            case 27:
                vv3 vv3Var3 = st3.a;
                qz3 qz3Var3 = (qz3) gw3Var.h;
                if (!qz3Var3.A().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var3.A())));
                }
                try {
                    a54 a54VarB3 = qz3Var3.B();
                    h54 h54Var3 = h54.a;
                    int i4 = u44.a;
                    vx3 vx3VarC = vx3.C(a54VarB3, h54.b);
                    if (vx3VarC.B().C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    bu1 bu1Var = new bu1(11);
                    bu1Var.k(vx3VarC.A().B());
                    bu1Var.r(vx3VarC.B().B());
                    bu1Var.u(vx3VarC.A().A().A());
                    bu1Var.v(vx3VarC.B().A().B());
                    bu1Var.k = st3.c(vx3VarC.B().A().A());
                    bu1Var.l = st3.b(qz3Var3.C());
                    return bu1Var.x();
                } catch (a64 e3) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e3);
                }
            default:
                vv3 vv3Var4 = wt3.a;
                qz3 qz3Var4 = (qz3) gw3Var.h;
                if (!qz3Var4.A().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var4.A())));
                }
                try {
                    a54 a54VarB4 = qz3Var4.B();
                    h54 h54Var4 = h54.a;
                    int i5 = u44.a;
                    fy3 fy3VarC = fy3.C(a54VarB4, h54.b);
                    p21 p21Var = new p21(24);
                    p21Var.A(fy3VarC.B());
                    p21Var.D(fy3VarC.A().A());
                    p21Var.F();
                    p21Var.i = wt3.b(qz3Var4.C());
                    return p21Var.K();
                } catch (a64 e4) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e4);
                }
        }
    }

    @Override // defpackage.pj
    public /* synthetic */ Object f(gi4 gi4Var) {
        return new Boolean(gi4Var.c());
    }

    @Override // defpackage.xu3
    public gi2 g(fw3 fw3Var) throws GeneralSecurityException {
        switch (this.f) {
            case 23:
                vv3 vv3Var = bt3.a;
                if (!((String) fw3Var.g).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    a54 a54Var = (a54) fw3Var.i;
                    h54 h54Var = h54.a;
                    int i2 = u44.a;
                    b04 b04VarC = b04.C(a54Var, h54.b);
                    if (b04VarC.A() == 0) {
                        return ys3.s0(new at3(b04VarC.B().A(), bt3.b((i04) fw3Var.j)), (Integer) fw3Var.k);
                    }
                    String strValueOf = String.valueOf(b04VarC);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
                    sb.append("KmsAeadKey are only accepted with version 0, got ");
                    sb.append(strValueOf);
                    throw new GeneralSecurityException(sb.toString());
                } catch (a64 e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            case 24:
            default:
                vv3 vv3Var2 = st3.a;
                if (!((String) fw3Var.g).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    a54 a54Var2 = (a54) fw3Var.i;
                    h54 h54Var2 = h54.a;
                    int i3 = u44.a;
                    tx3 tx3VarD = tx3.D(a54Var2, h54.b);
                    if (tx3VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (tx3VarD.B().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (tx3VarD.C().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    bu1 bu1Var = new bu1(11);
                    bu1Var.k(tx3VarD.B().C().d());
                    bu1Var.r(tx3VarD.C().C().d());
                    bu1Var.u(tx3VarD.B().B().A());
                    bu1Var.v(tx3VarD.C().B().B());
                    bu1Var.k = st3.c(tx3VarD.C().B().A());
                    bu1Var.l = st3.b((i04) fw3Var.j);
                    ds3 ds3VarX = bu1Var.x();
                    mc2 mc2Var = new mc2(23);
                    mc2Var.g = ds3VarX;
                    mc2Var.h = yf3.b(tx3VarD.B().C().p());
                    mc2Var.i = yf3.b(tx3VarD.C().C().p());
                    mc2Var.j = (Integer) fw3Var.k;
                    return mc2Var.y();
                } catch (a64 unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 25:
                vv3 vv3Var3 = et3.a;
                if (!((String) fw3Var.g).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    a54 a54Var3 = (a54) fw3Var.i;
                    h54 h54Var3 = h54.a;
                    int i4 = u44.a;
                    f04 f04VarC = f04.C(a54Var3, h54.b);
                    if (f04VarC.A() == 0) {
                        return ct3.s0(et3.c(f04VarC.B(), (i04) fw3Var.j), (Integer) fw3Var.k);
                    }
                    String strValueOf2 = String.valueOf(f04VarC);
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 58);
                    sb2.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                    sb2.append(strValueOf2);
                    throw new GeneralSecurityException(sb2.toString());
                } catch (a64 e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                }
        }
    }

    @Override // defpackage.yq
    public int l(Context context) {
        return ar.a(context);
    }

    @Override // defpackage.yq
    public int m(Context context, boolean z2) {
        return ar.d(context, z2);
    }

    @Override // defpackage.iq3
    public /* synthetic */ void p(Object obj) {
        gi2.G("Notification of cache hit successful.");
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        gi2.G("Notification of cache hit failed.");
    }

    @Override // defpackage.f62
    public /* synthetic */ Object x(JSONObject jSONObject) {
        return new ga2(jSONObject);
    }

    @Override // defpackage.eu2
    /* renamed from: a */
    public Object mo18a() {
        switch (this.f) {
            case 6:
                dk2 dk2Var = ok2.b;
                pu1.s(dk2Var);
                return new lx2(dk2Var);
            case 11:
                return -1;
            case 12:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            default:
                throw new IllegalStateException();
        }
    }
}
