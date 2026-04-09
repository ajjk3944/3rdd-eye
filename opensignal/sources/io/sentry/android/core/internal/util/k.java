package io.sentry.android.core.internal.util;

import android.content.Context;
import io.sentry.android.core.f0;
import io.sentry.u0;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f11667g = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f11668a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f11669b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f11670c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f11671d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f11672e;

    /* renamed from: f, reason: collision with root package name */
    public final Runtime f11673f;

    public k(Context context, f0 f0Var, u0 u0Var) {
        Runtime runtime = Runtime.getRuntime();
        this.f11668a = context;
        ir.f0.T(f0Var, "The BuildInfoProvider is required.");
        this.f11669b = f0Var;
        ir.f0.T(u0Var, "The Logger is required.");
        this.f11670c = u0Var;
        this.f11671d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.f11672e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        ir.f0.T(runtime, "The Runtime is required.");
        this.f11673f = runtime;
    }
}
