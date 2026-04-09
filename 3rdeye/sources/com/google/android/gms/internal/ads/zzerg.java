package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.AdRequest;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzerg implements zzetu {
    private final zzgdm zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzerg(zzgdm zzgdmVar, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgdmVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    public static /* synthetic */ zzerh zzc(zzerg zzergVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgb)).booleanValue() && zzergVar.zzb != null && zzergVar.zzd.contains("banner")) {
            return new zzerh(Boolean.valueOf(zzergVar.zzb.isHardwareAccelerated()));
        }
        Boolean boolValueOf = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgc)).booleanValue() && zzergVar.zzd.contains("native")) {
            Context context = zzergVar.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new zzerh(boolValueOf);
            }
        }
        return new zzerh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerg.zzc(this.zza);
            }
        });
    }
}
