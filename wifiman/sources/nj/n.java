package nj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class n extends h {
    public n(m mVar) {
        super((byte) 6);
        s(mVar.j());
    }

    @Override // nj.u
    protected byte k() {
        return (byte) ((this.f54864c ? 8 : 0) | 2);
    }

    @Override // nj.u
    protected byte[] o() {
        return f();
    }

    @Override // nj.u
    public String toString() {
        return String.valueOf(super.toString()) + " msgId " + this.f54863b;
    }

    public n(byte b10, byte[] bArr) throws IOException {
        super((byte) 6);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f54863b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }
}
