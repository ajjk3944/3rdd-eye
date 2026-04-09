package fb;

import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.es1;
import com.google.android.gms.internal.ads.ex;
import com.google.android.gms.internal.ads.fs1;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.js1;
import com.google.android.gms.internal.ads.q80;
import com.google.android.gms.internal.ads.x80;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23945a;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f23946b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f23947c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f23948d;

    public l(es1 es1Var, es1 es1Var2, es1 es1Var3, int i4) {
        this.f23945a = i4;
        switch (i4) {
            case 1:
                this.f23948d = es1Var;
                this.f23946b = es1Var2;
                this.f23947c = es1Var3;
                break;
            default:
                this.f23946b = es1Var;
                this.f23947c = es1Var2;
                this.f23948d = es1Var3;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f23945a) {
            case 0:
                x80 x80Var = (f0) this.f23946b.a();
                x80 x80Var2 = (p) this.f23947c.a();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                if (((Integer) ((es1) this.f23948d).a()).intValue() == 2) {
                    x80Var = x80Var2;
                }
                return new q80(x80Var, exVar);
            default:
                return new p((k) this.f23948d.a(), ((Integer) this.f23946b.a()).intValue(), (String) this.f23947c.a());
        }
    }
}
