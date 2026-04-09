package Z5;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z6.C8713a;

/* loaded from: classes3.dex */
public final class b extends C8713a implements a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DecimalFormat decimalFormat) {
        super(decimalFormat);
        AbstractC6492s.i(decimalFormat, "decimalFormat");
    }

    public b() {
        this("#.##;−#.##", null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ b(String str, RoundingMode roundingMode, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? RoundingMode.HALF_UP : roundingMode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String pattern, RoundingMode roundingMode) {
        this(C8713a.f67060b.a(pattern, roundingMode));
        AbstractC6492s.i(pattern, "pattern");
        AbstractC6492s.i(roundingMode, "roundingMode");
    }
}
