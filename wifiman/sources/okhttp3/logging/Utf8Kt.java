package okhttp3.logging;

import ej.C5481e;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;
import sh.AbstractC7978m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lej/e;", "", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lej/e;)Z", "okhttp-logging-interceptor"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Utf8Kt {
    public static final boolean a(C5481e c5481e) {
        AbstractC6492s.i(c5481e, "<this>");
        try {
            C5481e c5481e2 = new C5481e();
            c5481e.S(c5481e2, 0L, AbstractC7978m.h(c5481e.D0(), 64L));
            for (int i10 = 0; i10 < 16; i10++) {
                if (c5481e2.t()) {
                    return true;
                }
                int iB0 = c5481e2.B0();
                if (Character.isISOControl(iB0) && !Character.isWhitespace(iB0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
