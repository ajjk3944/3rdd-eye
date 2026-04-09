package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcdo extends zzcdl {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcdo(zzcbz zzcbzVar) {
        super(zzcbzVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfqk.zza(zzfqj.zza(), cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create preload cache directory at ".concat(strValueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not set cache file permissions at ".concat(strValueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfqk.zza(zzfqj.zza(), this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0330, code lost:
    
        r22 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0332, code lost:
    
        r22.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x033a, code lost:
    
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x033c, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zze("Preloaded " + r14.format(r6) + " bytes from " + r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x035d, code lost:
    
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0361, code lost:
    
        r3.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0368, code lost:
    
        if (r11.isFile() == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x036a, code lost:
    
        r11.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0372, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0375, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0378, code lost:
    
        r11.createNewFile();
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c9  */
    /* JADX WARN: Type inference failed for: r9v6, types: [long] */
    @Override // com.google.android.gms.internal.ads.zzcdl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzt(final java.lang.String r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdo.zzt(java.lang.String):boolean");
    }
}
