package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdjm {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfco zzc;
    private final zzdir zzd;
    private final zzdim zze;
    private final zzdka zzf;
    private final zzdki zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbgc zzj;
    private final zzdij zzk;

    public zzdjm(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfco zzfcoVar, zzdir zzdirVar, zzdim zzdimVar, zzdka zzdkaVar, zzdki zzdkiVar, Executor executor, Executor executor2, zzdij zzdijVar) {
        this.zzb = zzgVar;
        this.zzc = zzfcoVar;
        this.zzj = zzfcoVar.zzi;
        this.zzd = zzdirVar;
        this.zze = zzdimVar;
        this.zzf = zzdkaVar;
        this.zzg = zzdkiVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdijVar;
    }

    public static /* synthetic */ void zza(zzdjm zzdjmVar, ViewGroup viewGroup) {
        zzdim zzdimVar = zzdjmVar.zze;
        if (zzdimVar.zzf() != null) {
            boolean z10 = viewGroup != null;
            if (zzdimVar.zzc() == 2 || zzdimVar.zzc() == 1) {
                zzdjmVar.zzb.zzF(zzdjmVar.zzc.zzf, String.valueOf(zzdimVar.zzc()), z10);
            } else if (zzdimVar.zzc() == 6) {
                com.google.android.gms.ads.internal.util.zzg zzgVar = zzdjmVar.zzb;
                String str = zzdjmVar.zzc.zzf;
                zzgVar.zzF(str, "2", z10);
                zzgVar.zzF(str, "1", z10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zzb(final com.google.android.gms.internal.ads.zzdjm r10, com.google.android.gms.internal.ads.zzdkk r11) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdjm.zzb(com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzdkk):void");
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z10) {
        View viewZzf = z10 ? this.zze.zzf() : this.zze.zzg();
        if (viewZzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzf.getParent()).removeView(viewZzf);
        }
        viewGroup.addView(viewZzf, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzed)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zzc(zzdkk zzdkkVar) {
        zzdka zzdkaVar;
        if (zzdkkVar == null || (zzdkaVar = this.zzf) == null || zzdkkVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdkkVar.zzh().addView(zzdkaVar.zza());
        } catch (zzcfq e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e4);
        }
    }

    public final void zzd(zzdkk zzdkkVar) {
        if (zzdkkVar == null) {
            return;
        }
        Context context = zzdkkVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbv.zzi(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Activity context is needed for policy validator.");
                return;
            }
            zzdki zzdkiVar = this.zzg;
            if (zzdkiVar == null || zzdkkVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdkiVar.zza(zzdkkVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbv.zzb());
            } catch (zzcfq e4) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e4);
            }
        }
    }

    public final void zze(final zzdkk zzdkkVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjk
            @Override // java.lang.Runnable
            public final void run() {
                zzdjm.zzb(this.zza, zzdkkVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }
}
