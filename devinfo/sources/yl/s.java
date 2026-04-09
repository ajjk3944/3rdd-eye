package yl;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class s {
    public static int a(int i4, int i10, int i11) throws IOException {
        if ((i10 & 8) != 0) {
            i4--;
        }
        if (i11 <= i4) {
            return i4 - i11;
        }
        throw new IOException(a0.g.i(i11, i4, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
