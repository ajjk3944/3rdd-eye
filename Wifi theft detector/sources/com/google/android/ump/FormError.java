package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class FormError {

    /* renamed from: a, reason: collision with root package name */
    public final int f11538a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11539b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i10, @RecentlyNonNull String str) {
        this.f11538a = i10;
        this.f11539b = str;
    }

    public int getErrorCode() {
        return this.f11538a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.f11539b;
    }
}
