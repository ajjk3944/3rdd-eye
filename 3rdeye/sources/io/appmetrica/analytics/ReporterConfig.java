package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C4599f0;
import io.appmetrica.analytics.impl.C5109yn;
import io.appmetrica.analytics.impl.G5;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ReporterConfig {
    public final Map<String, Object> additionalConfig;
    public final String apiKey;
    public final Map<String, String> appEnvironment;
    public final Boolean dataSendingEnabled;
    public final Integer dispatchPeriodSeconds;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: l, reason: collision with root package name */
        private static final C5109yn f38768l = new C5109yn(new C4599f0());

        /* renamed from: a, reason: collision with root package name */
        private final G5 f38769a;

        /* renamed from: b, reason: collision with root package name */
        private final String f38770b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f38771c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f38772d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f38773e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f38774f;

        /* renamed from: g, reason: collision with root package name */
        private String f38775g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f38776h;
        private Integer i;

        /* renamed from: j, reason: collision with root package name */
        private final HashMap f38777j;

        /* renamed from: k, reason: collision with root package name */
        private final HashMap f38778k;

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f38778k.put(str, obj);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f38777j.put(str, str2);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z10) {
            this.f38773e = Boolean.valueOf(z10);
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i) {
            this.f38776h = Integer.valueOf(i);
            return this;
        }

        public Builder withLogs() {
            this.f38772d = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i) {
            this.i = Integer.valueOf(i);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f38774f = Integer.valueOf(this.f38769a.a(i));
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.f38771c = Integer.valueOf(i);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f38775g = str;
            return this;
        }

        private Builder(String str) {
            this.f38777j = new HashMap();
            this.f38778k = new HashMap();
            f38768l.a(str);
            this.f38769a = new G5(str);
            this.f38770b = str;
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i) {
        this(builder);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f38770b;
        this.sessionTimeout = builder.f38771c;
        this.logs = builder.f38772d;
        this.dataSendingEnabled = builder.f38773e;
        this.maxReportsInDatabaseCount = builder.f38774f;
        this.userProfileID = builder.f38775g;
        this.dispatchPeriodSeconds = builder.f38776h;
        this.maxReportsCount = builder.i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f38777j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f38778k);
    }
}
