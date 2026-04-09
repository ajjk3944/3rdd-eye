package dh;

import com.liuzh.deviceinfo.pro.account.delete.DeleteAccountActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountActivity f22256b;

    public /* synthetic */ c(DeleteAccountActivity deleteAccountActivity, int i4) {
        this.f22255a = i4;
        this.f22256b = deleteAccountActivity;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f22255a) {
            case 0:
                return this.f22256b.b();
            case 1:
                return this.f22256b.e();
            default:
                return this.f22256b.c();
        }
    }
}
