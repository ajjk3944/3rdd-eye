package g4;

import com.google.android.gms.internal.ads.C2228zK;
import j4.C2580l;
import j4.b0;
import java.io.IOException;
import o4.C2764c;

/* loaded from: classes.dex */
public abstract class o {
    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            C2764c c2764c = new C2764c(new C2228zK(1, sb));
            c2764c.f22725h = 1;
            b0.f21411z.getClass();
            C2580l.e(c2764c, this);
            return sb.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }
}
