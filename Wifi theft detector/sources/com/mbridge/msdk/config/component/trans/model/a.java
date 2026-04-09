package com.mbridge.msdk.config.component.trans.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f13741a;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get(c.a("118"))) == null) {
            return;
        }
        a(String.valueOf(obj).replace("'", ""));
    }

    public String a() {
        return this.f13741a;
    }

    public void a(String str) {
        this.f13741a = str;
    }
}
