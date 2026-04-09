package com.google.android.gms.internal.measurement;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Parcel;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b1 extends x implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd.a f19618a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(z0 z0Var, vd.a aVar) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f19618a = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final boolean O(int i4, Parcel parcel, Parcel parcel2) throws JSONException, Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException, ClassNotFoundException {
        if (i4 != 2) {
            return false;
        }
        c();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final void c() throws JSONException, Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException, ClassNotFoundException {
        this.f19618a.run();
    }
}
