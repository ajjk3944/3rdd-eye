package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class MC extends AbstractC2003vB {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9816e;

    /* renamed from: f, reason: collision with root package name */
    public AssetFileDescriptor f9817f;

    /* renamed from: g, reason: collision with root package name */
    public FileInputStream f9818g;

    /* renamed from: h, reason: collision with root package name */
    public long f9819h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f9820j;

    /* renamed from: k, reason: collision with root package name */
    public Object f9821k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MC(Context context, int i) {
        super(false);
        this.f9816e = i;
        switch (i) {
            case 1:
                super(false);
                this.f9820j = context.getApplicationContext();
                break;
            default:
                this.f9820j = context.getContentResolver();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final long a(TE te) throws Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException, IOException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        Resources resourcesForApplication;
        int identifier;
        long size;
        switch (this.f9816e) {
            case 0:
                ContentResolver contentResolver = (ContentResolver) this.f9820j;
                try {
                    try {
                        Uri uri = te.f11361a;
                        long j6 = te.f11363c;
                        Uri uriNormalizeScheme = uri.normalizeScheme();
                        this.f9821k = uriNormalizeScheme;
                        b(te);
                        if (Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                        } else {
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                        }
                        this.f9817f = assetFileDescriptorOpenAssetFileDescriptor;
                        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                            String strValueOf = String.valueOf(uriNormalizeScheme);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
                            sb.append("Could not open file descriptor for: ");
                            sb.append(strValueOf);
                            i = 2000;
                            try {
                                throw new C2220zC(new IOException(sb.toString()), 2000);
                            } catch (IOException e6) {
                                e = e6;
                                throw new C2220zC(e, true != (e instanceof FileNotFoundException) ? i : 2005);
                            }
                        }
                        long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                        FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                        this.f9818g = fileInputStream;
                        if (length != -1 && j6 > length) {
                            throw new C2220zC(null, 2008);
                        }
                        long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                        long jSkip = fileInputStream.skip(startOffset + j6) - startOffset;
                        if (jSkip != j6) {
                            throw new C2220zC(null, 2008);
                        }
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size2 = channel.size();
                            if (size2 == 0) {
                                this.f9819h = -1L;
                                jPosition = -1;
                            } else {
                                jPosition = size2 - channel.position();
                                this.f9819h = jPosition;
                                if (jPosition < 0) {
                                    throw new C2220zC(null, 2008);
                                }
                            }
                        } else {
                            jPosition = length - jSkip;
                            this.f9819h = jPosition;
                            if (jPosition < 0) {
                                throw new C2220zC(null, 2008);
                            }
                        }
                        long j7 = te.f11364d;
                        if (j7 != -1) {
                            this.f9819h = jPosition == -1 ? j7 : Math.min(jPosition, j7);
                        }
                        this.i = true;
                        e(te);
                        return j7 != -1 ? j7 : this.f9819h;
                    } catch (IOException e7) {
                        e = e7;
                        i = 2000;
                    }
                } catch (C2220zC e8) {
                    throw e8;
                }
                break;
            default:
                this.f9821k = te;
                b(te);
                Context context = (Context) this.f9820j;
                Uri uri2 = te.f11361a;
                long j8 = te.f11363c;
                Uri uriNormalizeScheme2 = uri2.normalizeScheme();
                if (TextUtils.equals("rawresource", uriNormalizeScheme2.getScheme())) {
                    resourcesForApplication = context.getResources();
                    List<String> pathSegments = uriNormalizeScheme2.getPathSegments();
                    if (pathSegments.size() != 1) {
                        int size3 = pathSegments.size();
                        throw new OJ(A.f.i(size3, "rawresource:// URI must have exactly one path element, found ", new StringBuilder(String.valueOf(size3).length() + 61)), null, 2000);
                    }
                    try {
                        identifier = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                        throw new OJ("Resource identifier must be an integer.", null, 1004);
                    }
                } else {
                    if (!TextUtils.equals("android.resource", uriNormalizeScheme2.getScheme())) {
                        String scheme = uriNormalizeScheme2.getScheme();
                        throw new OJ(AbstractC1135f5.n(new StringBuilder(String.valueOf(scheme).length() + 62), "Unsupported URI scheme (", scheme, "). Only android.resource is supported."), null, 1004);
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
                        } catch (PackageManager.NameNotFoundException e9) {
                            throw new OJ("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e9, 2005);
                        }
                    }
                    if (path.matches("\\d+")) {
                        try {
                            identifier = Integer.parseInt(path);
                        } catch (NumberFormatException unused2) {
                            throw new OJ("Resource identifier must be an integer.", null, 1004);
                        }
                    } else {
                        identifier = resourcesForApplication.getIdentifier(AbstractC1135f5.n(new StringBuilder(packageName.length() + 1 + path.length()), packageName, ":", path), "raw", null);
                        if (identifier == 0) {
                            throw new OJ("Resource not found.", null, 2005);
                        }
                    }
                }
                try {
                    AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
                    if (assetFileDescriptorOpenRawResourceFd == null) {
                        throw new OJ("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme2)), null, 2000);
                    }
                    this.f9817f = assetFileDescriptorOpenRawResourceFd;
                    long length2 = assetFileDescriptorOpenRawResourceFd.getLength();
                    FileInputStream fileInputStream2 = new FileInputStream(this.f9817f.getFileDescriptor());
                    this.f9818g = fileInputStream2;
                    try {
                        if (length2 != -1 && j8 > length2) {
                            throw new OJ(null, null, 2008);
                        }
                        long startOffset2 = this.f9817f.getStartOffset();
                        long jSkip2 = fileInputStream2.skip(startOffset2 + j8) - startOffset2;
                        if (jSkip2 != j8) {
                            throw new OJ(null, null, 2008);
                        }
                        if (length2 == -1) {
                            FileChannel channel2 = fileInputStream2.getChannel();
                            if (channel2.size() == 0) {
                                this.f9819h = -1L;
                                size = -1;
                            } else {
                                size = channel2.size() - channel2.position();
                                this.f9819h = size;
                                if (size < 0) {
                                    throw new OJ(null, null, 2008);
                                }
                            }
                        } else {
                            size = length2 - jSkip2;
                            this.f9819h = size;
                            if (size < 0) {
                                throw new C1359jE();
                            }
                        }
                        long j9 = te.f11364d;
                        if (j9 != -1) {
                            this.f9819h = size == -1 ? j9 : Math.min(size, j9);
                        }
                        this.i = true;
                        e(te);
                        return j9 != -1 ? j9 : this.f9819h;
                    } catch (OJ e10) {
                        throw e10;
                    } catch (IOException e11) {
                        throw new OJ(null, e11, 2000);
                    }
                } catch (Resources.NotFoundException e12) {
                    throw new OJ(null, e12, 2005);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) throws IOException {
        switch (this.f9816e) {
            case 0:
                if (i3 == 0) {
                    return 0;
                }
                long j6 = this.f9819h;
                if (j6 != 0) {
                    if (j6 != -1) {
                        try {
                            i3 = (int) Math.min(j6, i3);
                        } catch (IOException e6) {
                            throw new C2220zC(e6, 2000);
                        }
                    }
                    FileInputStream fileInputStream = this.f9818g;
                    String str = Vt.f12096a;
                    int i6 = fileInputStream.read(bArr, i, i3);
                    if (i6 != -1) {
                        long j7 = this.f9819h;
                        if (j7 != -1) {
                            this.f9819h = j7 - i6;
                        }
                        g(i6);
                        return i6;
                    }
                }
                return -1;
            default:
                if (i3 == 0) {
                    return 0;
                }
                long j8 = this.f9819h;
                if (j8 != 0) {
                    if (j8 != -1) {
                        try {
                            i3 = (int) Math.min(j8, i3);
                        } catch (IOException e7) {
                            throw new OJ(null, e7, 2000);
                        }
                    }
                    FileInputStream fileInputStream2 = this.f9818g;
                    String str2 = Vt.f12096a;
                    int i7 = fileInputStream2.read(bArr, i, i3);
                    if (i7 != -1) {
                        long j9 = this.f9819h;
                        if (j9 != -1) {
                            this.f9819h = j9 - i7;
                        }
                        g(i7);
                        return i7;
                    }
                    if (this.f9819h != -1) {
                        throw new OJ("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                    }
                }
                return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        switch (this.f9816e) {
            case 0:
                return (Uri) this.f9821k;
            default:
                TE te = (TE) this.f9821k;
                if (te != null) {
                    return te.f11361a;
                }
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() {
        switch (this.f9816e) {
            case 0:
                this.f9821k = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream = this.f9818g;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            this.f9818g = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor = this.f9817f;
                                if (assetFileDescriptor != null) {
                                    assetFileDescriptor.close();
                                }
                                this.f9817f = null;
                                if (this.i) {
                                    this.i = false;
                                    j();
                                    return;
                                }
                                return;
                            } catch (IOException e6) {
                                throw new C2220zC(e6, 2000);
                            }
                        } catch (Throwable th) {
                            this.f9818g = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor2 = this.f9817f;
                                if (assetFileDescriptor2 != null) {
                                    assetFileDescriptor2.close();
                                }
                                this.f9817f = null;
                                if (this.i) {
                                    this.i = false;
                                    j();
                                }
                                throw th;
                            } catch (IOException e7) {
                                throw new C2220zC(e7, 2000);
                            }
                        }
                    } catch (Throwable th2) {
                        this.f9817f = null;
                        if (this.i) {
                            this.i = false;
                            j();
                        }
                        throw th2;
                    }
                } catch (IOException e8) {
                    throw new C2220zC(e8, 2000);
                }
            default:
                this.f9821k = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream2 = this.f9818g;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            this.f9818g = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor3 = this.f9817f;
                                if (assetFileDescriptor3 != null) {
                                    assetFileDescriptor3.close();
                                }
                                this.f9817f = null;
                                if (this.i) {
                                    this.i = false;
                                    j();
                                    return;
                                }
                                return;
                            } catch (IOException e9) {
                                throw new OJ(null, e9, 2000);
                            }
                        } catch (IOException e10) {
                            throw new OJ(null, e10, 2000);
                        }
                    } catch (Throwable th3) {
                        this.f9817f = null;
                        if (this.i) {
                            this.i = false;
                            j();
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    this.f9818g = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor4 = this.f9817f;
                        if (assetFileDescriptor4 != null) {
                            assetFileDescriptor4.close();
                        }
                        this.f9817f = null;
                        if (this.i) {
                            this.i = false;
                            j();
                        }
                        throw th4;
                    } catch (IOException e11) {
                        throw new OJ(null, e11, 2000);
                    }
                }
        }
    }
}
