package com.google.android.gms.internal.ads;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzha extends zzgk {
    public final int zzb;

    public zzha(zzgo zzgoVar, int i, int i10) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzha zza(IOException iOException, zzgo zzgoVar, int i) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : (message == null || !zzfuk.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new zzgz(iOException, zzgoVar) : new zzha(iOException, zzgoVar, i10, i);
    }

    private static int zzb(int i, int i10) {
        return i == 2000 ? i10 != 1 ? 2000 : 2001 : i;
    }

    public zzha(IOException iOException, zzgo zzgoVar, int i, int i10) {
        super(iOException, zzb(i, i10));
        this.zzb = i10;
    }

    public zzha(String str, zzgo zzgoVar, int i, int i10) {
        super(str, zzb(i, i10));
        this.zzb = i10;
    }

    public zzha(String str, IOException iOException, zzgo zzgoVar, int i, int i10) {
        super(str, iOException, zzb(i, i10));
        this.zzb = i10;
    }
}
