package r5;

import a5.x;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f21238a;

    public final void a(int i10) {
        g gVar = this.f21238a;
        synchronized (gVar) {
            int i11 = gVar.E;
            if (i11 == 0 || gVar.f21243x) {
                if (i11 == i10) {
                    return;
                }
                gVar.E = i10;
                if (i10 != 1 && i10 != 0 && i10 != 8) {
                    gVar.H = gVar.h(i10);
                    ((x) gVar.f21242r).getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int i12 = gVar.f21244y > 0 ? (int) (jElapsedRealtime - gVar.B) : 0;
                    long j = gVar.D;
                    long j7 = gVar.H;
                    if (i12 != 0 || j != 0 || j7 != gVar.I) {
                        gVar.I = j7;
                        gVar.f21240d.a(i12, j, j7);
                    }
                    gVar.B = jElapsedRealtime;
                    gVar.D = 0L;
                    gVar.G = 0L;
                    gVar.F = 0L;
                    s sVar = gVar.f21241g;
                    sVar.f21265b.clear();
                    sVar.f21267d = -1;
                    sVar.f21268e = 0;
                    sVar.f21269f = 0;
                }
            }
        }
    }
}
