package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class FormError {

    /* renamed from: a, reason: collision with root package name */
    public final int f20705a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20706b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i4, @RecentlyNonNull String str) {
        this.f20705a = i4;
        this.f20706b = str;
    }

    public int getErrorCode() {
        return this.f20705a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.f20706b;
    }
}
