package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fm3 extends zd3 {
    public RandomAccessFile j;
    public Uri k;
    public long l;
    public boolean m;

    @Override // defpackage.th3
    public final long a(ij3 ij3Var) throws IOException {
        Uri uri = ij3Var.a;
        this.k = uri;
        c(ij3Var);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.j = randomAccessFile;
            try {
                long j = ij3Var.c;
                randomAccessFile.seek(j);
                long length = ij3Var.d;
                if (length == -1) {
                    length = this.j.length() - j;
                }
                this.l = length;
                if (length < 0) {
                    throw new ol3(null, null, 2008);
                }
                this.m = true;
                e(ij3Var);
                return this.l;
            } catch (IOException e) {
                throw new ol3(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new ol3(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            throw new ol3("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e2, 1004);
        } catch (SecurityException e3) {
            throw new ol3(2006, e3);
        } catch (RuntimeException e4) {
            throw new ol3(2000, e4);
        }
    }

    @Override // defpackage.ua4
    public final int d(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.l;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.j;
            String str = v23.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.l -= i3;
                f(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new ol3(2000, e);
        }
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
                RandomAccessFile randomAccessFile = this.j;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.j = null;
                if (this.m) {
                    this.m = false;
                    j();
                }
            } catch (IOException e) {
                throw new ol3(2000, e);
            }
        } catch (Throwable th) {
            this.j = null;
            if (this.m) {
                this.m = false;
                j();
            }
            throw th;
        }
    }
}
