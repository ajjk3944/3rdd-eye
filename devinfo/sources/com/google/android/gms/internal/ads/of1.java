package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class of1 extends h41 {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f14696e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f14697f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14698h;

    @Override // com.google.android.gms.internal.ads.l91
    public final long a(gb1 gb1Var) throws IOException {
        Uri uri = gb1Var.f11479a;
        this.f14697f = uri;
        c(gb1Var);
        int i4 = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f14696e = randomAccessFile;
            try {
                long j = gb1Var.f11481c;
                randomAccessFile.seek(j);
                long length = gb1Var.f11482d;
                if (length == -1) {
                    length = this.f14696e.length() - j;
                }
                this.g = length;
                if (length < 0) {
                    throw new bf1(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                this.f14698h = true;
                e(gb1Var);
                return this.g;
            } catch (IOException e2) {
                throw new bf1(AdError.SERVER_ERROR_CODE, e2);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (!(e10.getCause() instanceof ErrnoException) || ((ErrnoException) e10.getCause()).errno != OsConstants.EACCES) {
                    i4 = 2005;
                }
                throw new bf1(i4, e10);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbO = r5.c.o("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbO.append(fragment);
            throw new bf1(sbO.toString(), e10, TTAdConstant.IMAGE_MODE_CAROUSEL_IMG);
        } catch (SecurityException e11) {
            throw new bf1(AdError.INTERNAL_ERROR_2006, e11);
        } catch (RuntimeException e12) {
            throw new bf1(AdError.SERVER_ERROR_CODE, e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f14696e;
            String str = bq0.f9768a;
            int i11 = randomAccessFile.read(bArr, i4, (int) Math.min(j, i10));
            if (i11 > 0) {
                this.g -= i11;
                g(i11);
            }
            return i11;
        } catch (IOException e2) {
            throw new bf1(AdError.SERVER_ERROR_CODE, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() {
        this.f14697f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14696e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f14696e = null;
                if (this.f14698h) {
                    this.f14698h = false;
                    h();
                }
            } catch (IOException e2) {
                throw new bf1(AdError.SERVER_ERROR_CODE, e2);
            }
        } catch (Throwable th2) {
            this.f14696e = null;
            if (this.f14698h) {
                this.f14698h = false;
                h();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        return this.f14697f;
    }
}
