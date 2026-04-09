package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.A;
import com.google.android.play.integrity.internal.G;

/* loaded from: classes3.dex */
final class af extends G {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f37986a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f37987b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f37988c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f37989d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f37990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f37990e = ajVar;
        this.f37986a = bArr;
        this.f37987b = l10;
        this.f37988c = taskCompletionSource2;
        this.f37989d = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.G
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.G
    protected final void b() {
        try {
            ((A) this.f37990e.f38000a.e()).l(aj.a(this.f37990e, this.f37986a, this.f37987b, null), new ai(this.f37990e, this.f37988c));
        } catch (RemoteException e10) {
            this.f37990e.f38001b.c(e10, "requestIntegrityToken(%s)", this.f37989d);
            this.f37988c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
