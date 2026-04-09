package pb;

import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20370a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f20371b;

    public f(int i10) {
        this.f20370a = i10;
        switch (i10) {
            case 1:
                this.f20371b = new CopyOnWriteArrayList();
                break;
            default:
                this.f20371b = new CopyOnWriteArrayList();
                break;
        }
    }

    public final void a(int i10, long j, long j7) {
        switch (this.f20370a) {
            case 0:
                Iterator it = this.f20371b.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (!eVar.f20367c) {
                        eVar.f20365a.post(new f5.g(eVar, i10, j, j7, 1));
                    }
                }
                break;
            default:
                Iterator it2 = this.f20371b.iterator();
                while (it2.hasNext()) {
                    r5.c cVar = (r5.c) it2.next();
                    if (!cVar.f21231c) {
                        cVar.f21229a.post(new f5.g(cVar, i10, j, j7, 2));
                    }
                }
                break;
        }
    }

    public void b(AnalyticsCollector analyticsCollector) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f20371b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            r5.c cVar = (r5.c) it.next();
            if (cVar.f21230b == analyticsCollector) {
                cVar.f21231c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
    }

    public void c(com.google.android.exoplayer2.analytics.AnalyticsCollector analyticsCollector) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f20371b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f20366b == analyticsCollector) {
                eVar.f20367c = true;
                copyOnWriteArrayList.remove(eVar);
            }
        }
    }
}
