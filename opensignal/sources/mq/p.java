package mq;

import com.google.android.gms.internal.measurement.e5;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class p extends e5 {
    public static int a0(Iterable iterable, int i10) {
        br.l.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
