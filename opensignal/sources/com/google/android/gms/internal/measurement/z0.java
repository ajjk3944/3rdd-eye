package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class z0 extends y implements o0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zc.z1 f5277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(v0 v0Var, zc.z1 z1Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f5277d = z1Var;
    }

    @Override // com.google.android.gms.internal.measurement.o0
    public final void a() throws NumberFormatException {
        this.f5277d.run();
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean d(int i10, Parcel parcel, Parcel parcel2) throws NumberFormatException {
        if (i10 != 2) {
            return false;
        }
        a();
        return true;
    }
}
