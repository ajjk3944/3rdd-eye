package C3;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f2238a;

    /* renamed from: b, reason: collision with root package name */
    private static final SimpleDateFormat f2239b;

    /* renamed from: c, reason: collision with root package name */
    private static final StringBuilder f2240c;

    static {
        Locale locale = Locale.ROOT;
        f2238a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        f2239b = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f2240c = new StringBuilder(33);
    }

    public static String a(long j10) {
        String string;
        StringBuilder sb2 = f2240c;
        synchronized (sb2) {
            sb2.setLength(0);
            b(j10, sb2);
            string = sb2.toString();
        }
        return string;
    }

    public static StringBuilder b(long j10, StringBuilder sb2) {
        if (j10 == 0) {
            sb2.append("0s");
            return sb2;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z10 = false;
        if (j10 < 0) {
            sb2.append("-");
            if (j10 != Long.MIN_VALUE) {
                j10 = -j10;
            } else {
                j10 = Long.MAX_VALUE;
                z10 = true;
            }
        }
        if (j10 >= 86400000) {
            sb2.append(j10 / 86400000);
            sb2.append("d");
            j10 %= 86400000;
        }
        if (true == z10) {
            j10 = 25975808;
        }
        if (j10 >= 3600000) {
            sb2.append(j10 / 3600000);
            sb2.append("h");
            j10 %= 3600000;
        }
        if (j10 >= 60000) {
            sb2.append(j10 / 60000);
            sb2.append("m");
            j10 %= 60000;
        }
        if (j10 >= 1000) {
            sb2.append(j10 / 1000);
            sb2.append("s");
            j10 %= 1000;
        }
        if (j10 > 0) {
            sb2.append(j10);
            sb2.append("ms");
        }
        return sb2;
    }
}
