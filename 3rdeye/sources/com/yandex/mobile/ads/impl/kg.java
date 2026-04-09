package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class kg extends dk {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f29655e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f29656f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f29657g;

    /* renamed from: h, reason: collision with root package name */
    private long f29658h;
    private boolean i;

    public static final class a extends pv {
        public a(IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public kg(Context context) {
        super(false);
        this.f29655e = context.getAssets();
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final long a(sv svVar) throws IOException {
        try {
            Uri uri = svVar.f33250a;
            this.f29656f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            b(svVar);
            InputStream inputStreamOpen = this.f29655e.open(path, 1);
            this.f29657g = inputStreamOpen;
            if (inputStreamOpen.skip(svVar.f33255f) < svVar.f33255f) {
                throw new a(null, 2008);
            }
            long j4 = svVar.f33256g;
            if (j4 != -1) {
                this.f29658h = j4;
            } else {
                long jAvailable = this.f29657g.available();
                this.f29658h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f29658h = -1L;
                }
            }
            this.i = true;
            c(svVar);
            return this.f29658h;
        } catch (a e4) {
            throw e4;
        } catch (IOException e10) {
            throw new a(e10, e10 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() throws a {
        this.f29656f = null;
        try {
            try {
                InputStream inputStream = this.f29657g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e4) {
                throw new a(e4, 2000);
            }
        } finally {
            this.f29657g = null;
            if (this.i) {
                this.i = false;
                e();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        return this.f29656f;
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j4 = this.f29658h;
        if (j4 == 0) {
            return -1;
        }
        if (j4 != -1) {
            try {
                i10 = (int) Math.min(j4, i10);
            } catch (IOException e4) {
                throw new a(e4, 2000);
            }
        }
        InputStream inputStream = this.f29657g;
        int i11 = s82.f32899a;
        int i12 = inputStream.read(bArr, i, i10);
        if (i12 == -1) {
            return -1;
        }
        long j10 = this.f29658h;
        if (j10 != -1) {
            this.f29658h = j10 - i12;
        }
        c(i12);
        return i12;
    }
}
