package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c60 extends mg implements va.x1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9997a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9998b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9999c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10000d;

    /* renamed from: e, reason: collision with root package name */
    public final List f10001e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10002f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final ei0 f10003h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f10004i;
    public final double j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10005k;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c60(com.google.android.gms.internal.ads.wp0 r3, java.lang.String r4, com.google.android.gms.internal.ads.ei0 r5, com.google.android.gms.internal.ads.yp0 r6, java.lang.String r7) throws org.json.JSONException {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            r2.<init>(r0)
            r0 = 0
            if (r3 != 0) goto La
            r1 = r0
            goto Lc
        La:
            java.lang.String r1 = r3.f18075b0
        Lc:
            r2.f9998b = r1
            r2.f9999c = r7
            if (r6 != 0) goto L14
            r7 = r0
            goto L16
        L14:
            java.lang.String r7 = r6.f18820b
        L16:
            r2.f10000d = r7
            java.lang.String r7 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L28
            java.lang.String r7 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L32
        L28:
            if (r3 == 0) goto L32
            org.json.JSONObject r7 = r3.f18112v     // Catch: org.json.JSONException -> L32
            java.lang.String r1 = "class_name"
            java.lang.String r0 = r7.getString(r1)     // Catch: org.json.JSONException -> L32
        L32:
            if (r0 == 0) goto L35
            r4 = r0
        L35:
            r2.f9997a = r4
            java.util.List r4 = r5.f10801a
            r2.f10001e = r4
            r2.f10003h = r5
            if (r3 != 0) goto L42
            r4 = 0
            goto L44
        L42:
            double r4 = r3.f18121z0
        L44:
            r2.j = r4
            if (r3 != 0) goto L4a
            r4 = 2
            goto L4c
        L4a:
            int r4 = r3.H0
        L4c:
            r2.f10005k = r4
            ua.j r4 = ua.j.C
            tb.a r4 = r4.f35267k
            r4.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r0
            r2.f10002f = r4
            com.google.android.gms.internal.ads.pk r4 = com.google.android.gms.internal.ads.sk.f16434z7
            va.s r5 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r7 = r5.f36166c
            com.google.android.gms.internal.ads.rk r5 = r5.f36166c
            java.lang.Object r4 = r7.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L79
            if (r6 == 0) goto L79
            android.os.Bundle r4 = r6.f18827k
            r2.f10004i = r4
            goto L80
        L79:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r2.f10004i = r4
        L80:
            com.google.android.gms.internal.ads.pk r4 = com.google.android.gms.internal.ads.sk.A7
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L99
            if (r3 == 0) goto L99
            android.os.Bundle r3 = r3.F0
            android.os.Bundle r4 = r2.f10004i
            if (r4 == 0) goto L99
            r4.putAll(r3)
        L99:
            com.google.android.gms.internal.ads.pk r3 = com.google.android.gms.internal.ads.sk.f16421ya
            java.lang.Object r3 = r5.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb1
            if (r6 == 0) goto Lb1
            java.lang.String r3 = r6.f18826i
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto Lb3
        Lb1:
            java.lang.String r3 = ""
        Lb3:
            r2.g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c60.<init>(com.google.android.gms.internal.ads.wp0, java.lang.String, com.google.android.gms.internal.ads.ei0, com.google.android.gms.internal.ads.yp0, java.lang.String):void");
    }

    public static va.x1 h4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof va.x1 ? (va.x1) iInterfaceQueryLocalInterface : new va.v1(iBinder);
    }

    @Override // va.x1
    public final String A1() {
        return this.f9999c;
    }

    @Override // va.x1
    public final Bundle C1() {
        return this.f10004i;
    }

    @Override // va.x1
    public final String c() {
        return this.f9997a;
    }

    @Override // va.x1
    public final String d() {
        return this.f9998b;
    }

    @Override // va.x1
    public final List e() {
        return this.f10001e;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(this.f9997a);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString(this.f9998b);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeTypedList(this.f10001e);
                return true;
            case 4:
                va.e3 e3VarZ1 = z1();
                parcel2.writeNoException();
                ng.d(parcel2, e3VarZ1);
                return true;
            case 5:
                parcel2.writeNoException();
                ng.d(parcel2, this.f10004i);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString(this.f9999c);
                return true;
            default:
                return false;
        }
    }

    @Override // va.x1
    public final va.e3 z1() {
        ei0 ei0Var = this.f10003h;
        if (ei0Var != null) {
            return ei0Var.f10806f;
        }
        return null;
    }
}
