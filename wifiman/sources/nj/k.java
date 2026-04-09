package nj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class k extends AbstractC6996b {
    public k(byte b10, byte[] bArr) throws IOException {
        super((byte) 4);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f54863b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // nj.u
    protected byte[] o() {
        return f();
    }

    public k(o oVar) {
        super((byte) 4);
        this.f54863b = oVar.j();
    }

    public k(int i10) {
        super((byte) 4);
        this.f54863b = i10;
    }
}
