package fb;

import com.google.android.gms.internal.ads.a10;
import com.google.android.gms.internal.ads.fs1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23978a;

    /* renamed from: b, reason: collision with root package name */
    public final a10 f23979b;

    public /* synthetic */ u(a10 a10Var, int i4) {
        this.f23978a = i4;
        this.f23979b = a10Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f23978a) {
            case 0:
                return new t(this.f23979b.b());
            default:
                return new ya.x(this.f23979b.b());
        }
    }
}
