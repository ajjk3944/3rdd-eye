package com.yandex.mobile.ads.instream;

import c9.C2100u;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class InstreamAdRequestConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final String f36807a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36808b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f36809c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f36810a;

        /* renamed from: b, reason: collision with root package name */
        private String f36811b;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, String> f36812c;

        public Builder(String pageId) {
            l.f(pageId, "pageId");
            this.f36810a = pageId;
            this.f36811b = CommonUrlParts.Values.FALSE_INTEGER;
        }

        public final InstreamAdRequestConfiguration build() {
            return new InstreamAdRequestConfiguration(this.f36811b, this.f36810a, this.f36812c, null);
        }

        public final Builder setCategoryId(String str) {
            if (str == null) {
                str = CommonUrlParts.Values.FALSE_INTEGER;
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("Passed categoryId is empty");
            }
            this.f36811b = str;
            return this;
        }

        public final Builder setParameters(Map<String, String> map) {
            if (map == null) {
                map = C2100u.f18582b;
            }
            this.f36812c = map;
            return this;
        }
    }

    public /* synthetic */ InstreamAdRequestConfiguration(String str, String str2, Map map, g gVar) {
        this(str, str2, map);
    }

    public final String getCategoryId() {
        return this.f36807a;
    }

    public final String getPageId() {
        return this.f36808b;
    }

    public final Map<String, String> getParameters() {
        return this.f36809c;
    }

    private InstreamAdRequestConfiguration(String str, String str2, Map<String, String> map) {
        this.f36807a = str;
        this.f36808b = str2;
        this.f36809c = map;
    }
}
