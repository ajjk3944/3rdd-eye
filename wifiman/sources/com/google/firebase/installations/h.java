package com.google.firebase.installations;

import android.text.TextUtils;
import h5.AbstractC5952d;
import j5.C6253b;
import j5.InterfaceC6252a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final long f38903b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f38904c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    private static h f38905d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6252a f38906a;

    private h(InterfaceC6252a interfaceC6252a) {
        this.f38906a = interfaceC6252a;
    }

    public static h c() {
        return d(C6253b.b());
    }

    public static h d(InterfaceC6252a interfaceC6252a) {
        if (f38905d == null) {
            f38905d = new h(interfaceC6252a);
        }
        return f38905d;
    }

    static boolean g(String str) {
        return f38904c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f38906a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(AbstractC5952d abstractC5952d) {
        return TextUtils.isEmpty(abstractC5952d.b()) || abstractC5952d.h() + abstractC5952d.c() < b() + f38903b;
    }
}
