package d5;

import android.util.Base64;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements ne.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7000a;

    @Override // ne.n
    public final Object get() {
        switch (this.f7000a) {
            case 0:
                return new e(new r5.e(), 50000, 50000, 2500, 5000);
            case 1:
                byte[] bArr = new byte[12];
                e5.a0.f7798h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                byte[] bArr2 = new byte[12];
                x9.t.f25200h.nextBytes(bArr2);
                return Base64.encodeToString(bArr2, 10);
        }
    }
}
