package E6;

import E6.a;
import K6.C0749p;
import c9.C2092m;
import c9.C2099t;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.l;
import y9.q;

/* compiled from: CurrencyInputMask.kt */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final C0749p f1462e;

    /* renamed from: f, reason: collision with root package name */
    public final char f1463f;

    /* renamed from: g, reason: collision with root package name */
    public final List<Character> f1464g;

    /* renamed from: h, reason: collision with root package name */
    public NumberFormat f1465h;

    public b(Locale locale, C0749p c0749p) {
        super(new a.b("", C2099t.f18581b, false));
        this.f1462e = c0749p;
        this.f1463f = (char) 164;
        this.f1464g = C2092m.W('.', ',');
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        l.e(currencyInstance, "getCurrencyInstance(locale)");
        p(currencyInstance);
        this.f1465h = currencyInstance;
    }

    public static boolean r(f fVar, int i) {
        int i10 = fVar.f1470a;
        return i10 <= i && i < i10 + fVar.f1471b;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    @Override // E6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r21, java.lang.Integer r22) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E6.b.a(java.lang.String, java.lang.Integer):void");
    }

    @Override // E6.a
    public final void k(PatternSyntaxException patternSyntaxException) {
        this.f1462e.invoke(patternSyntaxException);
    }

    @Override // E6.a
    public final void l(String str) throws ParseException {
        Number number = this.f1465h.parse(str);
        if (number == null) {
            number = 0;
        }
        s(number);
        super.l(str);
    }

    public final void p(NumberFormat numberFormat) {
        DecimalFormat decimalFormat = numberFormat instanceof DecimalFormat ? (DecimalFormat) numberFormat : null;
        if (decimalFormat != null) {
            String pattern = decimalFormat.toPattern();
            l.e(pattern, "toPattern()");
            StringBuilder sb = new StringBuilder();
            int length = pattern.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = pattern.charAt(i);
                if (cCharAt != this.f1463f) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            l.e(string, "toString(...)");
            decimalFormat.applyPattern(q.w0(string).toString());
        }
    }

    public final DecimalFormatSymbols q() {
        NumberFormat numberFormat = this.f1465h;
        l.d(numberFormat, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) numberFormat).getDecimalFormatSymbols();
        l.e(decimalFormatSymbols, "currencyFormatter as Dec…mat).decimalFormatSymbols");
        return decimalFormatSymbols;
    }

    public final void s(Number number) {
        String formatted = this.f1465h.format(number);
        l.e(formatted, "formatted");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < formatted.length(); i++) {
            char cCharAt = formatted.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append('#');
            } else {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        l.e(string, "toString(...)");
        o(new a.b(string, C2092m.W(new a.c('#', '0', "\\d"), new a.c(q().getDecimalSeparator(), q().getDecimalSeparator(), "[" + q().getDecimalSeparator() + ']')), this.f1446a.f1456c), false);
    }
}
