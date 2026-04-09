package u4;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class o extends m {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f46576c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t4.g f46577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f46578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u uVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t4.g gVar) {
        super(taskCompletionSource);
        this.f46578e = uVar;
        this.f46576c = taskCompletionSource2;
        this.f46577d = gVar;
    }

    @Override // u4.m
    public final void a() {
        synchronized (this.f46578e.f46591f) {
            try {
                u uVar = this.f46578e;
                TaskCompletionSource taskCompletionSource = this.f46576c;
                uVar.f46590e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new K4.b(6, uVar, taskCompletionSource));
                if (this.f46578e.f46595k.getAndIncrement() > 0) {
                    this.f46578e.f46587b.a("Already connected to the service.", new Object[0]);
                }
                u.b(this.f46578e, this.f46577d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
