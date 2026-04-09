package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5646a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5647b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5648c;

    /* renamed from: d, reason: collision with root package name */
    private Long f5649d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f5650e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Deque f5651f = new ArrayDeque();

    public c4(com.applovin.impl.sdk.k kVar) {
        this.f5646a = (String) kVar.a(x4.f8591u4);
        this.f5647b = kVar.c(x4.f8599v4);
        this.f5648c = ((Integer) kVar.a(x4.f8607w4)).intValue();
    }

    public Long a() {
        return this.f5649d;
    }

    public Deque b() {
        return this.f5651f;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || this.f5648c <= 0) {
            return;
        }
        Map map = (Map) this.f5650e.remove(str);
        if (CollectionUtils.isEmpty(map)) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("cc_ms", Long.valueOf(System.currentTimeMillis()));
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!CollectionUtils.isEmpty(list)) {
                Iterator it = list.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                map2.put((String) entry.getKey(), Long.valueOf(jLongValue / list.size()));
            }
        }
        if (this.f5651f.size() == this.f5648c) {
            this.f5651f.pollLast();
        }
        this.f5651f.addFirst(map2);
    }

    public void b(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!CollectionUtils.isEmpty(this.f5647b) && this.f5648c > 0) {
            Iterator it = this.f5647b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (StringUtils.isValidString(str3) && str.endsWith(str3)) {
                    a(j10, str3, str2);
                    break;
                }
            }
        }
        if (StringUtils.isValidString(this.f5646a) && str.endsWith(this.f5646a)) {
            this.f5649d = Long.valueOf(j10);
        }
    }

    private void a(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f5650e.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f5650e.put(str2, map);
        }
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j10));
    }
}
