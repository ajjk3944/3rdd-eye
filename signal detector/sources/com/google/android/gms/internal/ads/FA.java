package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class FA extends B7 {

    /* renamed from: a, reason: collision with root package name */
    public final h2.d f8066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GA f8067b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FA(GA ga, h2.d dVar) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        this.f8067b = ga;
        this.f8066a = dVar;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        C0447Bq c0447Bq;
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) C7.b(parcel, Bundle.CREATOR);
        C7.f(parcel);
        int i3 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i6 = bundle.getInt("uiMode", 0);
        byte b5 = (byte) (((byte) (0 | 1)) | 1);
        if (string == null) {
            string = null;
        }
        byte b6 = (byte) (b5 | 2);
        if (b6 != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b6 & 1) == 0) {
                sb.append(" statusCode");
            }
            if ((b6 & 2) == 0) {
                sb.append(" uiMode");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        this.f8066a.q(new CA(i3, i6, string));
        if (i3 == 8157 && (c0447Bq = this.f8067b.f8329a) != null) {
            GA.f8327c.c("unbind LMD display overlay service", new Object[0]);
            c0447Bq.b(new Fu(12, c0447Bq));
        }
        return true;
    }
}
