package vu;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class s {
    public static int a(int i10, int i11, int i12) throws IOException {
        if ((i11 & 8) != 0) {
            i10--;
        }
        if (i12 <= i10) {
            return i10 - i12;
        }
        throw new IOException(h0.b.l("PROTOCOL_ERROR padding ", i12, i10, " > remaining length "));
    }
}
