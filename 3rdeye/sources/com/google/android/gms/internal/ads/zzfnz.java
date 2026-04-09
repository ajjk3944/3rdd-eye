package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfnz {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfnz(Context context, Executor executor, Task task, boolean z10) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z10;
    }

    public static zzfnz zza(final Context context, Executor executor, boolean z10) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z10) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnx
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzfpz.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfny
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzfpz.zzc());
                }
            });
        }
        return new zzfnz(context, executor, taskCompletionSource.getTask(), z10);
    }

    public static void zzg(int i) {
        zzf = i;
    }

    private final Task zzh(final int i, long j4, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfnv
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(task.isSuccessful());
                }
            });
        }
        Context context = this.zzb;
        final zzarx zzarxVarZza = zzasb.zza();
        zzarxVarZza.zza(context.getPackageName());
        zzarxVarZza.zze(j4);
        zzarxVarZza.zzg(zzf);
        if (exc != null) {
            int i10 = zzfwb.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzarxVarZza.zzf(stringWriter.toString());
            zzarxVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzarxVarZza.zzb(str2);
        }
        if (str != null) {
            zzarxVarZza.zzc(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfnw
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i11 = i;
                zzfpx zzfpxVarZza = ((zzfpz) task.getResult()).zza(((zzasb) zzarxVarZza.zzbn()).zzaV());
                zzfpxVarZza.zza(i11);
                zzfpxVarZza.zzc();
                return Boolean.TRUE;
            }
        });
    }

    public final Task zzb(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task zzc(int i, long j4, Exception exc) {
        return zzh(i, j4, exc, null, null, null);
    }

    public final Task zzd(int i, long j4) {
        return zzh(i, j4, null, null, null, null);
    }

    public final Task zze(int i, long j4, String str) {
        return zzh(i, j4, null, null, null, str);
    }

    public final Task zzf(int i, long j4, String str, Map map) {
        return zzh(i, j4, null, str, null, null);
    }
}
