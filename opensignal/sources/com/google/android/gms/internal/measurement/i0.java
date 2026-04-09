package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class i0 extends x implements k0 {
    @Override // com.google.android.gms.internal.measurement.k0
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeLong(j);
        S(parcelR, 23);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        z.b(parcelR, bundle);
        S(parcelR, 9);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeLong(j);
        S(parcelR, 24);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void generateEventId(m0 m0Var) {
        Parcel parcelR = R();
        z.c(parcelR, m0Var);
        S(parcelR, 22);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getCachedAppInstanceId(m0 m0Var) {
        Parcel parcelR = R();
        z.c(parcelR, m0Var);
        S(parcelR, 19);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getConditionalUserProperties(String str, String str2, m0 m0Var) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        z.c(parcelR, m0Var);
        S(parcelR, 10);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getCurrentScreenClass(m0 m0Var) {
        Parcel parcelR = R();
        z.c(parcelR, m0Var);
        S(parcelR, 17);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getCurrentScreenName(m0 m0Var) {
        Parcel parcelR = R();
        z.c(parcelR, m0Var);
        S(parcelR, 16);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getGmpAppId(m0 m0Var) {
        Parcel parcelR = R();
        z.c(parcelR, m0Var);
        S(parcelR, 21);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getMaxUserProperties(String str, m0 m0Var) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        z.c(parcelR, m0Var);
        S(parcelR, 6);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getUserProperties(String str, String str2, boolean z10, m0 m0Var) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        ClassLoader classLoader = z.f5276a;
        parcelR.writeInt(z10 ? 1 : 0);
        z.c(parcelR, m0Var);
        S(parcelR, 5);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void initialize(jc.b bVar, zzdd zzddVar, long j) {
        Parcel parcelR = R();
        z.c(parcelR, bVar);
        z.b(parcelR, zzddVar);
        parcelR.writeLong(j);
        S(parcelR, 1);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        z.b(parcelR, bundle);
        parcelR.writeInt(z10 ? 1 : 0);
        parcelR.writeInt(1);
        parcelR.writeLong(j);
        S(parcelR, 2);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void logHealthData(int i10, String str, jc.b bVar, jc.b bVar2, jc.b bVar3) {
        Parcel parcelR = R();
        parcelR.writeInt(5);
        parcelR.writeString("Error with data collection. Data lost.");
        z.c(parcelR, bVar);
        z.c(parcelR, bVar2);
        z.c(parcelR, bVar3);
        S(parcelR, 33);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) {
        Parcel parcelR = R();
        z.b(parcelR, zzdfVar);
        z.b(parcelR, bundle);
        parcelR.writeLong(j);
        S(parcelR, 53);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelR = R();
        z.b(parcelR, zzdfVar);
        parcelR.writeLong(j);
        S(parcelR, 54);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelR = R();
        z.b(parcelR, zzdfVar);
        parcelR.writeLong(j);
        S(parcelR, 55);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelR = R();
        z.b(parcelR, zzdfVar);
        parcelR.writeLong(j);
        S(parcelR, 56);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, m0 m0Var, long j) {
        Parcel parcelR = R();
        z.b(parcelR, zzdfVar);
        z.c(parcelR, m0Var);
        parcelR.writeLong(j);
        S(parcelR, 57);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelR = R();
        z.b(parcelR, zzdfVar);
        parcelR.writeLong(j);
        S(parcelR, 51);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelR = R();
        z.b(parcelR, zzdfVar);
        parcelR.writeLong(j);
        S(parcelR, 52);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void registerOnMeasurementEventListener(r0 r0Var) {
        Parcel parcelR = R();
        z.c(parcelR, r0Var);
        S(parcelR, 35);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void retrieveAndUploadBatches(o0 o0Var) {
        Parcel parcelR = R();
        z.c(parcelR, o0Var);
        S(parcelR, 58);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelR = R();
        z.b(parcelR, bundle);
        parcelR.writeLong(j);
        S(parcelR, 8);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) {
        Parcel parcelR = R();
        z.b(parcelR, zzdfVar);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeLong(j);
        S(parcelR, 50);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setDataCollectionEnabled(boolean z10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setUserProperty(String str, String str2, jc.b bVar, boolean z10, long j) {
        Parcel parcelR = R();
        parcelR.writeString("fcm");
        parcelR.writeString("_ln");
        z.c(parcelR, bVar);
        parcelR.writeInt(1);
        parcelR.writeLong(j);
        S(parcelR, 4);
    }
}
