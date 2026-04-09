package zf;

import com.liuzh.deviceinfo.MainActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f38266b;

    public /* synthetic */ e(MainActivity mainActivity, int i4) {
        this.f38265a = i4;
        this.f38266b = mainActivity;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f38265a) {
            case 0:
                return this.f38266b.b();
            case 1:
                return this.f38266b.e();
            default:
                return this.f38266b.c();
        }
    }
}
