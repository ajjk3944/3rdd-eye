package ou;

import java.io.IOException;

/* loaded from: classes.dex */
public final class y {
    public static z a(String str) throws IOException {
        br.l.e(str, "protocol");
        z zVar = z.HTTP_1_0;
        if (str.equals(zVar.protocol)) {
            return zVar;
        }
        z zVar2 = z.HTTP_1_1;
        if (str.equals(zVar2.protocol)) {
            return zVar2;
        }
        z zVar3 = z.H2_PRIOR_KNOWLEDGE;
        if (str.equals(zVar3.protocol)) {
            return zVar3;
        }
        z zVar4 = z.HTTP_2;
        if (str.equals(zVar4.protocol)) {
            return zVar4;
        }
        z zVar5 = z.SPDY_3;
        if (str.equals(zVar5.protocol)) {
            return zVar5;
        }
        z zVar6 = z.QUIC;
        if (str.equals(zVar6.protocol)) {
            return zVar6;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }
}
