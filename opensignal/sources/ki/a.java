package ki;

import android.os.Environment;
import ar.k;
import br.l;
import ch.f;
import ch.n;
import df.c;

/* loaded from: classes.dex */
public final class a {
    public a(f fVar, c cVar) {
    }

    public static Long a(k kVar) {
        long jLongValue;
        try {
            String string = Environment.getDataDirectory().toString();
            l.d(string, "toString(...)");
            jLongValue = ((Number) kVar.a(string)).longValue();
        } catch (Exception e4) {
            n.e("StorageChecker", e4);
            jLongValue = 0;
        }
        if (jLongValue == 0) {
            return null;
        }
        return Long.valueOf(jLongValue);
    }
}
