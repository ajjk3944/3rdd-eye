package U2;

import U2.s;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* loaded from: classes.dex */
public final class v implements L2.j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final m f12449a;

    public v(m mVar) {
        this.f12449a = mVar;
    }

    @Override // L2.j
    public final boolean a(ParcelFileDescriptor parcelFileDescriptor, L2.h hVar) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // L2.j
    public final N2.u<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i, int i10, L2.h hVar) throws IOException {
        m mVar = this.f12449a;
        return mVar.a(new s.c(parcelFileDescriptor, mVar.f12423d, mVar.f12422c), i, i10, hVar, m.f12418k);
    }
}
