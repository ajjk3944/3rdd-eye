package com.google.android.gms.oss.licenses;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.AbstractC4285n;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class f extends AbstractC4285n {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f36940d;

    f(j jVar, String str) {
        this.f36940d = str;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4285n
    protected final /* bridge */ /* synthetic */ void b(a.b bVar, TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult(((K3.g) bVar).k0(this.f36940d));
    }
}
