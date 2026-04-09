package pb;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d extends h {
    public InputStream B;
    public long D;
    public boolean E;

    /* renamed from: x, reason: collision with root package name */
    public final AssetManager f20358x;

    /* renamed from: y, reason: collision with root package name */
    public Uri f20359y;

    public d(Context context) {
        super(false);
        this.f20358x = context.getAssets();
    }

    @Override // pb.n
    public final void close() {
        this.f20359y = null;
        try {
            try {
                InputStream inputStream = this.B;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e4) {
                throw new c(e4, 2000);
            }
        } finally {
            this.B = null;
            if (this.E) {
                this.E = false;
                e();
            }
        }
    }

    @Override // pb.n
    public final Uri o() {
        return this.f20359y;
    }

    @Override // pb.n
    public final long q(na.c cVar) throws IOException {
        try {
            Uri uri = (Uri) cVar.f17422f;
            long j = cVar.f17419c;
            this.f20359y = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            f(cVar);
            InputStream inputStreamOpen = this.f20358x.open(path, 1);
            this.B = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new c(null, 2008);
            }
            long j7 = cVar.f17420d;
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
            h(cVar);
            return this.D;
        } catch (c e4) {
            throw e4;
        } catch (IOException e10) {
            throw new c(e10, e10 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // pb.k
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
                    throw new c(e4, 2000);
                }
            }
            InputStream inputStream = this.B;
            int i12 = qb.v.f20828a;
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
}
