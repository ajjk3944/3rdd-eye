package nj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class s extends AbstractC6996b {
    public s(byte b10, byte[] bArr) throws IOException {
        super((byte) 11);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f54863b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // nj.u
    protected byte[] o() {
        return new byte[0];
    }
}
