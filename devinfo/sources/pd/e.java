package pd;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f31720a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f31720a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, Bundle bundle) {
        TaskCompletionSource taskCompletionSource = this.f31720a;
        if (i4 == 1) {
            taskCompletionSource.trySetResult(-1);
        } else if (i4 != 2) {
            taskCompletionSource.trySetResult(1);
        } else {
            taskCompletionSource.trySetResult(0);
        }
    }
}
