package j4;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class k extends j {
    k(l lVar, TaskCompletionSource taskCompletionSource, String str) {
        super(lVar, new k4.i("OnRequestInstallCallback"), taskCompletionSource);
    }

    @Override // j4.j, k4.h
    public final void U(Bundle bundle) {
        super.U(bundle);
        this.f50124b.trySetResult(new C6249d((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
