package nj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class m extends AbstractC6996b {
    public m(byte b10, byte[] bArr) throws IOException {
        super((byte) 5);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f54863b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // nj.u
    protected byte[] o() {
        return f();
    }

    public m(o oVar) {
        super((byte) 5);
        this.f54863b = oVar.j();
    }
}
