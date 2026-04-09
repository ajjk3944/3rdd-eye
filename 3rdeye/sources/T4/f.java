package t4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import u4.l;
import u4.o;
import u4.u;
import v4.C5679a;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class f implements InterfaceC5604b {

    /* renamed from: a, reason: collision with root package name */
    public final i f46406a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f46407b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f46408c = new Handler(Looper.getMainLooper());

    public f(i iVar, Context context) {
        this.f46406a = iVar;
        this.f46407b = context;
    }

    @Override // t4.InterfaceC5604b
    public final Task<C5603a> a() {
        String packageName = this.f46407b.getPackageName();
        l lVar = i.f46416e;
        i iVar = this.f46406a;
        u uVar = iVar.f46418a;
        if (uVar != null) {
            lVar.a("requestUpdateInfo(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            uVar.a().post(new o(uVar, taskCompletionSource, taskCompletionSource, new g(iVar, taskCompletionSource, packageName, taskCompletionSource)));
            return taskCompletionSource.getTask();
        }
        Object[] objArr = {-9};
        lVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", l.b(lVar.f46572a, "onError(%d)", objArr));
        }
        return Tasks.forException(new C5679a(-9));
    }

    @Override // t4.InterfaceC5604b
    public final Task b(C5603a c5603a, Activity activity, k kVar) {
        if (c5603a == null || activity == null || c5603a.f46402e) {
            return Tasks.forException(new C5679a(-4));
        }
        if (c5603a.a(kVar) == null) {
            return Tasks.forException(new C5679a(-6));
        }
        c5603a.f46402e = true;
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", c5603a.a(kVar));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new com.android.billingclient.api.e(this.f46408c, taskCompletionSource, 1));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }
}
