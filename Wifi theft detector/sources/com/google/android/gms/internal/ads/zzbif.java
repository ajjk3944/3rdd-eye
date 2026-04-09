package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbif {

    @Nullable
    private n.e zza;

    @Nullable
    private n.b zzb;

    @Nullable
    private n.d zzc;

    @Nullable
    private zzbie zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzikw.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        n.d dVar = this.zzc;
        if (dVar == null) {
            return;
        }
        activity.unbindService(dVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    @Nullable
    public final n.e zzc() {
        n.b bVar = this.zzb;
        if (bVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = bVar.e(null);
        }
        return this.zza;
    }

    public final void zzd(zzbie zzbieVar) {
        this.zzd = zzbieVar;
    }

    public final void zze(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzikw.zza(activity)) != null) {
            zzikx zzikxVar = new zzikx(this);
            this.zzc = zzikxVar;
            n.b.a(activity, strZza, zzikxVar);
        }
    }

    public final void zzf(n.b bVar) {
        this.zzb = bVar;
        bVar.g(0L);
        zzbie zzbieVar = this.zzd;
        if (zzbieVar != null) {
            zzbieVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
