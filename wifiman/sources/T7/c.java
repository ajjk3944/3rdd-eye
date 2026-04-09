package T7;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    public static final c METRIC = new c("METRIC", 0);
    public static final c IMPERIAL = new c("IMPERIAL", 1);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(Locale locale) {
            int iHashCode;
            AbstractC6492s.i(locale, "locale");
            String country = locale.getCountry();
            return (country == null || ((iHashCode = country.hashCode()) == 2438 ? !country.equals("LR") : !(iHashCode == 2464 ? country.equals("MM") : iHashCode == 2718 && country.equals("US")))) ? c.METRIC : c.IMPERIAL;
        }

        private a() {
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{METRIC, IMPERIAL};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = AbstractC5827b.a(cVarArr$values);
        Companion = new a(null);
    }

    private c(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
