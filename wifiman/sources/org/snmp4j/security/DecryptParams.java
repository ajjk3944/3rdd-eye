package org.snmp4j.security;

/* loaded from: classes2.dex */
public class DecryptParams {
    public byte[] array;
    public int length;
    public int offset;

    public DecryptParams(byte[] bArr, int i10, int i11) {
        this.array = bArr;
        this.offset = i10;
        this.length = i11;
    }

    public void setValues(byte[] bArr, int i10, int i11) {
        this.array = bArr;
        this.offset = i10;
        this.length = i11;
    }

    public DecryptParams() {
        this.array = null;
        this.offset = 0;
        this.length = 0;
    }
}
