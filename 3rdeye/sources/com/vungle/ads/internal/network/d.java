package com.vungle.ads.internal.network;

import U9.E;
import U9.F;
import U9.s;
import kotlin.jvm.internal.l;

/* compiled from: Response.kt */
/* loaded from: classes2.dex */
public final class d<T> {
    public static final a Companion = new a(null);
    private final T body;
    private final F errorBody;
    private final E rawResponse;

    /* compiled from: Response.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final <T> d<T> error(F f10, E rawResponse) {
            l.f(rawResponse, "rawResponse");
            if (rawResponse.d()) {
                throw new IllegalArgumentException("rawResponse should not be successful response");
            }
            kotlin.jvm.internal.g gVar = null;
            return new d<>(rawResponse, gVar, f10, gVar);
        }

        public final <T> d<T> success(T t10, E rawResponse) {
            l.f(rawResponse, "rawResponse");
            if (rawResponse.d()) {
                return new d<>(rawResponse, t10, null, 0 == true ? 1 : 0);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }

        private a() {
        }
    }

    public /* synthetic */ d(E e4, Object obj, F f10, kotlin.jvm.internal.g gVar) {
        this(e4, obj, f10);
    }

    public final T body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.f12565e;
    }

    public final F errorBody() {
        return this.errorBody;
    }

    public final s headers() {
        return this.rawResponse.f12567g;
    }

    public final boolean isSuccessful() {
        return this.rawResponse.d();
    }

    public final String message() {
        return this.rawResponse.f12564d;
    }

    public final E raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    private d(E e4, T t10, F f10) {
        this.rawResponse = e4;
        this.body = t10;
        this.errorBody = f10;
    }
}
