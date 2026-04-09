package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzavm {
    protected volatile Boolean zzb;
    private final zzawv zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzfpz zza = null;
    private static volatile Random zzd = null;

    public zzavm(zzawv zzawvVar) {
        this.zze = zzawvVar;
        zzawvVar.zzj().execute(new zzavl(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zzd == null) {
                synchronized (zzavm.class) {
                    try {
                        if (zzd == null) {
                            zzd = new Random();
                        }
                    } finally {
                    }
                }
            }
            return zzd.nextInt();
        }
    }

    public final void zzc(int i, int i10, long j4, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzarx zzarxVarZza = zzasb.zza();
            zzarxVarZza.zza(this.zze.zza.getPackageName());
            zzarxVarZza.zze(j4);
            if (str != null) {
                zzarxVarZza.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzarxVarZza.zzf(stringWriter.toString());
                zzarxVarZza.zzd(exc.getClass().getName());
            }
            zzfpx zzfpxVarZza = zza.zza(((zzasb) zzarxVarZza.zzbr()).zzaV());
            zzfpxVarZza.zza(i);
            if (i10 != -1) {
                zzfpxVarZza.zzb(i10);
            }
            zzfpxVarZza.zzc();
        } catch (Exception unused) {
        }
    }
}
