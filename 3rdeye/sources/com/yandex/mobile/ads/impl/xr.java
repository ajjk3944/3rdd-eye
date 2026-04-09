package com.yandex.mobile.ads.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventTypes;
import com.singular.sdk.internal.Constants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class xr extends dk {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f35391e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f35392f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f35393g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f35394h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f35395j;

    public static class a extends pv {
        public a(IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public xr(Context context) {
        super(false);
        this.f35391e = context.getContentResolver();
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final long a(sv svVar) throws IOException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = svVar.f33250a;
                this.f35392f = uri;
                b(svVar);
                if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(svVar.f33250a.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f35391e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f35391e.openAssetFileDescriptor(uri, Constants.REVENUE_AMOUNT_KEY);
                }
                this.f35393g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
                    } catch (IOException e4) {
                        e = e4;
                        throw new a(e, e instanceof FileNotFoundException ? 2005 : i);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f35394h = fileInputStream;
                if (length != -1 && svVar.f33255f > length) {
                    throw new a(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(svVar.f33255f + startOffset) - startOffset;
                if (jSkip != svVar.f33255f) {
                    throw new a(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.i = jPosition;
                        if (jPosition < 0) {
                            throw new a(null, 2008);
                        }
                    }
                } else {
                    long j4 = length - jSkip;
                    this.i = j4;
                    if (j4 < 0) {
                        throw new a(null, 2008);
                    }
                }
                long jMin = svVar.f33256g;
                if (jMin != -1) {
                    long j10 = this.i;
                    if (j10 != -1) {
                        jMin = Math.min(j10, jMin);
                    }
                    this.i = jMin;
                }
                this.f35395j = true;
                c(svVar);
                long j11 = svVar.f33256g;
                return j11 != -1 ? j11 : this.i;
            } catch (IOException e10) {
                e = e10;
                i = 2000;
            }
        } catch (a e11) {
            throw e11;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() throws a {
        this.f35392f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f35394h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f35394h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f35393g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new a(e4, 2000);
                    }
                } finally {
                    this.f35393g = null;
                    if (this.f35395j) {
                        this.f35395j = false;
                        e();
                    }
                }
            } catch (Throwable th) {
                this.f35394h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f35393g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f35393g = null;
                        if (this.f35395j) {
                            this.f35395j = false;
                            e();
                        }
                        throw th;
                    } finally {
                        this.f35393g = null;
                        if (this.f35395j) {
                            this.f35395j = false;
                            e();
                        }
                    }
                } catch (IOException e10) {
                    throw new a(e10, 2000);
                }
            }
        } catch (IOException e11) {
            throw new a(e11, 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        return this.f35392f;
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j4 = this.i;
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
        FileInputStream fileInputStream = this.f35394h;
        int i11 = s82.f32899a;
        int i12 = fileInputStream.read(bArr, i, i10);
        if (i12 == -1) {
            return -1;
        }
        long j10 = this.i;
        if (j10 != -1) {
            this.i = j10 - i12;
        }
        c(i12);
        return i12;
    }
}
