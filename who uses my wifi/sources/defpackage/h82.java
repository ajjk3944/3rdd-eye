package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h82 extends hv1 implements d82 {
    public static final /* synthetic */ int g = 0;
    public final RtbAdapter f;

    public h82(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f = rtbAdapter;
    }

    public static final void C3(String str) throws RemoteException {
        gi2.i0("Server parameters: ".concat(String.valueOf(str)));
        try {
            new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            }
        } catch (JSONException e) {
            gi2.c0("", e);
            throw new RemoteException();
        }
    }

    public static final void D3(pc4 pc4Var) {
        if (pc4Var.k) {
            return;
        }
        j63 j63Var = sv1.f.a;
        j63.n();
    }

    public static final void E3(String str, pc4 pc4Var) throws JSONException {
        String str2 = pc4Var.z;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        f82 e82Var;
        v72 u72Var;
        r72 q72Var;
        f82 f82Var = null;
        r72 r72Var = null;
        z72 y72Var = null;
        t72 s72Var = null;
        b82 a82Var = null;
        z72 y72Var2 = null;
        b82 a82Var2 = null;
        v72 v72Var = null;
        t72 s72Var2 = null;
        if (i == 1) {
            u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) iv1.b(parcel, creator);
            Bundle bundle2 = (Bundle) iv1.b(parcel, creator);
            xe4 xe4Var = (xe4) iv1.b(parcel, xe4.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                e82Var = f82Var;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (iInterfaceQueryLocalInterface instanceof f82) {
                    f82Var = (f82) iInterfaceQueryLocalInterface;
                    e82Var = f82Var;
                } else {
                    e82Var = new e82(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback", 2);
                }
            }
            iv1.f(parcel);
            q3(u10VarX0, string, bundle, bundle2, xe4Var, e82Var);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            c();
            throw null;
        }
        if (i == 3) {
            e();
            throw null;
        }
        if (i == 5) {
            py2 py2VarF = f();
            parcel2.writeNoException();
            iv1.e(parcel2, py2VarF);
            return true;
        }
        if (i == 10) {
            oi0.X0(parcel.readStrongBinder());
            iv1.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i == 11) {
            parcel.createStringArray();
            iv1.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 13:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                pc4 pc4Var = (pc4) iv1.b(parcel, pc4.CREATOR);
                u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    s72Var2 = iInterfaceQueryLocalInterface2 instanceof t72 ? (t72) iInterfaceQueryLocalInterface2 : new s72(strongBinder2);
                }
                t72 t72Var = s72Var2;
                z62 z62VarB3 = y62.B3(parcel.readStrongBinder());
                xe4 xe4Var2 = (xe4) iv1.b(parcel, xe4.CREATOR);
                iv1.f(parcel);
                y1(string2, string3, pc4Var, u10VarX02, t72Var, z62VarB3, xe4Var2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                pc4 pc4Var2 = (pc4) iv1.b(parcel, pc4.CREATOR);
                u10 u10VarX03 = oi0.X0(parcel.readStrongBinder());
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    u72Var = v72Var;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if (iInterfaceQueryLocalInterface3 instanceof v72) {
                        v72Var = (v72) iInterfaceQueryLocalInterface3;
                        u72Var = v72Var;
                    } else {
                        u72Var = new u72(strongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback", 2);
                    }
                }
                z62 z62VarB32 = y62.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                B0(string4, string5, pc4Var2, u10VarX03, u72Var, z62VarB32);
                parcel2.writeNoException();
                return true;
            case 15:
                oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 16:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                pc4 pc4Var3 = (pc4) iv1.b(parcel, pc4.CREATOR);
                u10 u10VarX04 = oi0.X0(parcel.readStrongBinder());
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    a82Var2 = iInterfaceQueryLocalInterface4 instanceof b82 ? (b82) iInterfaceQueryLocalInterface4 : new a82(strongBinder4);
                }
                b82 b82Var = a82Var2;
                z62 z62VarB33 = y62.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                g2(string6, string7, pc4Var3, u10VarX04, b82Var, z62VarB33);
                parcel2.writeNoException();
                return true;
            case 17:
                oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 18:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                pc4 pc4Var4 = (pc4) iv1.b(parcel, pc4.CREATOR);
                u10 u10VarX05 = oi0.X0(parcel.readStrongBinder());
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    y72Var2 = iInterfaceQueryLocalInterface5 instanceof z72 ? (z72) iInterfaceQueryLocalInterface5 : new y72(strongBinder5);
                }
                z72 z72Var = y72Var2;
                z62 z62VarB34 = y62.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                L1(string8, string9, pc4Var4, u10VarX05, z72Var, z62VarB34, null);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.readString();
                iv1.f(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                pc4 pc4Var5 = (pc4) iv1.b(parcel, pc4.CREATOR);
                u10 u10VarX06 = oi0.X0(parcel.readStrongBinder());
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    a82Var = iInterfaceQueryLocalInterface6 instanceof b82 ? (b82) iInterfaceQueryLocalInterface6 : new a82(strongBinder6);
                }
                b82 b82Var2 = a82Var;
                z62 z62VarB35 = y62.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                F2(string10, string11, pc4Var5, u10VarX06, b82Var2, z62VarB35);
                parcel2.writeNoException();
                return true;
            case zy1.zzm /* 21 */:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                pc4 pc4Var6 = (pc4) iv1.b(parcel, pc4.CREATOR);
                u10 u10VarX07 = oi0.X0(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    s72Var = iInterfaceQueryLocalInterface7 instanceof t72 ? (t72) iInterfaceQueryLocalInterface7 : new s72(strongBinder7);
                }
                t72 t72Var2 = s72Var;
                z62 z62VarB36 = y62.B3(parcel.readStrongBinder());
                xe4 xe4Var3 = (xe4) iv1.b(parcel, xe4.CREATOR);
                iv1.f(parcel);
                P1(string12, string13, pc4Var6, u10VarX07, t72Var2, z62VarB36, xe4Var3);
                parcel2.writeNoException();
                return true;
            case 22:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                pc4 pc4Var7 = (pc4) iv1.b(parcel, pc4.CREATOR);
                u10 u10VarX08 = oi0.X0(parcel.readStrongBinder());
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    y72Var = iInterfaceQueryLocalInterface8 instanceof z72 ? (z72) iInterfaceQueryLocalInterface8 : new y72(strongBinder8);
                }
                z72 z72Var2 = y72Var;
                z62 z62VarB37 = y62.B3(parcel.readStrongBinder());
                r12 r12Var = (r12) iv1.b(parcel, r12.CREATOR);
                iv1.f(parcel);
                L1(string14, string15, pc4Var7, u10VarX08, z72Var2, z62VarB37, r12Var);
                parcel2.writeNoException();
                return true;
            case 23:
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                pc4 pc4Var8 = (pc4) iv1.b(parcel, pc4.CREATOR);
                u10 u10VarX09 = oi0.X0(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 == null) {
                    q72Var = r72Var;
                } else {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    if (iInterfaceQueryLocalInterface9 instanceof r72) {
                        r72Var = (r72) iInterfaceQueryLocalInterface9;
                        q72Var = r72Var;
                    } else {
                        q72Var = new q72(strongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback", 2);
                    }
                }
                z62 z62VarB38 = y62.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                f2(string16, string17, pc4Var8, u10VarX09, q72Var, z62VarB38);
                parcel2.writeNoException();
                return true;
            case 24:
                oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.d82
    public final void B0(String str, String str2, pc4 pc4Var, u10 u10Var, v72 v72Var, z62 z62Var) throws RemoteException {
        try {
            z71 z71Var = new z71(this, v72Var);
            RtbAdapter rtbAdapter = this.f;
            C3(str2);
            B3(pc4Var);
            D3(pc4Var);
            E3(str2, pc4Var);
            rtbAdapter.loadRtbInterstitialAd(new gd0(), z71Var);
        } catch (Throwable th) {
            gi2.c0("Adapter failed to render interstitial ad.", th);
            gi2.E(u10Var, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    public final void B3(pc4 pc4Var) {
        Bundle bundle = pc4Var.r;
        if (bundle == null || bundle.getBundle(this.f.getClass().getName()) == null) {
            new Bundle();
        }
    }

    @Override // defpackage.d82
    public final void F2(String str, String str2, pc4 pc4Var, u10 u10Var, b82 b82Var, z62 z62Var) throws RemoteException {
        try {
            of3 of3Var = new of3(this, b82Var);
            RtbAdapter rtbAdapter = this.f;
            C3(str2);
            B3(pc4Var);
            D3(pc4Var);
            E3(str2, pc4Var);
            rtbAdapter.loadRtbRewardedInterstitialAd(new kd0(), of3Var);
        } catch (Throwable th) {
            gi2.c0("Adapter failed to render rewarded interstitial ad.", th);
            gi2.E(u10Var, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.d82
    public final boolean H0(oi0 oi0Var) {
        return false;
    }

    @Override // defpackage.d82
    public final void L1(String str, String str2, pc4 pc4Var, u10 u10Var, z72 z72Var, z62 z62Var, r12 r12Var) throws RemoteException {
        RtbAdapter rtbAdapter = this.f;
        try {
            zs1 zs1Var = new zs1(this, z72Var);
            C3(str2);
            B3(pc4Var);
            D3(pc4Var);
            E3(str2, pc4Var);
            rtbAdapter.loadRtbNativeAdMapper(new id0(), zs1Var);
        } catch (Throwable th) {
            gi2.c0("Adapter failed to render native ad.", th);
            gi2.E(u10Var, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                f23 f23Var = new f23(this, z72Var, 17);
                C3(str2);
                B3(pc4Var);
                D3(pc4Var);
                E3(str2, pc4Var);
                rtbAdapter.loadRtbNativeAd(new id0(), f23Var);
            } catch (Throwable th2) {
                gi2.c0("Adapter failed to render native ad.", th2);
                gi2.E(u10Var, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // defpackage.d82
    public final void P1(String str, String str2, pc4 pc4Var, u10 u10Var, t72 t72Var, z62 z62Var, xe4 xe4Var) throws RemoteException {
        try {
            RtbAdapter rtbAdapter = this.f;
            C3(str2);
            B3(pc4Var);
            D3(pc4Var);
            E3(str2, pc4Var);
            new d3(xe4Var.f, xe4Var.j, xe4Var.g);
            try {
                t72Var.a(new nx2(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null, null));
            } catch (RemoteException e) {
                gi2.c0("", e);
            }
        } catch (Throwable th) {
            gi2.c0("Adapter failed to render interscroller ad.", th);
            gi2.E(u10Var, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.d82
    public final i82 c() {
        this.f.getVersionInfo();
        throw null;
    }

    @Override // defpackage.d82
    public final i82 e() {
        this.f.getSDKVersionInfo();
        throw null;
    }

    @Override // defpackage.d82
    public final py2 f() {
        return null;
    }

    @Override // defpackage.d82
    public final void f2(String str, String str2, pc4 pc4Var, u10 u10Var, r72 r72Var, z62 z62Var) throws RemoteException {
        try {
            kf3 kf3Var = new kf3(this, r72Var, 17);
            RtbAdapter rtbAdapter = this.f;
            C3(str2);
            B3(pc4Var);
            D3(pc4Var);
            E3(str2, pc4Var);
            rtbAdapter.loadRtbAppOpenAd(new dd0(), kf3Var);
        } catch (Throwable th) {
            gi2.c0("Adapter failed to render app open ad.", th);
            gi2.E(u10Var, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.d82
    public final void g2(String str, String str2, pc4 pc4Var, u10 u10Var, b82 b82Var, z62 z62Var) throws RemoteException {
        try {
            of3 of3Var = new of3(this, b82Var);
            RtbAdapter rtbAdapter = this.f;
            C3(str2);
            B3(pc4Var);
            D3(pc4Var);
            E3(str2, pc4Var);
            rtbAdapter.loadRtbRewardedAd(new kd0(), of3Var);
        } catch (Throwable th) {
            gi2.c0("Adapter failed to render rewarded ad.", th);
            gi2.E(u10Var, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.d82
    public final boolean h2(oi0 oi0Var) {
        return false;
    }

    @Override // defpackage.d82
    public final boolean j3(u10 u10Var) {
        return false;
    }

    @Override // defpackage.d82
    public final void p3(String str, String str2, pc4 pc4Var, oi0 oi0Var, f13 f13Var, z62 z62Var) throws RemoteException {
        L1(str, str2, pc4Var, oi0Var, f13Var, z62Var, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (((java.lang.Boolean) defpackage.tw1.e.c.a(defpackage.mz1.Ec)).booleanValue() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r4.equals("app_open") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r4.equals("interstitial") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r4.equals("rewarded") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r4.equals("native") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r4.equals("banner") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        new java.util.ArrayList().add(new defpackage.pz(25));
        r8 = (android.content.Context) defpackage.oi0.l1(r3);
        new defpackage.d3(r7.f, r7.j, r7.g);
        r6.collectSignals(new defpackage.kr0(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r4.equals("rewarded_interstitial") != false) goto L29;
     */
    @Override // defpackage.d82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q3(defpackage.u10 r3, java.lang.String r4, android.os.Bundle r5, android.os.Bundle r6, defpackage.xe4 r7, defpackage.f82 r8) throws android.os.RemoteException {
        /*
            r2 = this;
            us0 r5 = new us0     // Catch: java.lang.Throwable -> L36
            r5.<init>()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r6 = r2.f     // Catch: java.lang.Throwable -> L36
            pz r8 = new pz     // Catch: java.lang.Throwable -> L36
            int r0 = r4.hashCode()     // Catch: java.lang.Throwable -> L36
            switch(r0) {
                case -1396342996: goto L5c;
                case -1052618729: goto L53;
                case -239580146: goto L4a;
                case 604727084: goto L41;
                case 1167692200: goto L38;
                case 1778294298: goto L1b;
                case 1911491517: goto L12;
                default: goto L10;
            }
        L10:
            goto L8b
        L12:
            java.lang.String r0 = "rewarded_interstitial"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
            goto L64
        L1b:
            java.lang.String r0 = "app_open_ad"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
            iz1 r4 = defpackage.mz1.Ec     // Catch: java.lang.Throwable -> L36
            tw1 r0 = defpackage.tw1.e     // Catch: java.lang.Throwable -> L36
            kz1 r0 = r0.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r0.a(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L36
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L8b
            goto L64
        L36:
            r4 = move-exception
            goto L93
        L38:
            java.lang.String r0 = "app_open"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
            goto L64
        L41:
            java.lang.String r0 = "interstitial"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
            goto L64
        L4a:
            java.lang.String r0 = "rewarded"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
            goto L64
        L53:
            java.lang.String r0 = "native"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
            goto L64
        L5c:
            java.lang.String r0 = "banner"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
        L64:
            r4 = 25
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L36
            r4.add(r8)     // Catch: java.lang.Throwable -> L36
            kr0 r4 = new kr0     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = defpackage.oi0.l1(r3)     // Catch: java.lang.Throwable -> L36
            android.content.Context r8 = (android.content.Context) r8     // Catch: java.lang.Throwable -> L36
            int r8 = r7.j     // Catch: java.lang.Throwable -> L36
            int r0 = r7.g     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = r7.f     // Catch: java.lang.Throwable -> L36
            d3 r1 = new d3     // Catch: java.lang.Throwable -> L36
            r1.<init>(r7, r8, r0)     // Catch: java.lang.Throwable -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L36
            r6.collectSignals(r4, r5)     // Catch: java.lang.Throwable -> L36
            return
        L8b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "Internal Error"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L36
            throw r4     // Catch: java.lang.Throwable -> L36
        L93:
            java.lang.String r5 = "Error generating signals for RTB"
            defpackage.gi2.c0(r5, r4)
            java.lang.String r5 = "adapter.collectSignals"
            defpackage.gi2.E(r3, r4, r5)
            android.os.RemoteException r3 = new android.os.RemoteException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h82.q3(u10, java.lang.String, android.os.Bundle, android.os.Bundle, xe4, f82):void");
    }

    @Override // defpackage.d82
    public final void y1(String str, String str2, pc4 pc4Var, u10 u10Var, t72 t72Var, z62 z62Var, xe4 xe4Var) throws RemoteException {
        try {
            vg0 vg0Var = new vg0(this, t72Var);
            RtbAdapter rtbAdapter = this.f;
            C3(str2);
            B3(pc4Var);
            D3(pc4Var);
            E3(str2, pc4Var);
            new d3(xe4Var.f, xe4Var.j, xe4Var.g);
            rtbAdapter.loadRtbBannerAd(new ed0(), vg0Var);
        } catch (Throwable th) {
            gi2.c0("Adapter failed to render banner ad.", th);
            gi2.E(u10Var, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.d82
    public final void j1(String str) {
    }
}
