package com.google.android.gms.oss.licenses;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.AbstractC4285n;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: classes.dex */
final class i extends AbstractC4285n {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ List f36943d;

    i(j jVar, List list) {
        this.f36943d = list;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4285n
    protected final /* bridge */ /* synthetic */ void b(a.b bVar, TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult(((K3.g) bVar).m0(this.f36943d));
    }
}
