package O2;

/* compiled from: ByteArrayAdapter.java */
/* loaded from: classes.dex */
public final class d implements a<byte[]> {
    @Override // O2.a
    public final int a() {
        return 1;
    }

    @Override // O2.a
    public final int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // O2.a
    public final String getTag() {
        return "ByteArrayPool";
    }

    @Override // O2.a
    public final byte[] newArray(int i) {
        return new byte[i];
    }
}
