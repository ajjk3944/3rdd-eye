package z6;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import k6.InterfaceC6395b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: z6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8713a implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final C2379a f67060b = new C2379a(null);

    /* renamed from: a, reason: collision with root package name */
    private final DecimalFormat f67061a;

    /* renamed from: z6.a$a, reason: collision with other inner class name */
    public static final class C2379a {
        public /* synthetic */ C2379a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DecimalFormat a(String pattern, RoundingMode roundingMode) {
            AbstractC6492s.i(pattern, "pattern");
            AbstractC6492s.i(roundingMode, "roundingMode");
            DecimalFormat decimalFormat = new DecimalFormat(pattern);
            decimalFormat.setRoundingMode(roundingMode);
            return decimalFormat;
        }

        private C2379a() {
        }
    }

    public C8713a(DecimalFormat decimalFormat) {
        AbstractC6492s.i(decimalFormat, "decimalFormat");
        this.f67061a = decimalFormat;
    }

    @Override // z6.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(float f10, InterfaceC6395b chartValues) {
        AbstractC6492s.i(chartValues, "chartValues");
        String str = this.f67061a.format(Float.valueOf(f10));
        AbstractC6492s.h(str, "decimalFormat.format(value)");
        return str;
    }

    public C8713a() {
        this("#.##;−#.##", null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ C8713a(String str, RoundingMode roundingMode, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? RoundingMode.HALF_UP : roundingMode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8713a(String pattern, RoundingMode roundingMode) {
        this(f67060b.a(pattern, roundingMode));
        AbstractC6492s.i(pattern, "pattern");
        AbstractC6492s.i(roundingMode, "roundingMode");
    }
}
