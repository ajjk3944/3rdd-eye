package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lp extends b40 {
    public final /* synthetic */ int j;
    public final Object k;

    public /* synthetic */ lp(int i, Object obj) {
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.f30
    public final void d(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.j) {
            case 0:
                ((jp) this.k).b();
                break;
            case 1:
                ((f30) this.k).d(th);
                break;
            case 2:
                c40 c40Var = (c40) this.k;
                Object objA = k().A();
                if (!(objA instanceof pg)) {
                    c40Var.e(wl2.x(objA));
                    break;
                } else {
                    c40Var.e(bd2.k(((pg) objA).a));
                    break;
                }
            default:
                ((kd) this.k).e(z31.a);
                break;
        }
    }
}
