package b6;

import e6.InterfaceC5422a;
import g6.InterfaceC5865a;
import g6.InterfaceC5866b;
import j6.InterfaceC6255b;
import java.util.Collection;
import java.util.Map;
import k6.C6396c;
import kotlin.jvm.internal.AbstractC6492s;
import u6.e;
import w6.InterfaceC8271a;

/* loaded from: classes3.dex */
public interface b extends InterfaceC8271a, InterfaceC5865a {

    public static final class a {
        public static void a(b bVar, e context, float f10, InterfaceC5866b outInsets) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(outInsets, "outInsets");
            InterfaceC5865a.C1772a.a(bVar, context, f10, outInsets);
        }

        public static void b(b bVar, Number left, Number top, Number right, Number bottom) {
            AbstractC6492s.i(left, "left");
            AbstractC6492s.i(top, "top");
            AbstractC6492s.i(right, "right");
            AbstractC6492s.i(bottom, "bottom");
            InterfaceC8271a.C2280a.a(bVar, left, top, right, bottom);
        }
    }

    void a(InterfaceC5422a interfaceC5422a, Object obj);

    void d(InterfaceC5422a interfaceC5422a, Object obj);

    InterfaceC6255b f(e eVar, Object obj);

    Collection j();

    void k(C6396c c6396c, Object obj);

    Map m();
}
