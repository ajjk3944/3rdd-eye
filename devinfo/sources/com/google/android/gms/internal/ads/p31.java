package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p31 extends h41 {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f14888e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f14889f;
    public InputStream g;

    /* renamed from: h, reason: collision with root package name */
    public long f14890h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14891i;

    public p31(Context context) {
        super(false);
        this.f14888e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final long a(gb1 gb1Var) throws IOException {
        try {
            Uri uri = gb1Var.f11479a;
            this.f14889f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            c(gb1Var);
            InputStream inputStreamOpen = this.f14888e.open(path, 1);
            this.g = inputStreamOpen;
            long j = gb1Var.f11481c;
            if (inputStreamOpen.skip(j) < j) {
                throw new b31(AdError.REMOTE_ADS_SERVICE_ERROR, null);
            }
            long j8 = gb1Var.f11482d;
            if (j8 != -1) {
                this.f14890h = j8;
            } else {
                long jAvailable = this.g.available();
                this.f14890h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f14890h = -1L;
                }
            }
            this.f14891i = true;
            e(gb1Var);
            return this.f14890h;
        } catch (b31 e2) {
            throw e2;
        } catch (IOException e10) {
            throw new b31(true != (e10 instanceof FileNotFoundException) ? AdError.SERVER_ERROR_CODE : 2005, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j = this.f14890h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i10 = (int) Math.min(j, i10);
                } catch (IOException e2) {
                    throw new b31(AdError.SERVER_ERROR_CODE, e2);
                }
            }
            InputStream inputStream = this.g;
            String str = bq0.f9768a;
            int i11 = inputStream.read(bArr, i4, i10);
            if (i11 != -1) {
                long j8 = this.f14890h;
                if (j8 != -1) {
                    this.f14890h = j8 - i11;
                }
                g(i11);
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() {
        this.f14889f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.f14891i) {
                    this.f14891i = false;
                    h();
                }
            } catch (IOException e2) {
                throw new b31(AdError.SERVER_ERROR_CODE, e2);
            }
        } catch (Throwable th2) {
            this.g = null;
            if (this.f14891i) {
                this.f14891i = false;
                h();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        return this.f14889f;
    }
}
