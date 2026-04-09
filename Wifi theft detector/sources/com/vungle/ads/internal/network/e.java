package com.vungle.ads.internal.network;

import kotlin.jvm.internal.p;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final a Companion = new a(null);

    @Nullable
    private final Object body;

    @Nullable
    private final ResponseBody errorBody;

    @NotNull
    private final Response rawResponse;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        @NotNull
        public final <T> e error(@Nullable ResponseBody responseBody, @NotNull Response rawResponse) {
            p.e(rawResponse, "rawResponse");
            if (rawResponse.isSuccessful()) {
                throw new IllegalArgumentException("rawResponse should not be successful response");
            }
            kotlin.jvm.internal.i iVar = null;
            return new e(rawResponse, iVar, responseBody, iVar);
        }

        @NotNull
        public final <T> e success(@Nullable T t10, @NotNull Response rawResponse) {
            p.e(rawResponse, "rawResponse");
            if (rawResponse.isSuccessful()) {
                return new e(rawResponse, t10, null, 0 == true ? 1 : 0);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }

        private a() {
        }
    }

    public /* synthetic */ e(Response response, Object obj, ResponseBody responseBody, kotlin.jvm.internal.i iVar) {
        this(response, obj, responseBody);
    }

    @Nullable
    public final Object body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.code();
    }

    @Nullable
    public final ResponseBody errorBody() {
        return this.errorBody;
    }

    @NotNull
    public final Headers headers() {
        return this.rawResponse.headers();
    }

    public final boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    @NotNull
    public final String message() {
        return this.rawResponse.message();
    }

    @NotNull
    public final Response raw() {
        return this.rawResponse;
    }

    @NotNull
    public String toString() {
        return this.rawResponse.toString();
    }

    private e(Response response, Object obj, ResponseBody responseBody) {
        this.rawResponse = response;
        this.body = obj;
        this.errorBody = responseBody;
    }
}
