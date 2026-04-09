package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static Map<Integer, b<String, List<Campaign>>> f15939a = new HashMap();

    public static b<String, List<Campaign>> a(int i10) {
        if (f15939a.containsKey(Integer.valueOf(i10))) {
            return f15939a.get(Integer.valueOf(i10));
        }
        a aVar = new a(i10);
        f15939a.put(Integer.valueOf(i10), aVar);
        return aVar;
    }
}
