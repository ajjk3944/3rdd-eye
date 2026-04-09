package c9;

import java.util.Collections;
import java.util.Map;

/* compiled from: MapsJVM.kt */
/* renamed from: c9.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2077A extends C2088i {
    public static int l(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> m(b9.l<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.l.f(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.f18083b, pair.f18084c);
        kotlin.jvm.internal.l.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }
}
