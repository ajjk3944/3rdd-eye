package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class i0 extends x implements j0 {
    public static j0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof j0 ? (j0) iInterfaceQueryLocalInterface : new h0(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 2);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final boolean O(int i4, Parcel parcel, Parcel parcel2) {
        boolean z3;
        l0 k0Var = null;
        n0 m0Var = null;
        l0 k0Var2 = null;
        l0 k0Var3 = null;
        l0 k0Var4 = null;
        l0 k0Var5 = null;
        q0 o0Var = null;
        q0 o0Var2 = null;
        q0 o0Var3 = null;
        l0 k0Var6 = null;
        l0 k0Var7 = null;
        l0 k0Var8 = null;
        l0 k0Var9 = null;
        l0 k0Var10 = null;
        l0 k0Var11 = null;
        s0 r0Var = null;
        l0 k0Var12 = null;
        l0 k0Var13 = null;
        l0 k0Var14 = null;
        l0 k0Var15 = null;
        l0 k0Var16 = null;
        switch (i4) {
            case 1:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                t0 t0Var = (t0) y.a(parcel, t0.CREATOR);
                long j = parcel.readLong();
                y.d(parcel);
                initialize(aVarR0, t0Var, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) y.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z3 = false;
                    z = true;
                } else {
                    z3 = false;
                }
                boolean z10 = parcel.readInt() != 0 ? true : z3;
                long j8 = parcel.readLong();
                y.d(parcel);
                logEvent(string, string2, bundle, z, z10, j8);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) y.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var = iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new k0(strongBinder);
                }
                l0 l0Var = k0Var;
                long j9 = parcel.readLong();
                y.d(parcel);
                logEventAndBundle(string3, string4, bundle2, l0Var, j9);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
                ClassLoader classLoader = y.f20039a;
                z = parcel.readInt() != 0;
                long j10 = parcel.readLong();
                y.d(parcel);
                setUserProperty(string5, string6, aVarR02, z, j10);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = y.f20039a;
                z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var16 = iInterfaceQueryLocalInterface2 instanceof l0 ? (l0) iInterfaceQueryLocalInterface2 : new k0(strongBinder2);
                }
                y.d(parcel);
                getUserProperties(string7, string8, z, k0Var16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var15 = iInterfaceQueryLocalInterface3 instanceof l0 ? (l0) iInterfaceQueryLocalInterface3 : new k0(strongBinder3);
                }
                y.d(parcel);
                getMaxUserProperties(string9, k0Var15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j11 = parcel.readLong();
                y.d(parcel);
                setUserId(string10, j11);
                break;
            case 8:
                Bundle bundle3 = (Bundle) y.a(parcel, Bundle.CREATOR);
                long j12 = parcel.readLong();
                y.d(parcel);
                setConditionalUserProperty(bundle3, j12);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) y.a(parcel, Bundle.CREATOR);
                y.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var14 = iInterfaceQueryLocalInterface4 instanceof l0 ? (l0) iInterfaceQueryLocalInterface4 : new k0(strongBinder4);
                }
                y.d(parcel);
                getConditionalUserProperties(string13, string14, k0Var14);
                break;
            case 11:
                ClassLoader classLoader3 = y.f20039a;
                z = parcel.readInt() != 0;
                long j13 = parcel.readLong();
                y.d(parcel);
                setMeasurementEnabled(z, j13);
                break;
            case 12:
                long j14 = parcel.readLong();
                y.d(parcel);
                resetAnalyticsData(j14);
                break;
            case 13:
                long j15 = parcel.readLong();
                y.d(parcel);
                setMinimumSessionDuration(j15);
                break;
            case 14:
                long j16 = parcel.readLong();
                y.d(parcel);
                setSessionTimeoutDuration(j16);
                break;
            case 15:
                vb.a aVarR03 = vb.b.r0(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j17 = parcel.readLong();
                y.d(parcel);
                setCurrentScreen(aVarR03, string15, string16, j17);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var13 = iInterfaceQueryLocalInterface5 instanceof l0 ? (l0) iInterfaceQueryLocalInterface5 : new k0(strongBinder5);
                }
                y.d(parcel);
                getCurrentScreenName(k0Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var12 = iInterfaceQueryLocalInterface6 instanceof l0 ? (l0) iInterfaceQueryLocalInterface6 : new k0(strongBinder6);
                }
                y.d(parcel);
                getCurrentScreenClass(k0Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    r0Var = iInterfaceQueryLocalInterface7 instanceof s0 ? (s0) iInterfaceQueryLocalInterface7 : new r0(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 2);
                }
                y.d(parcel);
                setInstanceIdProvider(r0Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var11 = iInterfaceQueryLocalInterface8 instanceof l0 ? (l0) iInterfaceQueryLocalInterface8 : new k0(strongBinder8);
                }
                y.d(parcel);
                getCachedAppInstanceId(k0Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var10 = iInterfaceQueryLocalInterface9 instanceof l0 ? (l0) iInterfaceQueryLocalInterface9 : new k0(strongBinder9);
                }
                y.d(parcel);
                getAppInstanceId(k0Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var9 = iInterfaceQueryLocalInterface10 instanceof l0 ? (l0) iInterfaceQueryLocalInterface10 : new k0(strongBinder10);
                }
                y.d(parcel);
                getGmpAppId(k0Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var8 = iInterfaceQueryLocalInterface11 instanceof l0 ? (l0) iInterfaceQueryLocalInterface11 : new k0(strongBinder11);
                }
                y.d(parcel);
                generateEventId(k0Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j18 = parcel.readLong();
                y.d(parcel);
                beginAdUnitExposure(string17, j18);
                break;
            case 24:
                String string18 = parcel.readString();
                long j19 = parcel.readLong();
                y.d(parcel);
                endAdUnitExposure(string18, j19);
                break;
            case 25:
                vb.a aVarR04 = vb.b.r0(parcel.readStrongBinder());
                long j20 = parcel.readLong();
                y.d(parcel);
                onActivityStarted(aVarR04, j20);
                break;
            case 26:
                vb.a aVarR05 = vb.b.r0(parcel.readStrongBinder());
                long j21 = parcel.readLong();
                y.d(parcel);
                onActivityStopped(aVarR05, j21);
                break;
            case 27:
                vb.a aVarR06 = vb.b.r0(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) y.a(parcel, Bundle.CREATOR);
                long j22 = parcel.readLong();
                y.d(parcel);
                onActivityCreated(aVarR06, bundle5, j22);
                break;
            case 28:
                vb.a aVarR07 = vb.b.r0(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                y.d(parcel);
                onActivityDestroyed(aVarR07, j23);
                break;
            case 29:
                vb.a aVarR08 = vb.b.r0(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                y.d(parcel);
                onActivityPaused(aVarR08, j24);
                break;
            case 30:
                vb.a aVarR09 = vb.b.r0(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                y.d(parcel);
                onActivityResumed(aVarR09, j25);
                break;
            case 31:
                vb.a aVarR010 = vb.b.r0(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var7 = iInterfaceQueryLocalInterface12 instanceof l0 ? (l0) iInterfaceQueryLocalInterface12 : new k0(strongBinder12);
                }
                long j26 = parcel.readLong();
                y.d(parcel);
                onActivitySaveInstanceState(aVarR010, k0Var7, j26);
                break;
            case 32:
                Bundle bundle6 = (Bundle) y.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var6 = iInterfaceQueryLocalInterface13 instanceof l0 ? (l0) iInterfaceQueryLocalInterface13 : new k0(strongBinder13);
                }
                long j27 = parcel.readLong();
                y.d(parcel);
                performAction(bundle6, k0Var6, j27);
                break;
            case 33:
                int i10 = parcel.readInt();
                String string19 = parcel.readString();
                vb.a aVarR011 = vb.b.r0(parcel.readStrongBinder());
                vb.a aVarR012 = vb.b.r0(parcel.readStrongBinder());
                vb.a aVarR013 = vb.b.r0(parcel.readStrongBinder());
                y.d(parcel);
                logHealthData(i10, string19, aVarR011, aVarR012, aVarR013);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    o0Var3 = iInterfaceQueryLocalInterface14 instanceof q0 ? (q0) iInterfaceQueryLocalInterface14 : new o0(strongBinder14);
                }
                y.d(parcel);
                setEventInterceptor(o0Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    o0Var2 = iInterfaceQueryLocalInterface15 instanceof q0 ? (q0) iInterfaceQueryLocalInterface15 : new o0(strongBinder15);
                }
                y.d(parcel);
                registerOnMeasurementEventListener(o0Var2);
                break;
            case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    o0Var = iInterfaceQueryLocalInterface16 instanceof q0 ? (q0) iInterfaceQueryLocalInterface16 : new o0(strongBinder16);
                }
                y.d(parcel);
                unregisterOnMeasurementEventListener(o0Var);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(y.f20039a);
                y.d(parcel);
                initForTests(hashMap);
                break;
            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var5 = iInterfaceQueryLocalInterface17 instanceof l0 ? (l0) iInterfaceQueryLocalInterface17 : new k0(strongBinder17);
                }
                int i11 = parcel.readInt();
                y.d(parcel);
                getTestFlag(k0Var5, i11);
                break;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                ClassLoader classLoader4 = y.f20039a;
                z = parcel.readInt() != 0;
                y.d(parcel);
                setDataCollectionEnabled(z);
                break;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var4 = iInterfaceQueryLocalInterface18 instanceof l0 ? (l0) iInterfaceQueryLocalInterface18 : new k0(strongBinder18);
                }
                y.d(parcel);
                isDataCollectionEnabled(k0Var4);
                break;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) y.a(parcel, Bundle.CREATOR);
                y.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                long j28 = parcel.readLong();
                y.d(parcel);
                clearMeasurementEnabled(j28);
                break;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                Bundle bundle8 = (Bundle) y.a(parcel, Bundle.CREATOR);
                long j29 = parcel.readLong();
                y.d(parcel);
                setConsent(bundle8, j29);
                break;
            case 45:
                Bundle bundle9 = (Bundle) y.a(parcel, Bundle.CREATOR);
                long j30 = parcel.readLong();
                y.d(parcel);
                setConsentThirdParty(bundle9, j30);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var3 = iInterfaceQueryLocalInterface19 instanceof l0 ? (l0) iInterfaceQueryLocalInterface19 : new k0(strongBinder19);
                }
                y.d(parcel);
                getSessionId(k0Var3);
                break;
            case 48:
                Intent intent = (Intent) y.a(parcel, Intent.CREATOR);
                y.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                v0 v0Var = (v0) y.a(parcel, v0.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j31 = parcel.readLong();
                y.d(parcel);
                setCurrentScreenByScionActivityInfo(v0Var, string20, string21, j31);
                break;
            case 51:
                v0 v0Var2 = (v0) y.a(parcel, v0.CREATOR);
                long j32 = parcel.readLong();
                y.d(parcel);
                onActivityStartedByScionActivityInfo(v0Var2, j32);
                break;
            case 52:
                v0 v0Var3 = (v0) y.a(parcel, v0.CREATOR);
                long j33 = parcel.readLong();
                y.d(parcel);
                onActivityStoppedByScionActivityInfo(v0Var3, j33);
                break;
            case 53:
                v0 v0Var4 = (v0) y.a(parcel, v0.CREATOR);
                Bundle bundle10 = (Bundle) y.a(parcel, Bundle.CREATOR);
                long j34 = parcel.readLong();
                y.d(parcel);
                onActivityCreatedByScionActivityInfo(v0Var4, bundle10, j34);
                break;
            case 54:
                v0 v0Var5 = (v0) y.a(parcel, v0.CREATOR);
                long j35 = parcel.readLong();
                y.d(parcel);
                onActivityDestroyedByScionActivityInfo(v0Var5, j35);
                break;
            case 55:
                v0 v0Var6 = (v0) y.a(parcel, v0.CREATOR);
                long j36 = parcel.readLong();
                y.d(parcel);
                onActivityPausedByScionActivityInfo(v0Var6, j36);
                break;
            case 56:
                v0 v0Var7 = (v0) y.a(parcel, v0.CREATOR);
                long j37 = parcel.readLong();
                y.d(parcel);
                onActivityResumedByScionActivityInfo(v0Var7, j37);
                break;
            case 57:
                v0 v0Var8 = (v0) y.a(parcel, v0.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var2 = iInterfaceQueryLocalInterface20 instanceof l0 ? (l0) iInterfaceQueryLocalInterface20 : new k0(strongBinder20);
                }
                long j38 = parcel.readLong();
                y.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(v0Var8, k0Var2, j38);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    m0Var = iInterfaceQueryLocalInterface21 instanceof n0 ? (n0) iInterfaceQueryLocalInterface21 : new m0(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 2);
                }
                y.d(parcel);
                retrieveAndUploadBatches(m0Var);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
