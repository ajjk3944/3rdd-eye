package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaxh extends zzayi {
    public zzaxh(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10) {
        super(zzawvVar, "WQkp0526ddrUi1BRkagos9QKSJQ1uugrJcxnlXdGVtysNEwcyhf7H4AuLi1Daa/J", "bIxRlixcWzGpKi+RzORPGFA/CCK1ebxNEgd5yxb9Upc=", zzasrVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i = 1;
        zzasr zzasrVar = this.zzd;
        zzasrVar.zzY(3);
        try {
            if (true == ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue()) {
                i = 2;
            }
            zzasrVar.zzY(i);
        } catch (InvocationTargetException e4) {
            if (!(e4.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e4;
            }
        }
    }
}
