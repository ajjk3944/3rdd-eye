package d5;

import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class l extends AbstractC2283k {
    public static int P(Iterable iterable) {
        q5.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
