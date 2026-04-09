package x;

import C.C;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: DynamicRangeConversions.java */
/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5753a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f47597a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f47598b;

    static {
        C c10;
        HashMap map = new HashMap();
        f47597a = map;
        HashMap map2 = new HashMap();
        f47598b = map2;
        C c11 = C.f616d;
        map.put(1L, c11);
        map2.put(c11, Collections.singletonList(1L));
        map.put(2L, C.f617e);
        map2.put((C) map.get(2L), Collections.singletonList(2L));
        C c12 = C.f618f;
        map.put(4L, c12);
        map2.put(c12, Collections.singletonList(4L));
        C c13 = C.f619g;
        map.put(8L, c13);
        map2.put(c13, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c10 = C.f620h;
            if (!zHasNext) {
                break;
            } else {
                f47597a.put((Long) it.next(), c10);
            }
        }
        f47598b.put(c10, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            C c14 = C.i;
            if (!zHasNext2) {
                f47598b.put(c14, listAsList2);
                return;
            }
            f47597a.put((Long) it2.next(), c14);
        }
    }

    public static Long a(C c10, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f47598b.get(c10);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l5 : list) {
            if (supportedProfiles.contains(l5)) {
                return l5;
            }
        }
        return null;
    }
}
