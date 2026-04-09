package bh;

import com.liuzh.deviceinfo.pro.account.AccountActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountActivity f2187b;

    public /* synthetic */ b(AccountActivity accountActivity, int i4) {
        this.f2186a = i4;
        this.f2187b = accountActivity;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f2186a) {
            case 0:
                return this.f2187b.b();
            case 1:
                return this.f2187b.e();
            default:
                return this.f2187b.c();
        }
    }
}
