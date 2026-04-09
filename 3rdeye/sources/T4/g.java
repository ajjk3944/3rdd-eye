package t4;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import u4.l;
import u4.m;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class g extends m {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f46409c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f46410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f46411e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f46411e = iVar;
        this.f46409c = str;
        this.f46410d = taskCompletionSource2;
    }

    @Override // u4.m
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.f46410d;
        i iVar = this.f46411e;
        String str = this.f46409c;
        try {
            iVar.f46418a.f46597m.k(iVar.f46419b, i.a(iVar, str), new h(iVar, taskCompletionSource, str));
        } catch (RemoteException e4) {
            l lVar = i.f46416e;
            Object[] objArr = {str};
            lVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", l.b(lVar.f46572a, "requestUpdateInfo(%s)", objArr), e4);
            }
            taskCompletionSource.trySetException(new RuntimeException(e4));
        }
    }
}
