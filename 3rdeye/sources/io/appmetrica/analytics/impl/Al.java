package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Al {

    /* renamed from: a, reason: collision with root package name */
    public final String f39119a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39120b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f39121c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f39122d;

    /* renamed from: e, reason: collision with root package name */
    public final String f39123e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f39124f;

    public Al(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f39119a = str;
        this.f39120b = str2;
        this.f39121c = num;
        this.f39122d = num2;
        this.f39123e = str3;
        this.f39124f = bool;
    }

    public Al(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
