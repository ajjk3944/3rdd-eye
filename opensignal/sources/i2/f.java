package i2;

import android.text.Layout;
import br.l;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f11166a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f11167b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (l.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (l.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f11166a = alignment;
        f11167b = alignment2;
    }
}
