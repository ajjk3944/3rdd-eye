package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Kn {

    /* renamed from: a, reason: collision with root package name */
    public final An f39725a;

    /* renamed from: b, reason: collision with root package name */
    public final U f39726b;

    /* renamed from: c, reason: collision with root package name */
    public final List f39727c;

    /* renamed from: d, reason: collision with root package name */
    public final String f39728d;

    /* renamed from: e, reason: collision with root package name */
    public final String f39729e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f39730f;

    /* renamed from: g, reason: collision with root package name */
    public final String f39731g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f39732h;

    public Kn(An an, U u8, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f39725a = an;
        this.f39726b = u8;
        this.f39727c = arrayList;
        this.f39728d = str;
        this.f39729e = str2;
        this.f39730f = map;
        this.f39731g = str3;
        this.f39732h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        An an = this.f39725a;
        if (an != null) {
            for (Al al : an.f39128c) {
                sb.append("at " + al.f39119a + "." + al.f39123e + "(" + al.f39120b + StringUtils.PROCESS_POSTFIX_DELIMITER + al.f39121c + StringUtils.PROCESS_POSTFIX_DELIMITER + al.f39122d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f39725a + "\n" + sb.toString() + '}';
    }
}
