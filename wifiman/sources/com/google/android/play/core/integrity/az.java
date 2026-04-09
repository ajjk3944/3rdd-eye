package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes3.dex */
final class az implements StandardIntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    private final bn f38031a;

    /* renamed from: b, reason: collision with root package name */
    private final bt f38032b;

    az(bn bnVar, bt btVar) {
        this.f38031a = bnVar;
        this.f38032b = btVar;
    }

    final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l10) throws Exception {
        final long jB = prepareIntegrityTokenRequest.b();
        final long jLongValue = l10.longValue();
        prepareIntegrityTokenRequest.a();
        final bt btVar = this.f38032b;
        final int i10 = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(jB, jLongValue, i10) { // from class: com.google.android.play.core.integrity.bs

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f38077b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f38078c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return this.f38076a.a(this.f38077b, this.f38078c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long jB = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f38031a.e(jB, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f38029a.a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
