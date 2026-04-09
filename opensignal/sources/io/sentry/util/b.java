package io.sentry.util;

import io.sentry.l0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List f12801a = Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f12802b;

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f12803c;

    static {
        Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");
        f12802b = new l0(400, 499);
        f12803c = new l0(500, 599);
    }
}
