package pd;

import android.os.RemoteException;
import android.util.Log;
import cl.u;
import com.google.android.gms.tasks.TaskCompletionSource;
import km.o;
import qd.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends qd.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31724b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f31725c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f31727e = iVar;
        this.f31726d = str;
        this.f31725c = taskCompletionSource2;
    }

    @Override // qd.i
    public final void a() {
        boolean z3 = false;
        switch (this.f31724b) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f31725c;
                i iVar = (i) this.f31727e;
                String str = (String) this.f31726d;
                try {
                    iVar.f31734a.f32267m.W1(iVar.f31735b, i.a(iVar, str), new h(iVar, taskCompletionSource, str));
                    return;
                } catch (RemoteException e2) {
                    u uVar = i.f31732e;
                    Object[] objArr = {str};
                    uVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", u.e(uVar.f2942b, "requestUpdateInfo(%s)", objArr), e2);
                    }
                    taskCompletionSource.trySetException(new RuntimeException(e2));
                    return;
                }
            default:
                synchronized (((n) this.f31727e).f32262f) {
                    try {
                        n nVar = (n) this.f31727e;
                        TaskCompletionSource taskCompletionSource2 = this.f31725c;
                        nVar.f32261e.add(taskCompletionSource2);
                        taskCompletionSource2.getTask().addOnCompleteListener(new o(z3, nVar, taskCompletionSource2));
                        if (((n) this.f31727e).f32265k.getAndIncrement() > 0) {
                            ((n) this.f31727e).f32258b.d("Already connected to the service.", new Object[0]);
                        }
                        n.b((n) this.f31727e, (g) this.f31726d);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, g gVar) {
        super(taskCompletionSource);
        this.f31727e = nVar;
        this.f31725c = taskCompletionSource2;
        this.f31726d = gVar;
    }
}
