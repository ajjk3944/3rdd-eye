package rs;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class c implements y {
    static {
        int i10 = g.f21753b;
    }

    public final b b(ByteArrayInputStream byteArrayInputStream, g gVar) throws IOException {
        b bVar;
        try {
            int i10 = byteArrayInputStream.read();
            if (i10 == -1) {
                bVar = null;
            } else {
                if ((i10 & 128) != 0) {
                    i10 &= 127;
                    int i11 = 7;
                    while (true) {
                        if (i11 >= 32) {
                            while (i11 < 64) {
                                int i12 = byteArrayInputStream.read();
                                if (i12 == -1) {
                                    throw t.a();
                                }
                                if ((i12 & 128) != 0) {
                                    i11 += 7;
                                }
                            }
                            throw new t("CodedInputStream encountered a malformed varint.");
                        }
                        int i13 = byteArrayInputStream.read();
                        if (i13 == -1) {
                            throw t.a();
                        }
                        i10 |= (i13 & 127) << i11;
                        if ((i13 & 128) == 0) {
                            break;
                        }
                        i11 += 7;
                    }
                }
                f5.u uVar = new f5.u(new a(byteArrayInputStream, i10));
                b bVar2 = (b) a(uVar, gVar);
                try {
                    uVar.c(0);
                    bVar = bVar2;
                } catch (t e4) {
                    e4.f21776a = bVar2;
                    throw e4;
                }
            }
            if (bVar == null || bVar.b()) {
                return bVar;
            }
            t tVar = new t(new bf.n().getMessage());
            tVar.f21776a = bVar;
            throw tVar;
        } catch (IOException e10) {
            throw new t(e10.getMessage());
        }
    }
}
