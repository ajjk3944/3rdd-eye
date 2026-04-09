package kotlin.reflect.jvm.internal.impl.renderer;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class F {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ F[] $VALUES;
    public static final F PLAIN = new F("PLAIN", 0) { // from class: kotlin.reflect.jvm.internal.impl.renderer.F.b
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.F
        public String escape(String string) {
            AbstractC6492s.i(string, "string");
            return string;
        }
    };
    public static final F HTML = new F("HTML", 1) { // from class: kotlin.reflect.jvm.internal.impl.renderer.F.a
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.F
        public String escape(String string) {
            AbstractC6492s.i(string, "string");
            return kotlin.text.t.L(kotlin.text.t.L(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    private static final /* synthetic */ F[] $values() {
        return new F[]{PLAIN, HTML};
    }

    static {
        F[] fArr$values = $values();
        $VALUES = fArr$values;
        $ENTRIES = AbstractC5827b.a(fArr$values);
    }

    public /* synthetic */ F(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) $VALUES.clone();
    }

    public abstract String escape(String str);

    private F(String str, int i10) {
    }
}
