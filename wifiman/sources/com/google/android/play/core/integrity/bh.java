package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C5030f;

/* loaded from: classes3.dex */
final class bh extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f38049a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f38050b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f38051c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f38052d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f38053e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(bnVar, taskCompletionSource);
        this.f38053e = bnVar;
        this.f38049a = bundle;
        this.f38050b = activity;
        this.f38051c = taskCompletionSource2;
        this.f38052d = i10;
    }

    @Override // com.google.android.play.integrity.internal.G
    protected final void b() {
        if (bn.k(this.f38053e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f38053e;
            C5030f c5030f = bnVar.f38063a;
            ((com.google.android.play.integrity.internal.v) c5030f.e()).d(this.f38049a, bnVar.f38067e.a(this.f38050b, this.f38051c, c5030f));
        } catch (RemoteException e10) {
            this.f38053e.f38064b.c(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f38052d));
            this.f38051c.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
