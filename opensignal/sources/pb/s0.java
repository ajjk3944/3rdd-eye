package pb;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class s0 extends h {
    public Uri B;
    public AssetFileDescriptor D;
    public FileInputStream E;
    public long F;
    public boolean G;

    /* renamed from: x, reason: collision with root package name */
    public final Resources f20423x;

    /* renamed from: y, reason: collision with root package name */
    public final String f20424y;

    public s0(Context context) {
        super(false);
        this.f20423x = context.getResources();
        this.f20424y = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("rawresource:///");
        sb2.append(i10);
        return Uri.parse(sb2.toString());
    }

    @Override // pb.n
    public final void close() {
        this.B = null;
        try {
            try {
                FileInputStream fileInputStream = this.E;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.E = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.D;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new r0(null, e4, 2000);
                    }
                } finally {
                    this.D = null;
                    if (this.G) {
                        this.G = false;
                        e();
                    }
                }
            } catch (Throwable th2) {
                this.E = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.D;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.D = null;
                        if (this.G) {
                            this.G = false;
                            e();
                        }
                        throw th2;
                    } finally {
                        this.D = null;
                        if (this.G) {
                            this.G = false;
                            e();
                        }
                    }
                } catch (IOException e10) {
                    throw new r0(null, e10, 2000);
                }
            }
        } catch (IOException e11) {
            throw new r0(null, e11, 2000);
        }
    }

    @Override // pb.n
    public final Uri o() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // pb.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long q(na.c r21) throws android.content.res.Resources.NotFoundException, pb.o, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.s0.q(na.c):long");
    }

    @Override // pb.k
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j = this.F;
        if (j != 0) {
            if (j != -1) {
                try {
                    i11 = (int) Math.min(j, i11);
                } catch (IOException e4) {
                    throw new r0(null, e4, 2000);
                }
            }
            FileInputStream fileInputStream = this.E;
            int i12 = qb.v.f20828a;
            int i13 = fileInputStream.read(bArr, i10, i11);
            if (i13 != -1) {
                long j7 = this.F;
                if (j7 != -1) {
                    this.F = j7 - i13;
                }
                a(i13);
                return i13;
            }
            if (this.F != -1) {
                throw new r0("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
