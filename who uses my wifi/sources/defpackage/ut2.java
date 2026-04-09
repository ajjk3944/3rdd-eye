package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ut2 extends hv1 implements f32 {
    public final String f;
    public final pr2 g;
    public final tr2 h;
    public final mv2 i;

    public ut2(String str, pr2 pr2Var, tr2 tr2Var, mv2 mv2Var) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f = str;
        this.g = pr2Var;
        this.h = tr2Var;
        this.i = mv2Var;
    }

    @Override // defpackage.f32
    public final z12 A() {
        z12 z12Var;
        rr2 rr2Var = this.g.F;
        synchronized (rr2Var) {
            z12Var = rr2Var.a;
        }
        return z12Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) throws JSONException {
        List list;
        b22 b22Var;
        double d;
        String strP;
        String strP2;
        u10 u10Var;
        List list2;
        c63 c63Var;
        boolean zF;
        gm2 gm2Var;
        gm2 gm2Var2;
        int i2 = 0;
        a32 a32Var = null;
        oo2 oo2Var = null;
        switch (i) {
            case 2:
                String strA = this.h.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 3:
                tr2 tr2Var = this.h;
                synchronized (tr2Var) {
                    list = tr2Var.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                String strC = this.h.c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 5:
                tr2 tr2Var2 = this.h;
                synchronized (tr2Var2) {
                    b22Var = tr2Var2.s;
                }
                parcel2.writeNoException();
                iv1.e(parcel2, b22Var);
                return true;
            case 6:
                String strE = this.h.e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 7:
                String strF = this.h.f();
                parcel2.writeNoException();
                parcel2.writeString(strF);
                return true;
            case 8:
                tr2 tr2Var3 = this.h;
                synchronized (tr2Var3) {
                    d = tr2Var3.r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                tr2 tr2Var4 = this.h;
                synchronized (tr2Var4) {
                    strP = tr2Var4.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 10:
                tr2 tr2Var5 = this.h;
                synchronized (tr2Var5) {
                    strP2 = tr2Var5.p("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP2);
                return true;
            case 11:
                py2 py2VarR = this.h.r();
                parcel2.writeNoException();
                iv1.e(parcel2, py2VarR);
                return true;
            case 12:
                String str = this.f;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                this.g.o();
                parcel2.writeNoException();
                return true;
            case 14:
                x12 x12VarS = this.h.s();
                parcel2.writeNoException();
                iv1.e(parcel2, x12VarS);
                return true;
            case 15:
                Bundle bundle = (Bundle) iv1.b(parcel, Bundle.CREATOR);
                iv1.f(parcel);
                pr2 pr2Var = this.g;
                synchronized (pr2Var) {
                    pr2Var.n.n(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) iv1.b(parcel, Bundle.CREATOR);
                iv1.f(parcel);
                boolean zP = this.g.p(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) iv1.b(parcel, Bundle.CREATOR);
                iv1.f(parcel);
                pr2 pr2Var2 = this.g;
                synchronized (pr2Var2) {
                    pr2Var2.n.k(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 18:
                u10 u10VarV = v();
                parcel2.writeNoException();
                iv1.e(parcel2, u10VarV);
                return true;
            case 19:
                tr2 tr2Var6 = this.h;
                synchronized (tr2Var6) {
                    u10Var = tr2Var6.q;
                }
                parcel2.writeNoException();
                iv1.e(parcel2, u10Var);
                return true;
            case 20:
                Bundle bundleD = this.h.d();
                parcel2.writeNoException();
                iv1.d(parcel2, bundleD);
                return true;
            case zy1.zzm /* 21 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    a32Var = iInterfaceQueryLocalInterface instanceof a32 ? (a32) iInterfaceQueryLocalInterface : new a32(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener", 2);
                }
                iv1.f(parcel);
                D3(a32Var);
                parcel2.writeNoException();
                return true;
            case 22:
                pr2 pr2Var3 = this.g;
                synchronized (pr2Var3) {
                    pr2Var3.n.x();
                }
                parcel2.writeNoException();
                return true;
            case 23:
                List listX = X();
                parcel2.writeNoException();
                parcel2.writeList(listX);
                return true;
            case 24:
                tr2 tr2Var7 = this.h;
                synchronized (tr2Var7) {
                    list2 = tr2Var7.f;
                }
                if (!list2.isEmpty()) {
                    synchronized (tr2Var7) {
                        c63Var = tr2Var7.g;
                    }
                    if (c63Var != null) {
                        i2 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader = iv1.a;
                parcel2.writeInt(i2);
                return true;
            case 25:
                nq2 nq2VarB3 = c63.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                B3(nq2VarB3);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    oo2Var = iInterfaceQueryLocalInterface2 instanceof oo2 ? (oo2) iInterfaceQueryLocalInterface2 : new oo2(strongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener", 2);
                }
                iv1.f(parcel);
                C3(oo2Var);
                parcel2.writeNoException();
                return true;
            case 27:
                pr2 pr2Var4 = this.g;
                synchronized (pr2Var4) {
                    pr2Var4.n.e();
                }
                parcel2.writeNoException();
                return true;
            case 28:
                pr2 pr2Var5 = this.g;
                synchronized (pr2Var5) {
                    hv1 hv1Var = pr2Var5.w;
                    if (hv1Var == null) {
                        gi2.U("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    } else {
                        pr2Var5.l.execute(new n82(pr2Var5, hv1Var instanceof as2, 1));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 29:
                z12 z12VarA = A();
                parcel2.writeNoException();
                iv1.e(parcel2, z12VarA);
                return true;
            case 30:
                pr2 pr2Var6 = this.g;
                synchronized (pr2Var6) {
                    zF = pr2Var6.n.f();
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = iv1.a;
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case 31:
                tx2 tx2VarH = H();
                parcel2.writeNoException();
                iv1.e(parcel2, tx2VarH);
                return true;
            case 32:
                zu2 zu2VarB3 = kd3.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                try {
                    if (!zu2VarB3.c()) {
                        this.i.b();
                    }
                } catch (RemoteException unused) {
                    gi2.q0(3);
                }
                pr2 pr2Var7 = this.g;
                synchronized (pr2Var7) {
                    pr2Var7.G.f.set(zu2VarB3);
                }
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) iv1.b(parcel, Bundle.CREATOR);
                iv1.f(parcel);
                O0(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                pr2 pr2Var8 = this.g;
                long j = (pr2Var8 == null || (gm2Var = pr2Var8.j) == null) ? 0L : gm2Var.a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j);
                return true;
            case 35:
                long j2 = parcel.readLong();
                iv1.f(parcel);
                pr2 pr2Var9 = this.g;
                if (pr2Var9 != null && (gm2Var2 = pr2Var9.j) != null) {
                    gm2Var2.a(j2);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final void B3(nq2 nq2Var) {
        pr2 pr2Var = this.g;
        synchronized (pr2Var) {
            pr2Var.n.l(nq2Var);
        }
    }

    public final void C3(oo2 oo2Var) {
        pr2 pr2Var = this.g;
        synchronized (pr2Var) {
            pr2Var.n.b(oo2Var);
        }
    }

    public final void D3(a32 a32Var) {
        pr2 pr2Var = this.g;
        synchronized (pr2Var) {
            pr2Var.n.i(a32Var);
        }
    }

    @Override // defpackage.f32
    public final tx2 H() {
        if (((Boolean) tw1.e.c.a(mz1.d7)).booleanValue()) {
            return this.g.f;
        }
        return null;
    }

    @Override // defpackage.f32
    public final void O0(Bundle bundle) throws JSONException {
        if (((Boolean) tw1.e.c.a(mz1.Nd)).booleanValue()) {
            pr2 pr2Var = this.g;
            ag2 ag2VarH = pr2Var.m.h();
            if (ag2VarH == null) {
                gi2.Z("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                pr2Var.l.execute(new tj2(ag2VarH, jSONObject));
            } catch (JSONException e) {
                gi2.c0("Error reading event signals", e);
            }
        }
    }

    @Override // defpackage.f32
    public final List X() {
        List list;
        c63 c63Var;
        List list2;
        tr2 tr2Var = this.h;
        synchronized (tr2Var) {
            list = tr2Var.f;
        }
        if (!list.isEmpty()) {
            synchronized (tr2Var) {
                c63Var = tr2Var.g;
            }
            if (c63Var != null) {
                tr2 tr2Var2 = this.h;
                synchronized (tr2Var2) {
                    list2 = tr2Var2.f;
                }
                return list2;
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.f32
    public final String b() {
        return this.h.a();
    }

    @Override // defpackage.f32
    public final List c() {
        List list;
        tr2 tr2Var = this.h;
        synchronized (tr2Var) {
            list = tr2Var.e;
        }
        return list;
    }

    @Override // defpackage.f32
    public final String e() {
        return this.h.c();
    }

    @Override // defpackage.f32
    public final b22 f() {
        b22 b22Var;
        tr2 tr2Var = this.h;
        synchronized (tr2Var) {
            b22Var = tr2Var.s;
        }
        return b22Var;
    }

    @Override // defpackage.f32
    public final String g() {
        return this.h.f();
    }

    @Override // defpackage.f32
    public final String i() {
        String strP;
        tr2 tr2Var = this.h;
        synchronized (tr2Var) {
            strP = tr2Var.p("store");
        }
        return strP;
    }

    @Override // defpackage.f32
    public final String j() {
        return this.h.e();
    }

    @Override // defpackage.f32
    public final double k() {
        double d;
        tr2 tr2Var = this.h;
        synchronized (tr2Var) {
            d = tr2Var.r;
        }
        return d;
    }

    @Override // defpackage.f32
    public final x12 m() {
        return this.h.s();
    }

    @Override // defpackage.f32
    public final String n() {
        String strP;
        tr2 tr2Var = this.h;
        synchronized (tr2Var) {
            strP = tr2Var.p("price");
        }
        return strP;
    }

    @Override // defpackage.f32
    public final py2 o() {
        return this.h.r();
    }

    @Override // defpackage.f32
    public final u10 s() {
        u10 u10Var;
        tr2 tr2Var = this.h;
        synchronized (tr2Var) {
            u10Var = tr2Var.q;
        }
        return u10Var;
    }

    @Override // defpackage.f32
    public final u10 v() {
        return new oi0(this.g);
    }
}
