package S8;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final a Companion;
    private final int width;
    public static final d MHZ_20 = new d("MHZ_20", 0, 20);
    public static final d MHZ_40 = new d("MHZ_40", 1, 40);
    public static final d MHZ_80 = new d("MHZ_80", 2, 80);
    public static final d MHZ_160 = new d("MHZ_160", 3, 160);
    public static final d MHZ_80_80 = new d("MHZ_80_80", 4, 160);
    public static final d MHZ_320 = new d("MHZ_320", 5, 320);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(int i10) {
            if (i10 == 20) {
                return d.MHZ_20;
            }
            if (i10 == 40) {
                return d.MHZ_40;
            }
            if (i10 == 80) {
                return d.MHZ_80;
            }
            if (i10 == 160) {
                return d.MHZ_160;
            }
            if (i10 != 320) {
                return null;
            }
            return d.MHZ_320;
        }

        private a() {
        }
    }

    private static final /* synthetic */ d[] $values() {
        return new d[]{MHZ_20, MHZ_40, MHZ_80, MHZ_160, MHZ_80_80, MHZ_320};
    }

    static {
        d[] dVarArr$values = $values();
        $VALUES = dVarArr$values;
        $ENTRIES = AbstractC5827b.a(dVarArr$values);
        Companion = new a(null);
    }

    private d(String str, int i10, int i11) {
        this.width = i11;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final int getWidth() {
        return this.width;
    }
}
