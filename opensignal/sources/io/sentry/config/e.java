package io.sentry.config;

import io.sentry.util.k;
import ir.f0;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import w.g;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f12173a;

    /* renamed from: b, reason: collision with root package name */
    public final Properties f12174b;

    public e(String str, Properties properties) {
        this.f12173a = str;
        f0.T(properties, "properties are required");
        this.f12174b = properties;
    }

    @Override // io.sentry.config.d
    public final Map c() {
        String strJ = g.j(new StringBuilder(), this.f12173a, "tags.");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f12174b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strJ)) {
                    map.put(str.substring(strJ.length()), k.d((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.d
    public final String getProperty(String str) {
        return k.d(this.f12174b.getProperty(this.f12173a + str));
    }

    public e(Properties properties) {
        this("", properties);
    }
}
