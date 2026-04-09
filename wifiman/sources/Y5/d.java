package Y5;

import android.graphics.RectF;
import e6.InterfaceC5422a;
import g6.InterfaceC5865a;
import g6.InterfaceC5866b;
import kotlin.jvm.internal.AbstractC6492s;
import u6.e;
import w6.InterfaceC8271a;

/* loaded from: classes3.dex */
public interface d extends InterfaceC8271a, InterfaceC5865a {

    public static final class a {
        public static void a(d dVar, e context, float f10, InterfaceC5866b outInsets) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(outInsets, "outInsets");
            InterfaceC5865a.C1772a.a(dVar, context, f10, outInsets);
        }

        public static void b(d dVar, Number left, Number top, Number right, Number bottom) {
            AbstractC6492s.i(left, "left");
            AbstractC6492s.i(top, "top");
            AbstractC6492s.i(right, "right");
            AbstractC6492s.i(bottom, "bottom");
            InterfaceC8271a.C2280a.a(dVar, left, top, right, bottom);
        }
    }

    void c(InterfaceC5422a interfaceC5422a);

    void e(RectF... rectFArr);

    void h(InterfaceC5422a interfaceC5422a);
}
