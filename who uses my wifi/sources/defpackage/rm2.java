package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rm2 extends hv1 implements tx2 {
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final long k;
    public final String l;
    public final e03 m;
    public final Bundle n;
    public final double o;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rm2(defpackage.a83 r3, java.lang.String r4, defpackage.e03 r5, defpackage.c83 r6, java.lang.String r7) throws org.json.JSONException {
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
            r2.g = r1
            r2.h = r7
            if (r6 != 0) goto L14
            r7 = r0
            goto L16
        L14:
            java.lang.String r7 = r6.b
        L16:
            r2.i = r7
            java.lang.String r7 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L28
            java.lang.String r7 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L32
        L28:
            if (r3 == 0) goto L32
            org.json.JSONObject r7 = r3.v     // Catch: org.json.JSONException -> L32
            java.lang.String r1 = "class_name"
            java.lang.String r0 = r7.getString(r1)     // Catch: org.json.JSONException -> L32
        L32:
            if (r0 == 0) goto L35
            r4 = r0
        L35:
            r2.f = r4
            java.util.List r4 = r5.a
            r2.j = r4
            r2.m = r5
            if (r3 != 0) goto L42
            r3 = 0
            goto L44
        L42:
            double r3 = r3.z0
        L44:
            r2.o = r3
            hg4 r3 = defpackage.hg4.C
            ym r3 = r3.k
            r3.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            r2.k = r3
            iz1 r3 = defpackage.mz1.f7
            tw1 r4 = defpackage.tw1.e
            kz1 r5 = r4.c
            java.lang.Object r3 = r5.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L6f
            if (r6 == 0) goto L6f
            android.os.Bundle r3 = r6.k
            r2.n = r3
            goto L76
        L6f:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r2.n = r3
        L76:
            iz1 r3 = defpackage.mz1.Z9
            kz1 r4 = r4.c
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L90
            if (r6 == 0) goto L90
            java.lang.String r3 = r6.i
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L92
        L90:
            java.lang.String r3 = ""
        L92:
            r2.l = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm2.<init>(a83, java.lang.String, e03, c83, java.lang.String):void");
    }

    public static tx2 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof tx2 ? (tx2) iInterfaceQueryLocalInterface : new ow2(iBinder);
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(this.f);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString(this.g);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeTypedList(this.j);
                return true;
            case 4:
                qh4 qh4VarF = f();
                parcel2.writeNoException();
                iv1.d(parcel2, qh4VarF);
                return true;
            case 5:
                parcel2.writeNoException();
                iv1.d(parcel2, this.n);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString(this.h);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.tx2
    public final String b() {
        return this.f;
    }

    @Override // defpackage.tx2
    public final String c() {
        return this.g;
    }

    @Override // defpackage.tx2
    public final List e() {
        return this.j;
    }

    @Override // defpackage.tx2
    public final qh4 f() {
        e03 e03Var = this.m;
        if (e03Var != null) {
            return e03Var.f;
        }
        return null;
    }

    @Override // defpackage.tx2
    public final String g() {
        return this.h;
    }

    @Override // defpackage.tx2
    public final Bundle j() {
        return this.n;
    }
}
