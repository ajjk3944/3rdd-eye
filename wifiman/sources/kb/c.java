package kb;

import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import kb.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6510d;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f51354a = new c();

    private c() {
    }

    private final byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[javax.jmdns.impl.constants.d.CLASS_MASK];
        int iDeflate = deflater.deflate(bArr2);
        byte[] bArr3 = new byte[iDeflate];
        System.arraycopy(bArr2, 0, bArr3, 0, iDeflate);
        return bArr3;
    }

    public static /* synthetic */ ByteBuffer e(c cVar, byte[] bArr, l.b bVar, ByteBuffer byteBuffer, l.b bVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return cVar.c(bArr, bVar, byteBuffer, bVar2, z10);
    }

    private final void f(ByteBuffer byteBuffer, l.c cVar, l.b bVar, boolean z10, byte[] bArr) {
        byteBuffer.put(cVar.getValue());
        byteBuffer.put(bVar.getValue());
        byteBuffer.put(z10 ? (byte) 1 : (byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.putInt(bArr.length);
        byteBuffer.put(bArr);
    }

    public final ByteBuffer b(ByteBuffer data) {
        AbstractC6492s.i(data, "data");
        byte[] bytes = "{\"type\":\"message\"}".getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        return e(this, bytes, l.b.JSON, data, l.b.BINARY, false, 16, null);
    }

    public final ByteBuffer c(byte[] header, l.b headerFormat, ByteBuffer body, l.b bodyFormat, boolean z10) {
        byte[] bArrArray;
        AbstractC6492s.i(header, "header");
        AbstractC6492s.i(headerFormat, "headerFormat");
        AbstractC6492s.i(body, "body");
        AbstractC6492s.i(bodyFormat, "bodyFormat");
        if (body.hasArray()) {
            bArrArray = body.array();
        } else {
            byte[] bArr = new byte[body.remaining()];
            body.get(bArr);
            bArrArray = bArr;
        }
        AbstractC6492s.f(bArrArray);
        return d(header, headerFormat, bArrArray, bodyFormat, z10);
    }

    public final ByteBuffer d(byte[] header, l.b headerFormat, byte[] body, l.b bodyFormat, boolean z10) {
        AbstractC6492s.i(header, "header");
        AbstractC6492s.i(headerFormat, "headerFormat");
        AbstractC6492s.i(body, "body");
        AbstractC6492s.i(bodyFormat, "bodyFormat");
        byte[] bArrA = z10 ? a(header) : header;
        byte[] bArrA2 = z10 ? a(body) : body;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrA.length + 16 + bArrA2.length);
        AbstractC6492s.f(byteBufferAllocate);
        f(byteBufferAllocate, l.c.HEADER, headerFormat, z10, bArrA);
        f(byteBufferAllocate, l.c.BODY, bodyFormat, z10, bArrA2);
        byteBufferAllocate.position(0);
        return byteBufferAllocate;
    }
}
