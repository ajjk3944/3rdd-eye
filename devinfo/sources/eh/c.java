package eh;

import com.liuzh.deviceinfo.pro.account.login.LogInActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LogInActivity f23482b;

    public /* synthetic */ c(LogInActivity logInActivity, int i4) {
        this.f23481a = i4;
        this.f23482b = logInActivity;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f23481a) {
            case 0:
                return this.f23482b.b();
            case 1:
                return this.f23482b.e();
            default:
                return this.f23482b.c();
        }
    }
}
