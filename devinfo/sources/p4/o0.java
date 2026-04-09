package p4;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o0 extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f31263b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(r0 r0Var, int i4) {
        super(0);
        this.f31262a = i4;
        this.f31263b = r0Var;
    }

    @Override // mk.a
    public final Object invoke() throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        switch (this.f31262a) {
            case 0:
                r0 r0Var = this.f31263b;
                File file = new File(r0Var.f31293b.getAbsolutePath() + r0Var.f31296e);
                r0.f(r0Var, file);
                return file;
            case 1:
                System.loadLibrary("datastore_shared_counter");
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) new o0(this.f31263b, 0).invoke(), 939524096);
                    try {
                        int fd2 = parcelFileDescriptorOpen.getFd();
                        NativeSharedCounter nativeSharedCounter = x0.f31345b;
                        if (nativeSharedCounter.nativeTruncateFile(fd2) != 0) {
                            throw new IOException("Failed to truncate counter file");
                        }
                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
                        if (jNativeCreateSharedCounter < 0) {
                            throw new IOException("Failed to mmap counter file");
                        }
                        x0 x0Var = new x0(jNativeCreateSharedCounter);
                        parcelFileDescriptorOpen.close();
                        return x0Var;
                    } catch (Throwable th2) {
                        th = th2;
                        if (parcelFileDescriptorOpen != null) {
                            parcelFileDescriptorOpen.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptorOpen = null;
                }
            default:
                r0 r0Var2 = this.f31263b;
                File file2 = new File(r0Var2.f31293b.getAbsolutePath() + r0Var2.f31295d);
                r0.f(r0Var2, file2);
                return file2;
        }
    }
}
