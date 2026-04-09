package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m72 extends hv1 implements w62 {
    public final Object f;
    public xb4 g;
    public sa2 h;
    public u10 i;

    public m72() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static final boolean D3(pc4 pc4Var) {
        if (pc4Var.k) {
            return true;
        }
        j63 j63Var = sv1.f.a;
        return j63.n();
    }

    public static final String E3(String str, pc4 pc4Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return pc4Var.z;
        }
    }

    @Override // defpackage.w62
    public final void A0(u10 u10Var, pc4 pc4Var, String str, String str2, z62 z62Var) throws RemoteException {
        Object obj = this.f;
        boolean z = obj instanceof MediationInterstitialAdapter;
        if (!z && !(obj instanceof f3)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = f3.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            ex0.q(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            gi2.i0(sb.toString());
            throw new RemoteException();
        }
        gi2.U("Requesting interstitial ad from adapter.");
        if (!z) {
            if (obj instanceof f3) {
                try {
                    k72 k72Var = new k72(this, z62Var, 0);
                    B3(str, pc4Var, str2);
                    C3(pc4Var);
                    D3(pc4Var);
                    E3(str, pc4Var);
                    ((f3) obj).loadInterstitialAd(new gd0(), k72Var);
                    return;
                } catch (Throwable th) {
                    gi2.c0("", th);
                    gi2.E(u10Var, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = pc4Var.j;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = pc4Var.g;
            if (j != -1) {
                new Date(j);
            }
            boolean zD3 = D3(pc4Var);
            int i = pc4Var.l;
            boolean z2 = pc4Var.w;
            E3(str, pc4Var);
            i72 i72Var = new i72(hashSet, zD3, i, z2);
            Bundle bundle = pc4Var.r;
            mediationInterstitialAdapter.requestInterstitialAd((Context) oi0.l1(u10Var), new xb4(z62Var), B3(str, pc4Var, str2), i72Var, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            gi2.c0("", th2);
            gi2.E(u10Var, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        sa2 qa2Var;
        f23 f23Var;
        z62 x62Var = null;
        z62 x62Var2 = null;
        z62 x62Var3 = null;
        z62 x62Var4 = null;
        b52 x42Var = null;
        z62 x62Var5 = null;
        p22Var = null;
        p22 p22Var = null;
        z62 x62Var6 = null;
        sa2 qa2Var2 = null;
        z62 x62Var7 = null;
        z62 x62Var8 = null;
        z62 x62Var9 = null;
        switch (i) {
            case 1:
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                xe4 xe4Var = (xe4) iv1.b(parcel, xe4.CREATOR);
                pc4 pc4Var = (pc4) iv1.b(parcel, pc4.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    x62Var = iInterfaceQueryLocalInterface instanceof z62 ? (z62) iInterfaceQueryLocalInterface : new x62(strongBinder);
                }
                iv1.f(parcel);
                P0(u10VarX0, xe4Var, pc4Var, string, null, x62Var);
                parcel2.writeNoException();
                return true;
            case 2:
                u10 u10VarC = c();
                parcel2.writeNoException();
                iv1.e(parcel2, u10VarC);
                return true;
            case 3:
                u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
                pc4 pc4Var2 = (pc4) iv1.b(parcel, pc4.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    x62Var9 = iInterfaceQueryLocalInterface2 instanceof z62 ? (z62) iInterfaceQueryLocalInterface2 : new x62(strongBinder2);
                }
                z62 z62Var = x62Var9;
                iv1.f(parcel);
                A0(u10VarX02, pc4Var2, string2, null, z62Var);
                parcel2.writeNoException();
                return true;
            case 4:
                f();
                parcel2.writeNoException();
                return true;
            case 5:
                j();
                parcel2.writeNoException();
                return true;
            case 6:
                u10 u10VarX03 = oi0.X0(parcel.readStrongBinder());
                xe4 xe4Var2 = (xe4) iv1.b(parcel, xe4.CREATOR);
                pc4 pc4Var3 = (pc4) iv1.b(parcel, pc4.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    x62Var8 = iInterfaceQueryLocalInterface3 instanceof z62 ? (z62) iInterfaceQueryLocalInterface3 : new x62(strongBinder3);
                }
                iv1.f(parcel);
                P0(u10VarX03, xe4Var2, pc4Var3, string3, string4, x62Var8);
                parcel2.writeNoException();
                return true;
            case 7:
                u10 u10VarX04 = oi0.X0(parcel.readStrongBinder());
                pc4 pc4Var4 = (pc4) iv1.b(parcel, pc4.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    x62Var7 = iInterfaceQueryLocalInterface4 instanceof z62 ? (z62) iInterfaceQueryLocalInterface4 : new x62(strongBinder4);
                }
                z62 z62Var2 = x62Var7;
                iv1.f(parcel);
                A0(u10VarX04, pc4Var4, string5, string6, z62Var2);
                parcel2.writeNoException();
                return true;
            case 8:
                i();
                parcel2.writeNoException();
                return true;
            case 9:
                n();
                parcel2.writeNoException();
                return true;
            case 10:
                u10 u10VarX05 = oi0.X0(parcel.readStrongBinder());
                pc4 pc4Var5 = (pc4) iv1.b(parcel, pc4.CREATOR);
                parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    qa2Var2 = iInterfaceQueryLocalInterface5 instanceof sa2 ? (sa2) iInterfaceQueryLocalInterface5 : new qa2(strongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 2);
                }
                String string7 = parcel.readString();
                iv1.f(parcel);
                u1(u10VarX05, pc4Var5, qa2Var2, string7);
                parcel2.writeNoException();
                return true;
            case 11:
                pc4 pc4Var6 = (pc4) iv1.b(parcel, pc4.CREATOR);
                String string8 = parcel.readString();
                iv1.f(parcel);
                F3(string8, pc4Var6);
                parcel2.writeNoException();
                return true;
            case 12:
                S();
                throw null;
            case 13:
                boolean zM = m();
                parcel2.writeNoException();
                ClassLoader classLoader = iv1.a;
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 14:
                u10 u10VarX06 = oi0.X0(parcel.readStrongBinder());
                pc4 pc4Var7 = (pc4) iv1.b(parcel, pc4.CREATOR);
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    x62Var6 = iInterfaceQueryLocalInterface6 instanceof z62 ? (z62) iInterfaceQueryLocalInterface6 : new x62(strongBinder6);
                }
                z62 z62Var3 = x62Var6;
                r12 r12Var = (r12) iv1.b(parcel, r12.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                iv1.f(parcel);
                l3(u10VarX06, pc4Var7, string9, string10, z62Var3, r12Var, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = iv1.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = iv1.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                iv1.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                iv1.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                iv1.d(parcel2, bundle3);
                return true;
            case 20:
                pc4 pc4Var8 = (pc4) iv1.b(parcel, pc4.CREATOR);
                String string11 = parcel.readString();
                parcel.readString();
                iv1.f(parcel);
                F3(string11, pc4Var8);
                parcel2.writeNoException();
                return true;
            case zy1.zzm /* 21 */:
                u10 u10VarX07 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                l0(u10VarX07);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = iv1.a;
                parcel2.writeInt(0);
                return true;
            case 23:
                u10 u10VarX08 = oi0.X0(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    qa2Var = iInterfaceQueryLocalInterface7 instanceof sa2 ? (sa2) iInterfaceQueryLocalInterface7 : new qa2(strongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 2);
                } else {
                    qa2Var = null;
                }
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                iv1.f(parcel);
                V2(u10VarX08, qa2Var, arrayListCreateStringArrayList2);
                throw null;
            case 24:
                xb4 xb4Var = this.g;
                if (xb4Var != null && (f23Var = (f23) xb4Var.i) != null) {
                    p22Var = (p22) f23Var.g;
                }
                parcel2.writeNoException();
                iv1.e(parcel2, p22Var);
                return true;
            case 25:
                boolean zA = iv1.a(parcel);
                iv1.f(parcel);
                i3(zA);
                parcel2.writeNoException();
                return true;
            case 26:
                py2 py2VarC = C();
                parcel2.writeNoException();
                iv1.e(parcel2, py2VarC);
                return true;
            case 27:
                e72 e72VarF = F();
                parcel2.writeNoException();
                iv1.e(parcel2, e72VarF);
                return true;
            case 28:
                u10 u10VarX09 = oi0.X0(parcel.readStrongBinder());
                pc4 pc4Var9 = (pc4) iv1.b(parcel, pc4.CREATOR);
                String string12 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    x62Var5 = iInterfaceQueryLocalInterface8 instanceof z62 ? (z62) iInterfaceQueryLocalInterface8 : new x62(strongBinder8);
                }
                iv1.f(parcel);
                y0(u10VarX09, pc4Var9, string12, x62Var5);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                u10 u10VarX010 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                z3(u10VarX010);
                throw null;
            case 31:
                u10 u10VarX011 = oi0.X0(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    x42Var = iInterfaceQueryLocalInterface9 instanceof b52 ? (b52) iInterfaceQueryLocalInterface9 : new x42(strongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback", 2);
                }
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(e52.CREATOR);
                iv1.f(parcel);
                J0(u10VarX011, x42Var, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                u10 u10VarX012 = oi0.X0(parcel.readStrongBinder());
                pc4 pc4Var10 = (pc4) iv1.b(parcel, pc4.CREATOR);
                String string13 = parcel.readString();
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    x62Var4 = iInterfaceQueryLocalInterface10 instanceof z62 ? (z62) iInterfaceQueryLocalInterface10 : new x62(strongBinder10);
                }
                iv1.f(parcel);
                b3(u10VarX012, pc4Var10, string13, x62Var4);
                parcel2.writeNoException();
                return true;
            case 33:
                H();
                parcel2.writeNoException();
                ClassLoader classLoader5 = iv1.a;
                parcel2.writeInt(0);
                return true;
            case 34:
                Z2();
                parcel2.writeNoException();
                ClassLoader classLoader6 = iv1.a;
                parcel2.writeInt(0);
                return true;
            case 35:
                u10 u10VarX013 = oi0.X0(parcel.readStrongBinder());
                xe4 xe4Var3 = (xe4) iv1.b(parcel, xe4.CREATOR);
                pc4 pc4Var11 = (pc4) iv1.b(parcel, pc4.CREATOR);
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    x62Var3 = iInterfaceQueryLocalInterface11 instanceof z62 ? (z62) iInterfaceQueryLocalInterface11 : new x62(strongBinder11);
                }
                iv1.f(parcel);
                r2(u10VarX013, xe4Var3, pc4Var11, string14, string15, x62Var3);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel2.writeNoException();
                ClassLoader classLoader7 = iv1.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 37:
                u10 u10VarX014 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                e1(u10VarX014);
                parcel2.writeNoException();
                return true;
            case 38:
                u10 u10VarX015 = oi0.X0(parcel.readStrongBinder());
                pc4 pc4Var12 = (pc4) iv1.b(parcel, pc4.CREATOR);
                String string16 = parcel.readString();
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    x62Var2 = iInterfaceQueryLocalInterface12 instanceof z62 ? (z62) iInterfaceQueryLocalInterface12 : new x62(strongBinder12);
                }
                iv1.f(parcel);
                S0(u10VarX015, pc4Var12, string16, x62Var2);
                parcel2.writeNoException();
                return true;
            case 39:
                u10 u10VarX016 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                e3(u10VarX016);
                throw null;
        }
    }

    public final Bundle B3(String str, pc4 pc4Var, String str2) throws RemoteException {
        gi2.U("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (pc4Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", pc4Var.l);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            gi2.c0("", th);
            throw new RemoteException();
        }
    }

    @Override // defpackage.w62
    public final py2 C() {
        Object obj = this.f;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th) {
                gi2.c0("", th);
            }
        }
        return null;
    }

    public final void C3(pc4 pc4Var) {
        Bundle bundle = pc4Var.r;
        if (bundle == null || bundle.getBundle(this.f.getClass().getName()) == null) {
            new Bundle();
        }
    }

    @Override // defpackage.w62
    public final e72 F() {
        xb4 xb4Var;
        hd1 hd1Var;
        if (!(this.f instanceof MediationNativeAdapter) || (xb4Var = this.g) == null || (hd1Var = (hd1) xb4Var.h) == null) {
            return null;
        }
        return new p72(hd1Var);
    }

    public final void F3(String str, pc4 pc4Var) throws RemoteException {
        Object obj = this.f;
        if (obj instanceof f3) {
            y0(this.i, pc4Var, str, new n72((f3) obj, this.h));
            return;
        }
        String canonicalName = f3.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        gi2.i0(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.w62
    public final i82 H() {
        Object obj = this.f;
        if (!(obj instanceof f3)) {
            return null;
        }
        ((f3) obj).getVersionInfo();
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @Override // defpackage.w62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J0(defpackage.u10 r9, defpackage.b52 r10, java.util.ArrayList r11) throws android.os.RemoteException {
        /*
            r8 = this;
            java.lang.Object r10 = r8.f
            boolean r0 = r10 instanceof defpackage.f3
            if (r0 == 0) goto La0
            ts0 r0 = new ts0
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r11.size()
            r3 = 0
        L15:
            if (r3 >= r2) goto L94
            java.lang.Object r4 = r11.get(r3)
            int r3 = r3 + 1
            e52 r4 = (defpackage.e52) r4
            java.lang.String r4 = r4.f
            int r5 = r4.hashCode()
            r6 = 0
            s2 r7 = defpackage.s2.APP_OPEN_AD
            switch(r5) {
                case -1396342996: goto L7d;
                case -1052618729: goto L72;
                case -239580146: goto L67;
                case 604727084: goto L5c;
                case 1167692200: goto L53;
                case 1778294298: goto L37;
                case 1911491517: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L87
        L2c:
            java.lang.String r5 = "rewarded_interstitial"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L87
            s2 r6 = defpackage.s2.REWARDED_INTERSTITIAL
            goto L87
        L37:
            java.lang.String r5 = "app_open_ad"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L87
            iz1 r4 = defpackage.mz1.Ec
            tw1 r5 = defpackage.tw1.e
            kz1 r5 = r5.c
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L87
        L51:
            r6 = r7
            goto L87
        L53:
            java.lang.String r5 = "app_open"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L87
            goto L51
        L5c:
            java.lang.String r5 = "interstitial"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L87
            s2 r6 = defpackage.s2.INTERSTITIAL
            goto L87
        L67:
            java.lang.String r5 = "rewarded"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L87
            s2 r6 = defpackage.s2.REWARDED
            goto L87
        L72:
            java.lang.String r5 = "native"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L87
            s2 r6 = defpackage.s2.NATIVE
            goto L87
        L7d:
            java.lang.String r5 = "banner"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L87
            s2 r6 = defpackage.s2.BANNER
        L87:
            if (r6 == 0) goto L15
            pz r4 = new pz
            r5 = 25
            r4.<init>(r5)
            r1.add(r4)
            goto L15
        L94:
            f3 r10 = (defpackage.f3) r10
            java.lang.Object r9 = defpackage.oi0.l1(r9)
            android.content.Context r9 = (android.content.Context) r9
            r10.initialize(r9, r0, r1)
            return
        La0:
            android.os.RemoteException r9 = new android.os.RemoteException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m72.J0(u10, b52, java.util.ArrayList):void");
    }

    @Override // defpackage.w62
    public final boolean K() {
        return false;
    }

    @Override // defpackage.w62
    public final void P0(u10 u10Var, xe4 xe4Var, pc4 pc4Var, String str, String str2, z62 z62Var) throws RemoteException {
        d3 d3Var;
        Object obj = this.f;
        boolean z = obj instanceof MediationBannerAdapter;
        if (!z && !(obj instanceof f3)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = f3.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            ex0.q(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            gi2.i0(sb.toString());
            throw new RemoteException();
        }
        gi2.U("Requesting banner ad from adapter.");
        boolean z2 = xe4Var.s;
        int i = xe4Var.g;
        int i2 = xe4Var.j;
        if (z2) {
            d3 d3Var2 = new d3(i2, i);
            d3Var2.e = true;
            d3Var2.f = i;
            d3Var = d3Var2;
        } else {
            d3Var = new d3(xe4Var.f, i2, i);
        }
        if (!z) {
            if (obj instanceof f3) {
                try {
                    j72 j72Var = new j72(this, z62Var, 0);
                    B3(str, pc4Var, str2);
                    C3(pc4Var);
                    D3(pc4Var);
                    E3(str, pc4Var);
                    ((f3) obj).loadBannerAd(new ed0(), j72Var);
                    return;
                } catch (Throwable th) {
                    gi2.c0("", th);
                    gi2.E(u10Var, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = pc4Var.j;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = pc4Var.g;
            if (j != -1) {
                new Date(j);
            }
            boolean zD3 = D3(pc4Var);
            int i3 = pc4Var.l;
            boolean z3 = pc4Var.w;
            E3(str, pc4Var);
            i72 i72Var = new i72(hashSet, zD3, i3, z3);
            Bundle bundle = pc4Var.r;
            mediationBannerAdapter.requestBannerAd((Context) oi0.l1(u10Var), new xb4(z62Var), B3(str, pc4Var, str2), d3Var, i72Var, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            gi2.c0("", th2);
            gi2.E(u10Var, th2, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.w62
    public final void S() throws RemoteException {
        Object obj = this.f;
        if (obj instanceof f3) {
            gi2.Z("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = f3.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        gi2.i0(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.w62
    public final void S0(u10 u10Var, pc4 pc4Var, String str, z62 z62Var) throws RemoteException {
        Object obj = this.f;
        if (!(obj instanceof f3)) {
            String canonicalName = f3.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            gi2.i0(sb.toString());
            throw new RemoteException();
        }
        gi2.U("Requesting app open ad from adapter.");
        try {
            l72 l72Var = new l72(this, z62Var, 1);
            B3(str, pc4Var, null);
            C3(pc4Var);
            D3(pc4Var);
            E3(str, pc4Var);
            ((f3) obj).loadAppOpenAd(new dd0(), l72Var);
        } catch (Exception e) {
            gi2.c0("", e);
            gi2.E(u10Var, e, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.w62
    public final void U1(String str, pc4 pc4Var) throws RemoteException {
        F3(str, pc4Var);
    }

    @Override // defpackage.w62
    public final b72 V() {
        return null;
    }

    @Override // defpackage.w62
    public final void V2(u10 u10Var, sa2 sa2Var, List list) throws RemoteException {
        gi2.i0("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // defpackage.w62
    public final i82 Z2() {
        Object obj = this.f;
        if (!(obj instanceof f3)) {
            return null;
        }
        ((f3) obj).getSDKVersionInfo();
        throw null;
    }

    @Override // defpackage.w62
    public final a72 a0() {
        return null;
    }

    @Override // defpackage.w62
    public final void b3(u10 u10Var, pc4 pc4Var, String str, z62 z62Var) throws RemoteException {
        Object obj = this.f;
        if (!(obj instanceof f3)) {
            String canonicalName = f3.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            gi2.i0(sb.toString());
            throw new RemoteException();
        }
        gi2.U("Requesting rewarded interstitial ad from adapter.");
        try {
            k72 k72Var = new k72(this, z62Var, 1);
            B3(str, pc4Var, null);
            C3(pc4Var);
            D3(pc4Var);
            E3(str, pc4Var);
            ((f3) obj).loadRewardedInterstitialAd(new kd0(), k72Var);
        } catch (Exception e) {
            gi2.E(u10Var, e, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.w62
    public final u10 c() throws RemoteException {
        Object obj = this.f;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new oi0(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                gi2.c0("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof f3) {
            return new oi0(null);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = f3.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        ex0.q(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        gi2.i0(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.w62
    public final c72 e0() {
        return null;
    }

    @Override // defpackage.w62
    public final void e1(u10 u10Var) throws RemoteException {
        Object obj = this.f;
        if ((obj instanceof f3) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                f();
                return;
            } else {
                gi2.U("Show interstitial ad from adapter.");
                gi2.Z("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = f3.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        ex0.q(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        gi2.i0(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.w62
    public final void e3(u10 u10Var) throws RemoteException {
        Object obj = this.f;
        if (obj instanceof f3) {
            gi2.U("Show app open ad from adapter.");
            gi2.Z("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = f3.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        gi2.i0(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.w62
    public final void f() throws RemoteException {
        Object obj = this.f;
        if (obj instanceof MediationInterstitialAdapter) {
            gi2.U("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                gi2.c0("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        gi2.i0(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.w62
    public final void i() throws RemoteException {
        Object obj = this.f;
        if (obj instanceof cd0) {
            try {
                ((cd0) obj).onPause();
            } catch (Throwable th) {
                gi2.c0("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // defpackage.w62
    public final void i3(boolean z) {
        Object obj = this.f;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                gi2.c0("", th);
                return;
            }
        }
        String canonicalName = AbstractAdViewAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        gi2.U(sb.toString());
    }

    @Override // defpackage.w62
    public final void j() throws RemoteException {
        Object obj = this.f;
        if (obj instanceof cd0) {
            try {
                ((cd0) obj).onDestroy();
            } catch (Throwable th) {
                gi2.c0("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // defpackage.w62
    public final void l0(u10 u10Var) {
    }

    @Override // defpackage.w62
    public final void l3(u10 u10Var, pc4 pc4Var, String str, String str2, z62 z62Var, r12 r12Var, ArrayList arrayList) throws RemoteException {
        Object obj = this.f;
        boolean z = obj instanceof MediationNativeAdapter;
        if (!z && !(obj instanceof f3)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = f3.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            ex0.q(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            gi2.i0(sb.toString());
            throw new RemoteException();
        }
        gi2.U("Requesting native ad from adapter.");
        if (z) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list = pc4Var.j;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j = pc4Var.g;
                if (j != -1) {
                    new Date(j);
                }
                boolean zD3 = D3(pc4Var);
                int i = pc4Var.l;
                boolean z2 = pc4Var.w;
                E3(str, pc4Var);
                o72 o72Var = new o72(hashSet, zD3, i, r12Var, arrayList, z2);
                Bundle bundle = pc4Var.r;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.g = new xb4(z62Var);
                mediationNativeAdapter.requestNativeAd((Context) oi0.l1(u10Var), this.g, B3(str, pc4Var, str2), o72Var, bundle2);
                return;
            } catch (Throwable th) {
                gi2.c0("", th);
                gi2.E(u10Var, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj instanceof f3) {
            try {
                j72 j72Var = new j72(this, z62Var, 1);
                B3(str, pc4Var, str2);
                C3(pc4Var);
                D3(pc4Var);
                E3(str, pc4Var);
                ((f3) obj).loadNativeAdMapper(new id0(), j72Var);
            } catch (Throwable th2) {
                gi2.c0("", th2);
                gi2.E(u10Var, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    l72 l72Var = new l72(this, z62Var, 0);
                    B3(str, pc4Var, str2);
                    C3(pc4Var);
                    D3(pc4Var);
                    E3(str, pc4Var);
                    ((f3) obj).loadNativeAd(new id0(), l72Var);
                } catch (Throwable th3) {
                    gi2.c0("", th3);
                    gi2.E(u10Var, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // defpackage.w62
    public final boolean m() throws RemoteException {
        Object obj = this.f;
        if ((obj instanceof f3) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.h != null;
        }
        String canonicalName = f3.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        gi2.i0(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.w62
    public final void n() throws RemoteException {
        Object obj = this.f;
        if (obj instanceof cd0) {
            try {
                ((cd0) obj).onResume();
            } catch (Throwable th) {
                gi2.c0("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // defpackage.w62
    public final void r2(u10 u10Var, xe4 xe4Var, pc4 pc4Var, String str, String str2, z62 z62Var) throws RemoteException {
        Object obj = this.f;
        if (!(obj instanceof f3)) {
            String canonicalName = f3.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            gi2.i0(sb.toString());
            throw new RemoteException();
        }
        gi2.U("Requesting interscroller ad from adapter.");
        try {
            f3 f3Var = (f3) obj;
            vq2 vq2Var = new vq2(this, z62Var, f3Var, 24);
            B3(str, pc4Var, str2);
            C3(pc4Var);
            D3(pc4Var);
            E3(str, pc4Var);
            int i = xe4Var.j;
            int i2 = xe4Var.g;
            d3 d3Var = new d3(i, i2);
            d3Var.g = true;
            d3Var.h = i2;
            vq2Var.C(new r2(7, f3Var.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
        } catch (Exception e) {
            gi2.c0("", e);
            gi2.E(u10Var, e, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.w62
    public final void u1(u10 u10Var, pc4 pc4Var, sa2 sa2Var, String str) throws RemoteException {
        Object obj = this.f;
        if ((obj instanceof f3) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.i = u10Var;
            this.h = sa2Var;
            sa2Var.W1(new oi0(obj));
            return;
        }
        String canonicalName = f3.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        gi2.i0(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.w62
    public final void y0(u10 u10Var, pc4 pc4Var, String str, z62 z62Var) throws RemoteException {
        Object obj = this.f;
        if (!(obj instanceof f3)) {
            String canonicalName = f3.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            gi2.i0(sb.toString());
            throw new RemoteException();
        }
        gi2.U("Requesting rewarded ad from adapter.");
        try {
            k72 k72Var = new k72(this, z62Var, 1);
            B3(str, pc4Var, null);
            C3(pc4Var);
            D3(pc4Var);
            E3(str, pc4Var);
            ((f3) obj).loadRewardedAd(new kd0(), k72Var);
        } catch (Exception e) {
            gi2.c0("", e);
            gi2.E(u10Var, e, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.w62
    public final void z3(u10 u10Var) throws RemoteException {
        Object obj = this.f;
        if (obj instanceof f3) {
            gi2.U("Show rewarded ad from adapter.");
            gi2.Z("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = f3.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        gi2.i0(sb.toString());
        throw new RemoteException();
    }

    public m72(f3 f3Var) {
        this();
        this.f = f3Var;
    }

    public m72(cd0 cd0Var) {
        this();
        this.f = cd0Var;
    }
}
