package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
final class zzftn {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfuf zzc = new zzfuf("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfue zza;
    private final String zze;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.zzftj] */
    public zzftn(Context context) {
        if (zzfuh.zza(context)) {
            this.zza = new zzfue(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, new Object() { // from class: com.google.android.gms.internal.ads.zzftj
            });
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    public static /* synthetic */ void zza(zzftn zzftnVar, zzftu zzftuVar, int i, zzfts zzftsVar) {
        try {
            zzfue zzfueVar = zzftnVar.zza;
            if (zzfueVar == null) {
                throw null;
            }
            zzfse zzfseVar = (zzfse) zzfueVar.zzc();
            if (zzfseVar == null) {
                return;
            }
            String str = zzftnVar.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i);
            zzi(zzftuVar.zzb(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsy
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = zzftn.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzftuVar.zza(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfte
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = zzftn.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzfseVar.zzg(bundle, new zzftm(zzftnVar, zzftsVar));
        } catch (RemoteException e4) {
            zzc.zzb(e4, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), zzftnVar.zze);
        }
    }

    public static /* synthetic */ void zzb(zzftn zzftnVar, zzfsu zzfsuVar, zzfts zzftsVar) {
        try {
            zzfue zzfueVar = zzftnVar.zza;
            if (zzfueVar == null) {
                throw null;
            }
            zzfse zzfseVar = (zzfse) zzfueVar.zzc();
            if (zzfseVar == null) {
                return;
            }
            String str = zzftnVar.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzfsuVar.zzb(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzftg
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzftn.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfsuVar.zza(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfth
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzftn.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzfseVar.zze(bundle, new zzftm(zzftnVar, zzftsVar));
        } catch (RemoteException e4) {
            zzc.zzb(e4, "dismiss overlay display from: %s", zzftnVar.zze);
        }
    }

    public static /* synthetic */ void zzc(zzftn zzftnVar, zzftp zzftpVar, zzfts zzftsVar) {
        try {
            zzfue zzfueVar = zzftnVar.zza;
            if (zzfueVar == null) {
                throw null;
            }
            zzfse zzfseVar = (zzfse) zzfueVar.zzc();
            if (zzfseVar == null) {
                return;
            }
            String str = zzftnVar.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzftpVar.zzf());
            zzi(zzftpVar.zzg(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzftl
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzftn.zzb;
                    bundle.putString("adFieldEnifd", (String) obj);
                }
            });
            bundle.putInt("layoutGravity", zzftpVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzftpVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzftpVar.zze());
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsz
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzftn.zzb;
                    bundle.putString("deeplinkUrl", (String) obj);
                }
            });
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfta
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzftn.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzftpVar.zzh(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzftb
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzftn.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzftc
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzftn.zzb;
                    bundle.putString("thirdPartyAuthCallerId", (String) obj);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzfseVar.zzf(str, bundle, new zzftm(zzftnVar, zzftsVar));
        } catch (RemoteException e4) {
            zzc.zzb(e4, "show overlay display from: %s", zzftnVar.zze);
        }
    }

    public static /* synthetic */ boolean zzh(String str) {
        return !zzk(str);
    }

    private static void zzi(String str, Consumer consumer) {
        if (zzk(str)) {
            return;
        }
        str.getClass();
        consumer.accept(str.trim());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzftk] */
    private static boolean zzj(zzfts zzftsVar, String str, List list) {
        if (list.stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.ads.zzftk
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return zzftn.zzh((String) obj);
            }
        })) {
            return true;
        }
        zzc.zza(str, new Object[0]);
        zzftq zzftqVarZzc = zzftr.zzc();
        zzftqVarZzc.zzb(8160);
        zzftsVar.zza(zzftqVarZzc.zzc());
        return false;
    }

    private static boolean zzk(String str) {
        return zzfvv.zzc(str).trim().isEmpty();
    }

    public final void zzd() {
        zzfue zzfueVar = this.zza;
        if (zzfueVar == null) {
            return;
        }
        zzc.zzc("unbind LMD display overlay service", new Object[0]);
        zzfueVar.zzn();
    }

    public final void zze(final zzfsu zzfsuVar, final zzfts zzftsVar) {
        zzfue zzfueVar = this.zza;
        if (zzfueVar == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzftsVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzfsuVar.zzb(), zzfsuVar.zza()))) {
            zzfueVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftd
                @Override // java.lang.Runnable
                public final void run() {
                    zzftn.zzb(this.zza, zzfsuVar, zzftsVar);
                }
            });
        }
    }

    public final void zzf(final zzftp zzftpVar, final zzfts zzftsVar) {
        zzfue zzfueVar = this.zza;
        if (zzfueVar == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzftsVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzftpVar.zzh()))) {
            zzfueVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfti
                @Override // java.lang.Runnable
                public final void run() {
                    zzftn.zzc(this.zza, zzftpVar, zzftsVar);
                }
            });
        }
    }

    public final void zzg(final zzftu zzftuVar, final zzfts zzftsVar, final int i) {
        zzfue zzfueVar = this.zza;
        if (zzfueVar == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzftsVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzftuVar.zzb(), zzftuVar.zza()))) {
            zzfueVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftf
                @Override // java.lang.Runnable
                public final void run() {
                    zzftn.zza(this.zza, zzftuVar, i, zzftsVar);
                }
            });
        }
    }
}
