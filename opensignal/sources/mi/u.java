package mi;

import java.util.TimerTask;

/* loaded from: classes.dex */
public final class u extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f16818a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f16819d;

    public u(long j, v vVar) {
        this.f16818a = j;
        this.f16819d = vVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        String str = "Timer has expired after " + this.f16818a;
        ch.n.b("TracerouteJob", str);
        v vVar = this.f16819d;
        vVar.w("ERROR", str);
        vVar.Q.stop();
    }
}
