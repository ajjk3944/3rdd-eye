package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4287p implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f34846a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4288q f34847b;

    C4287p(C4288q c4288q, TaskCompletionSource taskCompletionSource) {
        this.f34847b = c4288q;
        this.f34846a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f34847b.f34849b.remove(this.f34846a);
    }
}
