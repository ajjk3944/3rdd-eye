package ec;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n4 f23074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f23075c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1 f23076d;

    public /* synthetic */ t1(u1 u1Var, n4 n4Var, Bundle bundle, int i4) {
        this.f23073a = i4;
        this.f23074b = n4Var;
        this.f23075c = bundle;
        this.f23076d = u1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f23073a) {
            case 0:
                u1 u1Var = this.f23076d;
                u1Var.f23089a.B();
                return u1Var.f23089a.d0(this.f23075c, this.f23074b);
            default:
                u1 u1Var2 = this.f23076d;
                u1Var2.f23089a.B();
                return u1Var2.f23089a.d0(this.f23075c, this.f23074b);
        }
    }
}
