package xh;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface h {

    public static final class a {
        public static void a(h hVar, Object[] args) {
            AbstractC6492s.i(args, "args");
            if (j.a(hVar) == args.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + j.a(hVar) + " arguments, but " + args.length + " were provided.");
        }
    }

    List a();

    Member b();

    Object call(Object[] objArr);

    Type getReturnType();
}
