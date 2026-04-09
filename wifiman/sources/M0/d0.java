package M0;

import android.text.Layout;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f12384a = new d0();

    /* renamed from: b, reason: collision with root package name */
    private static final Layout.Alignment f12385b;

    /* renamed from: c, reason: collision with root package name */
    private static final Layout.Alignment f12386c;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (AbstractC6492s.d(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (AbstractC6492s.d(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f12385b = alignment;
        f12386c = alignment2;
    }

    private d0() {
    }

    public final Layout.Alignment a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Layout.Alignment.ALIGN_NORMAL : f12386c : f12385b : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
    }
}
