package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowInsets;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzemi implements zzetu {
    private final zzetu zza;
    private final zzfco zzb;
    private final Context zzc;
    private final zzbzq zzd;

    public zzemi(zzeom zzeomVar, zzfco zzfcoVar, Context context, zzbzq zzbzqVar) {
        this.zza = zzeomVar;
        this.zzb = zzfcoVar;
        this.zzc = context;
        this.zzd = zzbzqVar;
    }

    public static /* synthetic */ zzemj zzc(zzemi zzemiVar, zzeud zzeudVar) {
        String str;
        boolean z10;
        String strZzj;
        int i;
        int i10;
        float f10;
        float f11;
        int i11;
        DisplayMetrics displayMetrics;
        zzfco zzfcoVar = zzemiVar.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzfcoVar.zze;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr != null) {
            str = null;
            z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                boolean z13 = zzrVar2.zzi;
                if (!z13 && !z11) {
                    str = zzrVar2.zza;
                    z11 = true;
                }
                if (z13) {
                    if (!z12) {
                        z10 = true;
                    }
                    z12 = true;
                }
                if (z11 && z12) {
                    break;
                }
            }
        } else {
            str = zzrVar.zza;
            z10 = zzrVar.zzi;
        }
        Context context = zzemiVar.zzc;
        Resources resources = context.getResources();
        int i12 = Build.VERSION.SDK_INT;
        Insets insetsOf = i12 >= 29 ? Insets.NONE : null;
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strZzj = null;
            i = 0;
            i10 = 0;
            f10 = 0.0f;
        } else {
            zzbzq zzbzqVar = zzemiVar.zzd;
            f10 = displayMetrics.density;
            i10 = displayMetrics.widthPixels;
            int i13 = displayMetrics.heightPixels;
            strZzj = zzbzqVar.zzi().zzj();
            i = i13;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznw)).booleanValue() || i12 < 35) {
            f11 = 0.0f;
            i11 = i10;
        } else {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null || f10 == 0.0f) {
                f11 = 0.0f;
                i11 = i10;
                insetsOf = Insets.NONE;
            } else {
                Insets insets = windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar());
                f11 = 0.0f;
                i11 = i10;
                insetsOf = Insets.of((int) Math.ceil(insets.left / f10), (int) Math.ceil(insets.top / f10), (int) Math.ceil(insets.right / f10), (int) Math.ceil(insets.bottom / f10));
            }
        }
        StringBuilder sb = new StringBuilder();
        if (zzrVarArr != null) {
            int i14 = 0;
            boolean z14 = false;
            while (i14 < zzrVarArr.length) {
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVarArr[i14];
                float f12 = f11;
                if (zzrVar3.zzi) {
                    z14 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i15 = zzrVar3.zze;
                    if (i15 == -1) {
                        i15 = f10 != f12 ? (int) (zzrVar3.zzf / f10) : -1;
                    }
                    sb.append(i15);
                    sb.append("x");
                    int i16 = zzrVar3.zzb;
                    if (i16 == -2) {
                        i16 = f10 != f12 ? (int) (zzrVar3.zzc / f10) : -2;
                    }
                    sb.append(i16);
                }
                i14++;
                f11 = f12;
            }
            if (z14) {
                if (sb.length() != 0) {
                    sb.insert(0, "|");
                }
                sb.insert(0, "320x50");
            }
        }
        return new zzemj(zzrVar, str, z10, sb.toString(), f10, i11, i, strZzj, zzfcoVar.zzq, insetsOf);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return zzgdb.zzm(this.zza.zzb(), new zzfut() { // from class: com.google.android.gms.internal.ads.zzemh
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return zzemi.zzc(this.zza, (zzeud) obj);
            }
        }, zzcad.zzg);
    }
}
