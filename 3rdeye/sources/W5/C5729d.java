package w5;

import android.os.Build;
import java.io.IOException;

/* compiled from: AutoSessionEventEncoder.java */
/* renamed from: w5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5729d implements Z4.d<C5727b> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5729d f47392a = new C5729d();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47393b = Z4.c.a("appId");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47394c = Z4.c.a("deviceModel");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f47395d = Z4.c.a("sessionSdkVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f47396e = Z4.c.a("osVersion");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f47397f = Z4.c.a("logEnvironment");

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f47398g = Z4.c.a("androidAppInfo");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        C5727b c5727b = (C5727b) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f47393b, c5727b.f47382a);
        eVar2.a(f47394c, Build.MODEL);
        eVar2.a(f47395d, "2.0.3");
        eVar2.a(f47396e, Build.VERSION.RELEASE);
        eVar2.a(f47397f, c5727b.f47383b);
        eVar2.a(f47398g, c5727b.f47384c);
    }
}
