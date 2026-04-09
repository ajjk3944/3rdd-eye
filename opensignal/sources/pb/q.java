package pb;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f20404a;

    public /* synthetic */ q(r rVar) {
        this.f20404a = rVar;
    }

    public final void a(int i10) {
        r rVar = this.f20404a;
        synchronized (rVar) {
            int i11 = rVar.E;
            if (i11 == 0 || rVar.f20415x) {
                if (i11 == i10) {
                    return;
                }
                rVar.E = i10;
                if (i10 != 1 && i10 != 0 && i10 != 8) {
                    rVar.H = rVar.h(i10);
                    ((et.d) rVar.f20414r).getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int i12 = rVar.f20416y > 0 ? (int) (jElapsedRealtime - rVar.B) : 0;
                    long j = rVar.D;
                    long j7 = rVar.H;
                    if (i12 != 0 || j != 0 || j7 != rVar.I) {
                        rVar.I = j7;
                        rVar.f20412d.a(i12, j, j7);
                    }
                    rVar.B = jElapsedRealtime;
                    rVar.D = 0L;
                    rVar.G = 0L;
                    rVar.F = 0L;
                    qb.r rVar2 = rVar.f20413g;
                    rVar2.f20815b.clear();
                    rVar2.f20817d = -1;
                    rVar2.f20818e = 0;
                    rVar2.f20819f = 0;
                }
            }
        }
    }
}
