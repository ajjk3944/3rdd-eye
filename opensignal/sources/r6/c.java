package r6;

import a5.d0;
import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f21286a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f21287b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f21288c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f21289d;

    static {
        int i10 = d0.f105a;
        Locale locale = Locale.US;
        f21287b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f21288c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f21289d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String str) throws NumberFormatException {
        String strGroup;
        String strGroup2;
        Matcher matcher = f21287b.matcher(str);
        Matcher matcher2 = f21288c.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                a5.a.t();
            }
            strGroup2 = matcher.group(1);
            strGroup = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            String strGroup3 = matcher2.group(1);
            strGroup = matcher2.group(2);
            strGroup2 = strGroup3;
        }
        strGroup2.getClass();
        float f10 = Float.parseFloat(strGroup2.trim());
        strGroup.getClass();
        return new PointF(f10, Float.parseFloat(strGroup.trim()));
    }
}
