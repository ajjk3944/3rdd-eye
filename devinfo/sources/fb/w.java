package fb;

import android.content.Context;
import com.google.android.gms.internal.ads.a10;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.es1;
import com.google.android.gms.internal.ads.ex;
import com.google.android.gms.internal.ads.fs1;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.g10;
import com.google.android.gms.internal.ads.js1;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.ud0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23986a;

    /* renamed from: b, reason: collision with root package name */
    public final a10 f23987b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f23988c;

    public /* synthetic */ w(a10 a10Var, js1 js1Var, int i4) {
        this.f23986a = i4;
        this.f23987b = a10Var;
        this.f23988c = js1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        int i4 = this.f23986a;
        js1 js1Var = this.f23988c;
        a10 a10Var = this.f23987b;
        switch (i4) {
            case 0:
                Context contextB = a10Var.b();
                pk pkVar = sk.f16033a;
                return new v(contextB, va.s.f36163e.f36164a.A(), ((g10) js1Var).b());
            case 1:
                return new yb.e((Context) a10Var.a(), (za.a) ((g10) js1Var).a());
            default:
                Context contextB2 = a10Var.b();
                ud0 ud0Var = (ud0) ((es1) js1Var).a();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new z(contextB2, ud0Var, exVar);
        }
    }
}
