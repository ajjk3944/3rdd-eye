package com.google.android.recaptcha.internal;

import Ii.V;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class zzas {
    public static final Task zza(V v10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        v10.invokeOnCompletion(new zzar(taskCompletionSource, v10));
        return taskCompletionSource.getTask();
    }
}
