package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
public abstract class E0 {

    /* renamed from: a, reason: collision with root package name */
    private static E0 f34990a = new C0();

    public static synchronized E0 a() {
        return f34990a;
    }

    public abstract URLConnection b(URL url, String str);
}
