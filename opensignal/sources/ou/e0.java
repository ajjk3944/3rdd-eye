package ou;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class e0 implements Closeable {
    public abstract long b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        pu.b.d(h());
    }

    public abstract v f();

    public abstract cv.i h();

    public final String i() throws IOException {
        Charset charsetA;
        cv.i iVarH = h();
        try {
            v vVarF = f();
            if (vVarF == null || (charsetA = vVarF.a(tt.a.f22975a)) == null) {
                charsetA = tt.a.f22975a;
            }
            String strJ = iVarH.J(pu.b.r(iVarH, charsetA));
            iVarH.close();
            return strJ;
        } finally {
        }
    }
}
