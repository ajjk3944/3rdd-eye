package m0;

import android.graphics.Canvas;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: m0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6670H {

    /* renamed from: a, reason: collision with root package name */
    private static final Canvas f52811a = new Canvas();

    public static final InterfaceC6717n0 a(J0 j02) {
        C6668G c6668g = new C6668G();
        c6668g.z(new Canvas(AbstractC6679O.b(j02)));
        return c6668g;
    }

    public static final InterfaceC6717n0 b(Canvas canvas) {
        C6668G c6668g = new C6668G();
        c6668g.z(canvas);
        return c6668g;
    }

    public static final Canvas d(InterfaceC6717n0 interfaceC6717n0) {
        AbstractC6492s.g(interfaceC6717n0, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((C6668G) interfaceC6717n0).a();
    }
}
