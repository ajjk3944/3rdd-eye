package defpackage;

import android.net.Uri;
import android.view.InputEvent;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vc0 extends mz0 implements hy {
    public int j;
    public final /* synthetic */ wc0 k;
    public final /* synthetic */ Uri l;
    public final /* synthetic */ InputEvent m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc0(wc0 wc0Var, Uri uri, InputEvent inputEvent, oj ojVar) {
        super(2, ojVar);
        this.k = wc0Var;
        this.l = uri;
        this.m = inputEvent;
    }

    @Override // defpackage.hy
    public final Object f(Object obj, Object obj2) {
        return ((vc0) h((oj) obj2, (qk) obj)).m(z31.a);
    }

    @Override // defpackage.s9
    public final oj h(oj ojVar, Object obj) {
        return new vc0(this.k, this.l, this.m, ojVar);
    }

    @Override // defpackage.s9
    public final Object m(Object obj) throws Throwable {
        int i = this.j;
        if (i == 0) {
            bd2.x(obj);
            uc0 uc0Var = this.k.a;
            this.j = 1;
            Object objC = uc0Var.c(this.l, this.m, this);
            rk rkVar = rk.f;
            if (objC == rkVar) {
                return rkVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bd2.x(obj);
        }
        return z31.a;
    }
}
