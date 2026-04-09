package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yr {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f35961a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f35962b = new ArrayList();

    public static void a(yr yrVar, long j4) {
        yrVar.f35961a.put("exo_len", Long.valueOf(j4));
        yrVar.f35962b.remove("exo_len");
    }

    public final List<String> b() {
        return Collections.unmodifiableList(new ArrayList(this.f35962b));
    }

    public static void a(yr yrVar, Uri uri) {
        if (uri == null) {
            yrVar.f35962b.add("exo_redir");
            yrVar.f35961a.remove("exo_redir");
            return;
        }
        String string = uri.toString();
        HashMap map = yrVar.f35961a;
        string.getClass();
        map.put("exo_redir", string);
        yrVar.f35962b.remove("exo_redir");
    }

    public final Map<String, Object> a() {
        HashMap map = new HashMap(this.f35961a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
