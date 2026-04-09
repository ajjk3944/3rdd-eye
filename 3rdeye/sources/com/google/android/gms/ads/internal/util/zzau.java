package com.google.android.gms.ads.internal.util;

import B4.f;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzgdm;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzau {
    private final Context zza;
    private final zzdvb zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzau(Context context) {
        this.zzg = 0;
        this.zzl = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
            @Override // java.lang.Runnable
            public final void run() {
                zzau.zzi(this.zza);
            }
        };
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzv.zzv().zzb();
        this.zzk = com.google.android.gms.ads.internal.zzv.zzv().zza();
        this.zzb = com.google.android.gms.ads.internal.zzv.zzu().zza();
    }

    public static /* synthetic */ void zza(zzau zzauVar) {
        zzay zzayVarZzu = com.google.android.gms.ads.internal.zzv.zzu();
        String str = zzauVar.zzd;
        String str2 = zzauVar.zze;
        String str3 = zzauVar.zzf;
        boolean zZzm = zzayVarZzu.zzm();
        Context context = zzauVar.zza;
        zzayVarZzu.zzh(zzayVarZzu.zzj(context, str, str2));
        if (!zzayVarZzu.zzm()) {
            zzayVarZzu.zzd(context, str, str2);
            return;
        }
        if (!zZzm && !TextUtils.isEmpty(str3)) {
            zzayVarZzu.zze(context, str2, str3, str);
        }
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Device is linked for debug signals.");
        zzayVarZzu.zzi(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    public static /* synthetic */ void zzc(final zzau zzauVar, int i, int i10, int i11, int i12, int i13, DialogInterface dialogInterface, int i14) {
        if (i14 != i) {
            if (i14 == i10) {
                int i15 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Debug mode [Creative Preview] selected.");
                zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzau.zzj(this.zza);
                    }
                });
                return;
            }
            if (i14 == i11) {
                int i16 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Debug mode [Troubleshooting] selected.");
                zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzat
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzau.zza(this.zza);
                    }
                });
                return;
            }
            if (i14 == i12) {
                zzdvb zzdvbVar = zzauVar.zzb;
                final zzgdm zzgdmVar = zzcad.zzf;
                zzgdm zzgdmVar2 = zzcad.zza;
                if (zzdvbVar.zzq()) {
                    zzgdmVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.android.gms.ads.internal.zzv.zzu().zzc(this.zza.zza);
                        }
                    });
                    return;
                } else {
                    zzgdmVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzas
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzau.zzl(this.zza, zzgdmVar);
                        }
                    });
                    return;
                }
            }
            if (i14 == i13) {
                zzdvb zzdvbVar2 = zzauVar.zzb;
                final zzgdm zzgdmVar3 = zzcad.zzf;
                zzgdm zzgdmVar4 = zzcad.zza;
                if (zzdvbVar2.zzq()) {
                    zzgdmVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzau zzauVar2 = this.zza;
                            zzauVar2.zzs(zzauVar2.zza);
                        }
                    });
                    return;
                } else {
                    zzgdmVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzal
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzau.zzd(this.zza, zzgdmVar3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        Context context = zzauVar.zza;
        if (!(context instanceof Activity)) {
            int i17 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not create dialog without Activity Context");
            return;
        }
        String str = zzauVar.zzc;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            com.google.android.gms.ads.internal.zzv.zzr();
            Map mapZzQ = zzs.zzQ(uriBuild);
            for (String str3 : mapZzQ.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) mapZzQ.get(str3));
                sb.append("\n\n");
            }
            String strTrim = sb.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        com.google.android.gms.ads.internal.zzv.zzr();
        AlertDialog.Builder builderZzL = zzs.zzL(context);
        builderZzL.setMessage(str2);
        builderZzL.setTitle("Ad Information");
        builderZzL.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzah
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i18) {
                zzau.zzg(this.zza, str2, dialogInterface2, i18);
            }
        });
        builderZzL.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzai
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i18) {
            }
        });
        builderZzL.create().show();
    }

    public static /* synthetic */ void zzd(final zzau zzauVar, zzgdm zzgdmVar) {
        zzay zzayVarZzu = com.google.android.gms.ads.internal.zzv.zzu();
        Context context = zzauVar.zza;
        if (zzayVarZzu.zzj(context, zzauVar.zzd, zzauVar.zze)) {
            zzgdmVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzak
                @Override // java.lang.Runnable
                public final void run() {
                    zzau zzauVar2 = this.zza;
                    zzauVar2.zzs(zzauVar2.zza);
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzv.zzu().zzd(context, zzauVar.zzd, zzauVar.zze);
        }
    }

    public static /* synthetic */ void zzf(zzau zzauVar, AtomicInteger atomicInteger, int i, int i10, int i11, DialogInterface dialogInterface, int i12) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i10) {
                zzauVar.zzb.zzm(zzdux.SHAKE);
            } else if (atomicInteger.get() == i11) {
                zzauVar.zzb.zzm(zzdux.FLICK);
            } else {
                zzauVar.zzb.zzm(zzdux.NONE);
            }
        }
        zzauVar.zzr();
    }

    public static /* synthetic */ void zzg(zzau zzauVar, String str, DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzv.zzr();
        zzs.zzU(zzauVar.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public static /* synthetic */ void zzi(zzau zzauVar) {
        zzauVar.zzg = 4;
        zzauVar.zzr();
    }

    public static /* synthetic */ void zzj(zzau zzauVar) {
        zzay zzayVarZzu = com.google.android.gms.ads.internal.zzv.zzu();
        Context context = zzauVar.zza;
        String str = zzauVar.zzd;
        String str2 = zzauVar.zze;
        if (!zzayVarZzu.zzk(context, str, str2)) {
            zzayVarZzu.zzi(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(zzayVarZzu.zza)) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Creative is not pushed for this device.");
            zzayVarZzu.zzi(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzayVarZzu.zza)) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("The app is not linked for creative preview.");
            zzayVarZzu.zzd(context, str, str2);
        } else if (CommonUrlParts.Values.FALSE_INTEGER.equals(zzayVarZzu.zza)) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Device is linked for in app preview.");
            zzayVarZzu.zzi(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public static /* synthetic */ void zzl(final zzau zzauVar, zzgdm zzgdmVar) {
        zzay zzayVarZzu = com.google.android.gms.ads.internal.zzv.zzu();
        Context context = zzauVar.zza;
        if (zzayVarZzu.zzj(context, zzauVar.zzd, zzauVar.zze)) {
            zzgdmVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaj
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzv.zzu().zzc(this.zza.zza);
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzv.zzu().zzd(context, zzauVar.zzd, zzauVar.zze);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(Context context) {
        ArrayList arrayList = new ArrayList();
        int iZzu = zzu(arrayList, "None", true);
        final int iZzu2 = zzu(arrayList, "Shake", true);
        final int iZzu3 = zzu(arrayList, "Flick", true);
        int iOrdinal = this.zzb.zza().ordinal();
        final int i = iOrdinal != 1 ? iOrdinal != 2 ? iZzu : iZzu3 : iZzu2;
        com.google.android.gms.ads.internal.zzv.zzr();
        AlertDialog.Builder builderZzL = zzs.zzL(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builderZzL.setTitle("Setup gesture");
        builderZzL.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzan
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                atomicInteger.set(i10);
            }
        });
        builderZzL.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzao
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.zza.zzr();
            }
        });
        builderZzL.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                zzau.zzf(this.zza, atomicInteger, i, iZzu2, iZzu3, dialogInterface, i10);
            }
        });
        builderZzL.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzaq
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzr();
            }
        });
        builderZzL.create().show();
    }

    private final boolean zzt(float f10, float f11, float f12, float f13) {
        return Math.abs(this.zzi.x - f10) < ((float) this.zzh) && Math.abs(this.zzi.y - f11) < ((float) this.zzh) && Math.abs(this.zzj.x - f12) < ((float) this.zzh) && Math.abs(this.zzj.y - f13) < ((float) this.zzh);
    }

    private static final int zzu(List list, String str, boolean z10) {
        if (!z10) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzc);
        sb.append(",DebugSignal: ");
        sb.append(this.zzf);
        sb.append(",AFMA Version: ");
        sb.append(this.zze);
        sb.append(",Ad Unit ID: ");
        return f.c(sb, this.zzd, "}");
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.zzg;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.zzg = 5;
                this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzk.postDelayed(this.zzl, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfb)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z10 = false;
                for (int i10 = 0; i10 < historySize; i10++) {
                    z10 |= !zzt(motionEvent.getHistoricalX(0, i10), motionEvent.getHistoricalY(0, i10), motionEvent.getHistoricalX(1, i10), motionEvent.getHistoricalY(1, i10));
                }
                if (zzt(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                    return;
                }
            }
            this.zzg = -1;
            this.zzk.removeCallbacks(this.zzl);
        }
    }

    public final void zzn(String str) {
        this.zzd = str;
    }

    public final void zzo(String str) {
        this.zze = str;
    }

    public final void zzp(String str) {
        this.zzc = str;
    }

    public final void zzq(String str) {
        this.zzf = str;
    }

    public final void zzr() {
        try {
            Context context = this.zza;
            if (!(context instanceof Activity)) {
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzu().zzb())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzv.zzu().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iZzu = zzu(arrayList, "Ad information", true);
            final int iZzu2 = zzu(arrayList, str, true);
            final int iZzu3 = zzu(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjv)).booleanValue();
            final int iZzu4 = zzu(arrayList, "Open ad inspector", zBooleanValue);
            final int iZzu5 = zzu(arrayList, "Ad inspector settings", zBooleanValue);
            com.google.android.gms.ads.internal.zzv.zzr();
            AlertDialog.Builder builderZzL = zzs.zzL(context);
            builderZzL.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzam
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzau.zzc(this.zza, iZzu, iZzu2, iZzu3, iZzu4, iZzu5, dialogInterface, i10);
                }
            });
            builderZzL.create().show();
        } catch (WindowManager.BadTokenException e4) {
            zze.zzb("", e4);
        }
    }

    public zzau(Context context, String str) {
        this(context);
        this.zzc = str;
    }
}
