package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.AbstractC4285n;
import com.google.android.gms.tasks.TaskCompletionSource;
import r3.C7566d;

/* loaded from: classes.dex */
final class P extends AbstractC4285n {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC4285n.a f34784d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(AbstractC4285n.a aVar, C7566d[] c7566dArr, boolean z10, int i10) {
        super(c7566dArr, z10, i10);
        this.f34784d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4285n
    protected final void b(a.b bVar, TaskCompletionSource taskCompletionSource) {
        this.f34784d.f34842a.accept(bVar, taskCompletionSource);
    }
}
