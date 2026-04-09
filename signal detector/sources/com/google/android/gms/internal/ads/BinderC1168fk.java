package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import q2.C2850w0;
import q2.InterfaceC2854y0;

/* renamed from: com.google.android.gms.internal.ads.fk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1168fk extends B7 implements InterfaceC2854y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14124a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14125b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14126c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14127d;

    /* renamed from: e, reason: collision with root package name */
    public final List f14128e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14129f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14130g;

    /* renamed from: h, reason: collision with root package name */
    public final C1228gq f14131h;
    public final Bundle i;

    /* renamed from: j, reason: collision with root package name */
    public final double f14132j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14133k;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BinderC1168fk(com.google.android.gms.internal.ads.Qt r3, java.lang.String r4, com.google.android.gms.internal.ads.C1228gq r5, com.google.android.gms.internal.ads.St r6, java.lang.String r7) throws org.json.JSONException {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            r2.<init>(r0)
            r0 = 0
            if (r3 != 0) goto La
            r1 = r0
            goto Lc
        La:
            java.lang.String r1 = r3.b0
        Lc:
            r2.f14125b = r1
            r2.f14126c = r7
            if (r6 != 0) goto L14
            r7 = r0
            goto L16
        L14:
            java.lang.String r7 = r6.f11269b
        L16:
            r2.f14127d = r7
            java.lang.String r7 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L28
            java.lang.String r7 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L32
        L28:
            if (r3 == 0) goto L32
            org.json.JSONObject r7 = r3.f10797v     // Catch: org.json.JSONException -> L32
            java.lang.String r1 = "class_name"
            java.lang.String r0 = r7.getString(r1)     // Catch: org.json.JSONException -> L32
        L32:
            if (r0 == 0) goto L35
            r4 = r0
        L35:
            r2.f14124a = r4
            java.util.List r4 = r5.f14380a
            r2.f14128e = r4
            r2.f14131h = r5
            if (r3 != 0) goto L42
            r4 = 0
            goto L44
        L42:
            double r4 = r3.f10805z0
        L44:
            r2.f14132j = r4
            if (r3 != 0) goto L4a
            r4 = 2
            goto L4c
        L4a:
            int r4 = r3.f10739H0
        L4c:
            r2.f14133k = r4
            p2.j r4 = p2.j.f22785C
            Q2.a r4 = r4.f22797k
            r4.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r0
            r2.f14129f = r4
            com.google.android.gms.internal.ads.E9 r4 = com.google.android.gms.internal.ads.H9.z7
            q2.s r5 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r7 = r5.f23270c
            com.google.android.gms.internal.ads.G9 r5 = r5.f23270c
            java.lang.Object r4 = r7.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L79
            if (r6 == 0) goto L79
            android.os.Bundle r4 = r6.f11277k
            r2.i = r4
            goto L80
        L79:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r2.i = r4
        L80:
            com.google.android.gms.internal.ads.E9 r4 = com.google.android.gms.internal.ads.H9.A7
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L99
            if (r3 == 0) goto L99
            android.os.Bundle r3 = r3.f10735F0
            android.os.Bundle r4 = r2.i
            if (r4 == 0) goto L99
            r4.putAll(r3)
        L99:
            com.google.android.gms.internal.ads.E9 r3 = com.google.android.gms.internal.ads.H9.wa
            java.lang.Object r3 = r5.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb1
            if (r6 == 0) goto Lb1
            java.lang.String r3 = r6.i
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto Lb3
        Lb1:
            java.lang.String r3 = ""
        Lb3:
            r2.f14130g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1168fk.<init>(com.google.android.gms.internal.ads.Qt, java.lang.String, com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.St, java.lang.String):void");
    }

    public static InterfaceC2854y0 K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2854y0 ? (InterfaceC2854y0) iInterfaceQueryLocalInterface : new C2850w0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(this.f14124a);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString(this.f14125b);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeTypedList(this.f14128e);
                return true;
            case 4:
                q2.f1 f1VarG = g();
                parcel2.writeNoException();
                C7.d(parcel2, f1VarG);
                return true;
            case 5:
                parcel2.writeNoException();
                C7.d(parcel2, this.i);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString(this.f14126c);
                return true;
            default:
                return false;
        }
    }

    @Override // q2.InterfaceC2854y0
    public final String b() {
        return this.f14124a;
    }

    @Override // q2.InterfaceC2854y0
    public final String d() {
        return this.f14125b;
    }

    @Override // q2.InterfaceC2854y0
    public final List e() {
        return this.f14128e;
    }

    @Override // q2.InterfaceC2854y0
    public final q2.f1 g() {
        C1228gq c1228gq = this.f14131h;
        if (c1228gq != null) {
            return c1228gq.f14385f;
        }
        return null;
    }

    @Override // q2.InterfaceC2854y0
    public final String h() {
        return this.f14126c;
    }

    @Override // q2.InterfaceC2854y0
    public final Bundle j() {
        return this.i;
    }
}
