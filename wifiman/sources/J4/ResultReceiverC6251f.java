package j4;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: j4.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class ResultReceiverC6251f extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f50118a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResultReceiverC6251f(g gVar, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f50118a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f50118a.trySetResult(null);
    }
}
