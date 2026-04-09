package e0;

import C.C;
import androidx.camera.core.impl.InterfaceC1680b0;
import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: DynamicRangeUtil.java */
/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4301b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f37631a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f37632b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f37633c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f37634d;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f37635e;

    static {
        HashMap map = new HashMap();
        f37631a = map;
        HashMap map2 = new HashMap();
        f37632b = map2;
        HashMap map3 = new HashMap();
        f37633c = map3;
        HashMap map4 = new HashMap();
        f37634d = map4;
        HashMap map5 = new HashMap();
        f37635e = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        C c10 = C.f616d;
        map6.put(c10, 1);
        C c11 = C.f617e;
        map6.put(c11, 2);
        C c12 = C.f618f;
        map6.put(c12, 4096);
        C c13 = C.f619g;
        map6.put(c13, 8192);
        HashMap map7 = new HashMap();
        map7.put(c10, 1);
        map7.put(c11, 2);
        map7.put(c12, 4096);
        map7.put(c13, 8192);
        HashMap map8 = new HashMap();
        map8.put(c10, 1);
        map8.put(c11, 4);
        map8.put(c12, 4096);
        map8.put(c13, 16384);
        HashMap map9 = new HashMap();
        map9.put(C.f620h, 256);
        map9.put(C.i, Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH));
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    public static boolean a(InterfaceC1680b0.c cVar, C c10) {
        int iA = cVar.a();
        Set set = (Set) f37631a.get(Integer.valueOf(c10.f622b));
        if (set == null || !set.contains(Integer.valueOf(iA))) {
            return false;
        }
        int iF = cVar.f();
        Set set2 = (Set) f37632b.get(Integer.valueOf(c10.f621a));
        return set2 != null && set2.contains(Integer.valueOf(iF));
    }
}
