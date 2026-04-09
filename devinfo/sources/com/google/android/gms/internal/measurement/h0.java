package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h0 extends ac.a implements j0 {
    @Override // com.google.android.gms.internal.measurement.j0
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeLong(j);
        e0(parcelT, 23);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        y.b(parcelT, bundle);
        e0(parcelT, 9);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeLong(j);
        e0(parcelT, 24);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void generateEventId(l0 l0Var) {
        Parcel parcelT = T();
        y.c(parcelT, l0Var);
        e0(parcelT, 22);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getCachedAppInstanceId(l0 l0Var) {
        Parcel parcelT = T();
        y.c(parcelT, l0Var);
        e0(parcelT, 19);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getConditionalUserProperties(String str, String str2, l0 l0Var) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        y.c(parcelT, l0Var);
        e0(parcelT, 10);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getCurrentScreenClass(l0 l0Var) {
        Parcel parcelT = T();
        y.c(parcelT, l0Var);
        e0(parcelT, 17);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getCurrentScreenName(l0 l0Var) {
        Parcel parcelT = T();
        y.c(parcelT, l0Var);
        e0(parcelT, 16);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getGmpAppId(l0 l0Var) {
        Parcel parcelT = T();
        y.c(parcelT, l0Var);
        e0(parcelT, 21);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getMaxUserProperties(String str, l0 l0Var) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        y.c(parcelT, l0Var);
        e0(parcelT, 6);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getUserProperties(String str, String str2, boolean z3, l0 l0Var) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ClassLoader classLoader = y.f20039a;
        parcelT.writeInt(z3 ? 1 : 0);
        y.c(parcelT, l0Var);
        e0(parcelT, 5);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void initialize(vb.a aVar, t0 t0Var, long j) {
        Parcel parcelT = T();
        y.c(parcelT, aVar);
        y.b(parcelT, t0Var);
        parcelT.writeLong(j);
        e0(parcelT, 1);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z10, long j) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        y.b(parcelT, bundle);
        parcelT.writeInt(z3 ? 1 : 0);
        parcelT.writeInt(1);
        parcelT.writeLong(j);
        e0(parcelT, 2);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void logHealthData(int i4, String str, vb.a aVar, vb.a aVar2, vb.a aVar3) {
        Parcel parcelT = T();
        parcelT.writeInt(5);
        parcelT.writeString("Error with data collection. Data lost.");
        y.c(parcelT, aVar);
        y.c(parcelT, aVar2);
        y.c(parcelT, aVar3);
        e0(parcelT, 33);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivityCreatedByScionActivityInfo(v0 v0Var, Bundle bundle, long j) {
        Parcel parcelT = T();
        y.b(parcelT, v0Var);
        y.b(parcelT, bundle);
        parcelT.writeLong(j);
        e0(parcelT, 53);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivityDestroyedByScionActivityInfo(v0 v0Var, long j) {
        Parcel parcelT = T();
        y.b(parcelT, v0Var);
        parcelT.writeLong(j);
        e0(parcelT, 54);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivityPausedByScionActivityInfo(v0 v0Var, long j) {
        Parcel parcelT = T();
        y.b(parcelT, v0Var);
        parcelT.writeLong(j);
        e0(parcelT, 55);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivityResumedByScionActivityInfo(v0 v0Var, long j) {
        Parcel parcelT = T();
        y.b(parcelT, v0Var);
        parcelT.writeLong(j);
        e0(parcelT, 56);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivitySaveInstanceStateByScionActivityInfo(v0 v0Var, l0 l0Var, long j) {
        Parcel parcelT = T();
        y.b(parcelT, v0Var);
        y.c(parcelT, l0Var);
        parcelT.writeLong(j);
        e0(parcelT, 57);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivityStartedByScionActivityInfo(v0 v0Var, long j) {
        Parcel parcelT = T();
        y.b(parcelT, v0Var);
        parcelT.writeLong(j);
        e0(parcelT, 51);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivityStoppedByScionActivityInfo(v0 v0Var, long j) {
        Parcel parcelT = T();
        y.b(parcelT, v0Var);
        parcelT.writeLong(j);
        e0(parcelT, 52);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void registerOnMeasurementEventListener(q0 q0Var) {
        Parcel parcelT = T();
        y.c(parcelT, q0Var);
        e0(parcelT, 35);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void retrieveAndUploadBatches(n0 n0Var) {
        Parcel parcelT = T();
        y.c(parcelT, n0Var);
        e0(parcelT, 58);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelT = T();
        y.b(parcelT, bundle);
        parcelT.writeLong(j);
        e0(parcelT, 8);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel parcelT = T();
        y.b(parcelT, bundle);
        parcelT.writeLong(j);
        e0(parcelT, 45);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setCurrentScreenByScionActivityInfo(v0 v0Var, String str, String str2, long j) {
        Parcel parcelT = T();
        y.b(parcelT, v0Var);
        parcelT.writeString(str);
        parcelT.writeString(str2);
        parcelT.writeLong(j);
        e0(parcelT, 50);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setDataCollectionEnabled(boolean z3) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setMeasurementEnabled(boolean z3, long j) {
        Parcel parcelT = T();
        ClassLoader classLoader = y.f20039a;
        parcelT.writeInt(z3 ? 1 : 0);
        parcelT.writeLong(j);
        e0(parcelT, 11);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setUserProperty(String str, String str2, vb.a aVar, boolean z3, long j) {
        Parcel parcelT = T();
        parcelT.writeString(null);
        parcelT.writeString(str2);
        y.c(parcelT, aVar);
        parcelT.writeInt(0);
        parcelT.writeLong(j);
        e0(parcelT, 4);
    }
}
