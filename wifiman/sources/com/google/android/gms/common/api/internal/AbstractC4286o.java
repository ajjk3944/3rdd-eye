package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import s3.AbstractC7887b;

/* renamed from: com.google.android.gms.common.api.internal.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4286o {
    public static void a(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.i()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(AbstractC7887b.a(status));
        }
    }
}
