package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfsa {
    public static A4.a zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzfrz zzfrzVar = new zzfrz(task, null);
        task.addOnCompleteListener(zzgdt.zzc(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfry
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfrz zzfrzVar2 = zzfrzVar;
                if (task2.isCanceled()) {
                    zzfrzVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfrzVar2.zzc(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzfrzVar2.zzd(exception);
            }
        });
        return zzfrzVar;
    }
}
