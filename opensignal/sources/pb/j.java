package pb;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class j extends h {
    public AssetFileDescriptor B;
    public FileInputStream D;
    public long E;
    public boolean F;

    /* renamed from: x, reason: collision with root package name */
    public final ContentResolver f20384x;

    /* renamed from: y, reason: collision with root package name */
    public Uri f20385y;

    public j(Context context) {
        super(false);
        this.f20384x = context.getContentResolver();
    }

    @Override // pb.n
    public final void close() {
        this.f20385y = null;
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
                        throw new i(e4, 2000);
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
                    throw new i(e10, 2000);
                }
            }
        } catch (IOException e11) {
            throw new i(e11, 2000);
        }
    }

    @Override // pb.n
    public final Uri o() {
        return this.f20385y;
    }

    @Override // pb.n
    public final long q(na.c cVar) throws IOException {
        try {
            Uri uri = (Uri) cVar.f17422f;
            long j = cVar.f17420d;
            long j7 = cVar.f17419c;
            this.f20385y = uri;
            f(cVar);
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f20384x.openAssetFileDescriptor(uri, "r");
            this.B = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                String strValueOf = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36);
                sb2.append("Could not open file descriptor for: ");
                sb2.append(strValueOf);
                throw new i(new IOException(sb2.toString()), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileDescriptor fileDescriptor = assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor();
            FileInputStream fileInputStreamK = xu.d.k(new FileInputStream(fileDescriptor), fileDescriptor);
            this.D = fileInputStreamK;
            if (length != -1 && j7 > length) {
                throw new i(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStreamK.skip(startOffset + j7) - startOffset;
            if (jSkip != j7) {
                throw new i(null, 2008);
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
                        throw new i(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.E = j10;
                if (j10 < 0) {
                    throw new i(null, 2008);
                }
            }
            if (j != -1) {
                long j11 = this.E;
                this.E = j11 == -1 ? j : Math.min(j11, j);
            }
            this.F = true;
            h(cVar);
            return j != -1 ? j : this.E;
        } catch (i e4) {
            throw e4;
        } catch (IOException e10) {
            throw new i(e10, e10 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // pb.k
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
                    throw new i(e4, 2000);
                }
            }
            FileInputStream fileInputStream = this.D;
            int i12 = qb.v.f20828a;
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
}
