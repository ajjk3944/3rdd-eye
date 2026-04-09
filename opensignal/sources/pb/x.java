package pb;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class x extends h {
    public long B;
    public boolean D;

    /* renamed from: x, reason: collision with root package name */
    public RandomAccessFile f20437x;

    /* renamed from: y, reason: collision with root package name */
    public Uri f20438y;

    @Override // pb.n
    public final void close() {
        this.f20438y = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f20437x;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e4) {
                throw new v(e4, 2000);
            }
        } finally {
            this.f20437x = null;
            if (this.D) {
                this.D = false;
                e();
            }
        }
    }

    @Override // pb.n
    public final Uri o() {
        return this.f20438y;
    }

    @Override // pb.n
    public final long q(na.c cVar) throws IOException {
        Uri uri = (Uri) cVar.f17422f;
        long j = cVar.f17419c;
        this.f20438y = uri;
        f(cVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f20437x = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = cVar.f17420d;
                if (length == -1) {
                    length = this.f20437x.length() - j;
                }
                this.B = length;
                if (length < 0) {
                    throw new v(null, null, 2008);
                }
                this.D = true;
                h(cVar);
                return this.B;
            } catch (IOException e4) {
                throw new v(e4, 2000);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new v(e10, (qb.v.f20828a < 21 || !w.b(e10.getCause())) ? 2005 : 2006);
            }
            throw new v("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e10, 1004);
        } catch (SecurityException e11) {
            throw new v(e11, 2006);
        } catch (RuntimeException e12) {
            throw new v(e12, 2000);
        }
    }

    @Override // pb.k
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j = this.B;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f20437x;
            int i12 = qb.v.f20828a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j, i11));
            if (i13 > 0) {
                this.B -= i13;
                a(i13);
            }
            return i13;
        } catch (IOException e4) {
            throw new v(e4, 2000);
        }
    }
}
