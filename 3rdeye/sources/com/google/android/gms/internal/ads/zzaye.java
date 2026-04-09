package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaye extends zzayi {
    public zzaye(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10) {
        super(zzawvVar, "1BnW1+pN8ACAA5SCwHeu4aDyUa+GdAsZQaTQjOE/fWA7hyCouT0ju5bDmhkUNXUI", "kp4jwXczzGPw0lGC8OB8RleYASbnnNEZzgNaMBT0Bfw=", zzasrVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzasr zzasrVar = this.zzd;
        zzasrVar.zzad(3);
        boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (zzasrVar) {
            try {
                if (zBooleanValue) {
                    zzasrVar.zzad(2);
                } else {
                    zzasrVar.zzad(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
