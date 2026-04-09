package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.google.android.gms.internal.ads.aH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0874aH extends AbstractC2003vB {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f13090e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f13091f;

    /* renamed from: g, reason: collision with root package name */
    public long f13092g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13093h;

    @Override // com.google.android.gms.internal.ads.XD
    public final long a(TE te) throws IOException {
        Uri uri = te.f11361a;
        this.f13091f = uri;
        b(te);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f13090e = randomAccessFile;
            try {
                long j6 = te.f11363c;
                randomAccessFile.seek(j6);
                long length = te.f11364d;
                if (length == -1) {
                    length = this.f13090e.length() - j6;
                }
                this.f13092g = length;
                if (length < 0) {
                    throw new OG(null, null, 2008);
                }
                this.f13093h = true;
                e(te);
                return this.f13092g;
            } catch (IOException e6) {
                throw new OG(e6, 2000);
            }
        } catch (FileNotFoundException e7) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new OG(e7, ((e7.getCause() instanceof ErrnoException) && ((ErrnoException) e7.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new OG("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e7, 1004);
        } catch (SecurityException e8) {
            throw new OG(e8, 2006);
        } catch (RuntimeException e9) {
            throw new OG(e9, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        long j6 = this.f13092g;
        if (j6 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f13090e;
            String str = Vt.f12096a;
            int i6 = randomAccessFile.read(bArr, i, (int) Math.min(j6, i3));
            if (i6 > 0) {
                this.f13092g -= i6;
                g(i6);
            }
            return i6;
        } catch (IOException e6) {
            throw new OG(e6, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        return this.f13091f;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() {
        this.f13091f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f13090e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f13090e = null;
                if (this.f13093h) {
                    this.f13093h = false;
                    j();
                }
            } catch (IOException e6) {
                throw new OG(e6, 2000);
            }
        } catch (Throwable th) {
            this.f13090e = null;
            if (this.f13093h) {
                this.f13093h = false;
                j();
            }
            throw th;
        }
    }
}
