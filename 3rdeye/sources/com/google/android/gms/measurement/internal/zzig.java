package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzig implements Runnable {
    final /* synthetic */ zzih zza;
    private final URL zzb;
    private final String zzc;
    private final zzfw zzd;

    public zzig(zzih zzihVar, String str, URL url, byte[] bArr, Map map, zzfw zzfwVar, byte[] bArr2) {
        this.zza = zzihVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfwVar);
        this.zzb = url;
        this.zzd = zzfwVar;
        this.zzc = str;
    }

    private final void zzb(final int i, final Exception exc, final byte[] bArr, final Map map) throws IllegalStateException {
        this.zza.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzif
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.measurement.internal.zzig] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.zzih r0 = r9.zza
            r0.zzax()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.zzih r2 = r9.zza     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.net.URL r3 = r9.zzb     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            if (r4 == 0) goto L84
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r3.setDefaultUseCaches(r0)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            com.google.android.gms.measurement.internal.zzfy r4 = r2.zzs     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r4.zzf()     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            com.google.android.gms.measurement.internal.zzfy r2 = r2.zzs     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r2.zzf()     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r2 = 1
            r3.setDoInput(r2)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L7b
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L68
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L54
        L4a:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L54
            if (r8 <= 0) goto L56
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L54
            goto L4a
        L54:
            r0 = move-exception
            goto L6a
        L56:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L54
            r6.close()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
            r3.disconnect()
            r9.zzb(r2, r1, r0, r4)
            return
        L64:
            r0 = move-exception
            goto L91
        L66:
            r0 = move-exception
            goto L9f
        L68:
            r0 = move-exception
            r6 = r1
        L6a:
            if (r6 == 0) goto L6f
            r6.close()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
        L6f:
            throw r0     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
        L70:
            r0 = move-exception
        L71:
            r4 = r1
            goto L91
        L73:
            r0 = move-exception
        L74:
            r4 = r1
            goto L9f
        L76:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L71
        L7b:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L74
        L80:
            r2 = move-exception
            goto L8c
        L82:
            r2 = move-exception
            goto L9a
        L84:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            throw r2     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
        L8c:
            r3 = r2
            r2 = r0
            r0 = r3
            r3 = r1
            r4 = r3
        L91:
            if (r3 == 0) goto L96
            r3.disconnect()
        L96:
            r9.zzb(r2, r1, r1, r4)
            throw r0
        L9a:
            r3 = r2
            r2 = r0
            r0 = r3
            r3 = r1
            r4 = r3
        L9f:
            if (r3 == 0) goto La4
            r3.disconnect()
        La4:
            r9.zzb(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzig.run():void");
    }

    public final /* synthetic */ void zza(int i, Exception exc, byte[] bArr, Map map) {
        zzfw zzfwVar = this.zzd;
        zzfwVar.zza.zzC(this.zzc, i, exc, bArr, map);
    }
}
