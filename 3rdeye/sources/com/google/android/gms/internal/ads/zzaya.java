package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaya extends zzayi {
    private final StackTraceElement[] zzh;

    public zzaya(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10, StackTraceElement[] stackTraceElementArr) {
        super(zzawvVar, "UtW7g7feJqOHsjIRMP7TbkL8M4VYsmVrsaULCIKJGwvBOELKcxTQZfT6AHg6wl4V", "3s4OpKjyDjUzqtut1o8wCVCKFRdtRePXWRu+sqk/xG8=", zzasrVar, i, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzawm zzawmVar = new zzawm((String) this.zze.invoke(null, stackTraceElementArr));
            zzasr zzasrVar = this.zzd;
            synchronized (zzasrVar) {
                try {
                    zzasrVar.zzD(zzawmVar.zza.longValue());
                    if (zzawmVar.zzb.booleanValue()) {
                        zzasrVar.zzZ(true != zzawmVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        zzasrVar.zzZ(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
