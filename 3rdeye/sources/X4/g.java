package x4;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class g extends y4.h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f47764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f47765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f47765d = iVar;
        this.f47764c = taskCompletionSource2;
    }

    @Override // y4.h
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.f47764c;
        i iVar = this.f47765d;
        try {
            iVar.f47770a.f48129m.d(iVar.f47771b, j.a(), new h(iVar, taskCompletionSource));
        } catch (RemoteException e4) {
            y4.g gVar = i.f47769c;
            Object[] objArr = {iVar.f47771b};
            gVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", y4.g.b(gVar.f48109a, "error requesting in-app review for %s", objArr), e4);
            }
            taskCompletionSource.trySetException(new RuntimeException(e4));
        }
    }
}
