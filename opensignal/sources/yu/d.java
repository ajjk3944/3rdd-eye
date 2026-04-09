package yu;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f26461a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        br.l.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f26459a;
        String loggerName = logRecord.getLoggerName();
        br.l.d(loggerName, "record.loggerName");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i10 = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        br.l.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String strY0 = (String) c.f26460b.get(loggerName);
        if (strY0 == null) {
            strY0 = tt.l.Y0(23, loggerName);
        }
        if (Log.isLoggable(strY0, i10)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int iA0 = tt.l.A0(message, '\n', i11, 4);
                if (iA0 == -1) {
                    iA0 = length;
                }
                while (true) {
                    iMin = Math.min(iA0, i11 + 4000);
                    String strSubstring = message.substring(i11, iMin);
                    br.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strY0, strSubstring);
                    if (iMin >= iA0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
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
