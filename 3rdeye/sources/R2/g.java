package R2;

import R2.f;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: FileLoader.java */
/* loaded from: classes.dex */
public final class g implements f.d<ParcelFileDescriptor> {
    @Override // R2.f.d
    public final Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    @Override // R2.f.d
    public final void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // R2.f.d
    public final ParcelFileDescriptor c(File file) throws FileNotFoundException {
        return ParcelFileDescriptor.open(file, 268435456);
    }
}
