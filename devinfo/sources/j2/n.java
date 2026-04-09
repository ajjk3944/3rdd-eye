package j2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.xz;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f27237b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(r rVar, int i4) {
        super(1);
        this.f27236a = i4;
        this.f27237b = rVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f27236a) {
            case 0:
                int i4 = ((n1.c) obj).f29514a;
                xz xzVar = (xz) this.f27237b.getFocusOwner();
                r rVar = (r) xzVar.f18584a;
                n1.s sVarH = xzVar.h();
                if (sVarH == null || !sVarH.f29549o || !rVar.y(i4)) {
                    nk.u uVar = new nk.u();
                    uVar.f29986a = Boolean.FALSE;
                    n1.s sVarH2 = xzVar.h();
                    Boolean boolG = xzVar.g(i4, rVar.getEmbeddedViewFocusRect(), new n1.j(uVar, i4));
                    if ((!nk.k.a(boolG, Boolean.TRUE) || sVarH2 == xzVar.h()) && boolG != null && uVar.f29986a != null && boolG.booleanValue()) {
                        ((Boolean) uVar.f29986a).getClass();
                    }
                }
                break;
            default:
                mk.a aVar = (mk.a) obj;
                r rVar2 = this.f27237b;
                rVar2.getUncaughtExceptionHandler$ui();
                Handler handler = rVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = rVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new g3.a(3, aVar));
                    }
                }
                break;
        }
        return yj.u.f37649a;
    }
}
