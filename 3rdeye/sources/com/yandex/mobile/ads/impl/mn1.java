package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class mn1 extends dk {

    /* renamed from: e, reason: collision with root package name */
    private final Resources f30460e;

    /* renamed from: f, reason: collision with root package name */
    private final String f30461f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f30462g;

    /* renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f30463h;
    private FileInputStream i;

    /* renamed from: j, reason: collision with root package name */
    private long f30464j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f30465k;

    public static class a extends pv {
        public a(int i, String str, Exception exc) {
            super(i, str, exc);
        }
    }

    public mn1(Context context) {
        super(false);
        this.f30460e = context.getResources();
        this.f30461f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.ov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.yandex.mobile.ads.impl.sv r17) throws android.content.res.Resources.NotFoundException, com.yandex.mobile.ads.impl.pv, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.mn1.a(com.yandex.mobile.ads.impl.sv):long");
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() throws a {
        this.f30462g = null;
        try {
            try {
                FileInputStream fileInputStream = this.i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f30463h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new a(2000, null, e4);
                    }
                } finally {
                    this.f30463h = null;
                    if (this.f30465k) {
                        this.f30465k = false;
                        e();
                    }
                }
            } catch (Throwable th) {
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f30463h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f30463h = null;
                        if (this.f30465k) {
                            this.f30465k = false;
                            e();
                        }
                        throw th;
                    } finally {
                        this.f30463h = null;
                        if (this.f30465k) {
                            this.f30465k = false;
                            e();
                        }
                    }
                } catch (IOException e10) {
                    throw new a(2000, null, e10);
                }
            }
        } catch (IOException e11) {
            throw new a(2000, null, e11);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        return this.f30462g;
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j4 = this.f30464j;
        if (j4 == 0) {
            return -1;
        }
        if (j4 != -1) {
            try {
                i10 = (int) Math.min(j4, i10);
            } catch (IOException e4) {
                throw new a(2000, null, e4);
            }
        }
        FileInputStream fileInputStream = this.i;
        int i11 = s82.f32899a;
        int i12 = fileInputStream.read(bArr, i, i10);
        if (i12 == -1) {
            if (this.f30464j == -1) {
                return -1;
            }
            throw new a(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j10 = this.f30464j;
        if (j10 != -1) {
            this.f30464j = j10 - i12;
        }
        c(i12);
        return i12;
    }
}
