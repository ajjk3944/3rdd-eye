package t2;

import android.text.Layout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f34137a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f34138b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (nk.k.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (nk.k.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f34137a = alignment;
        f34138b = alignment2;
    }
}
