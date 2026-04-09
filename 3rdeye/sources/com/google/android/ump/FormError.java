package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* loaded from: classes2.dex */
public class FormError {

    /* renamed from: a, reason: collision with root package name */
    public final int f23236a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23237b;

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i, @RecentlyNonNull String str) {
        this.f23236a = i;
        this.f23237b = str;
    }

    public int getErrorCode() {
        return this.f23236a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.f23237b;
    }
}
