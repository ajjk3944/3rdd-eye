package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r21 extends mg {

    /* renamed from: a, reason: collision with root package name */
    public final km.y f15508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s21 f15509b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r21(s21 s21Var, km.y yVar) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        this.f15509b = s21Var;
        this.f15508a = yVar;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        xi0 xi0Var;
        if (i4 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) ng.b(parcel, Bundle.CREATOR);
        ng.f(parcel);
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i11 = bundle.getInt("uiMode", 0);
        byte b10 = (byte) (((byte) (0 | 1)) | 1);
        if (string == null) {
            string = null;
        }
        byte b11 = (byte) (b10 | 2);
        if (b11 != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((b11 & 1) == 0) {
                sb2.append(" statusCode");
            }
            if ((b11 & 2) == 0) {
                sb2.append(" uiMode");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        this.f15508a.D(new o21(i10, i11, string));
        if (i10 == 8157 && (xi0Var = this.f15509b.f15847a) != null) {
            s21.f15845c.a("unbind LMD display overlay service", new Object[0]);
            xi0Var.i(new du0(11, xi0Var));
        }
        return true;
    }
}
