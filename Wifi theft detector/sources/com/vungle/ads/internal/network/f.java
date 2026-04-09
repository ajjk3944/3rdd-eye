package com.vungle.ads.internal.network;

import com.vungle.ads.internal.util.o;
import java.util.Map;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class f {

    @NotNull
    public static final b Companion = new b(null);
    private static final int PRIORITY_MAX_RETRY_COUNT = 3;
    private static final int REGULAR_MAX_RETRY_COUNT = 5;

    @Nullable
    private final String body;

    @Nullable
    private final Map<String, String> headers;

    @Nullable
    private final o logEntry;

    @NotNull
    private final HttpMethod method;

    @Nullable
    private final Boolean priorityRetry;
    private final int priorityRetryCount;
    private final boolean regularRetry;
    private final int regularRetryCount;

    @Nullable
    private final String tpatKey;

    @NotNull
    private final String url;

    public static final class a {

        @Nullable
        private String body;

        @Nullable
        private Map<String, String> headers;

        @Nullable
        private o logEntry;

        @NotNull
        private HttpMethod method;

        @Nullable
        private Boolean priorityRetry;
        private int priorityRetryCount;
        private boolean regularRetry;
        private int regularRetryCount;

        @Nullable
        private String tpatKey;

        @NotNull
        private final String url;

        public a(@NotNull String url) {
            p.e(url, "url");
            this.url = url;
            this.method = HttpMethod.GET;
            this.priorityRetryCount = 3;
            this.regularRetry = true;
            this.regularRetryCount = 5;
        }

        @NotNull
        public final a body(@Nullable String str) {
            this.body = str;
            return this;
        }

        @NotNull
        public final f build() {
            return new f(this.url, this.method, this.headers, this.body, this.priorityRetry, this.priorityRetryCount, this.regularRetry, this.regularRetryCount, this.tpatKey, this.logEntry, null);
        }

        @NotNull
        public final a get() {
            this.method = HttpMethod.GET;
            return this;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final a headers(@Nullable Map<String, String> map) {
            this.headers = map;
            return this;
        }

        @NotNull
        public final a method(@NotNull HttpMethod method) {
            p.e(method, "method");
            this.method = method;
            return this;
        }

        @NotNull
        public final a post() {
            this.method = HttpMethod.POST;
            return this;
        }

        @NotNull
        public final a priorityRetry(boolean z10) {
            this.priorityRetry = Boolean.valueOf(z10);
            return this;
        }

        @NotNull
        public final a priorityRetryCount(int i10) {
            this.priorityRetryCount = i10;
            return this;
        }

        @NotNull
        public final a regularRetry(boolean z10) {
            this.regularRetry = z10;
            return this;
        }

        @NotNull
        public final a regularRetryCount(int i10) {
            this.regularRetryCount = i10;
            return this;
        }

        @NotNull
        public final a tpatKey(@Nullable String str) {
            this.tpatKey = str;
            return this;
        }

        @NotNull
        public final a withLogEntry(@Nullable o oVar) {
            this.logEntry = oVar;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ f(String str, HttpMethod httpMethod, Map map, String str2, Boolean bool, int i10, boolean z10, int i11, String str3, o oVar, kotlin.jvm.internal.i iVar) {
        this(str, httpMethod, map, str2, bool, i10, z10, i11, str3, oVar);
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final o getLogEntry() {
        return this.logEntry;
    }

    @NotNull
    public final HttpMethod getMethod() {
        return this.method;
    }

    @Nullable
    public final Boolean getPriorityRetry() {
        return this.priorityRetry;
    }

    public final int getPriorityRetryCount() {
        return this.priorityRetryCount;
    }

    public final boolean getRegularRetry() {
        return this.regularRetry;
    }

    public final int getRegularRetryCount() {
        return this.regularRetryCount;
    }

    @Nullable
    public final String getTpatKey() {
        return this.tpatKey;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    private f(String str, HttpMethod httpMethod, Map<String, String> map, String str2, Boolean bool, int i10, boolean z10, int i11, String str3, o oVar) {
        this.url = str;
        this.method = httpMethod;
        this.headers = map;
        this.body = str2;
        this.priorityRetry = bool;
        this.priorityRetryCount = i10;
        this.regularRetry = z10;
        this.regularRetryCount = i11;
        this.tpatKey = str3;
        this.logEntry = oVar;
    }
}
