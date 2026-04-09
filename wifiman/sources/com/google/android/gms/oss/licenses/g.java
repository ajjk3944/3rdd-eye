package com.google.android.gms.oss.licenses;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.AbstractC4285n;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class g extends AbstractC4285n {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f36941d;

    g(j jVar, String str) {
        this.f36941d = str;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4285n
    protected final /* bridge */ /* synthetic */ void b(a.b bVar, TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult(((K3.g) bVar).l0(this.f36941d));
    }
}
