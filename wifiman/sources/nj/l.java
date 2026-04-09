package nj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class l extends AbstractC6996b {
    public l(byte b10, byte[] bArr) throws IOException {
        super((byte) 7);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f54863b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // nj.u
    protected byte[] o() {
        return f();
    }

    public l(o oVar) {
        super((byte) 7);
        this.f54863b = oVar.j();
    }

    public l(int i10) {
        super((byte) 7);
        this.f54863b = i10;
    }
}
