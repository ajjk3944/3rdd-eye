package ea;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import kotlin.jvm.internal.l;
import y9.q;
import y9.r;

/* compiled from: AndroidLog.kt */
/* loaded from: classes3.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f37781a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int iMin;
        l.f(record, "record");
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = c.f37779a;
        String loggerName = record.getLoggerName();
        l.e(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i = iIntValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        l.e(message, "record.message");
        Throwable thrown = record.getThrown();
        String strZ0 = c.f37780b.get(loggerName);
        if (strZ0 == null) {
            strZ0 = r.z0(23, loggerName);
        }
        if (Log.isLoggable(strZ0, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i10 = 0;
            while (i10 < length) {
                int iF0 = q.f0(message, '\n', i10, 4);
                if (iF0 == -1) {
                    iF0 = length;
                }
                while (true) {
                    iMin = Math.min(iF0, i10 + 4000);
                    String strSubstring = message.substring(i10, iMin);
                    l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, strZ0, strSubstring);
                    if (iMin >= iF0) {
                        break;
                    } else {
                        i10 = iMin;
                    }
                }
                i10 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
