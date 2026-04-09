package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class lq1 implements Parcelable {
    public static final Parcelable.Creator<lq1> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final int f30076b;

    public class a implements Parcelable.Creator<lq1> {
        @Override // android.os.Parcelable.Creator
        public final lq1 createFromParcel(Parcel parcel) {
            return new lq1(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final lq1[] newArray(int i) {
            return new lq1[i];
        }
    }

    public lq1(int i) {
        this.f30076b = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(android.content.Context r7) {
        /*
            r6 = this;
            boolean r0 = r6.e()
            r1 = 2
            if (r0 != 0) goto L8
            goto L48
        L8:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r7.getSystemService(r0)
            r0.getClass()
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r2 = r0.getActiveNetworkInfo()
            if (r2 == 0) goto L4a
            boolean r2 = r2.isConnected()
            if (r2 == 0) goto L4a
            int r2 = com.yandex.mobile.ads.impl.s82.f32899a
            r3 = 24
            if (r2 >= r3) goto L26
            goto L3b
        L26:
            android.net.Network r2 = r0.getActiveNetwork()
            if (r2 != 0) goto L2d
            goto L4a
        L2d:
            android.net.NetworkCapabilities r2 = r0.getNetworkCapabilities(r2)     // Catch: java.lang.SecurityException -> L3b
            if (r2 == 0) goto L4a
            r3 = 16
            boolean r2 = r2.hasCapability(r3)     // Catch: java.lang.SecurityException -> L3b
            if (r2 == 0) goto L4a
        L3b:
            int r2 = r6.f30076b
            r2 = r2 & r1
            if (r2 == 0) goto L48
            boolean r0 = r0.isActiveNetworkMetered()
            if (r0 == 0) goto L48
            r0 = r1
            goto L4e
        L48:
            r0 = 0
            goto L4e
        L4a:
            int r0 = r6.f30076b
            r0 = r0 & 3
        L4e:
            boolean r2 = r6.c()
            r3 = 0
            if (r2 == 0) goto L72
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r4 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r4)
            android.content.Intent r2 = r7.registerReceiver(r3, r2)
            if (r2 != 0) goto L63
            goto L70
        L63:
            java.lang.String r4 = "status"
            r5 = -1
            int r2 = r2.getIntExtra(r4, r5)
            if (r2 == r1) goto L72
            r1 = 5
            if (r2 != r1) goto L70
            goto L72
        L70:
            r0 = r0 | 8
        L72:
            boolean r1 = r6.d()
            if (r1 == 0) goto La4
            java.lang.String r1 = "power"
            java.lang.Object r1 = r7.getSystemService(r1)
            r1.getClass()
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            int r2 = com.yandex.mobile.ads.impl.s82.f32899a
            r4 = 23
            if (r2 < r4) goto L90
            boolean r1 = r1.isDeviceIdleMode()
            if (r1 != 0) goto La4
            goto La2
        L90:
            r4 = 20
            if (r2 < r4) goto L9b
            boolean r1 = r1.isInteractive()
            if (r1 != 0) goto La2
            goto La4
        L9b:
            boolean r1 = r1.isScreenOn()
            if (r1 != 0) goto La2
            goto La4
        La2:
            r0 = r0 | 4
        La4:
            boolean r1 = r6.f()
            if (r1 == 0) goto Lba
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.DEVICE_STORAGE_LOW"
            r1.<init>(r2)
            android.content.Intent r7 = r7.registerReceiver(r3, r1)
            if (r7 != 0) goto Lb8
            goto Lba
        Lb8:
            r0 = r0 | 16
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lq1.a(android.content.Context):int");
    }

    public final boolean c() {
        return (this.f30076b & 8) != 0;
    }

    public final boolean d() {
        return (this.f30076b & 4) != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return (this.f30076b & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && lq1.class == obj.getClass() && this.f30076b == ((lq1) obj).f30076b;
    }

    public final boolean f() {
        return (this.f30076b & 16) != 0;
    }

    public final int hashCode() {
        return this.f30076b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30076b);
    }
}
