package com.google.android.gms.internal.location;

import N7.B8;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@VisibleForTesting
@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes2.dex */
public final class zzbe extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();

    @SafeParcelable.Field(getter = "getRequestId", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getExpirationTime", id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getType", id = 3)
    private final short zzc;

    @SafeParcelable.Field(getter = "getLatitude", id = 4)
    private final double zzd;

    @SafeParcelable.Field(getter = "getLongitude", id = 5)
    private final double zze;

    @SafeParcelable.Field(getter = "getRadius", id = 6)
    private final float zzf;

    @SafeParcelable.Field(getter = "getTransitionTypes", id = 7)
    private final int zzg;

    @SafeParcelable.Field(defaultValue = CommonUrlParts.Values.FALSE_INTEGER, getter = "getNotificationResponsiveness", id = 8)
    private final int zzh;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getLoiteringDelay", id = 9)
    private final int zzi;

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 7) int i, @SafeParcelable.Param(id = 3) short s10, @SafeParcelable.Param(id = 4) double d10, @SafeParcelable.Param(id = 5) double d11, @SafeParcelable.Param(id = 6) float f10, @SafeParcelable.Param(id = 2) long j4, @SafeParcelable.Param(id = 8) int i10, @SafeParcelable.Param(id = 9) int i11) {
        if (str == null || str.length() > 100) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "requestId is null or too long: ".concat(strValueOf) : new String("requestId is null or too long: "));
        }
        if (f10 <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f10);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d10 > 90.0d || d10 < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d11 > 180.0d || d11 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d11);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i12 = i & 7;
        if (i12 == 0) {
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
        this.zzc = s10;
        this.zza = str;
        this.zzd = d10;
        this.zze = d11;
        this.zzf = f10;
        this.zzb = j4;
        this.zzg = i12;
        this.zzh = i10;
        this.zzi = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzf == zzbeVar.zzf && this.zzd == zzbeVar.zzd && this.zze == zzbeVar.zze && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zzd);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((B8.g(this.zzf, (((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31, 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s10 = this.zzc;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s10 != -1 ? s10 != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / 1000), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeShort(parcel, 3, this.zzc);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzd);
        SafeParcelWriter.writeDouble(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
