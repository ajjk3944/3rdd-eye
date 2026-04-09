package d4;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class r0 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6869d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u0 f6870g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(u0 u0Var, int i10) {
        super(0);
        this.f6869d = i10;
        this.f6870g = u0Var;
    }

    @Override // ar.a
    public final Object c() throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        switch (this.f6869d) {
            case 0:
                System.loadLibrary("datastore_shared_counter");
                u0 u0Var = this.f6870g;
                File file = new File(u0Var.f6887b.getAbsolutePath() + u0Var.f6890e);
                u0.f(u0Var, file);
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 939524096);
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptorOpen = null;
                }
                try {
                    int fd2 = parcelFileDescriptorOpen.getFd();
                    NativeSharedCounter nativeSharedCounter = a1.f6765b;
                    if (nativeSharedCounter.nativeTruncateFile(fd2) != 0) {
                        throw new IOException("Failed to truncate counter file");
                    }
                    long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
                    if (jNativeCreateSharedCounter < 0) {
                        throw new IOException("Failed to mmap counter file");
                    }
                    a1 a1Var = new a1(jNativeCreateSharedCounter);
                    parcelFileDescriptorOpen.close();
                    return a1Var;
                } catch (Throwable th3) {
                    th = th3;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            default:
                u0 u0Var2 = this.f6870g;
                File file2 = new File(u0Var2.f6887b.getAbsolutePath() + u0Var2.f6889d);
                u0.f(u0Var2, file2);
                return file2;
        }
    }
}
