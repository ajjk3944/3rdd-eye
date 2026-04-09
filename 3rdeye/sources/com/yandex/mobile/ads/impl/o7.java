package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o7 {

    /* renamed from: a, reason: collision with root package name */
    private final ka f31276a = new ka();

    /* renamed from: b, reason: collision with root package name */
    private final dj1 f31277b = new dj1();

    public final jp1 a(h7 h7Var) {
        jp1 jp1Var = new jp1((Map) null, 3);
        if (h7Var != null) {
            Map<String, String> mapH = h7Var.h();
            this.f31276a.getClass();
            jp1 jp1Var2 = new jp1(new HashMap(), 2);
            if (mapH != null) {
                Object obj = (String) mapH.get("adapter_network_name");
                Object obj2 = (String) mapH.get("adapter_version");
                Object obj3 = (String) mapH.get("adapter_network_sdk_version");
                jp1Var2.a(obj, "adapter_network_name");
                jp1Var2.a(obj2, "adapter_version");
                jp1Var2.a(obj3, "adapter_network_sdk_version");
            }
            Map<String, Object> mapB = jp1Var2.b();
            this.f31277b.getClass();
            jp1 jp1Var3 = new jp1(new HashMap(), 2);
            if (mapH != null) {
                Object obj4 = (String) mapH.get("plugin_type");
                Object obj5 = (String) mapH.get("plugin_version");
                jp1Var3.a(obj4, "plugin_type");
                jp1Var3.a(obj5, "plugin_version");
            }
            Map<String, Object> mapB2 = jp1Var3.b();
            String strJ = h7Var.j();
            jp1Var.a((Map<String, ? extends Object>) mapB);
            jp1Var.a((Map<String, ? extends Object>) mapB2);
            jp1Var.a(strJ, "preload_type");
        }
        String strG = h7Var != null ? h7Var.g() : null;
        boolean z10 = strG == null || strG.length() == 0;
        jp1Var.b(Boolean.valueOf(!z10), "open_bidding");
        if (!z10) {
            jp1Var.a("openbidding", "integration_type");
        }
        return jp1Var;
    }
}
