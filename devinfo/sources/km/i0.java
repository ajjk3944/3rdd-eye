package km;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i0 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28427c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f28428d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28429e;

    public /* synthetic */ i0(Method method, int i4, int i10) {
        this.f28427c = i10;
        this.f28428d = method;
        this.f28429e = i4;
    }

    @Override // km.c1
    public final void a(s0 s0Var, Object obj) {
        switch (this.f28427c) {
            case 0:
                rl.m mVar = (rl.m) obj;
                if (mVar == null) {
                    throw c1.m(this.f28428d, this.f28429e, "Headers parameter must not be null.", new Object[0]);
                }
                y yVar = s0Var.f28465f;
                yVar.getClass();
                int size = mVar.size();
                for (int i4 = 0; i4 < size; i4++) {
                    com.bumptech.glide.d.j(yVar, mVar.c(i4), mVar.f(i4));
                }
                return;
            default:
                if (obj == null) {
                    throw c1.m(this.f28428d, this.f28429e, "@Url parameter is null.", new Object[0]);
                }
                s0Var.f28462c = obj.toString();
                return;
        }
    }
}
