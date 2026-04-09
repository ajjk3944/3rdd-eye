package r3;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class w extends u {

    /* renamed from: c, reason: collision with root package name */
    private static final WeakReference f60107c = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f60108b;

    w(byte[] bArr) {
        super(bArr);
        this.f60108b = f60107c;
    }

    @Override // r3.u
    final byte[] n0() {
        byte[] bArrO0;
        synchronized (this) {
            try {
                bArrO0 = (byte[]) this.f60108b.get();
                if (bArrO0 == null) {
                    bArrO0 = o0();
                    this.f60108b = new WeakReference(bArrO0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrO0;
    }

    protected abstract byte[] o0();
}
