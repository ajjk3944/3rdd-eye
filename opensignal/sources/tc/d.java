package tc;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f22698a;

    /* renamed from: b, reason: collision with root package name */
    public static final DecimalFormat f22699b;

    static {
        Locale locale = Locale.ROOT;
        f22698a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f22699b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
