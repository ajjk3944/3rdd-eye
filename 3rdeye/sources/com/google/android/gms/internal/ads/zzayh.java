package com.google.android.gms.internal.ads;

import com.singular.sdk.internal.Constants;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzayh {
    private final zzawv zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzayh(zzawv zzawvVar, String str, String str2, Class... clsArr) {
        this.zza = zzawvVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzawvVar.zzj().submit(new zzayg(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzayh zzayhVar) {
        try {
            zzawv zzawvVar = zzayhVar.zza;
            Class<?> clsLoadClass = zzawvVar.zzh().loadClass(zzayhVar.zzc(zzawvVar.zzs(), zzayhVar.zzb));
            if (clsLoadClass != null) {
                zzayhVar.zzd = clsLoadClass.getMethod(zzayhVar.zzc(zzawvVar.zzs(), zzayhVar.zzc), zzayhVar.zze);
            }
        } catch (zzavz | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            zzayhVar.zzf.countDown();
            throw th;
        }
        zzayhVar.zzf.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzavz, UnsupportedEncodingException {
        return new String(this.zza.zze().zzb(bArr, str), Constants.ENCODING);
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
