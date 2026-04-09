package com.google.android.recaptcha.internal;

import Ii.V;
import Yg.J;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
final class zzar extends AbstractC6494u implements InterfaceC6835l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ V zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzar(TaskCompletionSource taskCompletionSource, V v10) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = v10;
    }

    @Override // mh.InterfaceC6835l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (th2 instanceof CancellationException) {
            this.zza.setException((Exception) th2);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return J.f24997a;
    }
}
