package R2;

import R2.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileLoader.java */
/* loaded from: classes.dex */
public final class h implements f.d<InputStream> {
    @Override // R2.f.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // R2.f.d
    public final void b(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // R2.f.d
    public final InputStream c(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }
}
