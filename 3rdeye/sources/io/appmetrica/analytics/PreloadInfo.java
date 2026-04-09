package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class PreloadInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f38764a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f38765b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f38766a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f38767b;

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f38767b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f38766a = str;
            this.f38767b = new HashMap();
        }
    }

    public /* synthetic */ PreloadInfo(Builder builder, int i) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f38765b;
    }

    public String getTrackingId() {
        return this.f38764a;
    }

    private PreloadInfo(Builder builder) {
        this.f38764a = builder.f38766a;
        this.f38765b = CollectionUtils.unmodifiableMapCopy(builder.f38767b);
    }
}
