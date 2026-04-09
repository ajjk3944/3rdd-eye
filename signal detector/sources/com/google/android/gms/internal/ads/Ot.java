package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import q2.C2841s;
import q2.InterfaceC2854y0;

/* loaded from: classes.dex */
public final class Ot extends B7 {

    /* renamed from: a, reason: collision with root package name */
    public final Lt f10264a;

    /* renamed from: b, reason: collision with root package name */
    public final It f10265b;

    /* renamed from: c, reason: collision with root package name */
    public final Yt f10266c;

    /* renamed from: d, reason: collision with root package name */
    public C1870sn f10267d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10268e;

    public Ot(Lt lt, It it, Yt yt) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.f10268e = false;
        this.f10264a = lt;
        this.f10265b = it;
        this.f10266c = yt;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        q2.N n6;
        InterfaceC0828Yg interfaceC0828Yg;
        if (i == 1) {
            C0452Ce c0452Ce = (C0452Ce) C7.b(parcel, C0452Ce.CREATOR);
            C7.f(parcel);
            K3(c0452Ce);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            s();
            parcel2.writeNoException();
            return true;
        }
        W2.a c0418Ae = null;
        if (i == 3) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                c0418Ae = iInterfaceQueryLocalInterface instanceof C0435Be ? (C0435Be) iInterfaceQueryLocalInterface : new C0435Be(strongBinder);
            }
            C7.f(parcel);
            M2.u.c("setRewardedVideoAdListener can only be called from the UI thread.");
            this.f10265b.f9184e.set(c0418Ae);
            parcel2.writeNoException();
            return true;
        }
        if (i == 34) {
            boolean zA = C7.a(parcel);
            C7.f(parcel);
            synchronized (this) {
                M2.u.c("setImmersiveMode must be called on the main UI thread.");
                this.f10268e = zA;
            }
            parcel2.writeNoException();
            return true;
        }
        int i3 = 0;
        switch (i) {
            case 5:
                M2.u.c("isLoaded must be called on the main UI thread.");
                boolean zO3 = O3();
                parcel2.writeNoException();
                ClassLoader classLoader = C7.f7544a;
                parcel2.writeInt(zO3 ? 1 : 0);
                return true;
            case 6:
                X1(null);
                parcel2.writeNoException();
                return true;
            case 7:
                y1(null);
                parcel2.writeNoException();
                return true;
            case 8:
                L3(null);
                parcel2.writeNoException();
                return true;
            case 9:
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                X1(aVarD1);
                parcel2.writeNoException();
                return true;
            case 10:
                S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                y1(aVarD12);
                parcel2.writeNoException();
                return true;
            case 11:
                S2.a aVarD13 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                L3(aVarD13);
                parcel2.writeNoException();
                return true;
            case 12:
                String strI = i();
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            case 13:
                String string = parcel.readString();
                C7.f(parcel);
                M3(string);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    n6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    n6 = iInterfaceQueryLocalInterface2 instanceof q2.N ? (q2.N) iInterfaceQueryLocalInterface2 : new q2.N(strongBinder2, "com.google.android.gms.ads.internal.client.IAdMetadataListener", 2);
                }
                C7.f(parcel);
                It it = this.f10265b;
                M2.u.c("setAdMetadataListener can only be called from the UI thread.");
                if (n6 == null) {
                    it.f9181b.set(null);
                } else {
                    it.f9181b.set(new Mt(this, n6, 1));
                }
                parcel2.writeNoException();
                return true;
            case 15:
                M2.u.c("getAdMetadata can only be called from the UI thread.");
                C1870sn c1870sn = this.f10267d;
                Bundle bundleD = c1870sn != null ? c1870sn.d() : new Bundle();
                parcel2.writeNoException();
                C7.d(parcel2, bundleD);
                return true;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    c0418Ae = iInterfaceQueryLocalInterface3 instanceof C0418Ae ? (C0418Ae) iInterfaceQueryLocalInterface3 : new C0418Ae(strongBinder3, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener", 2);
                }
                C7.f(parcel);
                M2.u.c("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                this.f10265b.f9186g.set(c0418Ae);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                C7.f(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                S2.a aVarD14 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                W0(aVarD14);
                parcel2.writeNoException();
                return true;
            case 19:
                String string2 = parcel.readString();
                C7.f(parcel);
                N3(string2);
                parcel2.writeNoException();
                return true;
            case 20:
                C1870sn c1870sn2 = this.f10267d;
                if (c1870sn2 != null && (interfaceC0828Yg = (InterfaceC0828Yg) c1870sn2.f16784m.get()) != null && !interfaceC0828Yg.U0()) {
                    i3 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = C7.f7544a;
                parcel2.writeInt(i3);
                return true;
            case 21:
                InterfaceC2854y0 interfaceC2854y0N = N();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC2854y0N);
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) q2.C2841s.f23267e.f23270c.a(com.google.android.gms.internal.ads.H9.o6)).booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void K3(com.google.android.gms.internal.ads.C0452Ce r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            M2.u.c(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r6.f7630b     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.E9 r1 = com.google.android.gms.internal.ads.H9.m6     // Catch: java.lang.Throwable -> L20
            q2.s r2 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.G9 r2 = r2.f23270c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r6 = move-exception
            goto L68
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            p2.j r2 = p2.j.f22785C     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.Hf r2 = r2.f22795h     // Catch: java.lang.Throwable -> L20
            r2.f(r1, r0)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r5.O3()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.o6     // Catch: java.lang.Throwable -> L20
            q2.s r1 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.G9 r1 = r1.f23270c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r5)
            return
        L46:
            com.google.android.gms.internal.ads.Jt r0 = new com.google.android.gms.internal.ads.Jt     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r5.f10267d = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.Lt r1 = r5.f10264a     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.au r2 = r1.f9781h     // Catch: java.lang.Throwable -> L20
            V0.m r2 = r2.f13254o     // Catch: java.lang.Throwable -> L20
            r3 = 1
            r2.f3830b = r3     // Catch: java.lang.Throwable -> L20
            q2.a1 r2 = r6.f7629a     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = r6.f7630b     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.L6 r3 = new com.google.android.gms.internal.ads.L6     // Catch: java.lang.Throwable -> L20
            r4 = 29
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L20
            r1.a(r2, r6, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r5)
            return
        L68:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L20
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Ot.K3(com.google.android.gms.internal.ads.Ce):void");
    }

    public final synchronized void L3(S2.a aVar) {
        M2.u.c("destroy must be called on the main UI thread.");
        Context context = null;
        this.f10265b.f9181b.set(null);
        if (this.f10267d != null) {
            if (aVar != null) {
                context = (Context) S2.b.n1(aVar);
            }
            C2137xk c2137xk = this.f10267d.f16602c;
            c2137xk.getClass();
            c2137xk.C1(new C9(context, false));
        }
    }

    public final synchronized void M3(String str) {
        M2.u.c("setUserId must be called on the main UI thread.");
        this.f10266c.f12718a = str;
    }

    public final synchronized InterfaceC2854y0 N() {
        C1870sn c1870sn;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.x7)).booleanValue() && (c1870sn = this.f10267d) != null) {
            return c1870sn.f16605f;
        }
        return null;
    }

    public final synchronized void N3(String str) {
        M2.u.c("#008 Must be called on the main UI thread.: setCustomData");
        this.f10266c.f12719b = str;
    }

    public final synchronized boolean O3() {
        C1870sn c1870sn = this.f10267d;
        if (c1870sn != null) {
            if (!c1870sn.f16789r.f7030b.get()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void W0(S2.a aVar) {
        try {
            M2.u.c("showAd must be called on the main UI thread.");
            if (this.f10267d != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object objN1 = S2.b.n1(aVar);
                    if (objN1 instanceof Activity) {
                        activity = (Activity) objN1;
                    }
                }
                this.f10267d.c(activity, this.f10268e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void X1(S2.a aVar) {
        M2.u.c("pause must be called on the main UI thread.");
        if (this.f10267d != null) {
            Context context = aVar == null ? null : (Context) S2.b.n1(aVar);
            C2137xk c2137xk = this.f10267d.f16602c;
            c2137xk.getClass();
            c2137xk.C1(new C1288hw(context, 3));
        }
    }

    public final synchronized String i() {
        BinderC1168fk binderC1168fk;
        C1870sn c1870sn = this.f10267d;
        if (c1870sn == null || (binderC1168fk = c1870sn.f16605f) == null) {
            return null;
        }
        return binderC1168fk.f14124a;
    }

    public final synchronized void s() {
        W0(null);
    }

    public final synchronized void y1(S2.a aVar) {
        M2.u.c("resume must be called on the main UI thread.");
        if (this.f10267d != null) {
            Context context = aVar == null ? null : (Context) S2.b.n1(aVar);
            C2137xk c2137xk = this.f10267d.f16602c;
            c2137xk.getClass();
            c2137xk.C1(new C2083wk(context));
        }
    }
}
