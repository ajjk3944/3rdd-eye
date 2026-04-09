package Nb;

import gg.i;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public interface e {

    public static final class a {
        public static void a(e eVar, List consoles) {
            AbstractC6492s.i(consoles, "consoles");
            eVar.clear();
            eVar.b(consoles);
        }
    }

    i a();

    void b(List list);

    void c(List list);

    void clear();

    void d(String str);
}
