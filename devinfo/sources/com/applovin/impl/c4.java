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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class c4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f3812a;

    /* renamed from: b, reason: collision with root package name */
    private final List f3813b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3814c;

    /* renamed from: d, reason: collision with root package name */
    private Long f3815d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f3816e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Deque f3817f = new ArrayDeque();

    public c4(com.applovin.impl.sdk.k kVar) {
        this.f3812a = (String) kVar.a(x4.u4);
        this.f3813b = kVar.c(x4.f6158v4);
        this.f3814c = ((Integer) kVar.a(x4.f6166w4)).intValue();
    }

    public Long a() {
        return this.f3815d;
    }

    public Deque b() {
        return this.f3817f;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || this.f3814c <= 0) {
            return;
        }
        Map map = (Map) this.f3816e.remove(str);
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
        if (this.f3817f.size() == this.f3814c) {
            this.f3817f.pollLast();
        }
        this.f3817f.addFirst(map2);
    }

    public void b(long j, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!CollectionUtils.isEmpty(this.f3813b) && this.f3814c > 0) {
            Iterator it = this.f3813b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (StringUtils.isValidString(str3) && str.endsWith(str3)) {
                    a(j, str3, str2);
                    break;
                }
            }
        }
        if (StringUtils.isValidString(this.f3812a) && str.endsWith(this.f3812a)) {
            this.f3815d = Long.valueOf(j);
        }
    }

    private void a(long j, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f3816e.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f3816e.put(str2, map);
        }
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j));
    }
}
