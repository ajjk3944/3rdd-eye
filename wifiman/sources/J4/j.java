package j4;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import k4.t;

/* loaded from: classes3.dex */
abstract class j extends k4.g {

    /* renamed from: a, reason: collision with root package name */
    final k4.i f50123a;

    /* renamed from: b, reason: collision with root package name */
    final TaskCompletionSource f50124b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f50125c;

    j(l lVar, k4.i iVar, TaskCompletionSource taskCompletionSource) {
        this.f50125c = lVar;
        this.f50123a = iVar;
        this.f50124b = taskCompletionSource;
    }

    @Override // k4.h
    public void U(Bundle bundle) {
        t tVar = this.f50125c.f50127a;
        if (tVar != null) {
            tVar.u(this.f50124b);
        }
        this.f50123a.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
