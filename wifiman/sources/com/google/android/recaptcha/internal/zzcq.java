package com.google.android.recaptcha.internal;

import Ii.AbstractC3063k;
import android.app.Application;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;
import dh.InterfaceC5380e;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes3.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j10, InterfaceC5380e interfaceC5380e) throws RecaptchaException, TimeoutCancellationException, ApiException {
        return zzcv.zzh(zza(application), str, j10, null, null, null, interfaceC5380e, 28, null);
    }

    public static final Task zzc(Application application, String str, long j10) throws RecaptchaException, TimeoutCancellationException, ApiException {
        return zzas.zza(AbstractC3063k.b(zza(application).zzd().zza(), null, null, new zzco(application, str, j10, null), 3, null));
    }

    public static final Object zzd(Application application, String str, InterfaceC5380e interfaceC5380e) throws RecaptchaException, ApiException {
        zzcv zzcvVarZza = zza(application);
        return zzcv.zzh(zzcvVarZza, str, 0L, null, zzcvVarZza.zzf, zzch.zzb, interfaceC5380e, 2, null);
    }

    public static final Task zze(Application application, String str) throws RecaptchaException, ApiException {
        return zzas.zza(AbstractC3063k.b(zza(application).zzd().zza(), null, null, new zzcp(application, str, null), 3, null));
    }
}
