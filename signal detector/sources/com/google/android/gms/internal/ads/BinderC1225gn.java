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
import q2.C2827k0;
import q2.C2841s;
import q2.InterfaceC2831m0;
import q2.InterfaceC2842s0;
import q2.InterfaceC2854y0;

/* renamed from: com.google.android.gms.internal.ads.gn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1225gn extends B7 implements InterfaceC1589nb {

    /* renamed from: a, reason: collision with root package name */
    public final String f14372a;

    /* renamed from: b, reason: collision with root package name */
    public final C1278hm f14373b;

    /* renamed from: c, reason: collision with root package name */
    public final C1492lm f14374c;

    /* renamed from: d, reason: collision with root package name */
    public final C0784Vn f14375d;

    public BinderC1225gn(String str, C1278hm c1278hm, C1492lm c1492lm, C0784Vn c0784Vn) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f14372a = str;
        this.f14373b = c1278hm;
        this.f14374c = c1492lm;
        this.f14375d = c0784Vn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final S2.a A() {
        return new S2.b(this.f14373b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final InterfaceC0601La C() {
        return this.f14373b.f14562F.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final void I() {
        this.f14373b.t();
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) throws JSONException {
        C0712Rj c0712Rj;
        C0712Rj c0712Rj2;
        C1481lb c1481lb = null;
        C2827k0 c2827k0 = null;
        switch (i) {
            case 2:
                String strB = this.f14374c.b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 3:
                List listC = this.f14374c.c();
                parcel2.writeNoException();
                parcel2.writeList(listC);
                return true;
            case 4:
                String strG = this.f14374c.g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 5:
                InterfaceC0635Na interfaceC0635NaO = this.f14374c.o();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0635NaO);
                return true;
            case 6:
                String strI = this.f14374c.i();
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            case 7:
                String strP = this.f14374c.p();
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 8:
                double dN = this.f14374c.n();
                parcel2.writeNoException();
                parcel2.writeDouble(dN);
                return true;
            case 9:
                String strL = this.f14374c.l();
                parcel2.writeNoException();
                parcel2.writeString(strL);
                return true;
            case 10:
                String strM = this.f14374c.m();
                parcel2.writeNoException();
                parcel2.writeString(strM);
                return true;
            case 11:
                q2.B0 b0X = this.f14374c.X();
                parcel2.writeNoException();
                C7.e(parcel2, b0X);
                return true;
            case 12:
                String str = this.f14372a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                I();
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC0550Ia interfaceC0550IaY = this.f14374c.Y();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0550IaY);
                return true;
            case 15:
                Bundle bundle = (Bundle) C7.b(parcel, Bundle.CREATOR);
                C7.f(parcel);
                this.f14373b.s(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) C7.b(parcel, Bundle.CREATOR);
                C7.f(parcel);
                boolean zU = this.f14373b.u(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) C7.b(parcel, Bundle.CREATOR);
                C7.f(parcel);
                this.f14373b.v(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                S2.a aVarA = A();
                parcel2.writeNoException();
                C7.e(parcel2, aVarA);
                return true;
            case 19:
                S2.a aVarK = this.f14374c.k();
                parcel2.writeNoException();
                C7.e(parcel2, aVarK);
                return true;
            case 20:
                Bundle bundleH = this.f14374c.h();
                parcel2.writeNoException();
                C7.d(parcel2, bundleH);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    c1481lb = iInterfaceQueryLocalInterface instanceof C1481lb ? (C1481lb) iInterfaceQueryLocalInterface : new C1481lb(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener", 2);
                }
                C7.f(parcel);
                P3(c1481lb);
                parcel2.writeNoException();
                return true;
            case 22:
                this.f14373b.E();
                parcel2.writeNoException();
                return true;
            case 23:
                List listS = S();
                parcel2.writeNoException();
                parcel2.writeList(listS);
                return true;
            case 24:
                boolean zM = M();
                parcel2.writeNoException();
                ClassLoader classLoader = C7.f7544a;
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 25:
                InterfaceC2831m0 interfaceC2831m0K3 = q2.K0.K3(parcel.readStrongBinder());
                C7.f(parcel);
                K3(interfaceC2831m0K3);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    c2827k0 = iInterfaceQueryLocalInterface2 instanceof C2827k0 ? (C2827k0) iInterfaceQueryLocalInterface2 : new C2827k0(strongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener", 2);
                }
                C7.f(parcel);
                L3(c2827k0);
                parcel2.writeNoException();
                return true;
            case 27:
                M3();
                parcel2.writeNoException();
                return true;
            case 28:
                N3();
                parcel2.writeNoException();
                return true;
            case 29:
                InterfaceC0601La interfaceC0601LaC = C();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0601LaC);
                return true;
            case 30:
                boolean zO3 = O3();
                parcel2.writeNoException();
                ClassLoader classLoader2 = C7.f7544a;
                parcel2.writeInt(zO3 ? 1 : 0);
                return true;
            case 31:
                InterfaceC2854y0 interfaceC2854y0K = K();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC2854y0K);
                return true;
            case 32:
                InterfaceC2842s0 interfaceC2842s0K3 = q2.T0.K3(parcel.readStrongBinder());
                C7.f(parcel);
                try {
                    if (!interfaceC2842s0K3.d()) {
                        this.f14375d.b();
                    }
                } catch (RemoteException e6) {
                    u2.k.d("Error in making CSI ping for reporting paid event callback", e6);
                }
                C1278hm c1278hm = this.f14373b;
                synchronized (c1278hm) {
                    c1278hm.f14563G.f17636a.set(interfaceC2842s0K3);
                }
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) C7.b(parcel, Bundle.CREATOR);
                C7.f(parcel);
                m2(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                C1278hm c1278hm2 = this.f14373b;
                long j6 = (c1278hm2 == null || (c0712Rj = c1278hm2.f16608j) == null) ? 0L : c0712Rj.f11035a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j6);
                return true;
            case 35:
                long j7 = parcel.readLong();
                C7.f(parcel);
                C1278hm c1278hm3 = this.f14373b;
                if (c1278hm3 != null && (c0712Rj2 = c1278hm3.f16608j) != null) {
                    c0712Rj2.a(j7);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final InterfaceC2854y0 K() {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.x7)).booleanValue()) {
            return this.f14373b.f16605f;
        }
        return null;
    }

    public final void K3(InterfaceC2831m0 interfaceC2831m0) {
        C1278hm c1278hm = this.f14373b;
        synchronized (c1278hm) {
            c1278hm.f14568n.p(interfaceC2831m0);
        }
    }

    public final void L3(C2827k0 c2827k0) {
        C1278hm c1278hm = this.f14373b;
        synchronized (c1278hm) {
            c1278hm.f14568n.i(c2827k0);
        }
    }

    public final boolean M() {
        List list;
        C1492lm c1492lm = this.f14374c;
        synchronized (c1492lm) {
            list = c1492lm.f15440f;
        }
        return (list.isEmpty() || c1492lm.f() == null) ? false : true;
    }

    public final void M3() {
        C1278hm c1278hm = this.f14373b;
        synchronized (c1278hm) {
            c1278hm.f14568n.e();
        }
    }

    public final void N3() {
        C1278hm c1278hm = this.f14373b;
        synchronized (c1278hm) {
            B7 b7 = c1278hm.f14577w;
            if (b7 == null) {
                u2.k.c("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            } else {
                c1278hm.f14566l.execute(new A1.q(c1278hm, b7 instanceof ViewTreeObserverOnGlobalLayoutListenerC1869sm, 4));
            }
        }
    }

    public final boolean O3() {
        boolean zG;
        C1278hm c1278hm = this.f14373b;
        synchronized (c1278hm) {
            zG = c1278hm.f14568n.g();
        }
        return zG;
    }

    public final void P3(C1481lb c1481lb) {
        C1278hm c1278hm = this.f14373b;
        synchronized (c1278hm) {
            c1278hm.f14568n.k(c1481lb);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final List S() {
        List list;
        C1492lm c1492lm = this.f14374c;
        synchronized (c1492lm) {
            list = c1492lm.f15440f;
        }
        return (list.isEmpty() || c1492lm.f() == null) ? Collections.EMPTY_LIST : this.f14374c.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final String b() {
        return this.f14374c.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final List d() {
        return this.f14374c.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final String e() {
        return this.f14374c.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final InterfaceC0635Na g() {
        return this.f14374c.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final String h() {
        return this.f14374c.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final String i() {
        return this.f14374c.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final String j() {
        return this.f14374c.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final double k() {
        return this.f14374c.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final InterfaceC0550Ia l() {
        return this.f14374c.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final void m2(Bundle bundle) throws JSONException {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.ke)).booleanValue()) {
            C1278hm c1278hm = this.f14373b;
            InterfaceC0828Yg interfaceC0828YgR = c1278hm.f14567m.r();
            if (interfaceC0828YgR == null) {
                u2.k.e("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                c1278hm.f14566l.execute(new RunnableC0609Li(interfaceC0828YgR, jSONObject));
            } catch (JSONException e6) {
                u2.k.f("Error reading event signals", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final String n() {
        return this.f14374c.m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final q2.B0 o() {
        return this.f14374c.X();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final S2.a u() {
        return this.f14374c.k();
    }
}
