package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes3.dex */
final class bt {

    /* renamed from: a, reason: collision with root package name */
    private final bn f38079a;

    bt(bn bnVar) {
        this.f38079a = bnVar;
    }

    final /* synthetic */ Task a(long j10, long j11, int i10, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f38079a.d(standardIntegrityTokenRequest.a(), j10, j11, 0);
    }
}
