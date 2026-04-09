package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfoq {
    private final Context zza;
    private final Executor zzb;
    private final zzfnz zzc;
    private final zzfop zzd;
    private Task zze;

    public zzfoq(Context context, Executor executor, zzfnz zzfnzVar, zzfob zzfobVar, zzfoo zzfooVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfnzVar;
        this.zzd = zzfooVar;
    }

    public static /* synthetic */ zzato zza(zzfoq zzfoqVar) throws PackageManager.NameNotFoundException {
        Context context = zzfoqVar.zza;
        return zzfoh.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public static zzfoq zzc(Context context, Executor executor, zzfnz zzfnzVar, zzfob zzfobVar) {
        final zzfoq zzfoqVar = new zzfoq(context, executor, zzfnzVar, zzfobVar, new zzfoo());
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzfom
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfoq.zza(this.zza);
            }
        };
        Executor executor2 = zzfoqVar.zzb;
        zzfoqVar.zze = Tasks.call(executor2, callable).addOnFailureListener(executor2, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfon
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzfoq.zzd(this.zza, exc);
            }
        });
        return zzfoqVar;
    }

    public static /* synthetic */ void zzd(zzfoq zzfoqVar, Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        zzfoqVar.zzc.zzc(2025, -1L, exc);
    }

    public final zzato zzb() {
        zzfop zzfopVar = this.zzd;
        Task task = this.zze;
        return !task.isSuccessful() ? zzfopVar.zza() : (zzato) task.getResult();
    }
}
