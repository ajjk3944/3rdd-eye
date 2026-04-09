package k4;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class m extends j {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f51206b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f51207c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ t f51208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, j jVar) {
        super(taskCompletionSource);
        this.f51206b = taskCompletionSource2;
        this.f51207c = jVar;
        this.f51208d = tVar;
    }

    @Override // k4.j
    public final void a() {
        synchronized (this.f51208d.f51220f) {
            try {
                t.n(this.f51208d, this.f51206b);
                if (this.f51208d.f51225k.getAndIncrement() > 0) {
                    this.f51208d.f51216b.c("Already connected to the service.", new Object[0]);
                }
                t.p(this.f51208d, this.f51207c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
