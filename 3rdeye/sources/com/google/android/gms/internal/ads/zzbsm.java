package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbsm extends zzbss {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcfe zzj;
    private final Activity zzk;
    private zzcgy zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbst zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbsm(zzcfe zzcfeVar, zzbst zzbstVar) {
        super(zzcfeVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcfeVar;
        this.zzk = zzcfeVar.zzi();
        this.zzo = zzbstVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzm(boolean z10) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlc)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzld)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzle)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcfe zzcfeVar = this.zzj;
                    viewGroup2.addView((View) zzcfeVar);
                    zzcfeVar.zzaj(this.zzl);
                } catch (IllegalStateException e4) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to add webview back to view hierarchy.", e4);
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcfe zzcfeVar2 = this.zzj;
                viewGroup3.addView((View) zzcfeVar2);
                zzcfeVar2.zzaj(this.zzl);
            }
        }
        if (z10) {
            zzl("default");
            zzbst zzbstVar = this.zzo;
            if (zzbstVar != null) {
                zzbstVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zzb(final boolean z10) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlb)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzm(z10);
                    } else {
                        zzcad.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsk
                            @Override // java.lang.Runnable
                            public final void run() throws JSONException {
                                this.zza.zzm(z10);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019b A[PHI: r18
  0x019b: PHI (r18v12 int) = (r18v5 int), (r18v6 int), (r18v7 int), (r18v8 int), (r18v9 int), (r18v10 int), (r18v13 int) binds: [B:85:0x0197, B:82:0x018a, B:79:0x017e, B:76:0x0172, B:73:0x0166, B:70:0x015a, B:68:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsm.zzc(java.util.Map):void");
    }

    public final void zzd(int i, int i10, boolean z10) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i10;
        }
    }

    public final void zze(int i, int i10) {
        this.zzc = i;
        this.zzd = i10;
    }

    public final boolean zzf() {
        boolean z10;
        synchronized (this.zzi) {
            z10 = this.zzp != null;
        }
        return z10;
    }
}
