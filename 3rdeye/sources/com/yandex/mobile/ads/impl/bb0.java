package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.ov;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public final class bb0 extends dk {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f25175e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f25176f;

    /* renamed from: g, reason: collision with root package name */
    private long f25177g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25178h;

    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean a(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static final class b implements ov.a {
        @Override // com.yandex.mobile.ads.impl.ov.a
        public final ov a() {
            return new bb0();
        }
    }

    public static class c extends pv {
        public c(int i, String str, FileNotFoundException fileNotFoundException) {
            super(i, str, fileNotFoundException);
        }

        public c(Exception exc, int i) {
            super(exc, i);
        }
    }

    public bb0() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final long a(sv svVar) throws IOException {
        Uri uri = svVar.f33250a;
        this.f25176f = uri;
        b(svVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, Constants.REVENUE_AMOUNT_KEY);
            this.f25175e = randomAccessFile;
            try {
                randomAccessFile.seek(svVar.f33255f);
                long length = svVar.f33256g;
                if (length == -1) {
                    length = this.f25175e.length() - svVar.f33255f;
                }
                this.f25177g = length;
                if (length < 0) {
                    throw new c(2008, null, null);
                }
                this.f25178h = true;
                c(svVar);
                return this.f25177g;
            } catch (IOException e4) {
                throw new c(e4, 2000);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new c(e10, (s82.f32899a < 21 || !a.a(e10.getCause())) ? 2005 : 2006);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbD = j6.l.d("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbD.append(fragment);
            throw new c(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, sbD.toString(), e10);
        } catch (SecurityException e11) {
            throw new c(e11, 2006);
        } catch (RuntimeException e12) {
            throw new c(e12, 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() throws c {
        this.f25176f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f25175e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e4) {
                throw new c(e4, 2000);
            }
        } finally {
            this.f25175e = null;
            if (this.f25178h) {
                this.f25178h = false;
                e();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        return this.f25176f;
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j4 = this.f25177g;
        if (j4 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f25175e;
            int i11 = s82.f32899a;
            int i12 = randomAccessFile.read(bArr, i, (int) Math.min(j4, i10));
            if (i12 > 0) {
                this.f25177g -= i12;
                c(i12);
            }
            return i12;
        } catch (IOException e4) {
            throw new c(e4, 2000);
        }
    }
}
