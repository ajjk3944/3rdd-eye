package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p9 extends ls {
    public int H;
    public final Context I;
    public final String J;
    public qg K;
    public o9 L;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p9(android.content.Context r11) {
        /*
            r10 = this;
            r0 = 23
            r10.<init>(r0)
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r10.H = r0
            android.content.Context r0 = r11.getApplicationContext()
            r10.I = r0
            int r0 = a4.b.f187a
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r0 >= r2) goto L81
            r3 = 33
            if (r0 < r3) goto La1
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r3 = "CODENAME"
            nk.k.d(r0, r3)
            java.lang.String r3 = "REL"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2f
            goto La1
        L2f:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r4 = r0.toUpperCase(r3)
            java.lang.String r5 = "toUpperCase(...)"
            nk.k.d(r4, r5)
            java.lang.String r6 = "BAKLAVA"
            boolean r4 = r4.equals(r6)
            r7 = 0
            if (r4 == 0) goto L45
            r4 = r1
            goto L46
        L45:
            r4 = r7
        L46:
            java.lang.String r8 = "UpsideDownCake"
            java.lang.String r9 = r8.toUpperCase(r3)
            nk.k.d(r9, r5)
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L56
            goto L57
        L56:
            r1 = r7
        L57:
            if (r4 == 0) goto L66
            if (r1 == 0) goto L66
            int r0 = r4.intValue()
            int r1 = r1.intValue()
            if (r0 < r1) goto La1
            goto L81
        L66:
            if (r4 != 0) goto L7f
            if (r1 != 0) goto L7f
            java.lang.String r0 = r0.toUpperCase(r3)
            nk.k.d(r0, r5)
            java.lang.String r1 = r8.toUpperCase(r3)
            nk.k.d(r1, r5)
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto La1
            goto L81
        L7f:
            if (r4 == 0) goto La1
        L81:
            int r0 = android.os.ext.SdkExtensions.getExtensionVersion(r2)
            r1 = 8
            if (r0 < r1) goto La1
            boolean r0 = android.os.Process.isSdkSandbox()
            if (r0 == 0) goto L9c
            java.lang.Class<android.app.sdksandbox.sdkprovider.SdkSandboxController> r0 = android.app.sdksandbox.sdkprovider.SdkSandboxController.class
            java.lang.Object r11 = r11.getSystemService(r0)
            android.app.sdksandbox.sdkprovider.SdkSandboxController r11 = (android.app.sdksandbox.sdkprovider.SdkSandboxController) r11
            java.lang.String r11 = r11.getClientPackageName()
            goto La5
        L9c:
            java.lang.String r11 = r11.getPackageName()
            goto La5
        La1:
            java.lang.String r11 = r11.getPackageName()
        La5:
            r10.J = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p9.<init>(android.content.Context):void");
    }

    public final boolean Z() {
        return (this.H != 2 || this.K == null || this.L == null) ? false : true;
    }

    public final ix0 a0() throws RemoteException {
        if (!Z()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.J);
        try {
            og ogVar = (og) this.K;
            Parcel parcelT = ogVar.T();
            ng.c(parcelT, bundle);
            Parcel parcelR0 = ogVar.r0(parcelT, 1);
            Bundle bundle2 = (Bundle) ng.b(parcelR0, Bundle.CREATOR);
            parcelR0.recycle();
            return new ix0(6, bundle2);
        } catch (RemoteException e2) {
            jz.l("RemoteException getting install referrer information");
            this.H = 0;
            throw e2;
        }
    }
}
