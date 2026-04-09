package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzbfk implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbfl zza;

    public zzbfk(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zzbfl zzbflVar = this.zza;
        synchronized (zzbflVar.zzh()) {
            try {
                zzbflVar.zzk(null);
                if (zzbflVar.zzi() != null) {
                    zzbflVar.zzj(null);
                }
                zzbflVar.zzh().notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
