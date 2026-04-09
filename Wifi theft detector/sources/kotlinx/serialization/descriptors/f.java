package kotlinx.serialization.descriptors;

import java.util.List;
import z8.r;

/* loaded from: classes4.dex */
public interface f {

    public static final class a {
        public static List a(f fVar) {
            return r.j();
        }

        public static boolean b(f fVar) {
            return false;
        }

        public static boolean c(f fVar) {
            return false;
        }
    }

    boolean b();

    int c(String str);

    int d();

    String e(int i10);

    List f(int i10);

    f g(int i10);

    List getAnnotations();

    h getKind();

    String h();

    boolean i(int i10);

    boolean isInline();
}
