package np;

import android.content.Context;
import br.l;
import on.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class c {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final np.b Companion;
    public static final c Horizontal = new c("Horizontal", 0) { // from class: np.c.a
        {
            br.g gVar = null;
        }

        @Override // np.c
        public String getLeftDescription(Context context, String str) {
            l.e(context, "context");
            l.e(str, "settingsText");
            return str;
        }

        @Override // np.c
        public String getRightDescription(Context context, String str) {
            l.e(context, "context");
            l.e(str, "settingsText");
            return str;
        }
    };
    public static final c Vertical = new c("Vertical", 1) { // from class: np.c.c
        {
            br.g gVar = null;
        }

        @Override // np.c
        public String getLeftDescription(Context context, String str) {
            l.e(context, "context");
            l.e(str, "settingsText");
            return "";
        }

        @Override // np.c
        public String getRightDescription(Context context, String str) {
            l.e(context, "context");
            l.e(str, "settingsText");
            return "";
        }
    };
    public static final c PortraitHorizontal = new c("PortraitHorizontal", 2) { // from class: np.c.b
        {
            br.g gVar = null;
        }

        @Override // np.c
        public String getLeftDescription(Context context, String str) {
            l.e(context, "context");
            l.e(str, "settingsText");
            if (tt.l.D0(str)) {
                return "";
            }
            String string = context.getString(u.survicate_micro_nps_portrait_horizontal_left_description, str);
            l.b(string);
            return string;
        }

        @Override // np.c
        public String getRightDescription(Context context, String str) {
            l.e(context, "context");
            l.e(str, "settingsText");
            if (tt.l.D0(str)) {
                return "";
            }
            String string = context.getString(u.survicate_micro_nps_portrait_horizontal_right_description, str);
            l.b(string);
            return string;
        }
    };

    private static final /* synthetic */ c[] $values() {
        return new c[]{Horizontal, Vertical, PortraitHorizontal};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = a.a.j(cVarArr$values);
        Companion = new np.b();
    }

    public /* synthetic */ c(String str, int i10, br.g gVar) {
        this(str, i10);
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public abstract String getLeftDescription(Context context, String str);

    public abstract String getRightDescription(Context context, String str);

    private c(String str, int i10) {
    }
}
