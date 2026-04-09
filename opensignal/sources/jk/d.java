package jk;

import br.l;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements c {
    @Override // jk.c
    public final boolean a(byte[] bArr, byte[] bArr2, b bVar) {
        l.e(bArr, "bytesSent");
        l.e(bArr2, "bytesReceived");
        return Arrays.equals(bArr, bArr2);
    }
}
