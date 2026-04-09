package nj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class q extends AbstractC6996b {

    /* renamed from: g, reason: collision with root package name */
    private int[] f54854g;

    public q(byte b10, byte[] bArr) throws IOException {
        super((byte) 9);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f54863b = dataInputStream.readUnsignedShort();
        this.f54854g = new int[bArr.length - 2];
        int i10 = 0;
        for (int i11 = dataInputStream.read(); i11 != -1; i11 = dataInputStream.read()) {
            this.f54854g[i10] = i11;
            i10++;
        }
        dataInputStream.close();
    }

    @Override // nj.u
    protected byte[] o() {
        return new byte[0];
    }

    @Override // nj.AbstractC6996b, nj.u
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" granted Qos");
        for (int i10 : this.f54854g) {
            stringBuffer.append(" ");
            stringBuffer.append(i10);
        }
        return stringBuffer.toString();
    }

    public int[] w() {
        return this.f54854g;
    }
}
