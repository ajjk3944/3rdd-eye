package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import java.util.List;
import s.f;
import s.h;
import s.i;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbed {
    private i zza;
    private f zzb;
    private h zzc;
    private zzbec zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzhgo.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final i zza() {
        f fVar = this.zzb;
        if (fVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = fVar.c(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzhgo.zza(activity)) != null) {
            zzhgp zzhgpVar = new zzhgp(this);
            this.zzc = zzhgpVar;
            f.a(activity, strZza, zzhgpVar);
        }
    }

    public final void zzc(f fVar) {
        this.zzb = fVar;
        fVar.getClass();
        try {
            fVar.f45883a.r();
        } catch (RemoteException unused) {
        }
        zzbec zzbecVar = this.zzd;
        if (zzbecVar != null) {
            zzbecVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbec zzbecVar) {
        this.zzd = zzbecVar;
    }

    public final void zzf(Activity activity) {
        h hVar = this.zzc;
        if (hVar == null) {
            return;
        }
        activity.unbindService(hVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
