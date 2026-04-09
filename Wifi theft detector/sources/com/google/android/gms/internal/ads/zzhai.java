package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zzhai implements Runnable {
    zzhak zza;

    public zzhai(zzhak zzhakVar) {
        this.zza = zzhakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.a aVarZzf;
        zzhak zzhakVar = this.zza;
        if (zzhakVar == null || (aVarZzf = zzhakVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (aVarZzf.isDone()) {
            zzhakVar.zzk(aVarZzf);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzx = zzhakVar.zzx();
            zzhakVar.zzy(null);
            String string = "Timed out";
            if (scheduledFutureZzx != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzx.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb.append("Timed out");
                        sb.append(" (timeout delayed by ");
                        sb.append(jAbs);
                        sb.append(" ms after scheduled time)");
                        string = sb.toString();
                    }
                } catch (Throwable th) {
                    zzhakVar.zzb(new zzhaj(string, null));
                    throw th;
                }
            }
            String string2 = aVarZzf.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 2 + string2.length());
            sb2.append(string);
            sb2.append(": ");
            sb2.append(string2);
            zzhakVar.zzb(new zzhaj(sb2.toString(), null));
        } finally {
            aVarZzf.cancel(true);
        }
    }
}
