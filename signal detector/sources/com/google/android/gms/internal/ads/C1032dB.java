package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.dB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1032dB extends AbstractC2003vB {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f13737e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f13738f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f13739g;

    /* renamed from: h, reason: collision with root package name */
    public long f13740h;
    public boolean i;

    public C1032dB(Context context) {
        super(false);
        this.f13737e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final long a(TE te) throws IOException {
        try {
            Uri uri = te.f11361a;
            this.f13738f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            b(te);
            InputStream inputStreamOpen = this.f13737e.open(path, 1);
            this.f13739g = inputStreamOpen;
            long j6 = te.f11363c;
            if (inputStreamOpen.skip(j6) < j6) {
                throw new PA(null, 2008);
            }
            long j7 = te.f11364d;
            if (j7 != -1) {
                this.f13740h = j7;
            } else {
                long jAvailable = this.f13739g.available();
                this.f13740h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f13740h = -1L;
                }
            }
            this.i = true;
            e(te);
            return this.f13740h;
        } catch (PA e6) {
            throw e6;
        } catch (IOException e7) {
            throw new PA(e7, true != (e7 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        long j6 = this.f13740h;
        if (j6 != 0) {
            if (j6 != -1) {
                try {
                    i3 = (int) Math.min(j6, i3);
                } catch (IOException e6) {
                    throw new PA(e6, 2000);
                }
            }
            InputStream inputStream = this.f13739g;
            String str = Vt.f12096a;
            int i6 = inputStream.read(bArr, i, i3);
            if (i6 != -1) {
                long j7 = this.f13740h;
                if (j7 != -1) {
                    this.f13740h = j7 - i6;
                }
                g(i6);
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        return this.f13738f;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() {
        this.f13738f = null;
        try {
            try {
                InputStream inputStream = this.f13739g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f13739g = null;
                if (this.i) {
                    this.i = false;
                    j();
                }
            } catch (IOException e6) {
                throw new PA(e6, 2000);
            }
        } catch (Throwable th) {
            this.f13739g = null;
            if (this.i) {
                this.i = false;
                j();
            }
            throw th;
        }
    }
}
