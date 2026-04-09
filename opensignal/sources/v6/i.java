package v6;

import a5.d0;
import a5.v;
import androidx.media3.common.k0;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f23897a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(v vVar) {
        vVar.getClass();
        String strH = vVar.h(ne.g.f17524c);
        return strH != null && strH.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i10 = d0.f105a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j7 = j * 1000;
        if (strArrSplit.length == 2) {
            j7 += Long.parseLong(strArrSplit[1]);
        }
        return j7 * 1000;
    }

    public static void d(v vVar) throws k0 {
        int i10 = vVar.f166b;
        if (a(vVar)) {
            return;
        }
        vVar.E(i10);
        throw k0.a(null, "Expected WEBVTT. Got " + vVar.h(ne.g.f17524c));
    }
}
