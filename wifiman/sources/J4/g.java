package j4;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* loaded from: classes3.dex */
public final class g implements InterfaceC6247b {

    /* renamed from: a, reason: collision with root package name */
    private final l f50119a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f50120b = new Handler(Looper.getMainLooper());

    g(l lVar) {
        this.f50119a = lVar;
    }

    @Override // j4.InterfaceC6247b
    public final Task a(Activity activity, AbstractC6246a abstractC6246a) {
        if (abstractC6246a.b()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", abstractC6246a.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new ResultReceiverC6251f(this, this.f50120b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    @Override // j4.InterfaceC6247b
    public final Task b() {
        return this.f50119a.a();
    }
}
