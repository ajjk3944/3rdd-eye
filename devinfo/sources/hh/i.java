package hh;

import androidx.lifecycle.l0;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends hg.e {

    /* renamed from: b, reason: collision with root package name */
    public final wi.e f25086b;

    /* renamed from: c, reason: collision with root package name */
    public final wi.e f25087c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f25088d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f25089e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f25090f;
    public final l0 g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f25091h;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f25092i;
    public final l0 j;

    /* renamed from: k, reason: collision with root package name */
    public final l0 f25093k;

    /* renamed from: l, reason: collision with root package name */
    public final h f25094l;

    /* renamed from: m, reason: collision with root package name */
    public final h f25095m;

    public i() {
        wi.e eVar = new wi.e();
        this.f25086b = eVar;
        this.f25087c = eVar;
        l0 l0Var = new l0();
        this.f25088d = l0Var;
        this.f25089e = l0Var;
        l0 l0Var2 = new l0();
        this.f25090f = l0Var2;
        this.g = l0Var2;
        l0 l0Var3 = new l0();
        this.f25091h = l0Var3;
        this.f25092i = l0Var3;
        l0 l0Var4 = new l0();
        this.j = l0Var4;
        this.f25093k = l0Var4;
        this.f25094l = new h(this, 1);
        this.f25095m = new h(this, 0);
    }

    public static final void g(i iVar, Throwable th2) {
        wi.e eVar = iVar.f25086b;
        String message = th2.getMessage();
        if (message == null) {
            message = a0.g.o("error@", th2);
        }
        eVar.h(message);
        iVar.f25091h.h(new r(hg.e.e(R.string.get_verification_code), true, false));
    }

    public static final void h(i iVar, Throwable th2) {
        wi.e eVar = iVar.f25086b;
        String message = th2.getMessage();
        if (message == null) {
            message = a0.g.o("error@", th2);
        }
        eVar.h(message);
        iVar.f25088d.h(new r(hg.e.e(R.string.get_verification_code), true, false));
    }

    public static final void i(i iVar, Throwable th2) {
        wi.e eVar = iVar.f25086b;
        String message = th2.getMessage();
        if (message == null) {
            message = a0.g.o("error@", th2);
        }
        eVar.h(message);
    }

    @Override // androidx.lifecycle.e1
    public final void d() {
        this.f25095m.cancel();
        this.f25094l.cancel();
    }
}
