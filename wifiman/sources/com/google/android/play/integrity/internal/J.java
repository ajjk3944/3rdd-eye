package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class J extends G {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f38118g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ G f38119h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C5030f f38120i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(C5030f c5030f, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, G g10) {
        super(taskCompletionSource);
        this.f38120i = c5030f;
        this.f38118g = taskCompletionSource2;
        this.f38119h = g10;
    }

    @Override // com.google.android.play.integrity.internal.G
    public final void b() {
        synchronized (this.f38120i.f38134f) {
            try {
                C5030f.o(this.f38120i, this.f38118g);
                if (this.f38120i.f38140l.getAndIncrement() > 0) {
                    this.f38120i.f38130b.d("Already connected to the service.", new Object[0]);
                }
                C5030f.q(this.f38120i, this.f38119h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
