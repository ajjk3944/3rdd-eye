package G;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* compiled from: ExifOutputStream.java */
/* loaded from: classes.dex */
public final class j extends FilterOutputStream {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f1829h = "Exif\u0000\u0000".getBytes(g.f1808d);

    /* renamed from: b, reason: collision with root package name */
    public final h f1830b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1831c;

    /* renamed from: d, reason: collision with root package name */
    public final ByteBuffer f1832d;

    /* renamed from: e, reason: collision with root package name */
    public int f1833e;

    /* renamed from: f, reason: collision with root package name */
    public int f1834f;

    /* renamed from: g, reason: collision with root package name */
    public int f1835g;

    public j(ByteArrayOutputStream byteArrayOutputStream, h hVar) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.f1831c = new byte[1];
        this.f1832d = ByteBuffer.allocate(4);
        this.f1833e = 0;
        this.f1830b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0381, code lost:
    
        if (r5 <= 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0383, code lost:
    
        ((java.io.FilterOutputStream) r19).out.write(r20, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0388, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(byte[] r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G.j.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte b10 = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.f1831c;
        bArr[0] = b10;
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
