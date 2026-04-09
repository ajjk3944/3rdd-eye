package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jd3 extends zd3 {
    public final AssetManager j;
    public Uri k;
    public InputStream l;
    public long m;
    public boolean n;

    public jd3(Context context) {
        super(false);
        this.j = context.getAssets();
    }

    @Override // defpackage.th3
    public final long a(ij3 ij3Var) throws IOException {
        try {
            Uri uri = ij3Var.a;
            this.k = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            c(ij3Var);
            InputStream inputStreamOpen = this.j.open(path, 1);
            this.l = inputStreamOpen;
            long j = ij3Var.c;
            if (inputStreamOpen.skip(j) < j) {
                throw new yc3(2008, null);
            }
            long j2 = ij3Var.d;
            if (j2 != -1) {
                this.m = j2;
            } else {
                long jAvailable = this.l.available();
                this.m = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.m = -1L;
                }
            }
            this.n = true;
            e(ij3Var);
            return this.m;
        } catch (yc3 e) {
            throw e;
        } catch (IOException e2) {
            throw new yc3(true != (e2 instanceof FileNotFoundException) ? 2000 : 2005, e2);
        }
    }

    @Override // defpackage.ua4
    public final int d(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.m;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new yc3(2000, e);
                }
            }
            InputStream inputStream = this.l;
            String str = v23.a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.m;
                if (j2 != -1) {
                    this.m = j2 - i3;
                }
                f(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // defpackage.th3
    public final Uri h() {
        return this.k;
    }

    @Override // defpackage.th3
    public final void l() {
        this.k = null;
        try {
            try {
                InputStream inputStream = this.l;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.l = null;
                if (this.n) {
                    this.n = false;
                    j();
                }
            } catch (IOException e) {
                throw new yc3(2000, e);
            }
        } catch (Throwable th) {
            this.l = null;
            if (this.n) {
                this.n = false;
                j();
            }
            throw th;
        }
    }
}
