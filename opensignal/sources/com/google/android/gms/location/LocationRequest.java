package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import cc.s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.libs.identity.ClientIdentity;
import i6.a;
import java.util.Arrays;
import pc.i;

/* loaded from: classes.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new a(27);
    public float B;
    public final boolean D;
    public long E;
    public final int F;
    public final int G;
    public final boolean H;
    public final WorkSource I;
    public final ClientIdentity J;

    /* renamed from: a, reason: collision with root package name */
    public int f5307a;

    /* renamed from: d, reason: collision with root package name */
    public long f5308d;

    /* renamed from: g, reason: collision with root package name */
    public long f5309g;

    /* renamed from: r, reason: collision with root package name */
    public final long f5310r;

    /* renamed from: x, reason: collision with root package name */
    public long f5311x;

    /* renamed from: y, reason: collision with root package name */
    public int f5312y;

    public LocationRequest(int i10, long j, long j7, long j10, long j11, long j12, int i11, float f10, boolean z10, long j13, int i12, int i13, boolean z11, WorkSource workSource, ClientIdentity clientIdentity) {
        this.f5307a = i10;
        if (i10 == 105) {
            this.f5308d = Long.MAX_VALUE;
        } else {
            this.f5308d = j;
        }
        this.f5309g = j7;
        this.f5310r = j10;
        this.f5311x = j11 == Long.MAX_VALUE ? j12 : Math.min(Math.max(1L, j11 - SystemClock.elapsedRealtime()), j12);
        this.f5312y = i11;
        this.B = f10;
        this.D = z10;
        this.E = j13 != -1 ? j13 : j;
        this.F = i12;
        this.G = i13;
        this.H = z11;
        this.I = workSource;
        this.J = clientIdentity;
    }

    public static String j(long j) {
        String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = i.f20449b;
        synchronized (sb2) {
            sb2.setLength(0);
            i.a(j, sb2);
            string = sb2.toString();
        }
        return string;
    }

    public final boolean d() {
        long j = this.f5310r;
        return j > 0 && (j >> 1) >= this.f5308d;
    }

    public final void e(long j) {
        s.c(j >= 0, "illegal fastest interval: %d", Long.valueOf(j));
        this.f5309g = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i10 = this.f5307a;
        if (i10 != locationRequest.f5307a) {
            return false;
        }
        if ((i10 == 105 || this.f5308d == locationRequest.f5308d) && this.f5309g == locationRequest.f5309g && d() == locationRequest.d()) {
            return (!d() || this.f5310r == locationRequest.f5310r) && this.f5311x == locationRequest.f5311x && this.f5312y == locationRequest.f5312y && this.B == locationRequest.B && this.D == locationRequest.D && this.F == locationRequest.F && this.G == locationRequest.G && this.H == locationRequest.H && this.I.equals(locationRequest.I) && s.k(this.J, locationRequest.J);
        }
        return false;
    }

    public final void g(long j) {
        s.a("intervalMillis must be greater than or equal to 0", j >= 0);
        long j7 = this.f5309g;
        long j10 = this.f5308d;
        if (j7 == j10 / 6) {
            this.f5309g = j / 6;
        }
        if (this.E == j10) {
            this.E = j;
        }
        this.f5308d = j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5307a), Long.valueOf(this.f5308d), Long.valueOf(this.f5309g), this.I});
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        int i11 = this.f5307a;
        i4.S(parcel, 1, 4);
        parcel.writeInt(i11);
        long j = this.f5308d;
        i4.S(parcel, 2, 8);
        parcel.writeLong(j);
        long j7 = this.f5309g;
        i4.S(parcel, 3, 8);
        parcel.writeLong(j7);
        int i12 = this.f5312y;
        i4.S(parcel, 6, 4);
        parcel.writeInt(i12);
        float f10 = this.B;
        i4.S(parcel, 7, 4);
        parcel.writeFloat(f10);
        i4.S(parcel, 8, 8);
        parcel.writeLong(this.f5310r);
        i4.S(parcel, 9, 4);
        parcel.writeInt(this.D ? 1 : 0);
        long j10 = this.f5311x;
        i4.S(parcel, 10, 8);
        parcel.writeLong(j10);
        long j11 = this.E;
        i4.S(parcel, 11, 8);
        parcel.writeLong(j11);
        i4.S(parcel, 12, 4);
        parcel.writeInt(this.F);
        i4.S(parcel, 13, 4);
        parcel.writeInt(this.G);
        i4.S(parcel, 15, 4);
        parcel.writeInt(this.H ? 1 : 0);
        i4.O(parcel, 16, this.I, i10);
        i4.O(parcel, 17, this.J, i10);
        i4.W(parcel, iU);
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }
}
