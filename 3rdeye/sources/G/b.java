package G;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import kotlin.KotlinVersion;

/* compiled from: ByteOrderedDataOutputStream.java */
/* loaded from: classes.dex */
public final class b extends FilterOutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final OutputStream f1797b;

    /* renamed from: c, reason: collision with root package name */
    public ByteOrder f1798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(OutputStream outputStream) {
        super(outputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f1797b = outputStream;
        this.f1798c = byteOrder;
    }

    public final void a(int i) throws IOException {
        ByteOrder byteOrder = this.f1798c;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f1797b;
        if (byteOrder == byteOrder2) {
            outputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
            outputStream.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            outputStream.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            outputStream.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            outputStream.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            outputStream.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            outputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    public final void c(short s10) throws IOException {
        ByteOrder byteOrder = this.f1798c;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f1797b;
        if (byteOrder == byteOrder2) {
            outputStream.write(s10 & 255);
            outputStream.write((s10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((s10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            outputStream.write(s10 & 255);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f1797b.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) throws IOException {
        this.f1797b.write(bArr, i, i10);
    }
}
