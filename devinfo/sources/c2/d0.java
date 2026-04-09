package c2;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2599a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2600b;

    public /* synthetic */ d0() {
        this.f2599a = 0;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        long j;
        switch (this.f2599a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                y yVar = (y) this.f2600b;
                if (yVar != null) {
                    yVar.f2699c = zBooleanValue;
                }
                return yj.u.f37649a;
            case 1:
                g1.k kVar = (g1.k) obj;
                synchronized (g1.m.f24260c) {
                    j = g1.m.f24262e;
                    g1.m.f24262e = 1 + j;
                }
                return new g1.f(j, kVar, (mk.c) this.f2600b);
            case 2:
                ((List) this.f2600b).get(((Number) obj).intValue());
                return null;
            case 3:
                ((u0.f) this.f2600b).cancel();
                return yj.u.f37649a;
            default:
                xk.h hVar = (xk.h) this.f2600b;
                yj.u uVar = yj.u.f37649a;
                hVar.resumeWith(uVar);
                return uVar;
        }
    }

    public /* synthetic */ d0(int i4, Object obj) {
        this.f2599a = i4;
        this.f2600b = obj;
    }
}
