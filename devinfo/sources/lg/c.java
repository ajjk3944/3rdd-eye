package lg;

import java.util.List;
import jg.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public long f28806a;

    /* renamed from: b, reason: collision with root package name */
    public l f28807b;

    public final void b() {
        l lVar = this.f28807b;
        if (lVar != null) {
            bi.d.a(new b(lVar, 1), 0L);
        }
    }

    public void c(Object obj, long j) {
        this.f28806a += j;
        l lVar = this.f28807b;
        if (lVar != null) {
            bi.d.a(new k1.b(3, lVar, this), 0L);
        }
    }

    public abstract List d();
}
