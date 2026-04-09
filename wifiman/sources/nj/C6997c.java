package nj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: nj.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6997c extends AbstractC6996b {

    /* renamed from: g, reason: collision with root package name */
    private int f54829g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f54830h;

    public C6997c(byte b10, byte[] bArr) throws IOException {
        super((byte) 2);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f54830h = (dataInputStream.readUnsignedByte() & 1) == 1;
        this.f54829g = dataInputStream.readUnsignedByte();
        dataInputStream.close();
    }

    @Override // nj.u
    public String i() {
        return "Con";
    }

    @Override // nj.u
    protected byte[] o() {
        return new byte[0];
    }

    @Override // nj.u
    public boolean p() {
        return false;
    }

    @Override // nj.AbstractC6996b, nj.u
    public String toString() {
        return String.valueOf(super.toString()) + " session present:" + this.f54830h + " return code: " + this.f54829g;
    }

    public int w() {
        return this.f54829g;
    }

    public boolean x() {
        return this.f54830h;
    }
}
