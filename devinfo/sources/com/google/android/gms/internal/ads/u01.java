package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u01 extends gv0 {

    /* renamed from: f, reason: collision with root package name */
    public final oy0 f17030f;

    public u01(Context context, ExecutorService executorService, oy0 oy0Var) {
        super(context, executorService, new TaskCompletionSource().getTask(), false);
        this.f17030f = oy0Var;
    }

    @Override // com.google.android.gms.internal.ads.gv0
    public final void b(int i4, long j) {
        ((vy0) this.f17030f).a(i4, j, null, null);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.gv0
    public final void c(int i4, long j, Exception exc) {
        ((vy0) this.f17030f).a(i4, j, exc, null);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.gv0
    public final void d(int i4, String str) {
        ((vy0) this.f17030f).a(i4, -1L, null, str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }
}
