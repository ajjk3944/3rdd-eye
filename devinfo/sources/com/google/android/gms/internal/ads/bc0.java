package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bc0 extends mg implements xn {

    /* renamed from: a, reason: collision with root package name */
    public final String f9645a;

    /* renamed from: b, reason: collision with root package name */
    public final ca0 f9646b;

    /* renamed from: c, reason: collision with root package name */
    public final ga0 f9647c;

    /* renamed from: d, reason: collision with root package name */
    public final qd0 f9648d;

    public bc0(String str, ca0 ca0Var, ga0 ga0Var, qd0 qd0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f9645a = str;
        this.f9646b = ca0Var;
        this.f9647c = ga0Var;
        this.f9648d = qd0Var;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final String A1() {
        return this.f9647c.p();
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final String B1() {
        return this.f9647c.l();
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final String C1() {
        return this.f9647c.i();
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final double D1() {
        return this.f9647c.n();
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final tm E1() {
        return this.f9647c.Y();
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final String F1() {
        return this.f9647c.m();
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final va.a2 G1() {
        return this.f9647c.X();
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final void J2(Bundle bundle) throws JSONException {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16232me)).booleanValue()) {
            ca0 ca0Var = this.f9646b;
            qz qzVarR = ca0Var.f10023m.r();
            if (qzVarR == null) {
                za.i.e("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                ca0Var.f10022l.execute(new h30(qzVarR, jSONObject));
            } catch (JSONException e2) {
                za.i.f("Error reading event signals", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final vb.a M1() {
        return new vb.b(this.f9646b);
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final String c() {
        return this.f9647c.b();
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final List d() {
        return this.f9647c.c();
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final void d2(va.r1 r1Var) {
        try {
            if (!r1Var.d()) {
                this.f9648d.b();
            }
        } catch (RemoteException e2) {
            za.i.d("Error in making CSI ping for reporting paid event callback", e2);
        }
        ca0 ca0Var = this.f9646b;
        synchronized (ca0Var) {
            ca0Var.G.f17640a.set(r1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final String e() {
        return this.f9647c.g();
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) throws JSONException {
        boolean zZ1;
        o50 o50Var;
        o50 o50Var2;
        vn vnVar = null;
        va.j1 j1Var = null;
        switch (i4) {
            case 2:
                String strB = this.f9647c.b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 3:
                List listC = this.f9647c.c();
                parcel2.writeNoException();
                parcel2.writeList(listC);
                return true;
            case 4:
                String strG = this.f9647c.g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 5:
                xm xmVarO = this.f9647c.o();
                parcel2.writeNoException();
                ng.e(parcel2, xmVarO);
                return true;
            case 6:
                String strI = this.f9647c.i();
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            case 7:
                String strP = this.f9647c.p();
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 8:
                double dN = this.f9647c.n();
                parcel2.writeNoException();
                parcel2.writeDouble(dN);
                return true;
            case 9:
                String strL = this.f9647c.l();
                parcel2.writeNoException();
                parcel2.writeString(strL);
                return true;
            case 10:
                String strM = this.f9647c.m();
                parcel2.writeNoException();
                parcel2.writeString(strM);
                return true;
            case 11:
                va.a2 a2VarX = this.f9647c.X();
                parcel2.writeNoException();
                ng.e(parcel2, a2VarX);
                return true;
            case 12:
                String str = this.f9645a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                this.f9646b.s();
                parcel2.writeNoException();
                return true;
            case 14:
                tm tmVarY = this.f9647c.Y();
                parcel2.writeNoException();
                ng.e(parcel2, tmVarY);
                return true;
            case 15:
                Bundle bundle = (Bundle) ng.b(parcel, Bundle.CREATOR);
                ng.f(parcel);
                this.f9646b.r(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) ng.b(parcel, Bundle.CREATOR);
                ng.f(parcel);
                boolean zT = this.f9646b.t(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) ng.b(parcel, Bundle.CREATOR);
                ng.f(parcel);
                this.f9646b.u(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                vb.a aVarM1 = M1();
                parcel2.writeNoException();
                ng.e(parcel2, aVarM1);
                return true;
            case 19:
                vb.a aVarK = this.f9647c.k();
                parcel2.writeNoException();
                ng.e(parcel2, aVarK);
                return true;
            case 20:
                Bundle bundleH = this.f9647c.h();
                parcel2.writeNoException();
                ng.d(parcel2, bundleH);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    vnVar = iInterfaceQueryLocalInterface instanceof vn ? (vn) iInterfaceQueryLocalInterface : new vn(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener", 1);
                }
                ng.f(parcel);
                l4(vnVar);
                parcel2.writeNoException();
                return true;
            case 22:
                this.f9646b.D();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZ = z();
                parcel2.writeNoException();
                parcel2.writeList(listZ);
                return true;
            case 24:
                boolean zU = u();
                parcel2.writeNoException();
                ClassLoader classLoader = ng.f14287a;
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 25:
                va.l1 l1VarH4 = va.j2.h4(parcel.readStrongBinder());
                ng.f(parcel);
                h4(l1VarH4);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    j1Var = iInterfaceQueryLocalInterface2 instanceof va.j1 ? (va.j1) iInterfaceQueryLocalInterface2 : new va.j1(strongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener", 1);
                }
                ng.f(parcel);
                i4(j1Var);
                parcel2.writeNoException();
                return true;
            case 27:
                j4();
                parcel2.writeNoException();
                return true;
            case 28:
                k4();
                parcel2.writeNoException();
                return true;
            case 29:
                vm vmVarA = this.f9646b.F.a();
                parcel2.writeNoException();
                ng.e(parcel2, vmVarA);
                return true;
            case 30:
                ca0 ca0Var = this.f9646b;
                synchronized (ca0Var) {
                    zZ1 = ca0Var.f10024n.z1();
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = ng.f14287a;
                parcel2.writeInt(zZ1 ? 1 : 0);
                return true;
            case 31:
                va.x1 x1VarT = t();
                parcel2.writeNoException();
                ng.e(parcel2, x1VarT);
                return true;
            case 32:
                va.r1 r1VarH4 = va.s2.h4(parcel.readStrongBinder());
                ng.f(parcel);
                d2(r1VarH4);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) ng.b(parcel, Bundle.CREATOR);
                ng.f(parcel);
                J2(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                ca0 ca0Var2 = this.f9646b;
                long j = (ca0Var2 == null || (o50Var = ca0Var2.j) == null) ? 0L : o50Var.f14565a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j);
                return true;
            case 35:
                long j8 = parcel.readLong();
                ng.f(parcel);
                ca0 ca0Var3 = this.f9646b;
                if (ca0Var3 != null && (o50Var2 = ca0Var3.j) != null) {
                    o50Var2.a(j8);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final void h4(va.l1 l1Var) {
        ca0 ca0Var = this.f9646b;
        synchronized (ca0Var) {
            ca0Var.f10024n.p(l1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final vb.a i() {
        return this.f9647c.k();
    }

    public final void i4(va.j1 j1Var) {
        ca0 ca0Var = this.f9646b;
        synchronized (ca0Var) {
            ca0Var.f10024n.h(j1Var);
        }
    }

    public final void j4() {
        ca0 ca0Var = this.f9646b;
        synchronized (ca0Var) {
            ca0Var.f10024n.e();
        }
    }

    public final void k4() {
        ca0 ca0Var = this.f9646b;
        synchronized (ca0Var) {
            mg mgVar = ca0Var.f10033w;
            if (mgVar == null) {
                za.i.c("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            } else {
                ca0Var.f10022l.execute(new bi.a(2, ca0Var, mgVar instanceof na0));
            }
        }
    }

    public final void l4(vn vnVar) {
        ca0 ca0Var = this.f9646b;
        synchronized (ca0Var) {
            ca0Var.f10024n.k(vnVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final va.x1 t() {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16401x7)).booleanValue()) {
            return this.f9646b.f14537f;
        }
        return null;
    }

    public final boolean u() {
        List list;
        ga0 ga0Var = this.f9647c;
        synchronized (ga0Var) {
            list = ga0Var.f11418f;
        }
        return (list.isEmpty() || ga0Var.f() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final List z() {
        List list;
        ga0 ga0Var = this.f9647c;
        synchronized (ga0Var) {
            list = ga0Var.f11418f;
        }
        return (list.isEmpty() || ga0Var.f() == null) ? Collections.EMPTY_LIST : this.f9647c.e();
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final xm z1() {
        return this.f9647c.o();
    }
}
