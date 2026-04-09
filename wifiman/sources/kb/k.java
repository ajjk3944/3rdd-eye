package kb;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    private byte[] f51366b;

    /* renamed from: c, reason: collision with root package name */
    private int f51367c;

    /* renamed from: a, reason: collision with root package name */
    private final l f51365a = new l();

    /* renamed from: d, reason: collision with root package name */
    private byte[] f51368d = new byte[0];

    private final byte[] b(byte[] bArr) {
        Inflater inflater = new Inflater();
        inflater.setInput(bArr, 0, bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[bArr.length];
        while (!inflater.needsInput()) {
            try {
                byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
            } catch (DataFormatException e10) {
                Sj.a.f20830a.e(e10, "Decompression failed", new Object[0]);
            }
        }
        inflater.end();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC6492s.h(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final void a(ByteBuffer buf) {
        AbstractC6492s.i(buf, "buf");
        if (!this.f51365a.c()) {
            this.f51365a.a(buf);
        }
        if (this.f51365a.c()) {
            if (this.f51366b == null) {
                int iB = this.f51365a.b();
                this.f51367c = iB;
                this.f51366b = new byte[iB];
            }
            byte[] bArr = this.f51366b;
            byte[] bArr2 = null;
            if (bArr == null) {
                AbstractC6492s.v("_content");
                bArr = null;
            }
            int length = bArr.length;
            int i10 = this.f51367c;
            int i11 = length - i10;
            int iMin = Math.min(i10, buf.remaining());
            byte[] bArr3 = this.f51366b;
            if (bArr3 == null) {
                AbstractC6492s.v("_content");
                bArr3 = null;
            }
            buf.get(bArr3, i11, iMin);
            this.f51367c -= iMin;
            if (d() && this.f51365a.d()) {
                byte[] bArr4 = this.f51366b;
                if (bArr4 == null) {
                    AbstractC6492s.v("_content");
                    bArr4 = null;
                }
                this.f51366b = b(bArr4);
            }
            byte[] bArr5 = this.f51366b;
            if (bArr5 != null) {
                if (bArr5 == null) {
                    AbstractC6492s.v("_content");
                } else {
                    bArr2 = bArr5;
                }
                this.f51368d = bArr2;
            }
        }
    }

    public final byte[] c() {
        return this.f51368d;
    }

    public final boolean d() {
        return this.f51365a.c() && this.f51367c == 0;
    }
}
