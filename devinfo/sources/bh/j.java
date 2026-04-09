package bh;

import com.liuzh.deviceinfo.pro.account.AccountProActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountProActivity f2205b;

    public /* synthetic */ j(AccountProActivity accountProActivity, int i4) {
        this.f2204a = i4;
        this.f2205b = accountProActivity;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f2204a) {
            case 0:
                return this.f2205b.b();
            case 1:
                return this.f2205b.e();
            default:
                return this.f2205b.c();
        }
    }
}
