package hh;

import androidx.lifecycle.l0;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y extends hg.e {

    /* renamed from: b, reason: collision with root package name */
    public final wi.e f25142b;

    /* renamed from: c, reason: collision with root package name */
    public final wi.e f25143c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f25144d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f25145e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f25146f;
    public final l0 g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f25147h;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f25148i;
    public final l0 j;

    /* renamed from: k, reason: collision with root package name */
    public final l0 f25149k;

    /* renamed from: l, reason: collision with root package name */
    public final h f25150l;

    public y() {
        wi.e eVar = new wi.e();
        this.f25142b = eVar;
        this.f25143c = eVar;
        l0 l0Var = new l0();
        this.f25144d = l0Var;
        this.f25145e = l0Var;
        l0 l0Var2 = new l0();
        this.f25146f = l0Var2;
        this.g = l0Var2;
        l0 l0Var3 = new l0();
        this.f25147h = l0Var3;
        this.f25148i = l0Var3;
        l0 l0Var4 = new l0();
        this.j = l0Var4;
        this.f25149k = l0Var4;
        this.f25150l = new h(this, 2);
    }

    public static final void g(y yVar, Throwable th2) {
        wi.e eVar = yVar.f25142b;
        String message = th2.getMessage();
        if (message == null) {
            message = a0.g.o("error@", th2);
        }
        eVar.h(message);
        yVar.f25144d.h(new r(hg.e.e(R.string.get_verification_code), true, false));
    }

    @Override // androidx.lifecycle.e1
    public final void d() {
        this.f25150l.cancel();
    }
}
