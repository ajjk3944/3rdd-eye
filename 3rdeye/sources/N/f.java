package N;

import C.d0;
import W.F;
import android.view.Surface;
import o0.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements K0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4385c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.f4383a = i;
        this.f4384b = obj;
        this.f4385c = obj2;
    }

    @Override // K0.b
    public final void accept(Object obj) {
        switch (this.f4383a) {
            case 0:
                j jVar = (j) this.f4384b;
                jVar.getClass();
                d0 d0Var = (d0) this.f4385c;
                d0Var.close();
                Surface surface = (Surface) jVar.i.remove(d0Var);
                if (surface != null) {
                    l lVar = jVar.f4397b;
                    P.d.d(true, lVar.f4408a);
                    P.d.c(lVar.f4410c);
                    lVar.i(surface, true);
                    break;
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                F f10 = (F) this.f4384b;
                if (f10.f13101U == null) {
                    if (th instanceof d0.h) {
                        f10.y(F.g.ERROR_ENCODER);
                    } else {
                        f10.y(F.g.ERROR_SOURCE);
                    }
                    f10.f13101U = th;
                    f10.I();
                    ((b.a) this.f4385c).b(null);
                    break;
                }
                break;
        }
    }
}
