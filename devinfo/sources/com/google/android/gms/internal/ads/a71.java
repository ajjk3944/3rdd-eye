package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import j$.util.Objects;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a71 extends h41 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9237e;

    /* renamed from: f, reason: collision with root package name */
    public AssetFileDescriptor f9238f;
    public FileInputStream g;

    /* renamed from: h, reason: collision with root package name */
    public long f9239h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9240i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public Object f9241k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a71(Context context, int i4) {
        super(false);
        this.f9237e = i4;
        switch (i4) {
            case 1:
                super(false);
                this.j = context.getApplicationContext();
                break;
            default:
                this.j = context.getContentResolver();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final long a(gb1 gb1Var) throws Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException, IOException {
        int i4;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        Resources resourcesForApplication;
        int identifier;
        long size;
        switch (this.f9237e) {
            case 0:
                ContentResolver contentResolver = (ContentResolver) this.j;
                try {
                    try {
                        Uri uri = gb1Var.f11479a;
                        long j = gb1Var.f11481c;
                        Uri uriNormalizeScheme = uri.normalizeScheme();
                        this.f9241k = uriNormalizeScheme;
                        c(gb1Var);
                        if (Objects.equals(uriNormalizeScheme.getScheme(), AppLovinEventTypes.USER_VIEWED_CONTENT)) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                        } else {
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                        }
                        this.f9238f = assetFileDescriptorOpenAssetFileDescriptor;
                        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                            String strValueOf = String.valueOf(uriNormalizeScheme);
                            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36);
                            sb2.append("Could not open file descriptor for: ");
                            sb2.append(strValueOf);
                            IOException iOException = new IOException(sb2.toString());
                            i4 = AdError.SERVER_ERROR_CODE;
                            try {
                                throw new n61(AdError.SERVER_ERROR_CODE, iOException);
                            } catch (IOException e2) {
                                e = e2;
                                throw new n61(true != (e instanceof FileNotFoundException) ? i4 : 2005, e);
                            }
                        }
                        long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                        FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                        this.g = fileInputStream;
                        if (length != -1 && j > length) {
                            throw new n61(AdError.REMOTE_ADS_SERVICE_ERROR, null);
                        }
                        long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                        long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                        if (jSkip != j) {
                            throw new n61(AdError.REMOTE_ADS_SERVICE_ERROR, null);
                        }
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size2 = channel.size();
                            if (size2 == 0) {
                                this.f9239h = -1L;
                                jPosition = -1;
                            } else {
                                jPosition = size2 - channel.position();
                                this.f9239h = jPosition;
                                if (jPosition < 0) {
                                    throw new n61(AdError.REMOTE_ADS_SERVICE_ERROR, null);
                                }
                            }
                        } else {
                            jPosition = length - jSkip;
                            this.f9239h = jPosition;
                            if (jPosition < 0) {
                                throw new n61(AdError.REMOTE_ADS_SERVICE_ERROR, null);
                            }
                        }
                        long j8 = gb1Var.f11482d;
                        if (j8 != -1) {
                            this.f9239h = jPosition == -1 ? j8 : Math.min(jPosition, j8);
                        }
                        this.f9240i = true;
                        e(gb1Var);
                        return j8 != -1 ? j8 : this.f9239h;
                    } catch (n61 e10) {
                        throw e10;
                    }
                } catch (IOException e11) {
                    e = e11;
                    i4 = AdError.SERVER_ERROR_CODE;
                }
                break;
            default:
                this.f9241k = gb1Var;
                c(gb1Var);
                Context context = (Context) this.j;
                Uri uri2 = gb1Var.f11479a;
                long j9 = gb1Var.f11481c;
                Uri uriNormalizeScheme2 = uri2.normalizeScheme();
                if (TextUtils.equals("rawresource", uriNormalizeScheme2.getScheme())) {
                    resourcesForApplication = context.getResources();
                    List<String> pathSegments = uriNormalizeScheme2.getPathSegments();
                    if (pathSegments.size() != 1) {
                        int size3 = pathSegments.size();
                        throw new bl1(d.h.q(size3, "rawresource:// URI must have exactly one path element, found ", new StringBuilder(String.valueOf(size3).length() + 61)), null, AdError.SERVER_ERROR_CODE);
                    }
                    try {
                        identifier = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                        throw new bl1("Resource identifier must be an integer.", null, TTAdConstant.IMAGE_MODE_CAROUSEL_IMG);
                    }
                } else {
                    if (!TextUtils.equals("android.resource", uriNormalizeScheme2.getScheme())) {
                        String scheme = uriNormalizeScheme2.getScheme();
                        throw new bl1(r5.c.m(new StringBuilder(String.valueOf(scheme).length() + 62), "Unsupported URI scheme (", scheme, "). Only android.resource is supported."), null, TTAdConstant.IMAGE_MODE_CAROUSEL_IMG);
                    }
                    String path = uriNormalizeScheme2.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String packageName = TextUtils.isEmpty(uriNormalizeScheme2.getHost()) ? context.getPackageName() : uriNormalizeScheme2.getHost();
                    if (packageName.equals(context.getPackageName())) {
                        resourcesForApplication = context.getResources();
                    } else {
                        try {
                            resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                        } catch (PackageManager.NameNotFoundException e12) {
                            throw new bl1("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e12, 2005);
                        }
                    }
                    if (path.matches("\\d+")) {
                        try {
                            identifier = Integer.parseInt(path);
                        } catch (NumberFormatException unused2) {
                            throw new bl1("Resource identifier must be an integer.", null, TTAdConstant.IMAGE_MODE_CAROUSEL_IMG);
                        }
                    } else {
                        identifier = resourcesForApplication.getIdentifier(r5.c.m(new StringBuilder(packageName.length() + 1 + path.length()), packageName, ":", path), "raw", null);
                        if (identifier == 0) {
                            throw new bl1("Resource not found.", null, 2005);
                        }
                    }
                }
                try {
                    AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
                    if (assetFileDescriptorOpenRawResourceFd == null) {
                        throw new bl1("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme2)), null, AdError.SERVER_ERROR_CODE);
                    }
                    this.f9238f = assetFileDescriptorOpenRawResourceFd;
                    long length2 = assetFileDescriptorOpenRawResourceFd.getLength();
                    FileInputStream fileInputStream2 = new FileInputStream(this.f9238f.getFileDescriptor());
                    this.g = fileInputStream2;
                    try {
                        if (length2 != -1 && j9 > length2) {
                            throw new bl1(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                        long startOffset2 = this.f9238f.getStartOffset();
                        long jSkip2 = fileInputStream2.skip(startOffset2 + j9) - startOffset2;
                        if (jSkip2 != j9) {
                            throw new bl1(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                        if (length2 == -1) {
                            FileChannel channel2 = fileInputStream2.getChannel();
                            if (channel2.size() == 0) {
                                this.f9239h = -1L;
                                size = -1;
                            } else {
                                size = channel2.size() - channel2.position();
                                this.f9239h = size;
                                if (size < 0) {
                                    throw new bl1(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                }
                            }
                        } else {
                            size = length2 - jSkip2;
                            this.f9239h = size;
                            if (size < 0) {
                                throw new x91();
                            }
                        }
                        long j10 = gb1Var.f11482d;
                        if (j10 != -1) {
                            this.f9239h = size == -1 ? j10 : Math.min(size, j10);
                        }
                        this.f9240i = true;
                        e(gb1Var);
                        return j10 != -1 ? j10 : this.f9239h;
                    } catch (bl1 e13) {
                        throw e13;
                    } catch (IOException e14) {
                        throw new bl1(null, e14, AdError.SERVER_ERROR_CODE);
                    }
                } catch (Resources.NotFoundException e15) {
                    throw new bl1(null, e15, 2005);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) throws IOException {
        switch (this.f9237e) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                long j = this.f9239h;
                if (j != 0) {
                    if (j != -1) {
                        try {
                            i10 = (int) Math.min(j, i10);
                        } catch (IOException e2) {
                            throw new n61(AdError.SERVER_ERROR_CODE, e2);
                        }
                    }
                    FileInputStream fileInputStream = this.g;
                    String str = bq0.f9768a;
                    int i11 = fileInputStream.read(bArr, i4, i10);
                    if (i11 != -1) {
                        long j8 = this.f9239h;
                        if (j8 != -1) {
                            this.f9239h = j8 - i11;
                        }
                        g(i11);
                        return i11;
                    }
                }
                return -1;
            default:
                if (i10 == 0) {
                    return 0;
                }
                long j9 = this.f9239h;
                if (j9 != 0) {
                    if (j9 != -1) {
                        try {
                            i10 = (int) Math.min(j9, i10);
                        } catch (IOException e10) {
                            throw new bl1(null, e10, AdError.SERVER_ERROR_CODE);
                        }
                    }
                    FileInputStream fileInputStream2 = this.g;
                    String str2 = bq0.f9768a;
                    int i12 = fileInputStream2.read(bArr, i4, i10);
                    if (i12 != -1) {
                        long j10 = this.f9239h;
                        if (j10 != -1) {
                            this.f9239h = j10 - i12;
                        }
                        g(i12);
                        return i12;
                    }
                    if (this.f9239h != -1) {
                        throw new bl1("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
                    }
                }
                return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() {
        switch (this.f9237e) {
            case 0:
                this.f9241k = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream = this.g;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            this.g = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor = this.f9238f;
                                if (assetFileDescriptor != null) {
                                    assetFileDescriptor.close();
                                }
                                this.f9238f = null;
                                if (this.f9240i) {
                                    this.f9240i = false;
                                    h();
                                    return;
                                }
                                return;
                            } catch (IOException e2) {
                                throw new n61(AdError.SERVER_ERROR_CODE, e2);
                            }
                        } catch (Throwable th2) {
                            this.g = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor2 = this.f9238f;
                                if (assetFileDescriptor2 != null) {
                                    assetFileDescriptor2.close();
                                }
                                this.f9238f = null;
                                if (this.f9240i) {
                                    this.f9240i = false;
                                    h();
                                }
                                throw th2;
                            } catch (IOException e10) {
                                throw new n61(AdError.SERVER_ERROR_CODE, e10);
                            }
                        }
                    } catch (Throwable th3) {
                        this.f9238f = null;
                        if (this.f9240i) {
                            this.f9240i = false;
                            h();
                        }
                        throw th3;
                    }
                } catch (IOException e11) {
                    throw new n61(AdError.SERVER_ERROR_CODE, e11);
                }
            default:
                this.f9241k = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream2 = this.g;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            this.g = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor3 = this.f9238f;
                                if (assetFileDescriptor3 != null) {
                                    assetFileDescriptor3.close();
                                }
                                this.f9238f = null;
                                if (this.f9240i) {
                                    this.f9240i = false;
                                    h();
                                    return;
                                }
                                return;
                            } catch (IOException e12) {
                                throw new bl1(null, e12, AdError.SERVER_ERROR_CODE);
                            }
                        } catch (IOException e13) {
                            throw new bl1(null, e13, AdError.SERVER_ERROR_CODE);
                        }
                    } catch (Throwable th4) {
                        this.f9238f = null;
                        if (this.f9240i) {
                            this.f9240i = false;
                            h();
                        }
                        throw th4;
                    }
                } catch (Throwable th5) {
                    this.g = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor4 = this.f9238f;
                        if (assetFileDescriptor4 != null) {
                            assetFileDescriptor4.close();
                        }
                        this.f9238f = null;
                        if (this.f9240i) {
                            this.f9240i = false;
                            h();
                        }
                        throw th5;
                    } catch (IOException e14) {
                        throw new bl1(null, e14, AdError.SERVER_ERROR_CODE);
                    }
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        switch (this.f9237e) {
            case 0:
                return (Uri) this.f9241k;
            default:
                gb1 gb1Var = (gb1) this.f9241k;
                if (gb1Var != null) {
                    return gb1Var.f11479a;
                }
                return null;
        }
    }
}
