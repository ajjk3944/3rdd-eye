package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tp0 extends mg {

    /* renamed from: a, reason: collision with root package name */
    public final qp0 f16914a;

    /* renamed from: b, reason: collision with root package name */
    public final np0 f16915b;

    /* renamed from: c, reason: collision with root package name */
    public final eq0 f16916c;

    /* renamed from: d, reason: collision with root package name */
    public oc0 f16917d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16918e;

    public tp0(qp0 qp0Var, np0 np0Var, eq0 eq0Var) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.f16918e = false;
        this.f16914a = qp0Var;
        this.f16915b = np0Var;
        this.f16916c = eq0Var;
    }

    public final synchronized String B1() {
        c60 c60Var;
        oc0 oc0Var = this.f16917d;
        if (oc0Var == null || (c60Var = oc0Var.f14537f) == null) {
            return null;
        }
        return c60Var.f9997a;
    }

    public final synchronized va.x1 N1() {
        oc0 oc0Var;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16401x7)).booleanValue() && (oc0Var = this.f16917d) != null) {
            return oc0Var.f14537f;
        }
        return null;
    }

    public final synchronized void T0(vb.a aVar) {
        try {
            pb.y.d("showAd must be called on the main UI thread.");
            if (this.f16917d != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object objU0 = vb.b.U0(aVar);
                    if (objU0 instanceof Activity) {
                        activity = (Activity) objU0;
                    }
                }
                this.f16917d.c(activity, this.f16918e);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void V1(vb.a aVar) {
        pb.y.d("pause must be called on the main UI thread.");
        if (this.f16917d != null) {
            Context context = aVar == null ? null : (Context) vb.b.U0(aVar);
            s60 s60Var = this.f16917d.f14534c;
            s60Var.getClass();
            s60Var.p1(new mu0(context, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        va.n0 n0Var;
        qz qzVar;
        if (i4 == 1) {
            tu tuVar = (tu) ng.b(parcel, tu.CREATOR);
            ng.f(parcel);
            h4(tuVar);
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 2) {
            h();
            parcel2.writeNoException();
            return true;
        }
        IInterface ruVar = null;
        if (i4 == 3) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                ruVar = iInterfaceQueryLocalInterface instanceof su ? (su) iInterfaceQueryLocalInterface : new su(strongBinder);
            }
            ng.f(parcel);
            pb.y.d("setRewardedVideoAdListener can only be called from the UI thread.");
            this.f16915b.f14394e.set(ruVar);
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 34) {
            boolean zA = ng.a(parcel);
            ng.f(parcel);
            synchronized (this) {
                pb.y.d("setImmersiveMode must be called on the main UI thread.");
                this.f16918e = zA;
            }
            parcel2.writeNoException();
            return true;
        }
        int i10 = 0;
        switch (i4) {
            case 5:
                pb.y.d("isLoaded must be called on the main UI thread.");
                boolean zL4 = l4();
                parcel2.writeNoException();
                ClassLoader classLoader = ng.f14287a;
                parcel2.writeInt(zL4 ? 1 : 0);
                return true;
            case 6:
                V1(null);
                parcel2.writeNoException();
                return true;
            case 7:
                y2(null);
                parcel2.writeNoException();
                return true;
            case 8:
                i4(null);
                parcel2.writeNoException();
                return true;
            case 9:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                V1(aVarR0);
                parcel2.writeNoException();
                return true;
            case 10:
                vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                y2(aVarR02);
                parcel2.writeNoException();
                return true;
            case 11:
                vb.a aVarR03 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                i4(aVarR03);
                parcel2.writeNoException();
                return true;
            case 12:
                String strB1 = B1();
                parcel2.writeNoException();
                parcel2.writeString(strB1);
                return true;
            case 13:
                String string = parcel.readString();
                ng.f(parcel);
                j4(string);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    n0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    n0Var = iInterfaceQueryLocalInterface2 instanceof va.n0 ? (va.n0) iInterfaceQueryLocalInterface2 : new va.n0(strongBinder2, "com.google.android.gms.ads.internal.client.IAdMetadataListener", 1);
                }
                ng.f(parcel);
                np0 np0Var = this.f16915b;
                pb.y.d("setAdMetadataListener can only be called from the UI thread.");
                if (n0Var == null) {
                    np0Var.f14391b.set(null);
                } else {
                    np0Var.f14391b.set(new rp0(this, n0Var, 1));
                }
                parcel2.writeNoException();
                return true;
            case 15:
                pb.y.d("getAdMetadata can only be called from the UI thread.");
                oc0 oc0Var = this.f16917d;
                Bundle bundleD = oc0Var != null ? oc0Var.d() : new Bundle();
                parcel2.writeNoException();
                ng.d(parcel2, bundleD);
                return true;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    ruVar = iInterfaceQueryLocalInterface3 instanceof ru ? (ru) iInterfaceQueryLocalInterface3 : new ru(strongBinder3, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener", 1);
                }
                ng.f(parcel);
                pb.y.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                this.f16915b.g.set(ruVar);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                ng.f(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                vb.a aVarR04 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                T0(aVarR04);
                parcel2.writeNoException();
                return true;
            case 19:
                String string2 = parcel.readString();
                ng.f(parcel);
                k4(string2);
                parcel2.writeNoException();
                return true;
            case 20:
                oc0 oc0Var2 = this.f16917d;
                if (oc0Var2 != null && (qzVar = (qz) oc0Var2.f14657m.get()) != null && !qzVar.K0()) {
                    i10 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = ng.f14287a;
                parcel2.writeInt(i10);
                return true;
            case 21:
                va.x1 x1VarN1 = N1();
                parcel2.writeNoException();
                ng.e(parcel2, x1VarN1);
                return true;
            default:
                return false;
        }
    }

    public final synchronized void h() {
        T0(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) va.s.f36163e.f36166c.a(com.google.android.gms.internal.ads.sk.f16256o6)).booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h4(com.google.android.gms.internal.ads.tu r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            pb.y.d(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r6.f16963b     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.pk r1 = com.google.android.gms.internal.ads.sk.m6     // Catch: java.lang.Throwable -> L20
            va.s r2 = va.s.f36163e     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.rk r2 = r2.f36166c     // Catch: java.lang.Throwable -> L20
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
            ua.j r2 = ua.j.C     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zw r2 = r2.f35265h     // Catch: java.lang.Throwable -> L20
            r2.f(r1, r0)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r5.l4()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.f16256o6     // Catch: java.lang.Throwable -> L20
            va.s r1 = va.s.f36163e     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.rk r1 = r1.f36166c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r5)
            return
        L46:
            com.google.android.gms.internal.ads.op0 r0 = new com.google.android.gms.internal.ads.op0     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r5.f16917d = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.qp0 r1 = r5.f16914a     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.gq0 r2 = r1.f15392h     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.s9 r2 = r2.f11588o     // Catch: java.lang.Throwable -> L20
            r3 = 1
            r2.f15910b = r3     // Catch: java.lang.Throwable -> L20
            va.z2 r2 = r6.f16962a     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = r6.f16963b     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.ne0 r3 = new com.google.android.gms.internal.ads.ne0     // Catch: java.lang.Throwable -> L20
            r4 = 13
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L20
            r1.a(r2, r6, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r5)
            return
        L68:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L20
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tp0.h4(com.google.android.gms.internal.ads.tu):void");
    }

    public final synchronized void i4(vb.a aVar) {
        pb.y.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.f16915b.f14391b.set(null);
        if (this.f16917d != null) {
            if (aVar != null) {
                context = (Context) vb.b.U0(aVar);
            }
            s60 s60Var = this.f16917d.f14534c;
            s60Var.getClass();
            s60Var.p1(new nk(context, 2));
        }
    }

    public final synchronized void j4(String str) {
        pb.y.d("setUserId must be called on the main UI thread.");
        this.f16916c.f10848a = str;
    }

    public final synchronized void k4(String str) {
        pb.y.d("#008 Must be called on the main UI thread.: setCustomData");
        this.f16916c.f10849b = str;
    }

    public final synchronized boolean l4() {
        oc0 oc0Var = this.f16917d;
        if (oc0Var != null) {
            if (!oc0Var.f14662r.f18305b.get()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void y2(vb.a aVar) {
        pb.y.d("resume must be called on the main UI thread.");
        if (this.f16917d != null) {
            Context context = aVar == null ? null : (Context) vb.b.U0(aVar);
            s60 s60Var = this.f16917d.f14534c;
            s60Var.getClass();
            s60Var.p1(new jm(context, 1));
        }
    }
}
