package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import x3.InterfaceC8420a;

/* loaded from: classes.dex */
public final class R0 extends Y implements P0 {
    R0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeLong(j10);
        f(23, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC4298a0.d(parcelB, bundle);
        f(9, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void endAdUnitExposure(String str, long j10) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeLong(j10);
        f(24, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void generateEventId(U0 u02) {
        Parcel parcelB = b();
        AbstractC4298a0.c(parcelB, u02);
        f(22, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCachedAppInstanceId(U0 u02) {
        Parcel parcelB = b();
        AbstractC4298a0.c(parcelB, u02);
        f(19, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getConditionalUserProperties(String str, String str2, U0 u02) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC4298a0.c(parcelB, u02);
        f(10, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCurrentScreenClass(U0 u02) {
        Parcel parcelB = b();
        AbstractC4298a0.c(parcelB, u02);
        f(17, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCurrentScreenName(U0 u02) {
        Parcel parcelB = b();
        AbstractC4298a0.c(parcelB, u02);
        f(16, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getGmpAppId(U0 u02) {
        Parcel parcelB = b();
        AbstractC4298a0.c(parcelB, u02);
        f(21, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getMaxUserProperties(String str, U0 u02) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        AbstractC4298a0.c(parcelB, u02);
        f(6, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getUserProperties(String str, String str2, boolean z10, U0 u02) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC4298a0.e(parcelB, z10);
        AbstractC4298a0.c(parcelB, u02);
        f(5, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void initialize(InterfaceC8420a interfaceC8420a, C4326d1 c4326d1, long j10) {
        Parcel parcelB = b();
        AbstractC4298a0.c(parcelB, interfaceC8420a);
        AbstractC4298a0.d(parcelB, c4326d1);
        parcelB.writeLong(j10);
        f(1, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC4298a0.d(parcelB, bundle);
        AbstractC4298a0.e(parcelB, z10);
        AbstractC4298a0.e(parcelB, z11);
        parcelB.writeLong(j10);
        f(2, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void logHealthData(int i10, String str, InterfaceC8420a interfaceC8420a, InterfaceC8420a interfaceC8420a2, InterfaceC8420a interfaceC8420a3) {
        Parcel parcelB = b();
        parcelB.writeInt(i10);
        parcelB.writeString(str);
        AbstractC4298a0.c(parcelB, interfaceC8420a);
        AbstractC4298a0.c(parcelB, interfaceC8420a2);
        AbstractC4298a0.c(parcelB, interfaceC8420a3);
        f(33, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityCreatedByScionActivityInfo(C4353g1 c4353g1, Bundle bundle, long j10) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, c4353g1);
        AbstractC4298a0.d(parcelB, bundle);
        parcelB.writeLong(j10);
        f(53, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityDestroyedByScionActivityInfo(C4353g1 c4353g1, long j10) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, c4353g1);
        parcelB.writeLong(j10);
        f(54, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityPausedByScionActivityInfo(C4353g1 c4353g1, long j10) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, c4353g1);
        parcelB.writeLong(j10);
        f(55, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityResumedByScionActivityInfo(C4353g1 c4353g1, long j10) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, c4353g1);
        parcelB.writeLong(j10);
        f(56, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivitySaveInstanceStateByScionActivityInfo(C4353g1 c4353g1, U0 u02, long j10) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, c4353g1);
        AbstractC4298a0.c(parcelB, u02);
        parcelB.writeLong(j10);
        f(57, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityStartedByScionActivityInfo(C4353g1 c4353g1, long j10) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, c4353g1);
        parcelB.writeLong(j10);
        f(51, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityStoppedByScionActivityInfo(C4353g1 c4353g1, long j10) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, c4353g1);
        parcelB.writeLong(j10);
        f(52, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void registerOnMeasurementEventListener(InterfaceC4299a1 interfaceC4299a1) {
        Parcel parcelB = b();
        AbstractC4298a0.c(parcelB, interfaceC4299a1);
        f(35, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void retrieveAndUploadBatches(V0 v02) {
        Parcel parcelB = b();
        AbstractC4298a0.c(parcelB, v02);
        f(58, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, bundle);
        parcelB.writeLong(j10);
        f(8, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setCurrentScreenByScionActivityInfo(C4353g1 c4353g1, String str, String str2, long j10) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, c4353g1);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeLong(j10);
        f(50, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel parcelB = b();
        AbstractC4298a0.e(parcelB, z10);
        f(39, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setUserId(String str, long j10) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeLong(j10);
        f(7, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setUserProperty(String str, String str2, InterfaceC8420a interfaceC8420a, boolean z10, long j10) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC4298a0.c(parcelB, interfaceC8420a);
        AbstractC4298a0.e(parcelB, z10);
        parcelB.writeLong(j10);
        f(4, parcelB);
    }
}
