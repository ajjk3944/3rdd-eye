package g1;

import b5.i0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24199c;

    public /* synthetic */ a(int i4, Object obj, Object obj2) {
        this.f24197a = i4;
        this.f24198b = obj;
        this.f24199c = obj2;
    }

    private final Object c(Object obj) {
        i0 i0Var = (i0) this.f24198b;
        Object obj2 = i0Var.f1822c;
        xk.h hVar = (xk.h) this.f24199c;
        synchronized (obj2) {
            ((ArrayList) i0Var.f1821b).remove(hVar);
        }
        return yj.u.f37649a;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        long j;
        switch (this.f24197a) {
            case 0:
                k kVar = (k) obj;
                synchronized (m.f24260c) {
                    j = m.f24262e;
                    m.f24262e = 1 + j;
                }
                return new c(j, kVar, (mk.c) this.f24198b, (mk.c) this.f24199c);
            case 1:
                int iIntValue = ((Number) obj).intValue();
                return ((s2.u) this.f24198b).invoke(Integer.valueOf(iIntValue), ((List) this.f24199c).get(iIntValue));
            case 2:
                return c(obj);
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof u6.u) {
                    ((t6.u) this.f24198b).stop(((u6.u) th2).f35192a);
                }
                ((vd.b) this.f24199c).cancel(false);
                return yj.u.f37649a;
        }
    }
}
