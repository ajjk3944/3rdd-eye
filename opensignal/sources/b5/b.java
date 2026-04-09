package b5;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class b extends c {
    public InputStream B;
    public long D;
    public boolean E;

    /* renamed from: x, reason: collision with root package name */
    public final AssetManager f2422x;

    /* renamed from: y, reason: collision with root package name */
    public Uri f2423y;

    public b(Context context) {
        super(false);
        this.f2422x = context.getAssets();
    }

    @Override // b5.h
    public final void close() {
        this.f2423y = null;
        try {
            try {
                InputStream inputStream = this.B;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e4) {
                throw new a(e4, 2000);
            }
        } finally {
            this.B = null;
            if (this.E) {
                this.E = false;
                e();
            }
        }
    }

    @Override // b5.h
    public final Uri o() {
        return this.f2423y;
    }

    @Override // androidx.media3.common.l
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j = this.D;
        if (j != 0) {
            if (j != -1) {
                try {
                    i11 = (int) Math.min(j, i11);
                } catch (IOException e4) {
                    throw new a(e4, 2000);
                }
            }
            InputStream inputStream = this.B;
            int i12 = a5.d0.f105a;
            int i13 = inputStream.read(bArr, i10, i11);
            if (i13 != -1) {
                long j7 = this.D;
                if (j7 != -1) {
                    this.D = j7 - i13;
                }
                a(i13);
                return i13;
            }
        }
        return -1;
    }

    @Override // b5.h
    public final long t(k kVar) throws IOException {
        try {
            Uri uri = kVar.f2443a;
            long j = kVar.f2447e;
            this.f2423y = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            f(kVar);
            InputStream inputStreamOpen = this.f2422x.open(path, 1);
            this.B = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new a(null, 2008);
            }
            long j7 = kVar.f2448f;
            if (j7 != -1) {
                this.D = j7;
            } else {
                long jAvailable = this.B.available();
                this.D = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.D = -1L;
                }
            }
            this.E = true;
            h(kVar);
            return this.D;
        } catch (a e4) {
            throw e4;
        } catch (IOException e10) {
            throw new a(e10, e10 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }
}
