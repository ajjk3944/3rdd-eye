package w6;

import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC6492s;
import y6.AbstractC8620i;

/* renamed from: w6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8271a {

    /* renamed from: w6.a$a, reason: collision with other inner class name */
    public static final class C2280a {
        public static void a(InterfaceC8271a interfaceC8271a, Number left, Number top, Number right, Number bottom) {
            AbstractC6492s.i(left, "left");
            AbstractC6492s.i(top, "top");
            AbstractC6492s.i(right, "right");
            AbstractC6492s.i(bottom, "bottom");
            AbstractC8620i.e(interfaceC8271a.getBounds(), left, top, right, bottom);
        }
    }

    RectF getBounds();

    void l(Number number, Number number2, Number number3, Number number4);
}
