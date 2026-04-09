package ih;

import java.util.TimerTask;

/* loaded from: classes.dex */
public final class a extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11364a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f11365d;

    public a(e eVar, boolean z10) {
        this.f11365d = eVar;
        this.f11364a = z10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ih.c, mi.f] */
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f11364a) {
            e eVar = this.f11365d;
            eVar.f11371d = true;
            eVar.d();
            ?? r12 = eVar.f11385t;
            if (r12 != 0) {
                r12.d();
            }
            eVar.i();
        }
    }
}
