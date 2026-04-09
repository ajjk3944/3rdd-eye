package b5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class e extends c {
    public AssetFileDescriptor B;
    public FileInputStream D;
    public long E;
    public boolean F;

    /* renamed from: x, reason: collision with root package name */
    public final ContentResolver f2430x;

    /* renamed from: y, reason: collision with root package name */
    public Uri f2431y;

    public e(Context context) {
        super(false);
        this.f2430x = context.getContentResolver();
    }

    @Override // b5.h
    public final void close() {
        this.f2431y = null;
        try {
            try {
                FileInputStream fileInputStream = this.D;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.D = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.B;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new d(e4, 2000);
                    }
                } finally {
                    this.B = null;
                    if (this.F) {
                        this.F = false;
                        e();
                    }
                }
            } catch (Throwable th2) {
                this.D = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.B;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.B = null;
                        if (this.F) {
                            this.F = false;
                            e();
                        }
                        throw th2;
                    } finally {
                        this.B = null;
                        if (this.F) {
                            this.F = false;
                            e();
                        }
                    }
                } catch (IOException e10) {
                    throw new d(e10, 2000);
                }
            }
        } catch (IOException e11) {
            throw new d(e11, 2000);
        }
    }

    @Override // b5.h
    public final Uri o() {
        return this.f2431y;
    }

    @Override // androidx.media3.common.l
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j = this.E;
        if (j != 0) {
            if (j != -1) {
                try {
                    i11 = (int) Math.min(j, i11);
                } catch (IOException e4) {
                    throw new d(e4, 2000);
                }
            }
            FileInputStream fileInputStream = this.D;
            int i12 = a5.d0.f105a;
            int i13 = fileInputStream.read(bArr, i10, i11);
            if (i13 != -1) {
                long j7 = this.E;
                if (j7 != -1) {
                    this.E = j7 - i13;
                }
                a(i13);
                return i13;
            }
        }
        return -1;
    }

    @Override // b5.h
    public final long t(k kVar) throws IOException {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = kVar.f2443a;
                long j = kVar.f2448f;
                long j7 = kVar.f2447e;
                this.f2431y = uri;
                f(kVar);
                boolean zEquals = "content".equals(kVar.f2443a.getScheme());
                ContentResolver contentResolver = this.f2430x;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                }
                this.B = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i10 = 2000;
                    try {
                        throw new d(new IOException("Could not open file descriptor for: " + uri), 2000);
                    } catch (IOException e4) {
                        e = e4;
                        if (e instanceof FileNotFoundException) {
                            i10 = 2005;
                        }
                        throw new d(e, i10);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileDescriptor fileDescriptor = assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor();
                FileInputStream fileInputStreamK = xu.d.k(new FileInputStream(fileDescriptor), fileDescriptor);
                this.D = fileInputStreamK;
                if (length != -1 && j7 > length) {
                    throw new d(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStreamK.skip(startOffset + j7) - startOffset;
                if (jSkip != j7) {
                    throw new d(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStreamK.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.E = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.E = jPosition;
                        if (jPosition < 0) {
                            throw new d(null, 2008);
                        }
                    }
                } else {
                    long j10 = length - jSkip;
                    this.E = j10;
                    if (j10 < 0) {
                        throw new d(null, 2008);
                    }
                }
                if (j != -1) {
                    long j11 = this.E;
                    this.E = j11 == -1 ? j : Math.min(j11, j);
                }
                this.F = true;
                h(kVar);
                return j != -1 ? j : this.E;
            } catch (d e10) {
                throw e10;
            }
        } catch (IOException e11) {
            e = e11;
            i10 = 2000;
        }
    }
}
