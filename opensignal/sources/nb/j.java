package nb;

import com.google.android.exoplayer2.y0;
import java.util.regex.Pattern;
import qb.v;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f17488a = Pattern.compile("^NOTE([ \t].*)?$");

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i10 = v.f20828a;
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

    public static void c(fb.f fVar) throws y0 {
        int i10 = fVar.f8801b;
        String strE = fVar.e();
        if (strE == null || !strE.startsWith("WEBVTT")) {
            fVar.y(i10);
            String strValueOf = String.valueOf(fVar.e());
            throw y0.a(null, strValueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(strValueOf) : new String("Expected WEBVTT. Got "));
        }
    }
}
