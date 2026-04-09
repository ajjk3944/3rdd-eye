package b5;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class s extends c {
    public long B;
    public boolean D;

    /* renamed from: x, reason: collision with root package name */
    public RandomAccessFile f2465x;

    /* renamed from: y, reason: collision with root package name */
    public Uri f2466y;

    @Override // b5.h
    public final void close() {
        this.f2466y = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f2465x;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e4) {
                throw new r(e4, 2000);
            }
        } finally {
            this.f2465x = null;
            if (this.D) {
                this.D = false;
                e();
            }
        }
    }

    @Override // b5.h
    public final Uri o() {
        return this.f2466y;
    }

    @Override // androidx.media3.common.l
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j = this.B;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f2465x;
            int i12 = a5.d0.f105a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j, i11));
            if (i13 > 0) {
                this.B -= i13;
                a(i13);
            }
            return i13;
        } catch (IOException e4) {
            throw new r(e4, 2000);
        }
    }

    @Override // b5.h
    public final long t(k kVar) throws IOException {
        Uri uri = kVar.f2443a;
        long j = kVar.f2447e;
        this.f2466y = uri;
        f(kVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f2465x = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = kVar.f2448f;
                if (length == -1) {
                    length = this.f2465x.length() - j;
                }
                this.B = length;
                if (length < 0) {
                    throw new r(null, null, 2008);
                }
                this.D = true;
                h(kVar);
                return this.B;
            } catch (IOException e4) {
                throw new r(e4, 2000);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new r(e10, (a5.d0.f105a < 21 || !q.b(e10.getCause())) ? 2005 : 2006);
            }
            throw new r("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e10, 1004);
        } catch (SecurityException e11) {
            throw new r(e11, 2006);
        } catch (RuntimeException e12) {
            throw new r(e12, 2000);
        }
    }
}
