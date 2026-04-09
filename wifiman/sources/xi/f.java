package Xi;

import Zg.AbstractC3689v;
import java.util.List;

/* loaded from: classes4.dex */
public interface f {
    String a();

    default boolean c() {
        return false;
    }

    int d(String str);

    int e();

    String f(int i10);

    List g(int i10);

    default List getAnnotations() {
        return AbstractC3689v.l();
    }

    m h();

    f i(int i10);

    default boolean isInline() {
        return false;
    }

    boolean j(int i10);
}
