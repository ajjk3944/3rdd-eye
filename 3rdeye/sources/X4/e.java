package x4;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class e extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f47761b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f47761b = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f47761b.trySetResult(null);
    }
}
