package ya;

import android.content.Context;
import va.n1;
import va.w1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f37460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t5.p f37461b;

    public h(t5.p pVar, Context context) {
        this.f37460a = context;
        this.f37461b = pVar;
    }

    @Override // va.o1
    public final void Q(w1 w1Var) {
        if (w1Var == null) {
            return;
        }
        this.f37461b.p(this.f37460a, w1Var.f36178b, true, true);
    }
}
