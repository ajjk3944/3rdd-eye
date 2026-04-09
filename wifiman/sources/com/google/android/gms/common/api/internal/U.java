package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import f.AbstractC5487d;
import r3.C7566d;

/* loaded from: classes.dex */
public final class U extends S {
    public U(AbstractC4280i abstractC4280i, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final /* bridge */ /* synthetic */ void d(C4288q c4288q, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final boolean f(C4296z c4296z) {
        AbstractC5487d.a(c4296z.x().get(null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final C7566d[] g(C4296z c4296z) {
        AbstractC5487d.a(c4296z.x().get(null));
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.S
    public final void h(C4296z c4296z) {
        AbstractC5487d.a(c4296z.x().remove(null));
        this.f34785b.trySetResult(Boolean.FALSE);
    }
}
