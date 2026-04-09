package fb;

import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.es1;
import com.google.android.gms.internal.ads.ex;
import com.google.android.gms.internal.ads.fs1;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.js1;
import com.google.android.gms.internal.ads.ud0;
import com.google.android.gms.internal.ads.yv;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23951a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f23952b;

    public /* synthetic */ n(js1 js1Var, int i4) {
        this.f23951a = i4;
        this.f23952b = js1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f23951a) {
            case 0:
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new m(exVar, ((yv) this.f23952b).b());
            default:
                return new e0((ud0) ((es1) this.f23952b).a());
        }
    }
}
